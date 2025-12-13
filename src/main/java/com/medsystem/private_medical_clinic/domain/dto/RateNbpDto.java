package com.medsystem.private_medical_clinic.domain.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RateNbpDto {
    private String no;
    private LocalDate effectiveDate;
    private BigDecimal mid;
}
