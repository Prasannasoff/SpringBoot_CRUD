package com.example.TodoApp.Entity;

import jakarta.persistence.*;


// When you define an entity class, you’re defining the structure of the database table and how it should be mapped to the corresponding Java class.
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name="employee_id",length=50)
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto increments the id
    private int employee_id;

    @Column(name="employee_name",length=60)
    private String employee_name;

    @Column(name="employee_salary",length=10)
    private int employee_salary;

    public Employee(String employee_name, int employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public Employee() {
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
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_salary=" + employee_salary +
                '}';
    }
}
