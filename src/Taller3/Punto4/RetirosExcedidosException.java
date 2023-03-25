package Taller3.Punto4;

public class RetirosExcedidosException extends Exception{
    public RetirosExcedidosException() {
        super("Saldo insuficiente para realizar la operación");
    }

    public RetirosExcedidosException(String mensaje) {
        super(mensaje);
    }
}
