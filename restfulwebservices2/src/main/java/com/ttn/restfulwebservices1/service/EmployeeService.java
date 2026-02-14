package com.ttn.restfulwebservices1.service;

import com.ttn.restfulwebservices1.exception.ResourceNotFoundException;
import com.ttn.restfulwebservices1.model.EmployeeModel;
import com.ttn.restfulwebservices1.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService{

    @Autowired
    EmployeeRepo repo;

    public List<EmployeeModel> GetAllEmployee(){
        return repo.findAll();
    }
    public EmployeeModel getEmployeeById(Long id) {
            return repo.findById(id).
                    orElseThrow(()-> new ResourceNotFoundException("Employee Not exsist with id = "+id));
    }

    public EmployeeModel saveEmployee(EmployeeModel employee) {
        repo.save(employee);
        return repo.findById(employee.getId()).orElse(null);
    }

    public void deleteEmployee(Long id) {
        EmployeeModel e = repo.findById(id).
                orElseThrow(()-> new ResourceNotFoundException("Employee Not exsist with id = "+id));
        repo.deleteById(id);
    }

    public EmployeeModel updateEmployee(long id,EmployeeModel emp) {
        EmployeeModel exsisting = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee with this id="+ id+" not exsist"));


        exsisting.setName(emp.getName());
        exsisting.setAge(emp.getAge());
        return repo.save(exsisting);
    }
}