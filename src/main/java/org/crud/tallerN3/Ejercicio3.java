package org.crud.tallerN3;

class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Evento {
    private String nombre;

    public Evento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Matrimonio {
    private Persona persona;
    private Evento evento; 
    public Matrimonio(Persona persona, Evento evento) {
        this.persona = persona;
        this.evento = evento;
    }

    
    public void mostrarMatrimonio() {
        System.out.println(persona.getNombre() + " está asociado al evento " + evento.getNombre());
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Ana");
        Evento evento1 = new Evento("Boda de Juan y Ana");
        
        Matrimonio matrimonio1 = new Matrimonio(persona1, evento1);
        Matrimonio matrimonio2 = new Matrimonio(persona2, evento1);
        
        matrimonio1.mostrarMatrimonio();
        matrimonio2.mostrarMatrimonio();
    }
}
