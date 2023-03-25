package Taller3.Punto4;

public class CuentaAhorros extends Cuenta{


    public CuentaAhorros(String numeroDeCuenta, int saldo, String propietario) {
        super(numeroDeCuenta, saldo, propietario);
    }

    @Override
    public void retirar(int cantidad) throws SaldoInsuficienteException {
        if (cantidad > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente en la cuenta.");
        }
        if (getCantidadRetiros() >= 3) {
            double comision = cantidad * 0.01;
            cantidad += comision;
            System.out.println("Se ha aplicado una comisión del 1% (" + comision + ") por exceder el límite de retiros.");
        }
        setSaldo(getSaldo() - cantidad);
        System.out.println("Se han retirado " + cantidad + " unidades. Nuevo saldo: " + getSaldo());
        setCantidadRetiros(getCantidadRetiros()+1);
    }

}
