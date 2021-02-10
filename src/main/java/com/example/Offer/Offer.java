package com.example.Offer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


@Entity
public class Offer {
    private Integer offerId;
    private String offerName;
    private String offerDesc;
    private String offerType;
    private Integer no_Points;
    private Integer cashRebate;
    private Date startDate;
    private Date endDate;
    private String offerStatus;

    public Offer(Integer offerId, String offerName, String offerDesc, String offerType, Integer no_Points, Integer cashRebate, Date startDate, Date endDate,String offerStatus) {
        this.offerId = offerId;
        this.offerName = offerName;
        this.offerDesc = offerDesc;
        this.offerType = offerType;
        this.no_Points = no_Points;
        this.cashRebate = cashRebate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.offerStatus = offerStatus;
    }

    public Offer(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferDesc() {
        return offerDesc;
    }

    public void setOfferDesc(String offerDesc) {
        this.offerDesc = offerDesc;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public Integer getNo_Points() {
        return no_Points;
    }

    public void setNo_Points(Integer no_Points) {
        this.no_Points = no_Points;
    }

    public Integer getCashRebate() {
        return cashRebate;
    }

    public void setCashRebate(Integer cashRebate) {
        this.cashRebate = cashRebate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
    }
}
