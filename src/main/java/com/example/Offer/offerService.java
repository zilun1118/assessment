package com.example.Offer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class offerService {

    @Autowired
    private offerRepository off_repo;


    public List<Offer> listAll(){
        return off_repo.findAll();
    }

    public void saveNewOffer(Offer newoffer){
        off_repo.save(newoffer);
    }
    public void save(Offer newoffer){
        off_repo.save(newoffer);
    }

    public List<String> getOngoingOffers(String offerDetail){
        return off_repo.findOngoingOffer(offerDetail);
    }

    public List<String> getPendingOffers(String offerDetail){
        return off_repo.findPendingOffer(offerDetail);
    }

    public List<String> getPastOffers(String offerDetail){
        return off_repo.findPastOffer(offerDetail);
    }

    public Offer updateOffer(Offer offer){
        Offer currentOffer = off_repo.findById(offer.getOfferId()).orElse(null);
        currentOffer.setOfferName(offer.getOfferName());
        currentOffer.setOfferDesc(offer.getOfferDesc());
        currentOffer.setOfferType(offer.getOfferType());
        currentOffer.setNo_Points(offer.getNo_Points());
        currentOffer.setCashRebate(offer.getCashRebate());
        currentOffer.setStartDate(offer.getStartDate());
        currentOffer.setEndDate(offer.getEndDate());
        currentOffer.setOfferStatus(offer.getOfferStatus());
        return off_repo.save(currentOffer);
    }

    public String deleteOfferById(Integer id){
        off_repo.deleteById(id);
        return "Successfully deleted offer!";
    }

}
