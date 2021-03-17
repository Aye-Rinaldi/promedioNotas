package ar.com.xeven;

import java.util.ArrayList;

public class Materia {
    //atributos
    ArrayList<Alumno> alumnos = new ArrayList<>();

    //constructor
    public Materia(){
        //alumno1
        ArrayList<Double> notas1 = new ArrayList<>();
        notas1.add(7.00);
        notas1.add(8.50);
        notas1.add(10.00);
        Alumno alumno1 = new Alumno("Loren Curtis",notas1);
        alumnos.add(alumno1);

        //alumno2
        ArrayList<Double> notas2 = new ArrayList<>();
        notas2.add(9.90);
        notas2.add(8.80);
        notas2.add(8.00);
        Alumno alumno2 = new Alumno("Alicia Agneson",notas2);
        alumnos.add(alumno2);

    }

    //getters
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}
