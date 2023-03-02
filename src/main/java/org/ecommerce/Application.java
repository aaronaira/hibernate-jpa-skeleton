package org.ecommerce;

import org.ecommerce.entities.Registro;
import org.ecommerce.entities.Usuario;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Application {

    public static void main(String[] args) throws SQLException {


        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.ecommerce");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        Registro registro = new Registro();

                //2023-01-01 00:00:00
        try {
            Date dateTime = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").parse("2023-01-01 00:00:00");
            registro.setIdRegistro(2);
            registro.setFechaRegistro(dateTime);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        entityManager.getTransaction().begin();
        entityManager.persist(registro);
        entityManager.getTransaction().commit();

        System.out.println("Open your browser and navigate to http://localhost:8082/");
        System.out.println("JDBC URL: jdbc:h2:mem:my_database");
        System.out.println("User Name: sa");
        System.out.println("Password: ");

    }

}
