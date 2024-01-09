package com.local;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements GestorEscrituraRecursos, GestorLecturaRecursos {

    private List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    @Override
    public String listarRecursos() {
        StringBuilder sb = new StringBuilder();
        for (Recurso recurso : recursos) {
            sb.append(recurso).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String buscarRecursoPorTitulo(String titulo) {
        for (Recurso recurso : recursos) {
            if (recurso.getTitulo().equalsIgnoreCase(titulo))
                return "Recurso encontrado: " + recurso;
        }
        return "No encontrado";
    }

    @Override
    public void agregarRecurso(Recurso recurso) {
        if (idRecursoValido(recurso)) {
            recursos.add(recurso);
            System.out.println("Agregado con exito.");
        } else {
            System.out.println("Id " + recurso.getId() + " ya existe");
        }
    }

    @Override
    public boolean idRecursoValido(Recurso recursoValidar) {
        for (Recurso recurso : recursos) {
            if (recurso.getId() == recursoValidar.getId()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void prestarRecurso(int idRecurso) {
        for (Recurso recurso : recursos) {
            if (recurso.getId() == idRecurso) {
                recurso.setDisponible(false);
            }
        }
    }

}
