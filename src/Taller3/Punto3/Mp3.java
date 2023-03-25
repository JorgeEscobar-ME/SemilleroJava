package Taller3.Punto3;

import java.time.Duration;

public class Mp3 extends Formato{
    public Mp3(Duration duracion, int peso, String artista, String compositor, String generoMusical) {
    super(duracion,peso);
    setArtista(artista);
    setCompositor(compositor);
    setGeneroMusical(generoMusical);
    }

    public void reproducir(){
        System.out.println("Se reproduce la cancion");
    }
}
