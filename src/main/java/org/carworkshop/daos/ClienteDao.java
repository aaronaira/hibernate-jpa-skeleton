package org.carworkshop.daos;


import org.carworkshop.interfaces.Dao;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.carworkshop.entities.Cliente;

public class ClienteDao implements Dao<Cliente> {


    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.carworkshop");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public ClienteDao() {

    }


    @Override
    public Optional<Cliente> get(int id) {
        return Optional.ofNullable(entityManager.find(Cliente.class, id));
    }

    @Override
    public List<Cliente> getAll() {
        List<Cliente> allClients;
        allClients = entityManager.createQuery("from Cliente", Cliente.class).getResultList();
        return allClients;

    }

    @Override
    public void save(Cliente cliente) {
        execute(entityManager -> entityManager.merge(cliente));

    }

    @Override
    public void update(Cliente cliente, String[] params) {
        cliente.setNombre(Objects.requireNonNull(params[0], "Name cannot be null"));
        cliente.setApellidos(Objects.requireNonNull(params[1], "Email cannot be null"));
        execute(entityManager -> entityManager.merge(cliente));

    }

    @Override
    public void delete(Cliente cliente) {
        execute(entityManager -> entityManager.remove(cliente));
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
