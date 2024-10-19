package org.crud.tallerN1;

abstract class Instrumento {
    public abstract void tocar();
}


interface Afinable {
    void afinar();
}


class Guitarra extends Instrumento implements Afinable {
    
    @Override
    public void tocar() {
        System.out.println("La guitarra se toca");
    }
    
    @Override
    public void afinar() {
        System.out.println("La guitarra se afina");
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {

        Guitarra guitarra = new Guitarra();
        
        guitarra.tocar();
        guitarra.afinar();
    }
}
