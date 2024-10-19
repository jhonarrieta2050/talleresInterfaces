package org.crud.tallerN3;

class Puerta {
    private String material;

    public Puerta(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}

class Casa {
    private Puerta puerta;

    public Casa(Puerta puerta) {
        if (puerta == null) {
            throw new IllegalArgumentException("Una casa no puede existir sin una puerta.");
        }
        this.puerta = puerta;
    }

    public Puerta obtenerPuerta() {
        return puerta;
    }

    public void cambiarPuerta(Puerta nuevaPuerta) {
        if (nuevaPuerta == null) {
            throw new IllegalArgumentException("No se puede cambiar por una puerta nula.");
        }
        this.puerta = nuevaPuerta;
    }

    public void eliminarPuerta() {
        throw new UnsupportedOperationException("No se puede eliminar la puerta de la casa.");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Puerta puertaprincipal = new Puerta("Madera");

        Casa casa = new Casa(puertaprincipal);

        System.out.println("Material de la puerta Actual: " + casa.obtenerPuerta().getMaterial());

        // Cambiar la puerta
        Puerta nuevaPuerta = new Puerta("Acero");
        casa.cambiarPuerta(nuevaPuerta);

        // Mostrar el material de la nueva puerta
        System.out.println("Material de la nueva puerta: " + casa.obtenerPuerta().getMaterial());

        // Intentar eliminar la puerta (lanzará una excepción)
        try {
            casa.eliminarPuerta();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
