public class Apartaestudio extends Apartamento{
    int nHabitaciones=1;

    public Apartaestudio(int id, int area, String direccion, int precioAdmin, int nHabitaciones) {
        super(id, area, direccion, precioAdmin);
        this.nHabitaciones = nHabitaciones;
    }
}
