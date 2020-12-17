package modelos;

public class Prestamo {

    private int idprestamo;
    private String fecha_prestamo;
    private String fecha_devolucion;
    private String estado;
    private int idusuario;
    private int idlibro;

    public Prestamo(int idprestamo, String fecha_prestamo, String fecha_devolucion, String estado, int idusuario, int idlibro) {
        this.idprestamo = idprestamo;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.estado = estado;
        this.idusuario = idusuario;
        this.idlibro = idlibro;
    }

    public Prestamo(String fecha_prestamo, String fecha_devolucion, String estado, int idusuario, int idlibro) {
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.estado = estado;
        this.idusuario = idusuario;
        this.idlibro = idlibro;
    }

    public Prestamo() {
    }

    public int getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(int idprestamo) {
        this.idprestamo = idprestamo;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

}
