package Taller3.Punto2;

public class Main {
    public static void main(String[] args) {
        Estudiante alejandro = new Estudiante("Alejandro");
        System.out.println(alejandro.getMaterias());
        alejandro.agregarMateria("Sociales");
        System.out.println(alejandro.getMaterias());
    }
}
