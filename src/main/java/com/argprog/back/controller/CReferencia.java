/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.back.controller;

import com.argprog.back.entity.Referencia;
import com.argprog.back.service.SReferencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portafolioweb-yc.web.app")// la ruta se cruza con angularpackage com.argprog.back.controller;
public class CReferencia {
    @Autowired
   SReferencia refeServ;
    
    @GetMapping("/referencia")  //localhost:8080/Referencia/
    @ResponseBody
    public List<Referencia>listarReferencia(){
    return refeServ.listarReferencia();
    }
    
    @PostMapping ("/referencia")
    @ResponseBody
    public String crearReferencia (@RequestBody Referencia refe) {
      refeServ.crearReferencia(refe);
      return "La Referencia fue creada correctamente";
    }

    @DeleteMapping("/referencia/{id}")
    public void borrarReferencia(@PathVariable int id) {
    refeServ.borrarReferencia(id);
    }
    
    @GetMapping("/referencia/{id}")
    @ResponseBody
    public Referencia buscarReferenciaPorId(@PathVariable int id){
    return refeServ.buscarReferenciaPorId(id);
    }
    
    @PutMapping("/referencia")
    public void modificarReferencia(@RequestBody Referencia refe){
    refeServ.modificarReferencia(refe);
    }
}
