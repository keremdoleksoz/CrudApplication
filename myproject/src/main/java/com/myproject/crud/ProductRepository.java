/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.crud;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kerem
 */
public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAll();
    
}
