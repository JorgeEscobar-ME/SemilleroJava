package Taller4;

import Taller4.DAO.Account;
import Taller4.DAO.AccountDAO;

public class Main {
    public static void main(String[] args) {
        AccountDAO prueba = new AccountDAO();
        Account pruebaCuenta = new Account("Jorge Alejandro Escobar", "Ahorros", 50000, "1053868118");
        prueba.save(pruebaCuenta);
    }
}
