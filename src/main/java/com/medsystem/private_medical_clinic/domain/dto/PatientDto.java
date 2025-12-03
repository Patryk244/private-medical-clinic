package com.medsystem.private_medical_clinic.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
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

    @NotEmpty(message = "give me password xd")
    private String password;

    @Past
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    @JsonProperty("isBlocked")
    private boolean isBlocked;

    @NotNull
    @NotEmpty
    private String city;

    @NotNull
    @NotEmpty
    private String country;
}