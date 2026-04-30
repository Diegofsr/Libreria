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

    public boolean isPrestado() {
        return prestado;
    }

    public void prestarLibro() {
        if (!prestado) {
            this.prestado = true;
            System.out.println("Libro prestado con exito");
        } else {
            System.out.println("Lo siento el libro esta prestado");
        }
    }

    public void devolverLibro(String titulo) {
        if (prestado) {
            this.prestado = false;
            System.out.println("Has devuelto el libro");
        } else {
            System.out.println("No puedes devolver un libro que no ha sido prestado");
        }
    }
}
