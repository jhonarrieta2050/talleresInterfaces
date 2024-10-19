package org.crud.tallerN2;

import java.util.ArrayList;
import java.util.List;

class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
    
    }
   
class Aula {

    private int numero;
    private List<Estudiante> estudiantes;

    public Aula(int numero) {
        this.numero = numero;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Aula " + numero + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    }

public class Ejercicio4 {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Emilia", 12);
        Estudiante estudiante2 = new Estudiante("Marcos", 14);

        Aula aula1 = new Aula(001);

        aula1.agregarEstudiante(estudiante1);
        aula1.agregarEstudiante(estudiante2);

        aula1.mostrarEstudiantes();

    }
}
