package com.example.TodoApp.DTO;

public class EmployeeUpdateDTO {
    private int employee_id;
    private String employee_name;
    private int employee_salary;

    public EmployeeUpdateDTO(int employee_id,String employee_name, int employee_salary) {
        this.employee_id=employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public EmployeeUpdateDTO() {
    }

    public int getEmployee_id() {
        return employee_id;
    }

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

                ", employee_name='" + employee_name + '\'' +
                ", employee_salary=" + employee_salary +
                '}';
    }
}
