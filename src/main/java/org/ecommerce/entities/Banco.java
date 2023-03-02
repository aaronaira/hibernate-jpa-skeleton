package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banco")
public class Banco {

    @Id
    @Column(name = "id_banco", nullable = false)
    private Integer idBanco;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "id_datos_cobro", nullable = false)
    private Integer idDatosCobro;

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdDatosCobro(Integer idDatosCobro) {
        this.idDatosCobro = idDatosCobro;
    }

    public Integer getIdDatosCobro() {
        return idDatosCobro;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "idBanco=" + idBanco + '\'' +
                "nombre=" + nombre + '\'' +
                "idDatosCobro=" + idDatosCobro + '\'' +
                '}';
    }
}
