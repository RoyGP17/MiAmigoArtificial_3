package Historias;

public class LibroDrama extends Libro {

    private int niveldrama;

    public LibroDrama(int niveldrama, String autor, String nombre, String genero, String resumen) {
        super(autor, nombre, genero, resumen);
        this.niveldrama = niveldrama;
    }

    public int getNiveldrama() {
        return niveldrama;
    }

    public void setNiveldrama(int niveldrama) {
        this.niveldrama = niveldrama;
    }

    public void leerLibro() {
        System.out.println(this.getResumen());
    }

    public void introduccion() {
        System.out.println("tengo para ti:\n \t" + "\nUn libro de drama alistemos el pañuelo" + this.getNombre() + "\nEscrito por: " + this.getAutor());
    }
}
