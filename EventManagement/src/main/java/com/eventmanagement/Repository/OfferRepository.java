package com.eventmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventmanagement.Entity.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {
	
}
