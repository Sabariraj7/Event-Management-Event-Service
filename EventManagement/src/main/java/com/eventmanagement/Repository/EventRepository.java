package com.eventmanagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eventmanagement.Entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    //search query for get by EventName and Location
	@Query("SELECT e FROM Event e WHERE e.eventName LIKE %:query% OR e.hall.location LIKE %:query%")
    List<Event> searchByEventNameOrLocation(@Param("query") String query);
}



/*SELECT e 
FROM Event e 
WHERE LOWER(e.eventName) LIKE LOWER(%:query%) 
OR LOWER(e.hall.location) LIKE LOWER(%:query%) */