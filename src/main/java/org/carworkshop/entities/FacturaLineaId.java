package org.carworkshop.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FacturaLineaId implements Serializable {
    private static final long serialVersionUID = 6912198542897072317L;
    @Column(name = "n_linea", nullable = false)
    private Integer nLinea;

    @Column(name = "id_factura", nullable = false)
    private Integer idFactura;

    public Integer getNLinea() {
        return nLinea;
    }

    public void setNLinea(Integer nLinea) {
        this.nLinea = nLinea;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FacturaLineaId entity = (FacturaLineaId) o;
        return Objects.equals(this.idFactura, entity.idFactura) &&
                Objects.equals(this.nLinea, entity.nLinea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, nLinea);
    }

}