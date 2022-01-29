package com.park.parkingapp1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long userId;
    @NotBlank(message= "username is required")
    private String username;
    @NotBlank(message= "email is required")
    private String email;
    @NotBlank(message= "password is required")
    private String password;
    @NotBlank(message= "carID is required")
    private String userCarId;
    private Instant created;

    private boolean enabled;
}
