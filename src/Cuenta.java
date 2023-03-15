public class Cuenta {
    protected float Saldo;
    protected int consignaciones=0;
    protected int retiros=0;
    protected float tasa=0;
    protected float comision=0;

    public Cuenta(float saldo, float tasa) {
        Saldo = saldo;
        this.tasa = tasa;
    }
}
