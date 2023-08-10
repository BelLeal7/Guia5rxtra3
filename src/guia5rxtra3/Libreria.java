/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5rxtra3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 *
 * @author Bel
 */
public class Libreria {

    private HashSet<Libro> Libros;

    public Libreria() {
        this.Libros = new HashSet();
    }

    public Libreria(HashSet<Libro> Libros) {
        this.Libros = Libros;
    }

    public HashSet<Libro> getLibros() {
        return Libros;
    }

    public void setLibros(HashSet<Libro> Libros) {
        this.Libros = Libros;
    }

    public boolean prestamo(Libro libro) {
        boolean aux = false;
        if (libro.getNroEjemplares() - libro.getNroEjemplaresPres() > 0) {
            libro.setNroEjemplaresPres(libro.getNroEjemplaresPres() + 1);

            aux = true;
        }

        return aux;
    }
    public boolean devolucion(Libro libro) {
        boolean aux = false;
        if (libro.getNroEjemplaresPres() > 0) {
            libro.setNroEjemplaresPres(libro.getNroEjemplaresPres() - 1);

            aux = true;
        }

        return aux;
    }
//Formas de ordenaar una lista o conjunto.
    public void ordenarPorTitulo() {
        ArrayList <Libro> ordenPoTitulo=new ArrayList<>(Libros);
        Collections.sort(ordenPoTitulo, porTitulo);
        for (Libro libro : ordenPoTitulo) {
            System.out.println(ordenPoTitulo);
        }

    }
//El comparador agarra de a dos libros y compara los dos libros,
//compareTo devuelve un  entero, esto fuinciona es un metodo
//que trae las clases wragner , y les da numero, y en base a
//esos numeros lo acomoda, esta explicado en la guia igual)
    //Esta es una forma resumida, hay otra mas extensa y mas
    //facil de entender en la guia tambien
    Comparator<Libro> porTitulo = (Libro l1, Libro l2) -> {
        return l1.getTitulo().compareTo(l2.getTitulo());
    };
}
