package com.medsystem.private_medical_clinic.domain.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {
    private Long patientId;

    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @Email(message = "Please type correct email")
    private String email;

    @NotNull(message = "give me password xd")
    private String password;

    @Past
    private Date birthDate;

    private boolean isBlocked;

    @NotNull
    @NotEmpty
    private String city;

    @NotNull
    @NotEmpty
    private String country;
}