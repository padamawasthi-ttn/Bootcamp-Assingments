package com.ttn.restfulwebservices1.controller;

import com.ttn.restfulwebservices1.model.EmployeeModel;
import com.ttn.restfulwebservices1.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@Tag(name="Employee Controller" ,description = "APIs for managing employee operations like create, fetch, update and delete")
public class Controller {

    @Autowired
    EmployeeService service;

    @Autowired
    private MessageSource messageSource;

//    @GetMapping("/hello/in")
//    public String helloUser(@RequestParam String username, Locale locale){
//        return messageSource.getMessage("hello.user",new Object[] {username}, locale);
//    }


    @GetMapping("/home")
    public String Default(){
        return "Welcome To Spring Boot";
    }

    @GetMapping("/getAllEmployee")
    @Operation(summary = "Get All Employee" , description = "Fetch List Of All Employee ")
    public List<EmployeeModel> getAllEmp(){
        return service.GetAllEmployee();
    }

    @GetMapping("/getById/{id}")
    @Operation(summary = "Get One Employee" , description = "Fetch Individual Employee Details")
    public EmployeeModel getById(@PathVariable long id){
        return service.getEmployeeById(id);
    }


    // Q) 6 HateOAS 
    @PostMapping("/addEmployee")
    @Operation(summary = "Add Or Create New Employee" , description = "Create or Add new Employee record in new database")
    public EntityModel<EmployeeModel> addEmp(@Valid @RequestBody EmployeeModel emp){
        EmployeeModel employeeSaved= service.saveEmployee(emp);

        // wrap user
        EntityModel<EmployeeModel> resource = EntityModel.of(emp);

        // add link to all users API
        resource.add(linkTo(methodOn(Controller.class)
                .getAllEmp()).withRel("all-users"));
        return resource;

    }

    @DeleteMapping("/deltebyId/{id}")
    @Operation(summary = "Delete one Employee" , description = "Delete Employee From List using EmployeeId")
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
