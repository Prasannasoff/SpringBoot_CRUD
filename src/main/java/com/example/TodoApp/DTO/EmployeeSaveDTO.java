package com.example.TodoApp.DTO;

public class EmployeeSaveDTO {


    private String employee_name;
    private int employee_salary;

    public EmployeeSaveDTO(String employee_name, int employee_salary) {

        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public EmployeeSaveDTO() {
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


    //The toString() method of EmployeeSaveDTO can be used for debugging and logging purposes. It provides a string representation of the EmployeeSaveDTO object, which can be helpful for logging the details of the object when debugging or tracking the application's behavior.
    //Generally toString() is used as console.log

    //When you print an object using System.out.println(object);, Java automatically calls the object's toString() method to get a string representation of the object.
    @Override
    public String toString() {
        return "EmployeeDTO{" +

                ", employee_name='" + employee_name + '\'' +
                ", employee_salary=" + employee_salary +
                '}';
    }
}
