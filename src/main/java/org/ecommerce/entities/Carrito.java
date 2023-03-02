package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "carrito")
public class Carrito {

    @Id
    @Column(name = "id_carrito", nullable = false)
    private Integer idCarrito;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "cantidad_productos", nullable = false)
    private Integer cantidadProductos;

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setCantidadProductos(Integer cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "idCarrito=" + idCarrito + '\'' +
                "fechaCreacion=" + fechaCreacion + '\'' +
                "cantidadProductos=" + cantidadProductos + '\'' +
                '}';
    }
}
