package Taller3.Punto3;

import java.time.Duration;

public class Mp3 extends Formato{
    private String artista;
    private String compositor;
    private String generoMusical;
    public Mp3(Duration duracion, int peso, String artista, String compositor, String generoMusical) {
    super(duracion,peso);
    this.artista=artista;
    this.compositor=compositor;
    this.generoMusical=generoMusical;
    }

    public void reproducir(){
        System.out.println("Se reproduce la cancion");
    }
}
