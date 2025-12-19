package com.f1.formula.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="driver")
public class Driver {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Integer id;
    @Setter
    @Getter
    private String firstName;
    @Setter
    @Getter
    private String lastName;
    @Setter
    @Getter
    private Integer number;
    @Setter
    @Getter
    private String nationality;
    @Setter
    @Getter
    private String team;
    @Setter
    @Getter
    private Integer points;
    @Setter
    @Getter
    private Integer wins;
    @Getter
    @Setter
    private Integer podiums;

    public Driver(){

    }
    public Driver(String firstName, String lastName, Integer number, String nationality, String team, Integer points, Integer wins, Integer podiums) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.nationality = nationality;
        this.team = team;
        this.points = points;
        this.wins = wins;
        this.podiums = podiums;
    }

}
