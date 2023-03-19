package Taller1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Factura factura1 = new Factura(5000,"Jorge","Miguel");
        factura1.imprimirFactura();
        Cuenta jorge= new Cuenta(20000,0.1f);
        jorge.consignar(1500);

        jorge.retirar(5000);
        jorge.consignar(6000);
        jorge.retirar(1000);
        jorge.retirar(25000);
        System.out.println(jorge.calcularInteres());
        jorge.aplicarInteres();
        jorge.imprimir();
        CuentaAhorros jorgeAhorros= new CuentaAhorros(20000,0.05f);
        jorgeAhorros.retirar(100);
        jorgeAhorros.retirar(100);
        jorgeAhorros.retirar(100);
        jorgeAhorros.retirar(100);
        jorgeAhorros.retirar(100);

        jorgeAhorros.aplicarInteres();
        jorgeAhorros.imprimirDatos();

        CuentaCorriente jorgeCorriente = new CuentaCorriente(500.0f,0.1f);
        jorgeCorriente.retirar(5000);
        jorgeCorriente.consignar(6000);
        jorgeCorriente.imprimir();
        CasaRural casa1= new CasaRural(1,65,"Somalia",3,1,50,20);
        casa1.impuesto();

    }
}