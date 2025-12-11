package com.medsystem.private_medical_clinic.mapper;

import com.medsystem.private_medical_clinic.domain.Doctor;
import com.medsystem.private_medical_clinic.domain.dto.DoctorDto;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorMapper {

    public static DoctorDto maptoDoctorDto(Doctor doctor) {
        return new DoctorDto(
                doctor.getDoctorId(),
                doctor.getFirstName(),
                doctor.getLastName(),
                doctor.getEmail(),
                doctor.getSpecialization()
        );
    }

    public static Doctor maptoDoctor(DoctorDto doctorDto) {
        return new Doctor(
                doctorDto.getDoctorId(),
                doctorDto.getFirstName(),
                doctorDto.getLastName(),
                doctorDto.getEmail(),
                doctorDto.getSpecialization()
        );
    }

    public static List<DoctorDto> mapToDoctorDtoList(List<Doctor> doctors) {
        return doctors.stream()
                .map(DoctorMapper::maptoDoctorDto)
                .collect(Collectors.toList());
    }
}