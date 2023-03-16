package org.carworkshop.daos;

import org.carworkshop.entities.Cliente;
import org.carworkshop.entities.Login;
import org.carworkshop.interfaces.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class LoginDao implements Dao<Login> {

    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.carworkshop");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public LoginDao() {

    }
    @Override
    public Optional<Login> get(int id) {
        return Optional.ofNullable(entityManager.find(Login.class, id));

    }

    @Override
    public List<Login> getAll() {
        List<Login> allSessions;
        allSessions = entityManager.createQuery("from login", Login.class).getResultList();
        return allSessions;
    }

    @Override
    public void save(Login login) {
        execute(entityManager -> entityManager.persist(login));

    }

    @Override
    public void update(Login login, String[] params) {

    }

    @Override
    public void delete(Login login) {
        execute(entityManager -> entityManager.remove(login));

    }
    public void execute(Consumer<EntityManager> action) {

        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }

    }

}
