package com.ttn.restfulwebservices1.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.ttn.restfulwebservices1.views.Views;
import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "Unique Employee Id")
    @JsonView(Views.Public.class)
    Long id;
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, message = "Name must have at least 2 characters")
    @Schema(description = "Employee name")
    @JsonView(Views.Public.class)
    String name;

    @NotNull(message = "Age is mandatory")
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 60, message = "Age must not exceed 60")
    @JsonView(Views.Public.class)
    Integer age;

    @JsonView(Views.Internal.class)
    String password;
}
