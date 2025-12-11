package com.medsystem.private_medical_clinic.mapper;

import com.medsystem.private_medical_clinic.domain.Doctor;
import com.medsystem.private_medical_clinic.domain.Specialization;
import com.medsystem.private_medical_clinic.domain.dto.DoctorDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorMapperTest {

    @Test
    void mapToDoctorDto_shouldMapAllFieldsCorrectly() {
        Doctor doctor = new Doctor(
                1L,
                "Jan",
                "Kowalski",
                "kowalski@doctor.com",
                Specialization.Cardiology
        );

        DoctorDto doctorDto = DoctorMapper.maptoDoctorDto(doctor);
        assertNotNull(doctorDto);
        assertEquals("Jan", doctorDto.getFirstName());
        assertEquals("Kowalski", doctorDto.getLastName());
        assertEquals(Specialization.Cardiology, doctorDto.getSpecialization());

    }

    @Test
    void mapToDoctor_shouldMapAllFieldsCorrectly() {
        DoctorDto doctorDto = new DoctorDto(
                1L,
                "Jan",
                "Kowalski",
                "kowalski@doctor.com",
                Specialization.Cardiology
        );

        Doctor doctor = DoctorMapper.maptoDoctor(doctorDto);
        assertNotNull(doctor);
        assertEquals("Jan", doctor.getFirstName());
        assertEquals("Kowalski", doctor.getLastName());
        assertEquals(Specialization.Cardiology, doctor.getSpecialization());

    }
}