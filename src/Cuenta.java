public class Cuenta {
    public float saldo;
    public int consignaciones = 0;
    public int retiros = 0;
    public float tasa = 0;
    public float comision = 0;

    public Cuenta(float saldo, float tasa) {
        this.saldo = saldo;
        this.tasa = tasa;
        System.out.println("Su saldo es: " + saldo);
    }

    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
        consignaciones++;
        System.out.println("Ha consignado " + cantidad + "Y ahora su saldo es " + saldo);
        System.out.println("Cantidad total de consignaciones: " + consignaciones);
    }

    public void retirar(float cantidad) {
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
            retiros++;
            System.out.println("Ha retirado " + cantidad + "Y ahora su saldo es " + saldo);
            System.out.println("Cantidad total de retiros: " + retiros);
        } else {
            System.out.println("Error, no tiene tanto dinero");
        }

    }

}

