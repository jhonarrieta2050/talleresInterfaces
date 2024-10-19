package org.crud.tallerN1;

abstract class Animal {
    protected String nombre;

    public abstract void hacerSonido();

    
    public void presentar() {
        System.out.println("Este es mi animal, se llama " + nombre);
    }
}


class Perro extends Animal {
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Perro miPerro = new Perro("Estrella");

        miPerro.hacerSonido();
        miPerro.presentar();

    }
}
