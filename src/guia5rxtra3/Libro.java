/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5rxtra3;

/**
 *
 * @author Bel
 */
public class Libro {

    private String titulo, autor;
    private int nroEjemplares, nroEjemplaresPres;

    public Libro(String titulo, String autor, int nroEjemplares, int nroEjemplaresPres) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroEjemplares = nroEjemplares;
        this.nroEjemplaresPres = nroEjemplaresPres;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(int nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public int getNroEjemplaresPres() {
        return nroEjemplaresPres;
    }

    public void setNroEjemplaresPres(int nroEjemplaresPres) {
        this.nroEjemplaresPres = nroEjemplaresPres;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }

}
