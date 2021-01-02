package com.administracion.personal.infraestructura.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USUARIO", schema = "db_personal")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioEntidad implements Serializable {

    private static final long serialVersionUID = 4691209194109027765L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String usuario;
    private String clave;
    private String email;

    @Column(name = "FECHA_CREACION", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    private String estado;
}
