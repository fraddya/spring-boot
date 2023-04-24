/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.orders.service;

import com.example.orders.data.Order;
import com.example.orders.data.OrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fradd
 */
@Service
public class OrderService {
    
    @Autowired
    private OrderRepository OrderRepository;
    
    public List<Order> getAllOrder() {
        return OrderRepository.findAll();
    }

    public Order insertOrder(Order order) {
        return OrderRepository.save(order);
    }

    public void deleteOrderById(int id) {
        OrderRepository.deleteById(id);
    }
    public Order upadteOrder(Order order) {
        return OrderRepository.save(order);
    }
    
    public List<Order> getUserByIdAndUsername(String userid, String username) {
        return OrderRepository.findUserByIdAndUsername(userid, username);
    }
}
