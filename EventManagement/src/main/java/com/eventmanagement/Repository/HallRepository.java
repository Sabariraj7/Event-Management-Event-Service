package com.eventmanagement.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventmanagement.Entity.Hall;

@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {
	
}

