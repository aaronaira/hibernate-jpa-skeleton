package org.carworkshop.daos;

import org.ecommerce.entities.Usuario;
import org.carworkshop.interfaces.Dao;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class UsuarioDao implements Dao<Usuario> {


    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.ecommerce");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public UsuarioDao() {

    }


    @Override
    public Optional<Usuario> get(int id) {
        return Optional.ofNullable(entityManager.find(Usuario.class, id));
    }

    @Override
    public List<Usuario> getAll() {
        List<Usuario> allUsers;
        allUsers = entityManager.createQuery("from Usuario", Usuario.class).getResultList();
        return allUsers;

    }

    @Override
    public void save(Usuario usuario) {
        execute(entityManager -> entityManager.persist(usuario));

    }

    @Override
    public void upadte(Usuario usuario, String[] params) {
        usuario.setNombre(Objects.requireNonNull(params[0], "Name cannot be null"));
        usuario.setApellido(Objects.requireNonNull(params[1], "Email cannot be null"));
        execute(entityManager -> entityManager.merge(usuario));

    }

    @Override
    public void delete(Usuario usuario) {
        execute(entityManager -> entityManager.remove(usuario));
    }

    private void execute(Consumer<EntityManager> action) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw  e;
        }
    }
}
