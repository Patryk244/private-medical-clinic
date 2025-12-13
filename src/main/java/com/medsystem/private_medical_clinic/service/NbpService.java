package com.medsystem.private_medical_clinic.service;

import com.medsystem.private_medical_clinic.client.NbpConfig;
import com.medsystem.private_medical_clinic.domain.dto.NbpCurrencyDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@Slf4j
public class NbpService {
    private final RestTemplate restTemplate;
    private final NbpConfig config;

    public BigDecimal getEuroCurrency(String currency) {
        try {
            NbpCurrencyDto response = restTemplate.getForObject(config.getEndpointNbp() + "/A/"
                    + currency, NbpCurrencyDto.class);
            if (response != null && !response.getRates().isEmpty()) {
                BigDecimal midRate = response.getRates().get(0).getMid();
                log.info("Pobrano kurs EUR: {}", midRate);
                return midRate;
            }
        }
        catch (Exception e) {
            log.error(e.getMessage());
        }
        return BigDecimal.ZERO;
    }
}