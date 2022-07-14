/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Historias;

/**
 *
 * @author asus
 */
public class LibroAventura extends Libro {
    public LibroAventura(String autor, String nombre, String genero, String resumen) {
        super(autor, nombre, genero, resumen);
    }
    public void leerLibro(){
        System.out.println(this.getResumen());    
    }
    public void introduccion(){    
        System.out.println("tengo para ti:\n \t"+"\nUn libro de Aventura que emocionante "+this.getNombre()+"\nEscrito por: "+this.getAutor());
    }
}
