package com.f1.formula.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;
    @Setter
    @Getter
    private String firstName;
    @Setter
    @Getter
    private String userName;
    @Setter
    @Getter
    private String lastName;
    @Setter
    @Getter
    private String email;
    @Setter
    @Getter
    private Integer phoneNumber;
    @Setter
    @Getter
    private String password;
}
