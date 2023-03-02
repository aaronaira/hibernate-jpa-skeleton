package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "envio")
public class Envio {

    @Id
    @Column(name = "id_envio", nullable = false)
    private Integer idEnvio;

    @Column(name = "id_pedido", nullable = false)
    private Integer idPedido;

    @Column(name = "agencia_transportes", nullable = false)
    private String agenciaTransportes;

    @Column(name = "fecha_entrega", nullable = false)
    private Date fechaEntrega;

    @Column(name = "fecha_envio", nullable = false)
    private Date fechaEnvio;

    public void setIdEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Integer getIdEnvio() {
        return idEnvio;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setAgenciaTransportes(String agenciaTransportes) {
        this.agenciaTransportes = agenciaTransportes;
    }

    public String getAgenciaTransportes() {
        return agenciaTransportes;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "idEnvio=" + idEnvio + '\'' +
                "idPedido=" + idPedido + '\'' +
                "agenciaTransportes=" + agenciaTransportes + '\'' +
                "fechaEntrega=" + fechaEntrega + '\'' +
                "fechaEnvio=" + fechaEnvio + '\'' +
                '}';
    }
}
