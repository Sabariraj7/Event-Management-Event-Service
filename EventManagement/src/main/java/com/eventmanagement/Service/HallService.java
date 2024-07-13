package com.eventmanagement.Service;

import com.eventmanagement.Entity.Hall;
import com.eventmanagement.Repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HallService {

    @Autowired
    private HallRepository hallRepository;

    public List<Hall> getAllHalls() {
        return hallRepository.findAll();
    }

    public Map<String, Object> getHallById(Long hallId) {
        Map<String, Object> response = new HashMap<>();
        try {
            Hall hall = hallRepository.findById(hallId)
                    .orElseThrow(() -> new Exception("Hall not found"));
            response.put("status", "success");
            response.put("data", hall);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", e.getMessage());
        }
        return response;
    }

    public Map<String, Object> createHall(Hall hall) {
        Map<String, Object> response = new HashMap<>();
        try {
            Hall createdHall = hallRepository.save(hall);
            response.put("status", "success");
            response.put("data", createdHall);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", e.getMessage());
        }
        return response;
    }

    public Map<String, Object> updateHall(Long hallId, Hall hall) {
        Map<String, Object> response = new HashMap<>();
        try {
            if (hallRepository.existsById(hallId)) {
                hall.setId(hallId); // Ensure the hall ID is set
                hallRepository.save(hall);
                response.put("status", "success");
                response.put("message", "Hall " + hallId + " updated successfully");
            } else {
                response.put("status", "error");
                response.put("message", "Hall ID not found, please provide a correct ID to update");
            }
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error updating hall: " + e.getMessage());
        }
        return response;
    }

    public Map<String, Object> deleteHall(Long hallId) {
        Map<String, Object> response = new HashMap<>();
        try {
            if (hallRepository.existsById(hallId)) {
                hallRepository.deleteById(hallId);
                response.put("status", "success");
                response.put("message", "Hall " + hallId + " deleted successfully");
            } else {
                response.put("status", "error");
                response.put("message", "Hall ID not found, please provide a correct ID to delete");
            }
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error deleting hall: " + e.getMessage());
        }
        return response;
    }
}



