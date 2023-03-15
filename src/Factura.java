
public class Factura extends Precio {
    private String emisor;
    private String cliente;

    public Factura(double valor, String emisor, String cliente) {
        super(valor);
        this.emisor = emisor;
        this.cliente = cliente;
    }

    public void imprimirFactura() {
        System.out.println("Factura");
        System.out.println("Valor: " + getValor());
        System.out.println("Emisor: " + emisor);
        System.out.println("Cliente: " + cliente);
    }
}