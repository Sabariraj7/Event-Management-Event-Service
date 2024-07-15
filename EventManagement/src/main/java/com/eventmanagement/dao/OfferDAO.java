//package com.eventmanagement.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.eventmanagement.Entity.Offer;
//import com.eventmanagement.Repository.OfferRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class OfferDAO {
//
//    @Autowired
//    private OfferRepository offerRepository;
//
//    public List<Offer> getAllOffers() {
//        return offerRepository.findAll();
//    }
//
//    public Offer getOfferById(int offerId) {
//        Optional<Offer> optionalOffer = offerRepository.findById(offerId);
//        return optionalOffer.orElse(null);
//    }
//
//    public Offer createOffer(Offer offer) {
//        return offerRepository.save(offer);
//    }
//
//    public Offer updateOffer(Offer offer) {
//        return offerRepository.save(offer);
//    }
//
//    public void deleteOffer(int offerId) {
//        offerRepository.deleteById(offerId);
//    }
//}
