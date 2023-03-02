package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "datos_cobro")
public class DatosCobro {

    @Id
    @Column(name = "id_datos_cobro", nullable = false)
    private Integer idDatosCobro;

    @Column(name = "comision", nullable = false)
    private Double comision;

    @Column(name = "fecha_cobro", nullable = false)
    private Date fechaCobro;

    @Column(name = "token_operacion", nullable = false)
    private String tokenOperacion;

    @Column(name = "pasarela", nullable = false)
    private String pasarela;

    @Column(name = "importe_cobrado", nullable = false)
    private Double importeCobrado;

    public void setIdDatosCobro(Integer idDatosCobro) {
        this.idDatosCobro = idDatosCobro;
    }

    public Integer getIdDatosCobro() {
        return idDatosCobro;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Double getComision() {
        return comision;
    }

    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public Date getFechaCobro() {
        return fechaCobro;
    }

    public void setTokenOperacion(String tokenOperacion) {
        this.tokenOperacion = tokenOperacion;
    }

    public String getTokenOperacion() {
        return tokenOperacion;
    }

    public void setPasarela(String pasarela) {
        this.pasarela = pasarela;
    }

    public String getPasarela() {
        return pasarela;
    }

    public void setImporteCobrado(Double importeCobrado) {
        this.importeCobrado = importeCobrado;
    }

    public Double getImporteCobrado() {
        return importeCobrado;
    }

    @Override
    public String toString() {
        return "DatosCobro{" +
                "idDatosCobro=" + idDatosCobro + '\'' +
                "comision=" + comision + '\'' +
                "fechaCobro=" + fechaCobro + '\'' +
                "tokenOperacion=" + tokenOperacion + '\'' +
                "pasarela=" + pasarela + '\'' +
                "importeCobrado=" + importeCobrado + '\'' +
                '}';
    }
}
