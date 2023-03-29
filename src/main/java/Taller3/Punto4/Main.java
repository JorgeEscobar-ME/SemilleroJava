package Taller3.Punto4;

public class Main {
    public static void main(String[] args) {
        try {
            CuentaAhorros c1 = new CuentaAhorros("0001",5000,"Jorge");
            c1.depositar(500);
            c1.retirar(100);
            c1.retirar(100);
            c1.retirar(100);
            c1.retirar(100);
            CuentaCorriente c2 = new CuentaCorriente("0002", 25000, "Jorge");
            c2.depositar(500);
            c2.retirar(100);
            c2.retirar(100);
            c2.retirar(100);
            c2.retirar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente. No se puede realizar la operación.");
        } catch (RetirosExcedidosException e) {
            System.out.println("Número de retiros excedidos. No se puede realizar la operación.");
        }
    }

}
