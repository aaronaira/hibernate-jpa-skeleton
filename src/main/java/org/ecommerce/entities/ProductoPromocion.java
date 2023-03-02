package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "producto_promocion")
public class ProductoPromocion {

    @Id
    @Column(name = "id_promocion", nullable = false)
    private Integer idPromocion;

    @Id
    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;

    @Column(name = "fecha_comienzo", nullable = false)
    private Date fechaComienzo;

    @Column(name = "fecha_final", nullable = false)
    private Date fechaFinal;

    public void setIdPromocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }

    public Integer getIdPromocion() {
        return idPromocion;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setFechaComienzo(Date fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public Date getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    @Override
    public String toString() {
        return "ProductoPromocion{" +
                "idPromocion=" + idPromocion + '\'' +
                "idProducto=" + idProducto + '\'' +
                "fechaComienzo=" + fechaComienzo + '\'' +
                "fechaFinal=" + fechaFinal + '\'' +
                '}';
    }
}
