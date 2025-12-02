package com.medsystem.private_medical_clinic.mapper;

import com.medsystem.private_medical_clinic.domain.Patient;
import com.medsystem.private_medical_clinic.domain.dto.PatientDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientMapper {

    public static PatientDto mapToPatientDto(Patient patient) {
        return new PatientDto(
                patient.getPatientId(),
                patient.getFirstName(),
                patient.getLastName(),
                patient.getEmail(),
                patient.getPassword(),
                patient.getBirthDate(),
                patient.isBlocked(),
                patient.getCity(),
                patient.getCountry()
        );
    }

    public static Patient mapToPatient(PatientDto patientDto) {
        return new Patient(
                patientDto.getPatientId(),
                patientDto.getFirstName(),
                patientDto.getLastName(),
                patientDto.getEmail(),
                patientDto.getPassword(),
                patientDto.getBirthDate(),
                patientDto.isBlocked(),
                patientDto.getCity(),
                patientDto.getCountry()
        );
    }

    public static List<PatientDto> mapToPatientDtoList(List<Patient> patients) {
        return patients.stream()
                .map(PatientMapper::mapToPatientDto)
                .collect(Collectors.toList());
    }
}