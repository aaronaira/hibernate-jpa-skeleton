package org.ecommerce.application;

import org.ecommerce.daos.UsuarioDao;
import org.ecommerce.entities.Usuario;
import org.ecommerce.interfaces.Dao;


public class UserApplication {
    private static Dao<Usuario> usuarioDao;

    public static void main(String[] args) {
        usuarioDao = new UsuarioDao();

        Usuario user2 = new Usuario();
        user2.setNombre("aaron");
        user2.setApellido("aira");
        user2.setIdRegistro(1);

        //saveUsuario(new Usuario(1, "Aaron", "Aira"));
        saveUsuario(user2);
    }

    public static void saveUsuario(Usuario usuario) {
        usuarioDao.save(usuario);
    }
}
