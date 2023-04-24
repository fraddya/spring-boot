/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.user.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fradd
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
    @Query("Select s from User s where s.email=?1 and s.password=?2")
    List<User> findUserByEmailAndPassword(String email, String password);
    
}
