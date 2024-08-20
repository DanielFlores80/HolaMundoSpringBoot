/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.HolaMundoSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author grenn
 */
@RestController
@Slf4j
public class ControladorInicio {
    
    //Metodo que mapea la ruta raiz "/" y ejecuta el mensaje del metodo inicio()
    @GetMapping("/")
    public String inicio(){
        return "Hola Mundo con SpringBoot";
    }
}
