package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "login")
public class Login {

    @Id
    @Column(name = "id_login", nullable = false)
    private Integer idLogin;

    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "fecha_login", nullable = false)
    private Date fechaLogin;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "contraseña", nullable = false)
    private String contraseña;

    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public Integer getIdLogin() {
        return idLogin;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setFechaLogin(Date fechaLogin) {
        this.fechaLogin = fechaLogin;
    }

    public Date getFechaLogin() {
        return fechaLogin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return "Login{" +
                "idLogin=" + idLogin + '\'' +
                "idUsuario=" + idUsuario + '\'' +
                "fechaLogin=" + fechaLogin + '\'' +
                "email=" + email + '\'' +
                "contraseña=" + contraseña + '\'' +
                '}';
    }
}
