package com.medsystem.private_medical_clinic.client;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class NbpConfig {
    @Value("${api.nbp}")
    private String endpointNbp;
}