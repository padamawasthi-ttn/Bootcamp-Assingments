package com.ttn.restfulwebservices1.repo;


import com.ttn.restfulwebservices1.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepo extends JpaRepository<EmployeeModel, Long> {
}




