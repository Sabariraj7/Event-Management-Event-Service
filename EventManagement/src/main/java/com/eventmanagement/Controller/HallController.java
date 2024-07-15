package com.eventmanagement.Controller;

import com.eventmanagement.Entity.Hall;
import com.eventmanagement.Service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/eventmicroservice/halls")
public class HallController {

    @Autowired
    private HallService hallService;

    @GetMapping("/getall")
    public List<Hall> getAllHalls() {
        return hallService.getAllHalls();
    }

    @GetMapping("/{hallId}")
    public Map<String, Object> getHallById(@PathVariable Long hallId) {
        return hallService.getHallById(hallId);
    }

    @PostMapping("/add")
    public Map<String, Object> createHall(@RequestBody Hall hall) {
        return hallService.createHall(hall);
    }

    @PutMapping("/update/{hallId}")
    public Map<String, Object> updateHall(@PathVariable Long hallId, @RequestBody Hall hall) {
        return hallService.updateHall(hallId, hall);
    }

    @DeleteMapping("/delete/{hallId}")
    public Map<String, Object> deleteHall(@PathVariable Long hallId) {
        return hallService.deleteHall(hallId);
    }
}


//package com.eventmanagement.Controller;
//
//import com.eventmanagement.Entity.Hall;
//import com.eventmanagement.Service.HallService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/halls")
//public class HallController {
//
//    @Autowired
//    private HallService hallService;
//
//    @GetMapping("/getall")
//    public List<Hall> getAllHalls() {
//        return hallService.getAllHalls();
//    }
//
//    @GetMapping("/{hallId}")
//    public Hall getHallById(@PathVariable Long hallId) {
//        return hallService.getHallById(hallId);
//    }
//
//    @PostMapping("/add")
//    public Hall createHall(@RequestBody Hall hall) {
//        return hallService.createHall(hall);
//    }
//
//    @PutMapping("/update/{hallId}")
//    public String updateHall(@PathVariable Long hallId, @RequestBody Hall hall) {
//        return hallService.updateHall(hallId, hall);
//    }
//
//    @DeleteMapping("/delete/{hallId}")
//    public String deleteHall(@PathVariable Long hallId) {
//        return hallService.deleteHall(hallId);
//    }
//}
