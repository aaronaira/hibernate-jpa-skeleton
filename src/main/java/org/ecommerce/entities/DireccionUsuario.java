package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion_usuario")
public class DireccionUsuario {

    @Id
    @Column(name = "id_direccion", nullable = false)
    private Integer idDireccion;

    @Id
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    @Override
    public String toString() {
        return "DireccionUsuario{" +
                "idDireccion=" + idDireccion + '\'' +
                "idUsuario=" + idUsuario + '\'' +
                '}';
    }
}
