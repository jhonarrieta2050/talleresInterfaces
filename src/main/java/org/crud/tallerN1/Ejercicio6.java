package org.crud.tallerN1;

class Vehiculo {
    public void mover() {
        System.out.println("El vehiculo se mueve");
    }
}

class Moto extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La moto se mueve rapidamente");
    }
}


class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El avion vuela");
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {

        Vehiculo v1 = new Moto();
        v1.mover();

        Vehiculo v2 = new Avion();
        v2.mover();
    }
}
