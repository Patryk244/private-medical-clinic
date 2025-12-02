package com.medsystem.private_medical_clinic.repository;

import com.medsystem.private_medical_clinic.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {
    List<Patient> findAll();
}
