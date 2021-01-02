package com.administracion.personal.infraestructura.transformador;

import com.administracion.personal.dominio.model.UsuarioModel;
import com.administracion.personal.infraestructura.model.UsuarioEntidad;
import lombok.AllArgsConstructor;

public final class UsuarioTransformador {

    public static UsuarioEntidad usuarioModelToEntidad(UsuarioModel usuarioModel) {
        return UsuarioEntidad.builder()
                .idUsuario(usuarioModel.getIdUsuario())
                .usuario(usuarioModel.getUsuario())
                .clave(usuarioModel.getClave())
                .email(usuarioModel.getEmail())
                .fechaCreacion(usuarioModel.getFechaCreacion())
                .estado(usuarioModel.getEstado())
                .build();
    }

    public static UsuarioModel usuarioEntidadToModel(UsuarioEntidad usuarioEntidad) {
        return UsuarioModel.builder()
                .conIdUsuario(usuarioEntidad.getIdUsuario())
                .conUsuario(usuarioEntidad.getUsuario())
                .conClave(usuarioEntidad.getClave())
                .conEmail(usuarioEntidad.getEmail())
                .conFechaCreacion(usuarioEntidad.getFechaCreacion())
                .conEstado(usuarioEntidad.getEstado())
                .build();
    }
}
