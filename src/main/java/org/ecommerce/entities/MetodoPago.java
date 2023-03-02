package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "metodo_pago")
public class MetodoPago {

    @Id
    @Column(name = "id_metodo_pago", nullable = false)
    private Integer idMetodoPago;

    @Column(name = "tipo_comision", nullable = false)
    private Float tipoComision;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public void setIdMetodoPago(Integer idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public Integer getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setTipoComision(Float tipoComision) {
        this.tipoComision = tipoComision;
    }

    public Float getTipoComision() {
        return tipoComision;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "MetodoPago{" +
                "idMetodoPago=" + idMetodoPago + '\'' +
                "tipoComision=" + tipoComision + '\'' +
                "descripcion=" + descripcion + '\'' +
                '}';
    }
}
