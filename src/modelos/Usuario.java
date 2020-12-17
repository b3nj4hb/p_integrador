package modelos;

public class Usuario {

    private int idusuario;
    private String nombre;
    private String apellidos;
    private String dni;
    private String estado;

    public String getNombreCompleto() {
        return apellidos.toUpperCase() + ", " + nombre;
    }

    public Usuario() {

    }

    public Usuario(String nombre, String apellidos, String dni, String estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.estado = estado;
    }

    public Usuario(int idusuario, String nombre, String apellidos, String dni, String estado) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
