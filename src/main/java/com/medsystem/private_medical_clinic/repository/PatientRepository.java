package com.medsystem.private_medical_clinic.repository;

import com.medsystem.private_medical_clinic.domain.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {
    List<Patient> findAll();

    @Query(nativeQuery = true)
    Patient FindPatientByEmailAndPesel(@Param("EMAIL") String email, @Param("PESEL") String pesel);
}
