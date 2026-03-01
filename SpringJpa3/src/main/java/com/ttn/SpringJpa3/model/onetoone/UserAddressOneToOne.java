package com.ttn.SpringJpa3.model.onetoone;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class UserAddressOneToOne {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;

    private String Address;


//    //bidirectional
    @OneToOne(mappedBy = "addressOneToOne")
    @JsonBackReference
    private UserDetailsOneToOne userDetailsOneToOne;
}
