package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Biblioteca miBiblio = new Biblioteca();

    @Test
    void testBibliotecaSeCreaVacia() {

        assertEquals(0, miBiblio.getCantidadLibros(), "La biblioteca debería empezar con 0 libros");
    }

    @Test
    void testAgregarUnLibroSumaAlContador() {
        Libro harryPotter = new Libro("Harry Potter");

        miBiblio.agregarLibro(harryPotter);

        assertEquals(1, miBiblio.getCantidadLibros(), "El contador debería subir a 1 tras añadir un libro");
    }

    @Test
    void testNoDejaAgregarMasDeDiezLibros() {
        Biblioteca miBiblio = new Biblioteca();

        for (int i = 0; i < 10; i++) {
            miBiblio.agregarLibro(new Libro("Libro de prueba " + i));
        }

        Libro libroSobrante = new Libro("El Señor de los Anillos");
        miBiblio.agregarLibro(libroSobrante);

        assertEquals(10, miBiblio.getCantidadLibros(), "El array no debería permitir pasar de 10 libros");
    }
}