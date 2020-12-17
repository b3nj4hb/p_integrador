/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alvaro Alva Chipana
 */
public class Devolucion {
     private int idprestamo;
    private String fecha_prestamo;
    private String fecha_devolucion;
    private String estado;
    private String dni;
    private int idusuario;
    private int idlibro;
        private String anombre;
    private String apellidos;
    private String lnombre;
    
   
 public String getNombreCompleto(){
        return apellidos.toUpperCase() + ", " + anombre;
    }
    public Devolucion() {
    }

    public Devolucion(int idprestamo, String fecha_prestamo, String fecha_devolucion, String estado, String dni, int idusuario, int idlibro) {
        this.idprestamo = idprestamo;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.estado = estado;
        this.dni = dni;
        this.idusuario = idusuario;
        this.idlibro = idlibro;
    }

    public Devolucion(int idprestamo, String estado) {
        this.idprestamo = idprestamo;
        this.estado = estado;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getAnombre() {
        return anombre;
    }

    public void setAnombre(String anombre) {
        this.anombre = anombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLnombre() {
        return lnombre;
    }

    public void setLnombre(String lnombre) {
        this.lnombre = lnombre;
    }
}
