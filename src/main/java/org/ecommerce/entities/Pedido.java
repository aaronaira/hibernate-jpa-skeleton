package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @Column(name = "id_pedido", nullable = false)
    private Integer idPedido;

    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "id_carrrito", nullable = false)
    private Integer idCarrrito;

    @Column(name = "fecha_pedido", nullable = false)
    private Date fechaPedido;

    @Column(name = "id_direccion", nullable = false)
    private Integer idDireccion;

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdCarrrito(Integer idCarrrito) {
        this.idCarrrito = idCarrrito;
    }

    public Integer getIdCarrrito() {
        return idCarrrito;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido + '\'' +
                "idUsuario=" + idUsuario + '\'' +
                "idCarrrito=" + idCarrrito + '\'' +
                "fechaPedido=" + fechaPedido + '\'' +
                "idDireccion=" + idDireccion + '\'' +
                '}';
    }
}
