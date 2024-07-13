package com.eventmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eventmanagement.Entity.Offer;
import com.eventmanagement.Service.OfferService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/eventmicroservice/offers")
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping("/getall")
    public List<Offer> getAllOffers() {
        return offerService.getAllOffers();
    }

    @GetMapping("/{offerId}")
    public Map<String, Object> getOfferById(@PathVariable int offerId) {
        return offerService.getOfferById(offerId);
    }

    @PostMapping("/add")
    public Map<String, Object> createOffer(@RequestBody Offer offer) {
        return offerService.createOffer(offer);
    }

    @PutMapping("/update/{offerId}")
    public Map<String, Object> updateOffer(@PathVariable int offerId, @RequestBody Offer offer) {
        return offerService.updateOffer(offerId, offer);
    }

    @DeleteMapping("/delete/{offerId}")
    public Map<String, Object> deleteOffer(@PathVariable int offerId) {
        return offerService.deleteOffer(offerId);
    }
}




//package com.eventmanagement.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.eventmanagement.Entity.Offer;
//import com.eventmanagement.Service.OfferService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/offers")
//public class OfferController {
//
//    @Autowired
//    private OfferService offerService;
//
//    @GetMapping("/getall")
//    public List<Offer> getAllOffers() {
//        return offerService.getAllOffers();
//    }
//
//    @GetMapping("/{offerId}")
//    public Offer getOfferById(@PathVariable int offerId) {
//        return offerService.getOfferById(offerId);
//    }
//
//    @PostMapping("/add")
//    public Offer createOffer(@RequestBody Offer offer) {
//        return offerService.createOffer(offer);
//    }
//
//    @PutMapping("/update/{offerId}")
//    public Offer updateOffer(@PathVariable int offerId, @RequestBody Offer offer) {
//        return offerService.updateOffer(offerId, offer);
//    }
//
//    @DeleteMapping("/delete/{offerId}")
//    public void deleteOffer(@PathVariable int offerId) {
//        offerService.deleteOffer(offerId);
//    }
//}
