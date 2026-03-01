package com.ttn.SpringJpa3.model.onetoone;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserDetailsOneToOne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    private String name;


    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name="addressId")
    @JsonManagedReference
    private UserAddressOneToOne addressOneToOne;
}
