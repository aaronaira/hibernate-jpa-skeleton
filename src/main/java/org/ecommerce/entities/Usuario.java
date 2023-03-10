package org.ecommerce.entities;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "id_registro", nullable = false)
    private Integer idRegistro;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    public Usuario() {

    }

    public Usuario(int idRegistro, String nombre, String apellido) {
        this.idRegistro = idRegistro;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario + '\'' +
                "idRegistro=" + idRegistro + '\'' +
                "nombre=" + nombre + '\'' +
                "apellido=" + apellido + '\'' +
                '}';
    }
}
