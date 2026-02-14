package com.ttn.restfulwebservices1.controller;

import com.ttn.restfulwebservices1.exception.ResourceNotFoundException;
import com.ttn.restfulwebservices1.model.EmployeeModel;
import com.ttn.restfulwebservices1.model.Model2;
import com.ttn.restfulwebservices1.model.Model3;
import com.ttn.restfulwebservices1.repo.ModelRepo2;
import com.ttn.restfulwebservices1.repo.ModelRepo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q5Versioning {
    @Autowired
    private ModelRepo2 repo2;

    @Autowired
    private ModelRepo3 repo3;

    //URI Versioning
    @GetMapping("/v1/user/{id}")
    public Model2 getUserV1(@PathVariable Long id) {
        return repo2.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee Not Exsist With Id"));
    }

    @GetMapping("/v2/user/{id}")
    public Model3 getUserV2(@PathVariable Long id) {
        return repo3.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Exsist with id"));
    }

    //Request Parameter Versioning
    @GetMapping(value="/user/{id}", params="version=1")
    public Model2 getUserParamV1(@PathVariable long id) {
        return repo2.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee Not Exsist With Id"));
    }

    @GetMapping(value="/user/{id}", params="version=2")
    public Model3 getUserParamV2(@PathVariable Long id) {
        return repo3.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Exsist with id"));
    }

    //header versioning
    @GetMapping(value="/user/header/{id}", headers="X-API-VERSION=1")
    public Model2 getUserHeaderV1(@PathVariable Long id) {
        return repo2.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee Not Exsist With Id"));
    }

    @GetMapping(value="/user/header/{id}", headers="X-API-VERSION=2")
    public Model3 getUserHeaderV2(@PathVariable Long id) {
        return repo3.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Exsist with id"));
    }

    //MIME type versioning

    @GetMapping(
            value="/user/produces/{id}",
            produces="application/vnd.company.app-v1+json"
    )
    public Model2 getUserMimeV1(@PathVariable Long id) {
        return repo2.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Exsist with id"));
    }

    @GetMapping(
            value="/user/produces/{id}",
            produces="application/vnd.company.app-v2+json"
    )
    public Model3 getUserMimeV2(@PathVariable Long id) {
        return repo3.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Exsist with id"));
    }

}
