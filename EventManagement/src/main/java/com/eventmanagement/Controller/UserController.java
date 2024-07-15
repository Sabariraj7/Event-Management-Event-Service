package com.eventmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eventmanagement.Entity.User;
import com.eventmanagement.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/eventmicroservice/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/username/{userName}")
    public User getUserByUserName(@PathVariable String userName) {
        return userService.getUserByUserName(userName);
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/update/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/delete/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return userService.deleteUser(userId);
    }
}


//package com.eventmanagement.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.eventmanagement.Entity.User;
//import com.eventmanagement.Service.UserService;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/getall")
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @GetMapping("/{userId}")
//    public Map<String, Object> getUserById(@PathVariable int userId) {
//        return userService.getUserById(userId);
//    }
//
//    @GetMapping("/username/{userName}")
//    public Map<String, Object> getUserByUserName(@PathVariable String userName) {
//        return userService.getUserByUserName(userName);
//    }
//
//    @PostMapping("/add")
//    public Map<String, Object> createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//    @PutMapping("/update/{userId}")
//    public Map<String, Object> updateUser(@PathVariable int userId, @RequestBody User user) {
//        return userService.updateUser(userId, user);
//    }
//
//    @DeleteMapping("/delete/{userId}")
//    public Map<String, Object> deleteUser(@PathVariable int userId) {
//        return userService.deleteUser(userId);
//    }
//}





//package com.eventmanagement.Controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.eventmanagement.Entity.User;
//import com.eventmanagement.Service.UserService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/getall")
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @GetMapping("/{userId}")
//    public User getUserById(@PathVariable int userId) {
//        return userService.getUserById(userId);
//    }
//    
//    @GetMapping("/username/{username}")
//    public User getUserByUsername(@PathVariable String username) {
//        return userService.getUserByUsername(username);
//    }
//
//    @PostMapping("/add")
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//    @PutMapping("/update/{userId}")
//    public User updateUser(@PathVariable int userId, @RequestBody User user) {
//        return userService.updateUser(userId, user);
//    }
//
//    @DeleteMapping("/delete/{userId}")
//    public void deleteUser(@PathVariable int userId) {
//        userService.deleteUser(userId);
//    }
//}
