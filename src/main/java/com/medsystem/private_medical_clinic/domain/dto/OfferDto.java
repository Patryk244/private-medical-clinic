package com.medsystem.private_medical_clinic.domain.dto;

import com.medsystem.private_medical_clinic.domain.Specialization;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OfferDto {
    private Long offerId;

    @Length(min = 5, max = 100, message = "Typing offer name between from 5 to 100 characters.")
    private String offerName;

    @Length(min = 25, max = 250, message = "Typing description between from 25 to 250 characters.")
    private String description;

    private Specialization specialization;

    @NotNull(message = "Typing price")
    private BigDecimal pricePln;
}
