package com.local;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Recurso recurso1 = new Libro("Don quijote", false, "Cervantes");
        Recurso recurso2 = new Revista("Semana", false, TipoRevista.POPULAR);
        Recurso recurso3 = new Revista("Piloto", true, TipoRevista.ONLINE);
        biblioteca.agregarRecurso(recurso1);
        biblioteca.agregarRecurso(recurso2);
        biblioteca.agregarRecurso(recurso3);
        biblioteca.prestarRecurso(3);
        System.out.println(biblioteca.listarRecursos());
        System.out.println(biblioteca.buscarRecursoPorTitulo("don quijote"));
    }
}