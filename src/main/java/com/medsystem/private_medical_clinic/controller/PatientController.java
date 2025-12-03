package com.medsystem.private_medical_clinic.controller;

import com.medsystem.private_medical_clinic.domain.Patient;
import com.medsystem.private_medical_clinic.domain.dto.PatientDto;
import com.medsystem.private_medical_clinic.mapper.PatientMapper;
import com.medsystem.private_medical_clinic.service.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/")
public class PatientController {

    private final PatientService patientService;

    @GetMapping("patients")
    public List<PatientDto> getPatients() {
        return PatientMapper.mapToPatientDtoList(patientService.getAllPatients());
    }

    @PostMapping(value = "patient", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PatientDto> createPatient(@Valid @RequestBody PatientDto patientDto) {
        Patient patient = PatientMapper.mapToPatient(new PatientDto(
                null,
                patientDto.getFirstName(),
                patientDto.getLastName(),
                patientDto.getEmail(),
                patientDto.getPassword(),
                patientDto.getBirthDate(),
                patientDto.isBlocked(),
                patientDto.getCity(),
                patientDto.getCountry()
        ));
        Patient savedPatient = patientService.createPatient(patient);
        return ResponseEntity.ok(PatientMapper.mapToPatientDto(savedPatient));
    }

}