package Taller1;

public class LocalComercial extends Local{
    String centroComercial;

    public LocalComercial(int id, int area, String direccion, boolean interno, String centroComercial) {
        super(id, area, direccion, interno);
        this.centroComercial = centroComercial;
    }
}
