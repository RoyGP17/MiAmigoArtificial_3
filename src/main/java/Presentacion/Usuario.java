package Presentacion;

public class Usuario {

    private String Nombres;

    public void ActualizarNombre(Usuario ObjetoA, String nuevoNombre) {

        ObjetoA.Nombres = nuevoNombre;
    }

    public String getNombres() {
        return this.Nombres;
    }

    public void setNombres(String nombres) {
        this.Nombres = nombres;
    }

}
