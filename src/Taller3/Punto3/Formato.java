package Taller3.Punto3;

import java.time.Duration;

public abstract class Formato {
    private Duration duracion;
    private int peso;
    private String artista;
    private String compositor;
    private String generoMusical;

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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
}
