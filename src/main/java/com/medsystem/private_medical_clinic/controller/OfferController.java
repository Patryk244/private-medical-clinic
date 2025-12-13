package com.medsystem.private_medical_clinic.controller;

import com.medsystem.private_medical_clinic.client.NbpClient;
import com.medsystem.private_medical_clinic.domain.Offer;
import com.medsystem.private_medical_clinic.domain.dto.OfferDto;
import com.medsystem.private_medical_clinic.mapper.OfferMapper;
import com.medsystem.private_medical_clinic.service.NbpService;
import com.medsystem.private_medical_clinic.service.OfferService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import org.slf4j.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/")
public class OfferController {

    private final NbpClient nbpClient;
    private final OfferService offerService;
    private final NbpService nbpService;
    private static final Logger log = LoggerFactory.getLogger(OfferController.class);

    @GetMapping("offers")
    public List<OfferDto> getAllOffers() {
        return OfferMapper.mapToOfferDtoList(offerService.getAllOffers());
    }

    @PostMapping(value = "offer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OfferDto> createOffer(@Valid @RequestBody OfferDto offerDto) {
        Offer offer = OfferMapper.mapToOffer(new OfferDto(
                null,
                offerDto.getOfferName(),
                offerDto.getDescription(),
                offerDto.getSpecialization(),
                offerDto.getPricePln()
        ));
        return ResponseEntity.ok(OfferMapper.mapToOfferDto(offerService.createOffer(offer)));
    }


    @PutMapping(value = "offers/id/{id}/change/price")
    public ResponseEntity<OfferDto> updateOffer(@Valid @RequestBody OfferDto offerDto, @PathVariable long id) {
        Offer findOfferById = offerService.findOfferById(id);
        findOfferById.setPricePln(offerDto.getPricePln());
        Offer savedAfterChanges = offerService.createOffer(findOfferById);
        return ResponseEntity.ok(OfferMapper.mapToOfferDto(savedAfterChanges));
    }

    @GetMapping("currency/{currency}")
    public BigDecimal getCurrencyFromNbp(@PathVariable String currency) {
        BigDecimal rate = nbpService.getEuroCurrency(currency);
        log.info("Current EUR RATE: {}", rate);

        return rate;
    }
}
