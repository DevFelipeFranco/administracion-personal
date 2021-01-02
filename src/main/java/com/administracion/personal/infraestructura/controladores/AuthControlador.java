package com.administracion.personal.infraestructura.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/auth")
public class AuthControlador {

    @GetMapping(value = "/inicio")
    public String inicio() {
        return "Inicio";
    }
}
