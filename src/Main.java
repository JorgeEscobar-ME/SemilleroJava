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
    }
}