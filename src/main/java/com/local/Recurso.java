package com.local;

public abstract class Recurso {

    private static int COUNT = 0;
    private int id;
    private String titulo;
    private boolean disponible;

    public Recurso(String titulo, boolean disponible) {
        COUNT += 1;
        this.id = COUNT;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return " id='" + getId() + "'" +
                " titulo='" + getTitulo() + "'" +
                " disponible='" + isDisponible() + "'";
    }
}