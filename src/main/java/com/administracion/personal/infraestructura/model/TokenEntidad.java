package com.administracion.personal.infraestructura.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TOKEN", schema = "db_personal")
public class TokenEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idToken;

    private String token;

    @Column(name = "FECHA_EXPIRACION", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaExpiracion;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO")
    private UsuarioEntidad usuarioEntidad;

}
