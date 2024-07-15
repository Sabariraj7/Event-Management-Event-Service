//package com.eventmanagement.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.eventmanagement.Entity.Booking;
//import com.eventmanagement.Repository.BookingRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class BookingDAO {
//
//    @Autowired
//    private BookingRepository bookingRepository;
//
//    public List<Booking> getAllBookings() {
//        return bookingRepository.findAll();
//    }
//
//    public Booking getBookingById(int bookingId) {
//        Optional<Booking> optionalBooking = bookingRepository.findById(bookingId);
//        return optionalBooking.orElse(null);
//    }
//
//    public Booking createBooking(Booking booking) {
//        return bookingRepository.save(booking);
//    }
//    public Booking updateBooking(Booking booking) {
//        return bookingRepository.save(booking);
//    }
//
//    public void deleteBooking(int bookingId) {
//        bookingRepository.deleteById(bookingId);
//    }
//    public String addBookingWithTicket(int eventId, int userId, int numberOfTickets) {
//        List<String> result = bookingRepository.addBookingWithTicket(eventId, userId, numberOfTickets);
//        return result.isEmpty() ? null : result.get(0);
//    }
//    
////    public void addBookingWithTicket(int eventId, int userId, int numberOfTickets) {
////        bookingRepository.addBookingWithTicket(eventId, userId, numberOfTickets);
////    }
//}
//
