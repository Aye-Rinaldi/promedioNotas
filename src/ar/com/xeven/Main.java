package ar.com.xeven;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Materia fisicaGeneral = new Materia();

        //lista de alumnos
        ArrayList<Alumno> alumnosFisicaGeneral = fisicaGeneral.getAlumnos();

        //cantidad de alumnos inscriptos en la materia
        System.out.println("Cantidad de alumnos inscriptos en Fisica General: "+alumnosFisicaGeneral.size());
        System.out.println();

        //promedio de cada alumno
        for (int i=0;i<alumnosFisicaGeneral.size();i++){
            Alumno alumno = alumnosFisicaGeneral.get(i);
            System.out.println("El promedio del alumno "+alumno.getNombre()+" es "+String.format("%.2f",alumno.getPromedioNotas()));
        }
    }
}
