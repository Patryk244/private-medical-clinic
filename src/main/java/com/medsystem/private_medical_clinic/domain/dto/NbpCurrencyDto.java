package com.medsystem.private_medical_clinic.domain.dto;

import java.util.List;
import lombok.*;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NbpCurrencyDto {
    private String table;
    private String currency;
    private String code;
    private List<RateNbpDto> rates;
}