package com.medsystem.private_medical_clinic.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.pl.PESEL;

import java.time.LocalDate;
import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {
    private Long patientId;

    @Length(min = 3, max = 50, message = "Typing name between from 3 to 50 characters")
    private String firstName;

    @Length(min = 3, max = 50, message = "Typing name between from 3 to 50 characters")
    private String lastName;

    @Email(message = "Please type correct email")
    private String email;


    @PESEL(message = "Incorrect pesel!")
    private String pesel;

    @Past
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    private boolean blocked;

    @NotNull
    @NotEmpty
    private String city;

    @NotNull
    @NotEmpty
    private String country;
}