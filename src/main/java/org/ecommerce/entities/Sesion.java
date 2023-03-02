package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "sesion")
public class Sesion {

    @Id
    @Column(name = "id_sesion", nullable = false)
    private Integer idSesion;

    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "tiempo_sesion", nullable = false)
    private Date tiempoSesion;

    public void setIdSesion(Integer idSesion) {
        this.idSesion = idSesion;
    }

    public Integer getIdSesion() {
        return idSesion;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setTiempoSesion(Date tiempoSesion) {
        this.tiempoSesion = tiempoSesion;
    }

    public Date getTiempoSesion() {
        return tiempoSesion;
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "idSesion=" + idSesion + '\'' +
                "idUsuario=" + idUsuario + '\'' +
                "tiempoSesion=" + tiempoSesion + '\'' +
                '}';
    }
}
