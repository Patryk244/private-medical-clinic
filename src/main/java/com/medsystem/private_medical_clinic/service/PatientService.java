package com.medsystem.private_medical_clinic.service;

import com.medsystem.private_medical_clinic.controller.errorController.PatientNotFound;
import com.medsystem.private_medical_clinic.domain.Patient;
import com.medsystem.private_medical_clinic.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient findPatientByEmailAndPesel(String email, String password) {
        Patient patient = patientRepository.FindPatientByEmailAndPesel(email, password);
        if (patient == null) {
            throw new PatientNotFound();
        }
        return patient;
    }
}