public class CasaUrbana extends Viviendas{
    int nPisos;

    public CasaUrbana(int id, int area, String direccion, int nHabitaciones, int nBanios, int nPisos) {
        super(id, area, direccion, nHabitaciones, nBanios);
        this.nPisos = nPisos;
    }
}
