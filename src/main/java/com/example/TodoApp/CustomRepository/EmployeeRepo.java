package com.example.TodoApp.CustomRepository;


import com.example.TodoApp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories //JPA Add records to database

//@Repository
//This annotation is used to mark the interface as a Spring repository bean.
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
