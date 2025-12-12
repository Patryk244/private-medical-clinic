package com.medsystem.private_medical_clinic.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "offers")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;

    @Column(name = "offerName")
    private String offerName;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    private Specialization specialization;

    @Column(name = "pricePln")
    private BigDecimal pricePln;
}
