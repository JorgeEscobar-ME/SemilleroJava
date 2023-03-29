package Taller1;

public class Local extends Inmueble{
    boolean interno;

    public Local(int id, int area, String direccion, boolean interno) {
        super(id, area, direccion);
        this.interno = interno;
    }
}
