package com.example.TodoApp.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EmployeeDTO {
    private int employee_id;

    private String employee_name;
    private int employee_salary;

    public EmployeeDTO(int employee_id, String employee_name, int employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public EmployeeDTO() {
    }

//By using getters and setters, you can control how the fields are accessed and modified, ensuring proper validation and protection for the class's state.
    public int getEmployee_id() {
        return employee_id;
    }


    //Using setters allows you to add validation logic to ensure that any modification of a field meets certain conditions.
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_salary=" + employee_salary +
                '}';
    }
}
