package Taller3.Punto3;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Mp3 reproductorMp3 = new Mp3(Duration.ofMinutes(3).ofSeconds(20), 20, "J balvin", "Ni idea", "Reggaeton");
        reproductorMp3.reproducir();
        Video video = new Video(Duration.ofMinutes(2).ofSeconds(30),50);
        video.reproducirSoloAudio();
    }
}
