package Taller4.GUI;

import Taller4.Service.AccountService;

import java.util.List;
import java.util.Scanner;

public class GUI {

    private boolean running = true;
    private AccountService accountService;

    public GUI() {
        accountService = new AccountService();
    }

    public void iniciar() throws Exception {
        System.out.println("Bienvenido al sistema de persistencia de personas");

        while (running) {
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver cuenta");
            System.out.println("4. Transferir a otra cuenta");
            System.out.println("6. Salir");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            seleccion(opcion);
        }
    }

    private void seleccion(int seleccion) throws Exception {
        switch (seleccion) {
            case 1 -> deposit();
            default -> System.out.println("Opcion no valida");
        }
    }

    private void deposit() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su número de cedula");
        String identification= scanner.nextLine();
        System.out.println("Introduzca la cantidad de dinero a depositar");
        double money = scanner.nextDouble();
        accountService.depositAccount("1053868118",500);

    }
}
