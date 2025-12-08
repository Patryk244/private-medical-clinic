package com.medsystem.private_medical_clinic.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Patients")
@NamedQuery(
        name = "Patient.FindPatientByEmailAndPesel",
        query = "from Patient p where p.email = :EMAIL and p.pesel = :PESEL"
)
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

    @Column(name = "pesel")
    @Length(min = 11, max = 11)
    private String pesel;

    @Column(name = "birthDate")
    private LocalDate birthDate;

    @Column(name = "blocked")
    private boolean blocked;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

}