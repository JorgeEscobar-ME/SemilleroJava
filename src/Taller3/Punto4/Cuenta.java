package Taller3.Punto4;

public abstract class Cuenta {
    private String numeroDeCuenta;
    private double saldo;
    private String propietario;
    private int cantidadDepositos=0;
    private int cantidadRetiros=0;

    public Cuenta(String numeroDeCuenta, int saldo, String propietario) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getCantidadDepositos() {
        return cantidadDepositos;
    }

    public void setCantidadDepositos(int cantidadDepositos) {
        this.cantidadDepositos = cantidadDepositos;
    }

    public int getCantidadRetiros() {
        return cantidadRetiros;
    }

    public void setCantidadRetiros(int cantidadRetiros) {
        this.cantidadRetiros = cantidadRetiros;
    }

    public void depositar(double cantidad){
        setSaldo(getSaldo()+cantidad);
        System.out.println("Ha depositado "+cantidad+" y su nuevo saldo es " + getSaldo());
    }

    public abstract void retirar(int cantidad) throws SaldoInsuficienteException, RetirosExcedidosException;

}
