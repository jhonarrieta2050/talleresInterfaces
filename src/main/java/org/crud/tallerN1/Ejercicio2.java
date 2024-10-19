package org.crud.tallerN1;

interface Nadador {
    void nadar();
}


class Pez implements Nadador {
    private String nombre;


    public Pez(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void nadar() {
        System.out.println("El pez " + nombre + " está nadando.");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Pez pez1 = new Pez("ROSITA");

        pez1.nadar();
    }
}
