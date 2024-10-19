package org.crud.tallerN2;

interface Nadador{
    void nadar();
}

class Delfin implements Nadador{
    @Override
    public void nadar(){
        System.out.println("Nado por todo el mar");
    }
}


public class Ejercicio2 {
    public static void main(String[] args) {
        Delfin lola = new Delfin();

        lola.nadar();
    }
}
