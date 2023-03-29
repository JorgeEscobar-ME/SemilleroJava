package Taller3.Punto4;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar la operación");
    }

    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
