package com.example.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class offerController {

    @Autowired
    private offerService service;

    @GetMapping("/offers/all-offers")
    public List<Offer> list(){
        return service.listAll();
    }

    @GetMapping("/offers/ongoing")
    public List<String> getOngoingOffer(String offerDetail){
        return service.getOngoingOffers(offerDetail);
    }

    @GetMapping("/offers/pending")
    public List<String> getPendingOffer(String offerDetail){
        return service.getPendingOffers(offerDetail);
    }

    @GetMapping("/offers/past")
    public List<String> getPastOffer(String offerDetail){
        return service.getPastOffers(offerDetail);
    }

    @PostMapping("/insertOffer")
    public void insertOffer(@RequestBody Offer newoffer){
        service.saveNewOffer(newoffer);
    }

    @PutMapping("/updateOffer")
    public Offer updateOffer(@RequestBody Offer offer){
        return service.updateOffer(offer);
    }

    @DeleteMapping("offers/delete/{id}")
    public String deleteOffer(@PathVariable Integer id){
        return service.deleteOfferById(id);
    }

}
