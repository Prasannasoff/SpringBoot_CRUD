package com.example.TodoApp.Service;

import com.example.TodoApp.CustomRepository.EmployeeRepo;
import com.example.TodoApp.DTO.EmployeeDTO;
import com.example.TodoApp.DTO.EmployeeSaveDTO;
import com.example.TodoApp.DTO.EmployeeUpdateDTO;
import com.example.TodoApp.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Example: EmployeeService is an interface defining business operations related to employees, and EmployeeServiceIMPL is its implementation that contains the actual logic for these operations.


// In the service layer, the EmployeeSaveDTO is used to create an Employee entity, which is then saved to the database.
@Service //@Service: This annotation marks the class as a Spring service component. It allows Spring to detect it during component scanning and manage it as a Spring bean.
public class EmployeeServiceIMPL implements EmployeeService{
    @Autowired  //@Autowired: This annotation tells Spring to inject an instance of EmployeeRepo into this class.

    // EmployeeRepo is a Spring Data JPA repository that provides CRUD operations for the Employee entity.
    private EmployeeRepo employeeRepo;
    @Override
    //@Override: This annotation indicates that the addEmployee method is implementing a method defined in the EmployeeService interface.
    public String addEmployee(EmployeeSaveDTO employeeSaveDTO) {
        // It first creates a new Employee entity using data from the EmployeeSaveDTO object. This involves setting the employee's name and salary.
        Employee employee=new Employee(

                employeeSaveDTO.getEmployee_name(),
                employeeSaveDTO.getEmployee_salary()

        );
        employeeRepo.save(employee); // It then saves this Employee entity to the database using the employeeRepo.save(employee) method. The employeeRepo is a JPA repository that handles database interactions.

        return "Employee added successfully"; //It returns message to front end
    }
    @Override
    public String updateEmployee(int id, EmployeeUpdateDTO employeeUpdateDTO){
        Employee existingEmployee=employeeRepo.findById(id).orElseThrow(()->new RuntimeException("Employee not found with id"+id));
        existingEmployee.setEmployee_name(employeeUpdateDTO.getEmployee_name());
        existingEmployee.setEmployee_salary(employeeUpdateDTO.getEmployee_salary());
        employeeRepo.save(existingEmployee);
        return "Employee updated successfully";
    }
    @Override
    public String deleteEmployee(int id){
        Employee existingEmployee = employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        employeeRepo.deleteById(id);
        return "Employee deleted successfully";
    }
}
