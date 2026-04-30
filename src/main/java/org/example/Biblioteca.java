package org.example;
import java.util.ArrayList;

public class Biblioteca {

    private Libro[] estanteria;
    private int cantidadLibros;

    public Biblioteca() {
        this.estanteria = new Libro[10];
        this.cantidadLibros = 0;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void agregarLibro(Libro nuevoLibro) {
        if (cantidadLibros < estanteria.length) {
            estanteria[cantidadLibros] = nuevoLibro;
            cantidadLibros++;
            System.out.println("Libro puesto en la estantería. Cantidad de libros " + cantidadLibros);
        } else {
            System.out.println("No caben más libros, estantería llena.");
        }
    }
}
