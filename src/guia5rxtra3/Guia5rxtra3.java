/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5rxtra3;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Bel
 */
public class Guia5rxtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Libro> librosDisponibles = new HashSet();
        Libro libro1 = new Libro("Mona", "Lisa", 5, 1);
        Libro libro2 = new Libro("Mon", "Lis", 4, 2);
        Libro libro3 = new Libro("Mo", "Li", 3, 3);
//Se agregan los libros
        librosDisponibles.add(libro1);
        librosDisponibles.add(libro2);
        librosDisponibles.add(libro3);
        //Se crea una libreria con la coleccion
        
         Libreria libreria = new Libreria(librosDisponibles);
         //Se muestran los libros
        for (Libro libros : librosDisponibles) {
            System.out.println("Libro");
        }
        //Se lee y realiza el metodo prestamo

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();

        for (Libro libroDisponible : librosDisponibles) {
            if (libroDisponible.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Prestamo realizado:"+libreria.prestamo(libroDisponible));

            }
            }
            System.out.println("Ingrese el tituo del libro a devolver");
            titulo=leer.next();
            for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equals(titulo)) {
                System.out.println("Prestamo realizado:"+libreria.devolucion(libro));

            }
        }
    

}
}