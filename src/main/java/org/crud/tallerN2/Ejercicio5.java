package org.crud.tallerN2;

class Procesador {
    public void ejecutar() {
        System.out.println("El procesador esta ejecutando");
    }
    
    public void apagar() {
        System.out.println("El procesador se esta apagando");
    }
}

class Computadora {
    private Procesador procesador;

    public Computadora() {
        this.procesador = new Procesador(); 
    }

    public void encender() {
        System.out.println("La computadora se esta encendiendo");
        procesador.ejecutar();
    }

    public void apagar() {
        procesador.apagar();
        System.out.println("La computadora se está apagando.");
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {

        Computadora compu = new Computadora();

        compu.encender();
        compu.apagar();

    }
}
