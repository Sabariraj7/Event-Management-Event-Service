//package com.eventmanagement.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.eventmanagement.Entity.BookingTickets;
//import com.eventmanagement.Repository.BookingTicketsRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class BookingTicketsDAO {
//
//    @Autowired
//    private BookingTicketsRepository bookingTicketsRepository;
//
//    public List<BookingTickets> getAllBookingTickets() {
//        return bookingTicketsRepository.findAll();
//    }
//
//    public BookingTickets getBookingTicketsById(int bookingTicketsId) {
//        Optional<BookingTickets> optionalBookingTickets = bookingTicketsRepository.findById(bookingTicketsId);
//        return optionalBookingTickets.orElse(null);
//    }
//
//    public BookingTickets createBookingTickets(BookingTickets bookingTickets) {
//        return bookingTicketsRepository.save(bookingTickets);
//    }
//
//    public BookingTickets updateBookingTickets(BookingTickets bookingTickets) {
//        return bookingTicketsRepository.save(bookingTickets);
//    }
//
//    public void deleteBookingTickets(int bookingTicketsId) {
//        bookingTicketsRepository.deleteById(bookingTicketsId);
//    }
//}