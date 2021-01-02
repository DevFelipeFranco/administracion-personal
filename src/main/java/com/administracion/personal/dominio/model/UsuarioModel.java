package com.administracion.personal.dominio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "con")
public class UsuarioModel {

    private Long   idUsuario;
    private String usuario;
    private String clave;
    private String email;
    private Date   fechaCreacion;
    private String estado;
}
