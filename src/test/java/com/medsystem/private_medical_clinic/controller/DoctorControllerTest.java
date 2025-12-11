package com.medsystem.private_medical_clinic.controller;

import com.medsystem.private_medical_clinic.domain.Doctor;
import com.medsystem.private_medical_clinic.domain.Specialization;
import com.medsystem.private_medical_clinic.domain.dto.DoctorDto;
import com.medsystem.private_medical_clinic.mapper.DoctorMapper;
import com.medsystem.private_medical_clinic.service.DoctorService;
import org.junit.jupiter.api.Test;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tools.jackson.databind.ObjectMapper;

import java.util.List;
import static org.mockito.Mockito.when;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DoctorController.class)
class DoctorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private DoctorService doctorService;

    @MockitoBean
    private DoctorMapper doctorMapper;

    private static final Logger logger = LoggerFactory.getLogger(DoctorControllerTest.class);

    @Test
    void shouldFetchEmptyList() throws Exception {
        when(doctorService.getAllDoctors()).thenReturn(List.of());

        mockMvc.perform(get("/v1/doctors")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(0)));
    }

    @Test
    void shouldNewDoctor() throws Exception {
        DoctorDto doctorDto = new DoctorDto(
                1L, "Jan", "Kowlaski", "jan@example.com" , Specialization.Cardiology
        );

        String doctorJson = new ObjectMapper().writeValueAsString(doctorDto);
        logger.info("doctorJson: " + doctorJson);
        Doctor doctor = DoctorMapper.maptoDoctor(doctorDto);
        when(doctorService.createDoctor(any(Doctor.class))).thenReturn(doctor);
        mockMvc.perform(post("/v1/doctor")
                .contentType(MediaType.APPLICATION_JSON)
                .content(doctorJson))
                .andExpect(status().isOk());
    }
}