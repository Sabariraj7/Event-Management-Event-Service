//package com.eventmanagement.dao;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.eventmanagement.Entity.User;
//import com.eventmanagement.Repository.UserRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class UserDAO {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public User getUserById(int userId) {
//        Optional<User> optionalUser = userRepository.findById(userId);
//        return optionalUser.orElse(null);
//    }
//
//    public User createUser(User user) {
//        return userRepository.save(user);
//    }
//
//    public User updateUser(User user) {
//        if (userRepository.existsById(user.getId())) {
//            return userRepository.save(user);
//        }
//        return null;
//    }
//
//    public void deleteUser(int userId) {
//        userRepository.deleteById(userId);
//    }
//    
//    public User getUserByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//}
