package com.medsystem.private_medical_clinic.service;

import com.medsystem.private_medical_clinic.client.NbpClient;
import com.medsystem.private_medical_clinic.domain.dto.NbpCurrencyDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@Slf4j
public class NbpService {
    private final NbpClient nbpClient;
    public BigDecimal getEuroCurrency(String currency) {
        NbpCurrencyDto response = nbpClient.getCurrencyRate(currency);
        if (response != null && response.getRates() != null && !response.getRates().isEmpty()) {
            BigDecimal midRate = response.getRates().get(0).getMid();
            log.info("Current exchange rate {}: {}", currency, midRate);
            return midRate;
        }

        log.warn("Not found or other mistake: {}", currency);
        return BigDecimal.ZERO;
    }
}