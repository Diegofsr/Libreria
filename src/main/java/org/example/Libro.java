package org.example;

public class Libro {

    private String titulo;
    private boolean prestado = false;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void isPrestado() {
        if (prestado) {
            System.out.println("El libro esta prestado");
        } else {
            System.out.println("El libro no esta prestado");
        }
    }

    public void prestarLibro(String titulo) {
        if (prestado) {
            System.out.println("Lo siento el libro esta prestado");
        } else {
            this.prestado = true;
            System.out.println("Libro prestado con exito");
        }
    }

    public void devolverLibro(String titulo) {
        if (!prestado) {
            System.out.println("No puedes devolver un libro que no ha sido prestado");
        } else {
            System.out.println("Has devuelto el libro");
            this.prestado = false;
        }
    }
}
