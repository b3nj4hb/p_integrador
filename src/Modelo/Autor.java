package Modelo;

public class Autor {

    private int idautor;
    private String nombre;
    private String apellidos;

    public String getNombreCompleto() {
        return apellidos.toUpperCase() + ", " + nombre;
    }

    public Autor(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Autor(int idautor, String nombre, String apellidos) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor() {
    }
}
