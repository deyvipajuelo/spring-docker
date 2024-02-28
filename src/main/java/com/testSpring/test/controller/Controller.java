package com.testSpring.test.controller;

import com.testSpring.test.model.entity.User;
import com.testSpring.test.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class Controller {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/test")
    public String hola() {
        return "Hola Spring";
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUsers(@PathVariable Long id) {
        return ResponseEntity.ok(userRepository.findById(id));
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
