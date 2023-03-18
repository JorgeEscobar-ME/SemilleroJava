public class Oficina extends Local{
    boolean gobierno;

    public Oficina(int id, int area, String direccion, boolean interno, boolean gobierno) {
        super(id, area, direccion, interno);
        this.gobierno = gobierno;
    }
}
