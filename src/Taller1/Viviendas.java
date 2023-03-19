package Taller1;

public class Viviendas extends Inmueble{
    int nHabitaciones;
    int nBanios;

    public Viviendas(int id, int area, String direccion, int nHabitaciones, int nBanios) {
        super(id, area, direccion);
        this.nHabitaciones = nHabitaciones;
        this.nBanios = nBanios;
    }
}
