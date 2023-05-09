/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argprog.back.repository;

import com.argprog.back.entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RContacto extends JpaRepository <Contacto, Integer> {
    
}
