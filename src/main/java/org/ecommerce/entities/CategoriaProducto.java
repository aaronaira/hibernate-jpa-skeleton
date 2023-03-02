package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria_producto")
public class CategoriaProducto {

    @Id
    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;

    @Id
    @Column(name = "id_categoria", nullable = false)
    private Integer idCategoria;

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    @Override
    public String toString() {
        return "CategoriaProducto{" +
                "idProducto=" + idProducto + '\'' +
                "idCategoria=" + idCategoria + '\'' +
                '}';
    }
}
