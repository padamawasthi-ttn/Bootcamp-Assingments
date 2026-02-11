package com.ttn.restdemo.controller;

import com.ttn.restdemo.model.Employee;
import com.ttn.restdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/getAllEmployee")
    public List<Employee> GetAllEmployee(){
        return service.GetAllEmp();
    }
}

