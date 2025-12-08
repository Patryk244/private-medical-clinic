package com.medsystem.private_medical_clinic.mapper;

import com.medsystem.private_medical_clinic.domain.Patient;
import com.medsystem.private_medical_clinic.domain.dto.PatientDto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PatientMapperTest {

    @Test
    void mapToPatientDto_shouldMapAllFieldsCorrectly() {
        LocalDate birthDate = LocalDate.of(1990, 1, 1);
        Patient patient = new Patient(
                1L,
                "Jan",
                "Kowalski",
                "jan@example.com",
                "12345678900",
                birthDate,
                false,
                "Warszawa",
                "Polska"
        );

        PatientDto patientDto = PatientMapper.mapToPatientDto(patient);

        assertNotNull(patientDto);
        assertEquals(patient.getPatientId(), patientDto.getPatientId());
        assertEquals(patient.getFirstName(), patientDto.getFirstName());
        assertEquals(patient.getLastName(), patientDto.getLastName());
        assertEquals(patient.getEmail(), patientDto.getEmail());
        assertEquals(patient.getPesel(), patientDto.getPesel());
        assertEquals(patient.getBirthDate(), patientDto.getBirthDate());
        assertEquals(patient.isBlocked(), patientDto.isBlocked());
        assertEquals(patient.getCity(), patientDto.getCity());
        assertEquals(patient.getCountry(), patientDto.getCountry());
    }

    @Test
    void mapToPatient_shouldMapAllFieldsCorrectly() {
        // Given
        LocalDate birthDate = LocalDate.of(1995, 5, 5);
        PatientDto patientDto = new PatientDto(
                2L,
                "Anna",
                "Nowak",
                "anna@example.com",
                "12345678900",
                birthDate,
                true,
                "Kraków",
                "Polska"
        );

        // When
        Patient resultPatient = PatientMapper.mapToPatient(patientDto);

        // Then
        assertNotNull(resultPatient);
        assertEquals(patientDto.getPatientId(), resultPatient.getPatientId());
        assertEquals(patientDto.getFirstName(), resultPatient.getFirstName());
        assertEquals(patientDto.getLastName(), resultPatient.getLastName());
        assertEquals(patientDto.getEmail(), resultPatient.getEmail());
        assertEquals(patientDto.getPesel(), resultPatient.getPesel());
        assertEquals(patientDto.getBirthDate(), resultPatient.getBirthDate());
        assertEquals(patientDto.isBlocked(), resultPatient.isBlocked());
        assertEquals(patientDto.getCity(), resultPatient.getCity());
        assertEquals(patientDto.getCountry(), resultPatient.getCountry());
    }

    @Test
    void mapToPatientDtoList_shouldMapListOfPatients() {
        // Given
        Patient patient1 = new Patient(1L, "Jan", "Kowalski", "jan@test.pl", "12345678900", LocalDate.now(), false, "Wawa", "PL");
        Patient patient2 = new Patient(2L, "Ewa", "Nowak", "ewa@test.pl", "12345678900", LocalDate.now(), true, "Krk", "PL");
        List<Patient> patients = List.of(patient1, patient2);

        // When
        List<PatientDto> dtos = PatientMapper.mapToPatientDtoList(patients);

        // Then
        assertNotNull(dtos);
        assertEquals(2, dtos.size());
        assertEquals(patient1.getEmail(), dtos.get(0).getEmail());
        assertEquals(patient2.getEmail(), dtos.get(1).getEmail());
    }
}