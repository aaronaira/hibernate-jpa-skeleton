package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "metodo_banco")
public class MetodoBanco {

    @Id
    @Column(name = "id_metodo_pago", nullable = false)
    private Integer idMetodoPago;


    @Column(name = "id_banco", nullable = false)
    private Integer idBanco;

    @Column(name = "fecha_uso", nullable = false)
    private Date fechaUso;

    public void setIdMetodoPago(Integer idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public Integer getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setFechaUso(Date fechaUso) {
        this.fechaUso = fechaUso;
    }

    public Date getFechaUso() {
        return fechaUso;
    }

    @Override
    public String toString() {
        return "MetodoBanco{" +
                "idMetodoPago=" + idMetodoPago + '\'' +
                "idBanco=" + idBanco + '\'' +
                "fechaUso=" + fechaUso + '\'' +
                '}';
    }
}
