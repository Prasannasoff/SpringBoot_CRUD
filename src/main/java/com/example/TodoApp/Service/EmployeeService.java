package com.example.TodoApp.Service;

import com.example.TodoApp.DTO.EmployeeDTO;
import com.example.TodoApp.DTO.EmployeeSaveDTO;
import com.example.TodoApp.DTO.EmployeeUpdateDTO;

//Interface (EmployeeService): Defines what operations are available, such as addEmployee().

//Example: EmployeeService is an interface defining business operations related to employees, and EmployeeServiceIMPL is its implementation that contains the actual logic for these operations.
public interface EmployeeService {
    String addEmployee(EmployeeSaveDTO employeeSaveDTO);

    String updateEmployee(int id,EmployeeUpdateDTO employeeUpdateDTO);
    String deleteEmployee(int id);
}
