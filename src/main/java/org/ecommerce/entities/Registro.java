package org.ecommerce.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_registro", nullable = false)
    private Integer idRegistro;

    @Column(name = "fecha_registro", nullable = false)
    private Date fechaRegistro;

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "idRegistro=" + idRegistro + '\'' +
                "fechaRegistro=" + fechaRegistro + '\'' +
                '}';
    }
}
