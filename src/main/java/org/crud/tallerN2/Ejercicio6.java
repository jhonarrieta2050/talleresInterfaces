package org.crud.tallerN2;

import java.util.ArrayList;
import java.util.List;

class Jugador {
    private String nombre;
    private Equipo equipo;
    
    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }
    }
    
class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
        jugador.setEquipo(this);
    }

    public void mostrarJugadores() {
        System.out.println("Jugadores del equipo " + nombre + ":");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    
    }

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador("Leo");
        Jugador jugador2 = new Jugador("Cristiano");

        
        Equipo equipo = new Equipo("Dream Team");

        
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);

        
        equipo.mostrarJugadores();

        
        System.out.println(jugador1.getNombre() + " pertenece al equipo " + jugador1.getEquipo().getNombre());
        System.out.println(jugador2.getNombre() + " pertenece al equipo " + jugador2.getEquipo().getNombre());
    }
}
