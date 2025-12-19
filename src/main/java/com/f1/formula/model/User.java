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
    @Column(nullable = false)
    private String firstName;
    @Setter
    @Getter
    @Column(unique = true,nullable = false)
    private String userName;
    @Setter
    @Getter
    @Column(nullable = false)
    private String lastName;
    @Setter
    @Getter
    @Column(unique = true,nullable = false)
    private String email;
    @Setter
    @Getter

    @Column(unique = true,nullable = false)
    private Integer phoneNumber;
    @Setter
    @Getter
    @Column(nullable = false)
    private String password;
}
