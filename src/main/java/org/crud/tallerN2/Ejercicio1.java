package org.crud.tallerN2;

class Animal {

    public void respirar() {
    System.out.println("Estoy respirando");
    }

    public void sonido() {
        System.out.println("SONIDOOOO");
        }

    }
   
class Perro extends Animal {

    @Override
    public void sonido() {
    System.out.println("!GUAU GUAU GUAU! ");
    }

    public void moverCola() {
        System.out.println("Moviendo la cola");
    }

    }

public class Ejercicio1 {
    public static void main(String[] args) {
        Perro kira = new Perro();
        kira.respirar();
        kira.sonido();
        kira.moverCola();
    }
}
