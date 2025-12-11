package com.medsystem.private_medical_clinic.controller;

import com.medsystem.private_medical_clinic.domain.Doctor;
import com.medsystem.private_medical_clinic.domain.dto.DoctorDto;
import com.medsystem.private_medical_clinic.mapper.DoctorMapper;
import com.medsystem.private_medical_clinic.service.DoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/")
public class DoctorController {

    private final DoctorService doctorService;
    private static final Logger log = LoggerFactory.getLogger(DoctorController.class);

    @GetMapping("doctors")
    public List<DoctorDto> getAllDoctors() {
        return DoctorMapper.mapToDoctorDtoList(doctorService.getAllDoctors());
    }

    @PostMapping(value = "doctor", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DoctorDto> addDoctor(@Valid @RequestBody DoctorDto doctorDto) {
        log.info("Doctor firstname: " + doctorDto.getFirstName());
        log.info("Doctor lastname: " + doctorDto.getLastName());
        log.info("Doctor email: " + doctorDto.getEmail());
        log.info("Doctor specialization: " + doctorDto.getSpecialization());
        Doctor doctor = DoctorMapper.maptoDoctor(new DoctorDto(
                null,
                doctorDto.getFirstName(),
                doctorDto.getLastName(),
                doctorDto.getEmail(),
                doctorDto.getSpecialization()
        ));
        Doctor savedDoctor = doctorService.createDoctor(doctor);
        return ResponseEntity.ok(DoctorMapper.maptoDoctorDto(savedDoctor));
    }

}