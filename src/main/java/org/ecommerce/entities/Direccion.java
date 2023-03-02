package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Direccion {

    @Id
    @Column(name = "id_direccion", nullable = false)
    private Integer idDireccion;

    @Column(name = "calle", nullable = false)
    private String calle;

    @Column(name = "codigo_postal", nullable = false)
    private String codigoPostal;

    @Column(name = "portal", nullable = false)
    private Integer portal;

    @Column(name = "apartamento", nullable = false)
    private Integer apartamento;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCalle() {
        return calle;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setPortal(Integer portal) {
        this.portal = portal;
    }

    public Integer getPortal() {
        return portal;
    }

    public void setApartamento(Integer apartamento) {
        this.apartamento = apartamento;
    }

    public Integer getApartamento() {
        return apartamento;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "idDireccion=" + idDireccion + '\'' +
                "calle=" + calle + '\'' +
                "codigoPostal=" + codigoPostal + '\'' +
                "portal=" + portal + '\'' +
                "apartamento=" + apartamento + '\'' +
                "numero=" + numero + '\'' +
                '}';
    }
}
