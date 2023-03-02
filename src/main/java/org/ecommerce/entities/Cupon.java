package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "cupon")
public class Cupon {

    @Id
    @Column(name = "id_cupon", nullable = false)
    private Integer idCupon;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "codigo", nullable = false)
    private Integer codigo;

    @Column(name = "fecha_vencimiento", nullable = false)
    private Date fechaVencimiento;

    public void setIdCupon(Integer idCupon) {
        this.idCupon = idCupon;
    }

    public Integer getIdCupon() {
        return idCupon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Cupon{" +
                "idCupon=" + idCupon + '\'' +
                "nombre=" + nombre + '\'' +
                "codigo=" + codigo + '\'' +
                "fechaVencimiento=" + fechaVencimiento + '\'' +
                '}';
    }
}
