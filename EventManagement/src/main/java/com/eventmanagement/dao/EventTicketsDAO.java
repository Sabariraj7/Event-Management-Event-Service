//package com.eventmanagement.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.eventmanagement.Entity.EventTickets;
//import com.eventmanagement.Repository.EventTicketsRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class EventTicketsDAO {
//
//    @Autowired
//    private EventTicketsRepository eventTicketsRepository;
//
//    public List<EventTickets> getAllEventTickets() {
//        return eventTicketsRepository.findAll();
//    }
//
//    public EventTickets getEventTicketsById(int eventTicketsId) {
//        Optional<EventTickets> optionalEventTickets = eventTicketsRepository.findById(eventTicketsId);
//        return optionalEventTickets.orElse(null);
//    }
//
//    public EventTickets createEventTickets(EventTickets eventTickets) {
//        return eventTicketsRepository.save(eventTickets);
//    }
//
//    public EventTickets updateEventTickets(EventTickets eventTickets) {
//        return eventTicketsRepository.save(eventTickets);
//    }
//
//    public void deleteEventTickets(int eventTicketsId) {
//        eventTicketsRepository.deleteById(eventTicketsId);
//    }
//}
