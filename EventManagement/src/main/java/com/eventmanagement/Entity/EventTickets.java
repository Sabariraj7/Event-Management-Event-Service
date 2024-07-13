//package com.eventmanagement.Entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "eventtickets")
//public class EventTickets {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//
//    @ManyToOne
//    @JoinColumn(name = "eventid", referencedColumnName = "id")
//    private Event event;
//
//    @Column(name = "availabletickets")
//    private int availableTickets;
//
//    public EventTickets() {
//    }
//
//    public EventTickets(Event event, int availableTickets) {
//        this.event = event;
//        this.availableTickets = availableTickets;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Event getEvent() {
//        return event;
//    }
//
//    public void setEvent(Event event) {
//        this.event = event;
//    }
//
//    public int getAvailableTickets() {
//        return availableTickets;
//    }
//
//    public void setAvailableTickets(int availableTickets) {
//        this.availableTickets = availableTickets;
//    }
//
//    @Override
//    public String toString() {
//        return "EventTickets{" +
//                "id=" + id +
//                ", event=" + event +
//                ", availableTickets=" + availableTickets +
//                '}';
//    }
//}
