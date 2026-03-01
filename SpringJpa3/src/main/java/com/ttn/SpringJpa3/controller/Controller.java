package com.ttn.SpringJpa3.controller;

import com.ttn.SpringJpa3.model.onetoone.UserAddressOneToOne;
import com.ttn.SpringJpa3.model.onetoone.UserDetailsOneToOne;
import com.ttn.SpringJpa3.repository.AdressRepo;
import com.ttn.SpringJpa3.repository.Repo;
import com.ttn.SpringJpa3.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Service service;
    @Autowired
    AdressRepo repo;

    @PostMapping("/addUser")
    public ResponseEntity<UserDetailsOneToOne> saveNewUser(@RequestBody UserDetailsOneToOne model){
        UserDetailsOneToOne m= service.saveAuthor(model);
        return ResponseEntity.status(HttpStatus.OK).body(m);
    }

    @GetMapping(path="/getAllUser")
    public ResponseEntity<List<UserDetailsOneToOne>> getUserDetails(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllUser());
    }

    @GetMapping("/home/{id}/user")
    public List<UserAddressOneToOne> home(@PathVariable int id) {
        return repo.findAll();
    }
}
