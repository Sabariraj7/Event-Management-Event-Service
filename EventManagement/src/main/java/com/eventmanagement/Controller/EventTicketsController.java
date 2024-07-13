//package com.eventmanagement.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.eventmanagement.Entity.EventTickets;
//import com.eventmanagement.Service.EventTicketsService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/event-tickets")
//public class EventTicketsController {
//
//    @Autowired
//    private EventTicketsService eventTicketsService;
//
//    @GetMapping("/getall")
//    public List<EventTickets> getAllEventTickets() {
//        return eventTicketsService.getAllEventTickets();
//    }
//
//    @GetMapping("/{eventTicketsId}")
//    public EventTickets getEventTicketsById(@PathVariable int eventTicketsId) {
//        return eventTicketsService.getEventTicketsById(eventTicketsId);
//    }
//
//    @PostMapping("/add")
//    public EventTickets createEventTickets(@RequestBody EventTickets eventTickets) {
//        return eventTicketsService.createEventTickets(eventTickets);
//    }
//
//    @PutMapping("/update/{eventTicketsId}")
//    public EventTickets updateEventTickets(@PathVariable int eventTicketsId, @RequestBody EventTickets eventTickets) {
//        return eventTicketsService.updateEventTickets(eventTicketsId, eventTickets);
//    }
//
//    @DeleteMapping("/delete/{eventTicketsId}")
//    public void deleteEventTickets(@PathVariable int eventTicketsId) {
//        eventTicketsService.deleteEventTickets(eventTicketsId);
//    }
//}
