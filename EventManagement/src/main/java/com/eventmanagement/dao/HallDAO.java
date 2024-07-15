//package com.eventmanagement.dao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.eventmanagement.Entity.Hall;
//import com.eventmanagement.Repository.HallRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class HallDAO {
//
//    @Autowired
//    private HallRepository hallRepository;
//
//    public List<Hall> getAllHalls() {
//        return hallRepository.findAll();
//    }
//
//    public Hall getHallById(Long hallId) {
//        Optional<Hall> optionalHall = hallRepository.findById(hallId);
//        return optionalHall.orElse(null);
//    }
//
//    public Hall createHall(Hall hall) {
//        return hallRepository.save(hall);
//    }
//
//    public Hall updateHall(Hall hall) {
//        if (hallRepository.existsById(hall.getId())) {
//            return hallRepository.save(hall);
//        }
//        return null;
//    }
//
//    public void deleteHall(Long hallId) {
//        hallRepository.deleteById(hallId);
//    }
//}
