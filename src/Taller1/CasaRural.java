package Taller1;

public class CasaRural extends Viviendas{
    int distancia;
    int altitud;

    public CasaRural(int id, int area, String direccion, int nHabitaciones, int nBanios, int distancia, int altitud) {
        super(id, area, direccion, nHabitaciones, nBanios);
        this.distancia = distancia;
        this.altitud = altitud;
    }
}
