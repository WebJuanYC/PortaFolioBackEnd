/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.back.service;

import com.argprog.back.entity.Experiencia;
import com.argprog.back.repository.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencia {
     @Autowired
     RExperiencia expeRepo;

    public List<Experiencia> listarExperiencia() {
        return expeRepo.findAll();
    }

    public Experiencia crearExperiencia(Experiencia expe) {
       return expeRepo.save(expe);
    }

    public void borrarExperiencia(int id) {
         expeRepo.deleteById(id);
    }

    public Experiencia buscarExperienciaPorId(int id) {
        return expeRepo.findById(id).orElse(null);
    }

    public Experiencia modificarExperiencia(Experiencia expe) {
        return expeRepo.save(expe);
    }

}
