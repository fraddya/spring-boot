/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.user.service;

import com.example.user.data.User;
import com.example.user.data.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fradd
 */
@Service
public class UserService {
    @Autowired
    private UserRepository UserRepository;
    
    public List<User> getAllUser() {
        return UserRepository.findAll();
    }

    public User insertUser(User user) {
        return UserRepository.save(user);
    }

    public void deleteUserById(int id) {
        UserRepository.deleteById(id);
    }
    public User upadteUser(User user) {
        return UserRepository.save(user);
    }
    
    public List<User> getUserByEmailAndPassword(String email, String password) {
        return UserRepository.findUserByEmailAndPassword(email, password);
    }
}
