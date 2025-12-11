package com.medsystem.private_medical_clinic.domain.dto;

import com.medsystem.private_medical_clinic.domain.Specialization;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {

    private Long doctorId;

    @Length(min = 3, max = 50, message = "Typing name between from 3 to 50 characters")
    private String firstName;
    @Length(min = 3, max = 50, message = "Typing name between from 3 to 50 characters")
    private String lastName;

    @Email(message = "Incorrect email")
    private String email;

    private Specialization specialization;

}
