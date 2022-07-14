/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Historias;

/**
 *
 * @author asus
 */
public class Libro {
    private String autor;
    private String nombre;
    private String genero;
    private String resumen;

    public Libro(String autor, String nombre, String genero, String resumen) {
        this.autor = autor;
        this.nombre = nombre;
        this.genero = genero;
        this.resumen = resumen;
    }
    //public ArrayList<LibroDrama> listaLibrosDrama = new ArrayList<>();

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    public void introduccion(){ 
        System.out.println("Tenemos: "+this.nombre+ "\n Es una obra de: "+this.genero+"\nescrito por"+this.autor);
    }
    public void leerLibro(){
        System.out.println(this.getResumen()); 
    }
    
}
