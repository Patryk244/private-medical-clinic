package com.medsystem.private_medical_clinic.mapper;

import com.medsystem.private_medical_clinic.domain.Offer;
import com.medsystem.private_medical_clinic.domain.dto.OfferDto;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfferMapper {

    public static Offer mapToOffer(OfferDto offerDto) {
        return new Offer(
                offerDto.getOfferId(),
                offerDto.getOfferName(),
                offerDto.getDescription(),
                offerDto.getSpecialization(),
                offerDto.getPricePln()
        );
    }

    public static OfferDto mapToOfferDto(Offer offer) {
        return new OfferDto(
                offer.getOfferId(),
                offer.getOfferName(),
                offer.getDescription(),
                offer.getSpecialization(),
                offer.getPricePln()
        );
    }

    public static List<OfferDto> mapToOfferDtoList(List<Offer> offers) {
        return offers.stream()
                .map(OfferMapper::mapToOfferDto)
                .collect(Collectors.toList());
    }
}