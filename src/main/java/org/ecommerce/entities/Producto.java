package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;

    @Column(name = "id_iva", nullable = false)
    private Integer idIva;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "precio", nullable = false)
    private Integer precio;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdIva(Integer idIva) {
        this.idIva = idIva;
    }

    public Integer getIdIva() {
        return idIva;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto + '\'' +
                "idIva=" + idIva + '\'' +
                "nombre=" + nombre + '\'' +
                "precio=" + precio + '\'' +
                "cantidad=" + cantidad + '\'' +
                '}';
    }
}
