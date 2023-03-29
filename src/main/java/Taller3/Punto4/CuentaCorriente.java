package Taller3.Punto4;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(String numeroDeCuenta, int saldo, String propietario) {
        super(numeroDeCuenta, saldo, propietario);
    }

    @Override
    public void retirar(int cantidad) throws SaldoInsuficienteException, RetirosExcedidosException {
        if (getCantidadRetiros() >= 5) {
            throw new RetirosExcedidosException("Ya ha superado el límite de retiros permitidos");
        }
        setSaldo(getSaldo() - cantidad);
        setCantidadRetiros(getCantidadRetiros()+1);
        System.out.println("Se han retirado " + cantidad + " unidades. Nuevo saldo: " + getSaldo());
    }
    public void depositar(double cantidad) {
        if (getCantidadDepositos() < 2) {
            double bonificacion = cantidad * 0.005;
            super.depositar(cantidad + bonificacion);
        } else {
            super.depositar(cantidad);
        }
        setCantidadDepositos(getCantidadDepositos()+1);
    }
}
