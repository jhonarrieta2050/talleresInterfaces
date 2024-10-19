package org.crud.tallerN2;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
}
public class Ejercicio8 {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Cien años de soledad");
        Libro libro2 = new Libro("Don Quijote de la Mancha");
        Libro libro3 = new Libro("1984");

        
        Biblioteca biblioteca = new Biblioteca();

        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.mostrarLibros();
    }
}
