public class CuentaAhorros extends Cuenta{
    public boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if(saldo<10000){
            activa=false;
        }else {
            activa=true;
        }
    }
    @Override
    public void consignar(float cantidad) {
        if (activa == true){
            super.consignar(cantidad);
        }else{
            System.out.println("La cuenta no está activa");
        }
    }
}
