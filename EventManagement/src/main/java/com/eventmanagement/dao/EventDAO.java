//package com.eventmanagement.dao;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.eventmanagement.Entity.Event;
//import com.eventmanagement.Repository.EventRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class EventDAO {
//
//    @Autowired
//    private EventRepository eventRepository;
//
//    public List<Event> getAllEvents() {
//        return eventRepository.findAll();
//    }
//
//    public Event getEventById(int eventId) {
//        Optional<Event> optionalEvent = eventRepository.findById(eventId);
//        return optionalEvent.orElse(null);
//    }
//
//    public Event createEvent(Event event) {
//        return eventRepository.save(event);
//    }
//
//    public Event updateEvent(Event event) {
//        if (eventRepository.existsById(event.getId())) {
//            return eventRepository.save(event);
//        }
//        return null;
//    }
//
//    public void deleteEvent(int eventId) {
//        eventRepository.deleteById(eventId);
//    }
//}
