package com.ttn.restfulwebservices1.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.ttn.restfulwebservices1.model.EmployeeModel;
import com.ttn.restfulwebservices1.service.EmployeeService;
import com.ttn.restfulwebservices1.views.Views;
import org.apache.catalina.Service;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilterQ4 {

    @Autowired
    EmployeeService service;

    @PostMapping("/employee/static")
    public EmployeeModel saveEmployee(@RequestBody EmployeeModel employee){
        return employee;
    }

    @GetMapping("/users/{id}")
    @JsonView(Views.Public.class)
    public EmployeeModel getEmployee(@PathVariable Long id){
        return service.getEmployeeById(id);
    }

    @GetMapping("/users/internal/{id}")
    @JsonView(Views.Internal.class)
    public EmployeeModel getEmployeeInternal(@PathVariable Long id){
        return service.getEmployeeById(id);
    }
}
