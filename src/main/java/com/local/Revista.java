package com.local;

public class Revista extends Recurso {

    private int numero;
    private TipoRevista tipoRevista;

    public Revista(String titulo, boolean disponible, TipoRevista tipoRevista) {
        super(titulo, disponible);
        this.tipoRevista = tipoRevista;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoRevista getTipoRevista() {
        return this.tipoRevista;
    }

    public void setTipoRevista(TipoRevista tipoRevista) {
        this.tipoRevista = tipoRevista;
    }

    @Override
    public String toString() {
        return super.toString() + " numero='" + getNumero() + "'" +
                " tipoRevista='" + getTipoRevista() + "'";
    }
}
