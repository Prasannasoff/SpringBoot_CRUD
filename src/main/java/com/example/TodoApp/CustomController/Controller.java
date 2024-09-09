package com.example.TodoApp.CustomController;

import com.example.TodoApp.DTO.EmployeeDTO;
import com.example.TodoApp.DTO.EmployeeSaveDTO;
import com.example.TodoApp.DTO.EmployeeUpdateDTO;
import com.example.TodoApp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin //third party service like react
@RequestMapping("api/v1/Todo") //to specify the path for API
public class Controller {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path="/save")
    public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO) //The @RequestBody annotation in the saveEmployee method of your Controller class tells Spring Boot to bind the incoming JSON data to an instance of EmployeeSaveDTO
    {

        // After binding the JSON data to EmployeeSaveDTO, the saveEmployee method in the Controller passes this EmployeeSaveDTO object to the EmployeeService interface (implemented by EmployeeServiceIMPL).
        String id = employeeService.addEmployee(employeeSaveDTO); //It will return the employee_name coming from service
        return id;

    }

    @PutMapping(path="/update/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody EmployeeUpdateDTO employeeUpdateDTO) {
        String msg = employeeService.updateEmployee(id,employeeUpdateDTO);
        return msg;
    }
    @DeleteMapping(path="/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        String msg=employeeService.deleteEmployee(id);
        return msg;
    }

}
