package org.crud.tallerN1;

class Animal1 {
    protected String sonido = "Sonido de animal";

    public void hacerSonido() {
        System.out.println(sonido);
    }
}


class Gato extends Animal1 {
    public Gato() {
        super.sonido = "Miau"; 
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El gato maulla.");
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Gato miGato = new Gato();

        miGato.hacerSonido();
    }
}
