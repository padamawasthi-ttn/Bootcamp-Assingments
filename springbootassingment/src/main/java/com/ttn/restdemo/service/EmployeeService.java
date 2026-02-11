package com.ttn.restdemo.service;

import com.ttn.restdemo.model.Employee;
import com.ttn.restdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repo;

    public List<Employee> GetAllEmp(){
        return repo.findAll();
    }
}
