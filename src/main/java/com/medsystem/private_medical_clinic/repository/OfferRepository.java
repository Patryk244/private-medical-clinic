package com.medsystem.private_medical_clinic.repository;


import com.medsystem.private_medical_clinic.domain.Offer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface OfferRepository extends CrudRepository<Offer, Long> {
    List<Offer> findAll();
    Offer findById(long id);
}