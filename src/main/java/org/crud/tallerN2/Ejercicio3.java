package org.crud.tallerN2;

class Documento {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}

class Impresora {
    
    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo documento:");
        System.out.println(doc.getContenido());
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Documento documento = new Documento("Este es el contenido del documento.");


        Impresora impresora = new Impresora();
        impresora.imprimir(documento);
    }
}