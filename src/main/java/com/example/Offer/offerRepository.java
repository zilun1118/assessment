package com.example.Offer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface offerRepository extends JpaRepository<Offer,Integer> {

    //This is to get all the On going offers
    @Query("SELECT offerId," +
            "offerName," +
            "offerDesc," +
            "offerType, " +
            "no_Points, " +
            "cashRebate, " +
            "startDate, " +
            "endDate, " +
            "offerStatus " +
            "FROM Offer WHERE offerStatus='Ongoing'")
    List<String> findOngoingOffer(String offerDetail);

    //This is to get all the Pending Offers
    @Query("SELECT offerId," +
            "offerName," +
            "offerDesc," +
            "offerType, " +
            "no_Points, " +
            "cashRebate, " +
            "startDate, " +
            "endDate, " +
            "offerStatus " +
            "FROM Offer WHERE offerStatus='Pending'")
    List<String> findPendingOffer(String offerDetail);

    //This is to get all the Past Offers
    @Query("SELECT offerId," +
            "offerName," +
            "offerDesc," +
            "offerType, " +
            "no_Points, " +
            "cashRebate, " +
            "startDate, " +
            "endDate, " +
            "offerStatus " +
            "FROM Offer WHERE offerStatus='Past'")
    List<String> findPastOffer(String offerDetail);
}
