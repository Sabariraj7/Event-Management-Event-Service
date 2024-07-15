package com.eventmanagement.Service;

import com.eventmanagement.Entity.Offer;
import com.eventmanagement.Repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    public Map<String, Object> getOfferById(int offerId) {
        Map<String, Object> response = new HashMap<>();
        try {
            Offer offer = offerRepository.findById(offerId)
                    .orElseThrow(() -> new Exception("Offer not found"));
            response.put("status", "success");
            response.put("data", offer);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", e.getMessage());
        }
        return response;
    }

    public Map<String, Object> createOffer(Offer offer) {
        Map<String, Object> response = new HashMap<>();
        try {
            Offer createdOffer = offerRepository.save(offer);
            response.put("status", "success");
            response.put("data", createdOffer);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", e.getMessage());
        }
        return response;
    }

    public Map<String, Object> updateOffer(int offerId, Offer offer) {
        Map<String, Object> response = new HashMap<>();
        try {
            if (offerRepository.existsById(offerId)) {
                offer.setId(offerId);
                Offer updatedOffer = offerRepository.save(offer);
                response.put("status", "success");
                response.put("data", updatedOffer);
            } else {
                response.put("status", "error");
                response.put("message", "Offer ID not found, please provide a correct ID to update");
            }
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", e.getMessage());
        }
        return response;
    }

    public Map<String, Object> deleteOffer(int offerId) {
        Map<String, Object> response = new HashMap<>();
        try {
            if (offerRepository.existsById(offerId)) {
                offerRepository.deleteById(offerId);
                response.put("status", "success");
                response.put("message", "Offer " + offerId + " deleted successfully");
            } else {
                response.put("status", "error");
                response.put("message", "Offer ID not found, please provide a correct ID to delete");
            }
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error deleting offer: " + e.getMessage());
        }
        return response;
    }
}



//package com.eventmanagement.Service;
//
//import com.eventmanagement.Entity.Offer;
//import com.eventmanagement.Repository.OfferRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OfferService {
//
//    @Autowired
//    private OfferRepository offerRepository;
//
//    public List<Offer> getAllOffers() {
//        return offerRepository.findAll();
//    }
//
//    public Offer getOfferById(int offerId) {
//        return offerRepository.findById(offerId).orElse(null);
//    }
//
//    public Offer createOffer(Offer offer) {
//        return offerRepository.save(offer);
//    }
//
//    public Offer updateOffer(int offerId, Offer offer) {
//        if (offerRepository.existsById(offerId)) {
//            offer.setId(offerId);
//            return offerRepository.save(offer);
//        } else {
//            return null;
//        }
//    }
//
//    public void deleteOffer(int offerId) {
//        offerRepository.deleteById(offerId);
//    }
//}
