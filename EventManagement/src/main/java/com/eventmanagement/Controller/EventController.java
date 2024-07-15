package com.eventmanagement.Controller;

import com.eventmanagement.Entity.Event;
import com.eventmanagement.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventmicroservice/events")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/getall")
	public List<Event> getAllEvents() {
		return eventService.getAllEvents();
	}
	
	@GetMapping("/{eventId}")
	public Event getEventById(@PathVariable int eventId) {
		return eventService.getEventById(eventId);
	}
	
	@PostMapping("/add")
	public Event createEvent(@RequestBody Event event) {
		return eventService.createEvent(event);
	}
	
//	@PutMapping("/update/{eventId}")
//	public String updateEvent(@PathVariable int eventId, @RequestBody Event event) {
//		return eventService.updateEvent(eventId, event);
//	}
	@PutMapping("/update/{eventId}")
	public String updateEvent(@PathVariable int eventId, @RequestBody Event event) {
	    return eventService.updateEvent(eventId, event);
	}
	
	@DeleteMapping("/delete/{eventId}")
	public String deleteEvent(@PathVariable int eventId) {
		return eventService.deleteEvent(eventId);
	}
	
	@GetMapping("/search")
    public List<Event> searchEvents(@RequestParam String query) {
        return eventService.searchEvents(query);
    }
}
//package com.eventmanagement.Controller;
//
//import com.eventmanagement.Entity.Event;
//import com.eventmanagement.Service.EventService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/events")
//public class EventController {
//
//    @Autowired
//    private EventService eventService;
//
//    @GetMapping("/getall")
//    public List<Event> getAllEvents() {
//        return eventService.getAllEvents();
//    }
//
//    @GetMapping("/{eventId}")
//    public Map<String, Object> getEventById(@PathVariable int eventId) {
//        return eventService.getEventById(eventId);
//    }
//
//    @PostMapping("/add")
//    public Map<String, Object> createEvent(@RequestBody Event event) {
//        return eventService.createEvent(event);
//    }
//
//    @PutMapping("/update/{eventId}")
//    public Map<String, Object> updateEvent(@PathVariable int eventId, @RequestBody Event event) {
//        return eventService.updateEvent(eventId, event);
//    }
//
//    @DeleteMapping("/delete/{eventId}")
//    public Map<String, Object> deleteEvent(@PathVariable int eventId) {
//        return eventService.deleteEvent(eventId);
//    }
//}




//package com.eventmanagement.Controller;
//
//import com.eventmanagement.Entity.Event;
//import com.eventmanagement.Service.EventService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/events")
//public class EventController {
//
//    @Autowired
//    private EventService eventService;
//
//    @GetMapping("/getall")
//    public List<Event> getAllEvents() {
//        return eventService.getAllEvents();
//    }
//
//    @GetMapping("/{eventId}")
//    public Event getEventById(@PathVariable int eventId) {
//        return eventService.getEventById(eventId);
//    }
//
//    @PostMapping("/add")
//    public Event createEvent(@RequestBody Event event) {
//        return eventService.createEvent(event);
//    }
//
//    @PutMapping("/update/{eventId}")
//    public Event updateEvent(@PathVariable int eventId, @RequestBody Event event) {
//        return eventService.updateEvent(eventId, event);
//    }
//
//    @DeleteMapping("/delete/{eventId}")
//    public void deleteEvent(@PathVariable int eventId) {
//        eventService.deleteEvent(eventId);
//    }
//}
