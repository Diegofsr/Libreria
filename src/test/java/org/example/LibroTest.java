package org.example;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {


    @Test
    void testLibroSeCreaNoPrestado() {
        // 1. Preparar: Creamos un libro
        Libro libro = new Libro("Clean Code");

        // 2. Comprobar: Por defecto, isPrestado debe ser false
        assertFalse(libro.isPrestado(), "El libro no debería estar prestado al crearse");
    }
}