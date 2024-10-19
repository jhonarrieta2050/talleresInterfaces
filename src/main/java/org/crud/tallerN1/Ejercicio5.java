package org.crud.tallerN1;

final class Constante {
    public final int valor = 42; 
   
    public final void mostrarValor() {
        System.out.println("Valor: " + valor);
    }
}

class ClasePadre {
    protected void metodoProtegido() {
        System.out.println("Este es un metodo protegido");
    }
}


class SubClase extends ClasePadre {
    public void llamarMetodoProtegido() {
        metodoProtegido(); 
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Constante c = new Constante();
        c.mostrarValor();
        
        SubClase sc = new SubClase();
        sc.llamarMetodoProtegido();
        
    }
}
