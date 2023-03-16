package org.carworkshop;

import org.carworkshop.daos.ClienteDao;
import org.carworkshop.daos.LoginDao;
import org.carworkshop.entities.Cliente;
import org.carworkshop.entities.Login;

public class ApplicationCliente {
    public static void main(String[] args) {
        ClienteDao clienteDao = new ClienteDao();
        LoginDao loginDao = new LoginDao();
        Cliente cliente = new Cliente();
        Login login = new Login();

        login.setPassword("pasdas");
        login.setEmail("email5@email.com");
//        login.setCliente(cliente);
//
//        cliente.setDni("12312355B");
//        cliente.setDireccion("Torrecederia nº 66");
//        cliente.setNombre("Aaron2");
//        cliente.setApellidos("Aira2");
//        cliente.setEmail(login);



        loginDao.delete(login);

        //clienteDao.save(cliente);






    }
}
