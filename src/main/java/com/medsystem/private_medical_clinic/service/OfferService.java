package com.medsystem.private_medical_clinic.service;

import com.medsystem.private_medical_clinic.domain.Offer;
import com.medsystem.private_medical_clinic.repository.OfferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OfferService {

    private final OfferRepository offerRepository;

    public Offer createOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    public Offer findOfferById(long id) {
        return offerRepository.findById(id);
    }
}
