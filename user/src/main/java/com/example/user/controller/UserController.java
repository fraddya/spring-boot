/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.user.controller;

import com.example.user.data.User;
import com.example.user.service.UserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author fradd
 */
@RestController
public class UserController {
    
    @Autowired
    public UserService UserService;
    
    @CrossOrigin
    @GetMapping(path = "/users")
    public List<User> getAllUser() {
        return UserService.getAllUser();
    }
    
    @CrossOrigin
    @PostMapping(path = "/users")
    public User insertUser(@RequestBody User user) {
        return UserService.insertUser(user);
    }
    
    @CrossOrigin
    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(@PathVariable int id) {
        UserService.deleteUserById(id);
    }
    
    @CrossOrigin
    @PutMapping(path = "/users")
    public void updateUser(@RequestBody User user) {
        UserService.upadteUser(user);
    }
    
    @CrossOrigin
    @GetMapping(path = "/users", params = {"email", "password"})
    public ResponseEntity<Map<String, Object>> getUserByEmailAndPassword(@RequestParam String email, @RequestParam String password) {
        List<User> users = UserService.getUserByEmailAndPassword(email, password);
    if (users.size() == 1) {
        User user = users.get(0);
        Map<String, Object> response = new HashMap<>();
        response.put("id", user.getId());
        response.put("username", user.getUsername());
        return ResponseEntity.ok(response);
    } else {
        return ResponseEntity.notFound().build();
    }
    }
    
    @CrossOrigin
    @GetMapping(path = "/users", params = {"id", "username"})
    public List<User> getUserByIdAndUserName(@RequestParam int id, @RequestParam String username) {
        return UserService.getUserByIdAndUserName(id, username);
    }
}
