package com.medsystem.private_medical_clinic.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Patients")
public class Patient {

    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private Long patientId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "birthDate")
    private Date birthDate;

    @Column(name = "isBlocked")
    private boolean isBlocked;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;
}