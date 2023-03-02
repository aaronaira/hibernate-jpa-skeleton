package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @Column(name = "id_factura", nullable = false)
    private Integer idFactura;

    @Column(name = "id_pedido", nullable = false)
    private Integer idPedido;

    @Column(name = "id_metodo_pago", nullable = false)
    private Integer idMetodoPago;

    @Column(name = "fecha_factura", nullable = false)
    private Date fechaFactura;

    @Column(name = "total", nullable = false)
    private Double total;

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdMetodoPago(Integer idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public Integer getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura + '\'' +
                "idPedido=" + idPedido + '\'' +
                "idMetodoPago=" + idMetodoPago + '\'' +
                "fechaFactura=" + fechaFactura + '\'' +
                "total=" + total + '\'' +
                '}';
    }
}
