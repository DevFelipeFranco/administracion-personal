package com.administracion.personal.infraestructura.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthControlador {

    @GetMapping
    public String inicio() {
        return "Inicio";
    }
}
