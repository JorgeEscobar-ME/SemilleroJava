public class CuentaCorriente extends Cuenta{
    public float sobregiro=0;
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
    }
    @Override
    public void retirar(float cantidad){
        if (saldo>=cantidad){
            super.retirar(cantidad);
        }else {
            sobregiro=cantidad-saldo;
            saldo=0;
            System.out.println("Su sobregiro es " + sobregiro);
        }
    }
    @Override
    public void consignar(float cantidad){
        if (sobregiro==0) {
            super.consignar(cantidad);
            System.out.println("Su saldo es " + saldo);
        }else {
            sobregiro=sobregiro-cantidad;
            saldo=saldo-(sobregiro<0 ? sobregiro : 0);
            sobregiro=sobregiro<0 ? 0 : sobregiro;
            System.out.println("Su sobregiro es " + sobregiro + " y su saldo es " + saldo);
        }
    }
    @Override
    public void aplicarInteres(){
        float interes=calcularInteres();
        saldo=saldo-interes;
        System.out.println("Se cobró el interés y su nuevo sueldo es: " + saldo);
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Su sobregiro actual es: " + sobregiro);
    }
}
