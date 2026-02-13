package com.ttn.restfulwebservices1.model;

import jakarta.validation.constraints.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, message = "Name must have at least 2 characters")
    String name;

    @NotNull(message = "Age is mandatory")
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 60, message = "Age must not exceed 60")
    Integer age;
}
