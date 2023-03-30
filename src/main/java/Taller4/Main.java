package Taller4;

import Taller4.DAO.Account;
import Taller4.DAO.AccountDAO;
import Taller4.GUI.GUI;

public class Main {
    public static void main(String[] args) throws Exception {
        AccountDAO prueba = new AccountDAO();

        GUI ejecucion = new GUI();
        ejecucion.iniciar();

    }
}
