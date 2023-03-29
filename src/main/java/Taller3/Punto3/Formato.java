package Taller3.Punto3;

import java.time.Duration;

public abstract class Formato {
    private Duration duracion;
    private int peso;


    public Formato(Duration duracion, int peso) {
        this.duracion = duracion;
        this.peso = peso;
    }
    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
