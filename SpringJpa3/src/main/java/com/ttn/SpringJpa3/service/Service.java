package com.ttn.SpringJpa3.service;

import com.ttn.SpringJpa3.model.onetoone.UserDetailsOneToOne;
import com.ttn.SpringJpa3.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repo repo;

    public UserDetailsOneToOne saveAuthor(UserDetailsOneToOne m){
        return repo.save(m);
    }

    public List<UserDetailsOneToOne> getAllUser() {
        return repo.findAll();
    }
}
