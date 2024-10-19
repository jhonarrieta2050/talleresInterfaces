package org.crud.tallerN2;

class Proyecto {
    private String nombre;

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Asignacion {
    private Empleado empleado;
    private Proyecto proyecto;

    public Asignacion(Empleado empleado, Proyecto proyecto) {
        this.empleado = empleado;
        this.proyecto = proyecto;
    }

    public void mostrarAsignacion() {
        System.out.println(empleado.getNombre() + " esta asignado al proyecto " + proyecto.getNombre());
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
      
        Empleado empleado1 = new Empleado("Ana");
        Empleado empleado2 = new Empleado("Luis");
        
        Proyecto proyecto1 = new Proyecto("Desarrollo Web");
        Proyecto proyecto2 = new Proyecto("App Movil");
       
        Asignacion asignacion1 = new Asignacion(empleado1, proyecto1);
        Asignacion asignacion2 = new Asignacion(empleado1, proyecto2);
        Asignacion asignacion3 = new Asignacion(empleado2, proyecto1);

        asignacion1.mostrarAsignacion();
        asignacion2.mostrarAsignacion();
        asignacion3.mostrarAsignacion();
    }
}
