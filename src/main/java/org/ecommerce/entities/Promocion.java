package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "promocion")
public class Promocion {

    @Id
    @Column(name = "id_promocion", nullable = false)
    private Integer idPromocion;

    @Column(name = "tipo_promocion", nullable = false)
    private String tipoPromocion;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public void setIdPromocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }

    public Integer getIdPromocion() {
        return idPromocion;
    }

    public void setTipoPromocion(String tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    public String getTipoPromocion() {
        return tipoPromocion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Promocion{" +
                "idPromocion=" + idPromocion + '\'' +
                "tipoPromocion=" + tipoPromocion + '\'' +
                "descripcion=" + descripcion + '\'' +
                '}';
    }
}
