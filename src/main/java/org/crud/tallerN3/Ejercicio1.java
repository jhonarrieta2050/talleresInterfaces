package org.crud.tallerN3;

import java.util.ArrayList;
import java.util.List;


class Jugador {
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


class Equipo {
    private List<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    // Método para agregar un jugador
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }


    public Jugador buscarJugador(String nombre) {
        return jugadores.stream()
            .filter(jugador -> jugador.getNombre().equalsIgnoreCase(nombre)) // Compara nombres ignorando mayúsculas/minúsculas
            .findFirst()
            .orElse(null); // Devuelve null si no encuentra un jugador
    }

   
    public boolean eliminarJugador(Jugador jugador) {
        return jugadores.remove(jugador);
    }

   
    public void eliminarTodosLosJugadores() {
        jugadores.clear();
    }

   
    public void mostrarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores en el equipo.");
        } else {
            jugadores.forEach(jugador -> System.out.println(jugador.getNombre()));
        }
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();

       
        Jugador jugador1 = new Jugador("Carlos");
        Jugador jugador2 = new Jugador("Ana");
        Jugador jugador3 = new Jugador("Luis");

        
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        
        System.out.println("Jugadores en el equipo:");
        equipo.mostrarJugadores();

        
        Jugador encontrado = equipo.buscarJugador("Ana");
        if (encontrado != null) {
            System.out.println("\nJugador encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("\nJugador no encontrado");
        }

       
        equipo.eliminarJugador(jugador2);

        
        System.out.println("\nJugadores después de eliminar a Ana:");
        equipo.mostrarJugadores();

        
        equipo.eliminarTodosLosJugadores();
        System.out.println("\nTodos los jugadores fueron eliminados.");

        equipo.mostrarJugadores();
    }
}
