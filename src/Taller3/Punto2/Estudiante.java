package Taller3.Punto2;
import java.util.ArrayList;

public class Estudiante {
    private ArrayList<String> materias;
    private String id;
    public Estudiante(String id) {
        materias = new ArrayList<>();
        this.id=id;
    }

    public ArrayList<String> getMaterias() {
        if (materias.isEmpty()) {
            return null;
        } else {
            return materias;
        }
    }

    public void agregarMateria(String materia) {
        materias.add(materia);
    }
}

