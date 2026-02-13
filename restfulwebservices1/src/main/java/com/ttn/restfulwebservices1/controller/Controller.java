package com.ttn.restfulwebservices1.controller;

import com.ttn.restfulwebservices1.model.EmployeeModel;
import com.ttn.restfulwebservices1.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    EmployeeService service;


    @GetMapping("/home")
    public String Default(){
        return "Welcome To Spring Boot";
    }

    @GetMapping("/getAllEmployee")
    public List<EmployeeModel> getAllEmp(){
        return service.GetAllEmployee();
    }

    @GetMapping("/getById/{id}")
    public EmployeeModel getById(@PathVariable long id){
        return service.getEmployeeById(id);
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeModel> addEmp(@Valid @RequestBody EmployeeModel emp){
        EmployeeModel employeeSaved= service.saveEmployee(emp);
        return new ResponseEntity<>(employeeSaved, HttpStatus.CREATED);
    }


    @DeleteMapping("/deltebyId/{id}")
    public ResponseEntity<String> deleteEmp(@PathVariable long id){
        service.deleteEmployee(id);
        return ResponseEntity.ok("Employee Deleted Successfully");
    }

    @PutMapping("/editEmployee/{id}")
    public ResponseEntity<String> editEmployee(@PathVariable long id , @RequestBody EmployeeModel emp){
        EmployeeModel employeeSaved= service.updateEmployee(id, emp);
        return ResponseEntity.ok("employee edited successfully");
    }
}
