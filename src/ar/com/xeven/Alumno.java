package ar.com.xeven;

import java.util.ArrayList;

public class Alumno {
    //atributos
    private String nombre;
    private ArrayList<Double> notas;
    private Double promedio;

    //constructor
    public Alumno(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    //metodo que calcula el promedio de notas
    public Double getPromedioNotas(){
        Double suma = 0.0;
        for (int i = 0; i<notas.size(); i++)
            suma += notas.get(i);
        promedio = suma / notas.size();
        return promedio;
    }
}
