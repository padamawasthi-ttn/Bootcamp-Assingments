package com.ttn.SpringJpa3.repository;

import com.ttn.SpringJpa3.model.onetoone.UserAddressOneToOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepo extends JpaRepository<UserAddressOneToOne, Long> {
}
