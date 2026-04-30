package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LibroTest {

    Libro libro = new Libro("Efecto mariposa");

    @Test
    void testLibroSeCreaNoPrestado() {


        assertFalse(libro.isPrestado(), "El libro no debería estar prestado al crearse");
    }

    @Test
    void testPrestarLibroCambiaEstado() {
        libro.prestarLibro();

        assertTrue(libro.isPrestado(), "El libro debería marcarse como prestado");
    }

    @Test
    void testDevolverLibroCambiaEstado() {
        libro.prestarLibro();
        libro.devolverLibro();

        assertFalse(libro.isPrestado(), "El libro debería estar disponible tras devolverlo");
    }
}