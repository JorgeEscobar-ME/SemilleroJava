package Taller3.Punto3;

import java.time.Duration;

public class Video extends Formato implements IVideoAsAudio{

    public Video(Duration duracion, int peso) {
        super(duracion, peso);
    }
    @Override
    public void reproducirSoloAudio() {
        System.out.println("Se reproduce solo el audio de este video");
    }
}
