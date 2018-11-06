package com.utfrp.edu.br.arquiteturaapp08.dao;

import com.utfrp.edu.br.arquiteturaapp08.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDAO{
    @PostMapping("/employee/new")
    public void create(@RequestBody Employee employee){
       
    }
    
    @GetMapping("/employee")
    public List<Employee> read(){
        List<Employee> employees = new ArrayList();
        employees.add( new Employee(new Long(1),"Marcia",38, (float) 1058.00));
        employees.add( new Employee(new Long(2),"Maria",46,(float)1058.00));
        employees.add(new Employee(new Long(3),"Angela",34,(float)1058.00));
        return employees;
    }
    
    @PutMapping("/employee/update")
    public void update (@RequestBody Employee employee){
        
    }
    
    @DeleteMapping("/employee/delete/{id}")
    public String delete(@PathVariable int id){
        return "ok";
}
}