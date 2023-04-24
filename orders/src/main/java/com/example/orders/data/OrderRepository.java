/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.orders.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fradd
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
    
    @Query("Select s from Order s where s.userid=?1 and s.username=?2")
    List<Order> findUserByIdAndUsername(String userid, String username);
}
