package modelos;

public class ReportePrestamo {

    private int idreporte;
    private String fecha_prestamo;
    private String fecha_devolucion;
    private String estado;
    private String anombre;
    private String apellidos;
    private String lnombre;

    public String getNombreCompleto() {
        return apellidos.toUpperCase() + ", " + anombre;
    }

    public ReportePrestamo(int idreporte, String fecha_prestamo, String fecha_devolucion, String estado, String anombre, String apellidos, String lnombre) {
        this.idreporte = idreporte;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.estado = estado;
        this.anombre = anombre;
        this.apellidos = apellidos;
        this.lnombre = lnombre;
    }

    public ReportePrestamo() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdreporte() {
        return idreporte;
    }

    public void setIdreporte(int idreporte) {
        this.idreporte = idreporte;
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
        return estado.toUpperCase();
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAnombre() {
        return anombre;
    }

    public void setAnombre(String anombre) {
        this.anombre = anombre;
    }

    public String getLnombre() {
        return lnombre;
    }

    public void setLnombre(String lnombre) {
        this.lnombre = lnombre;
    }

}
