/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.orders.controller;

import com.example.orders.data.Order;
import com.example.orders.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class OrderController {
    @Autowired
    public OrderService OrderService;
    
    @CrossOrigin
    @GetMapping(path = "/orders")
    public List<Order> getAllOrder() {
        return OrderService.getAllOrder();
    }
    
    @CrossOrigin
    @PostMapping(path = "/orders")
    public Order insertOrder(@RequestBody Order order) {
        return OrderService.insertOrder(order);
    }
    
    @CrossOrigin
    @DeleteMapping(path = "/orders/{id}")
    public void deleteOrder(@PathVariable int id) {
        OrderService.deleteOrderById(id);
    }
    
    @CrossOrigin
    @PutMapping(path = "/orders")
    public void updateOrder(@RequestBody Order order) {
        OrderService.upadteOrder(order);
    }
    
    @GetMapping(path = "/orders", params = {"userid", "username"})
    public List<Order> getUserByIdAndUsername(@RequestParam String userid, @RequestParam String username) {
        return OrderService.getUserByIdAndUsername(userid, username);
    }
}
