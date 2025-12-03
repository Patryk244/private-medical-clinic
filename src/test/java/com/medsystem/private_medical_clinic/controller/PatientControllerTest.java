package com.medsystem.private_medical_clinic.controller;

import com.google.gson.Gson;
import com.medsystem.private_medical_clinic.domain.Patient;
import com.medsystem.private_medical_clinic.domain.dto.PatientDto;
import com.medsystem.private_medical_clinic.mapper.PatientMapper;
import com.medsystem.private_medical_clinic.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.*;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tools.jackson.databind.ObjectMapper;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.time.LocalDate;
import java.util.List;
import org.slf4j.*;



@WebMvcTest(PatientController.class)
class PatientControllerTest {

    private static final Logger log = LoggerFactory.getLogger(PatientControllerTest.class);

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private PatientService patientService;

    @MockitoBean
    private PatientMapper patientMapper;




    @Test
    void shouldFetchEmptyList() throws Exception {
        when(patientService.getAllPatients()).thenReturn(List.of());

        mockMvc.perform(get("/v1/patients")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(0)));
    }

    @Test
    void shouldAddNewPatient() throws Exception {
        LocalDate date = LocalDate.of(1995, 5 ,6);

        PatientDto patientDto = new PatientDto(
                null, "Anna", "Nowak", "anna@example.com", "tajneee456",
                date, false, "Krakow", "Polska"
        );
        Patient patient = PatientMapper.mapToPatient(new PatientDto(
                12L,
                patientDto.getFirstName(),
                patientDto.getLastName(),
                patientDto.getEmail(),
                patientDto.getPassword(),
                patientDto.getBirthDate(),
                patientDto.isBlocked(),
                patientDto.getCity(),
                patientDto.getCountry()
        ));

        String patientJson = new ObjectMapper().writeValueAsString(patientDto);
        when(patientService.createPatient(any(Patient.class))).thenReturn(patient);

        log.info("patientJson: {}", patientJson);

        mockMvc.perform(post("/v1/patient")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(patientJson)) // Przekazujemy wygenerowany JSON
                .andDo(print())
                .andExpect(status().isOk());
    }
}