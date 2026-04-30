package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Quijote");
        Libro libro2 = new Libro("100 años");


        Biblioteca biblioteca1 = new Biblioteca();

        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);
    }
}