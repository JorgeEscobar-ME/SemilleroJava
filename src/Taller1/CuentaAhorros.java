package Taller1;

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
    @Override
    public void retirar(float cantidad){
        if (activa == true){
            super.retirar(cantidad);
        }else{
            System.out.println("La cuenta no está activa");
        }
    }
    @Override
    public void aplicarInteres(){
        if (retiros<=4){
            super.aplicarInteres();
        }else{
            System.out.println("Como tiene mas de 4 retiros este mes se le descuenta 1000 adicional despues de intereses");
            super.aplicarInteres();
            saldo=saldo-1000;
        }
    }
    public void imprimirDatos(){
        System.out.println("El saldo de la cuenta es " + saldo);
        System.out.println("La comision mensual es "+ tasa);
        System.out.println("El numero de transacciones realizadas es " + (retiros+consignaciones));
    }
}
