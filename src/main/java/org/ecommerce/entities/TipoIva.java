package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_iva")
public class TipoIva {

    @Id
    @Column(name = "id_iva", nullable = false)
    private Integer idIva;

    @Column(name = "tipo_iva", nullable = false)
    private Float tipoIva;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    public void setIdIva(Integer idIva) {
        this.idIva = idIva;
    }

    public Integer getIdIva() {
        return idIva;
    }

    public void setTipoIva(Float tipoIva) {
        this.tipoIva = tipoIva;
    }

    public Float getTipoIva() {
        return tipoIva;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "TipoIva{" +
                "idIva=" + idIva + '\'' +
                "tipoIva=" + tipoIva + '\'' +
                "nombre=" + nombre + '\'' +
                '}';
    }
}
