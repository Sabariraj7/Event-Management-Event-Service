package com.eventmanagement.Service;

import com.eventmanagement.Entity.Event;
import com.eventmanagement.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}
	
	public Event getEventById(int eventId) {
		return eventRepository.findById(eventId).orElse(null);
	}
	
	public Event createEvent(Event event) {
		return eventRepository.save(event);
	}
	
	public String updateEvent(int eventId, Event event) {
		if (eventRepository.existsById(eventId)) {
			event.setId(eventId); // Ensure the event ID is set
			eventRepository.save(event);
			return "Event updated successfully";
		} else {
			return "Event id not found, please provide a correct id to update";
		}
	}
	
	public String deleteEvent(int eventId) {
		if (eventRepository.existsById(eventId)) {
			eventRepository.deleteById(eventId);
			return "Event deleted successfully";
		} else {
			return "Event id not found, please provide a correct id to delete";
		}
	}
	
	public List<Event> searchEvents(String query) {
        return eventRepository.searchByEventNameOrLocation(query);
    }
}
//package com.eventmanagement.Service;
//
//import com.eventmanagement.Entity.Event;
//import com.eventmanagement.Repository.EventRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class EventService {
//
//    @Autowired
//    private EventRepository eventRepository;
//
//    public List<Event> getAllEvents() {
//        return eventRepository.findAll();
//    }
//
//    public Map<String, Object> getEventById(int eventId) {
//        Map<String, Object> response = new HashMap<>();
//        try {
//            Event event = eventRepository.findById(eventId)
//                    .orElseThrow(() -> new Exception("Event not found"));
//            response.put("status", "success");
//            response.put("data", event);
//        } catch (Exception e) {
//            response.put("status", "error");
//            response.put("message", e.getMessage());
//        }
//        return response;
//    }
//
//    public Map<String, Object> createEvent(Event event) {
//        Map<String, Object> response = new HashMap<>();
//        try {
//            Event createdEvent = eventRepository.save(event);
//            response.put("status", "success");
//            response.put("data", createdEvent);
//        } catch (Exception e) {
//            response.put("status", "error");
//            response.put("message", e.getMessage());
//        }
//        return response;
//    }
//
//    public Map<String, Object> updateEvent(int eventId, Event event) {
//        Map<String, Object> response = new HashMap<>();
//        try {
//            if (eventRepository.existsById(eventId)) {
//                event.setId(eventId); // Ensure the event ID is set
//                eventRepository.save(event);
//                response.put("status", "success");
//                response.put("message", "Event updated successfully");
//            } else {
//                response.put("status", "error");
//                response.put("message", "Event id not found, please provide a correct id to update");
//            }
//        } catch (Exception e) {
//            response.put("status", "error");
//            response.put("message", "Error updating event: " + e.getMessage());
//        }
//        return response;
//    }
//
//    public Map<String, Object> deleteEvent(int eventId) {
//        Map<String, Object> response = new HashMap<>();
//        try {
//            if (eventRepository.existsById(eventId)) {
//                eventRepository.deleteById(eventId);
//                response.put("status", "success");
//                response.put("message", "Event deleted successfully");
//            } else {
//                response.put("status", "error");
//                response.put("message", "Event id not found, please provide a correct id to delete");
//            }
//        } catch (Exception e) {
//            response.put("status", "error");
//            response.put("message", "Error deleting event: " + e.getMessage());
//        }
//        return response;
//    }
//}




//package com.eventmanagement.Service;
//
//import com.eventmanagement.Entity.Event;
//import com.eventmanagement.Repository.EventRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EventService {
//
//    @Autowired
//    private EventRepository eventRepository;
//
//    public List<Event> getAllEvents() {
//        return eventRepository.findAll();
//    }
//
//    public Event getEventById(int eventId) {
//        return eventRepository.findById(eventId).orElse(null);
//    }
//
//    public Event createEvent(Event event) {
//        return eventRepository.save(event);
//    }
//
//    public Event updateEvent(int eventId, Event event) {
//        if (eventRepository.existsById(eventId)) {
//            event.setId(eventId); // Ensure the event ID is set
//            return eventRepository.save(event);
//        } else {
//            return null;
//        }
//    }
//
//    public void deleteEvent(int eventId) {
//        eventRepository.deleteById(eventId);
//    }
//}
