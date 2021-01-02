package com.administracion.personal.infraestructura.repositorio;

import com.administracion.personal.dominio.model.UsuarioModel;
import com.administracion.personal.dominio.repositorio.UsuarioRepositorio;
import com.administracion.personal.infraestructura.model.UsuarioEntidad;
import com.administracion.personal.infraestructura.transformador.UsuarioTransformador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorioMySQL extends JpaRepository<UsuarioEntidad, Long>, UsuarioRepositorio {

    @Override
    default UsuarioModel guardarUsuario(UsuarioModel usuarioModel) {
        UsuarioEntidad usuarioEntidad = UsuarioTransformador.usuarioModelToEntidad(usuarioModel);
        return UsuarioTransformador.usuarioEntidadToModel(save(usuarioEntidad));
    }
}
