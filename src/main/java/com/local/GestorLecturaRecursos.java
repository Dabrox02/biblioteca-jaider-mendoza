package com.local;

public interface GestorLecturaRecursos {
    String listarRecursos();

    String buscarRecursoPorTitulo(String titulo);

    boolean idRecursoValido(Recurso recursoValidar);
}
