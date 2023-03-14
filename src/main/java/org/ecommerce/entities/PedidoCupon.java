package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pedido_cupon")
public class PedidoCupon {

    @Id
    @Column(name = "id_cupon", nullable = false)
    private Integer idCupon;


    @Column(name = "id_pedido", nullable = false)
    private Integer idPedido;

    @Column(name = "fecha_vencimiento", nullable = false)
    private Date fechaVencimiento;

    public void setIdCupon(Integer idCupon) {
        this.idCupon = idCupon;
    }

    public Integer getIdCupon() {
        return idCupon;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "PedidoCupon{" +
                "idCupon=" + idCupon + '\'' +
                "idPedido=" + idPedido + '\'' +
                "fechaVencimiento=" + fechaVencimiento + '\'' +
                '}';
    }
}
