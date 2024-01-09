package com.local;

public class Libro extends Recurso {

    private String autor;

    public Libro(String titulo, boolean disponible, String autor) {
        super(titulo, disponible);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " autor='" + getAutor() + "'";
    }

}
