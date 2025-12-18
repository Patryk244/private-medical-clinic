package com.medsystem.private_medical_clinic.client;

import com.medsystem.private_medical_clinic.domain.dto.NbpCurrencyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.slf4j.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;
import java.net.URI;

@Component
@RequiredArgsConstructor
public class NbpClient {
    private static Logger logger = LoggerFactory.getLogger(NbpClient.class);
    private final RestTemplate restTemplate;
    private final NbpConfig config;

    private URI buildNbpUri(String typeTable, String currency) {
        logger.info("buildNbpUri: ");
        return UriComponentsBuilder.fromUriString(config.getEndpointNbp() + '/' + typeTable + '/' + currency)
                .queryParam("format", "json")
                .build().encode().toUri();
    }

    public NbpCurrencyDto getCurrencyRate(String currency) {
        URI url = buildNbpUri("A", currency);
        try {
            return restTemplate.getForObject(url, NbpCurrencyDto.class);
        } catch (Exception e) {
            logger.error("Unable to get a currency {}: {}", currency, e.getMessage());
            return null;
        }
    }
}
