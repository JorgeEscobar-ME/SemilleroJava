public class Apartamento extends Inmueble{
    int precioAdmin;

    public Apartamento(int id, int area, String direccion, int precioAdmin) {
        super(id, area, direccion);
        this.precioAdmin = precioAdmin;
    }
}
