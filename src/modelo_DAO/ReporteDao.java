package modelo_DAO;

import interfaces.CRUDreporte;
import modelos.Prestamo;
import modelos.ReportePrestamo;
import java.util.List;
import java.util.List;
import config.bd.ConectaBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ReporteDao implements CRUDreporte {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Prestamo e = new Prestamo();

    @Override
    public boolean lacosadelstock(int idlibro) {
        String consulta = " update libro " + " set " + " Stock_disponibles = Stock_disponibles-1 " + " where idlibro= " + idlibro;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ga error");
        }
        return true;
    }

    @Override
    public List listarusuarios() {
        ArrayList<ReportePrestamo> reportes = new ArrayList<>();
        String consulta = " select p.idprestamo, p.Fecha_Prestamo, p.Fecha_Devolucion, u.nombre,u.apellidos, l.titulo, p.estado" + " from prestamo p, usuario u, libro l" + " where l.idlibro=p.idlibro and u.idusuario=p.idusuario and p.estado= 'P' ORDER BY p.idprestamo";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                ReportePrestamo reporte = new ReportePrestamo();
                reporte.setIdreporte(rs.getInt("p.idprestamo"));
                reporte.setFecha_prestamo(rs.getString("p.Fecha_Prestamo"));
                reporte.setFecha_devolucion(rs.getString("p.Fecha_Devolucion"));
                reporte.setAnombre(rs.getString("u.nombre"));
                reporte.setApellidos(rs.getString("u.apellidos"));
                reporte.setLnombre(rs.getString("l.titulo"));
                reporte.setEstado(rs.getString("p.estado"));
                reportes.add(reporte);

            }

        } catch (Exception error) {
            System.out.println("Listar error");

        }
        return reportes;
    }

    @Override
    public Prestamo buscarusuario(int idprestamo) {
        String consulta = " select *" + " from prestamo " + " where idprestamo = " + idprestamo;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdprestamo(rs.getInt("idprestamo"));
                e.setFecha_prestamo(rs.getString("p.Fecha_Prestamo"));
                e.setFecha_devolucion(rs.getString("p.Fecha_Devolucion"));
                e.setIdusuario(rs.getInt("idusuario"));
                e.setIdlibro(rs.getInt("idlibro"));
                e.setEstado(rs.getString("p.estado"));

            }

        } catch (Exception e) {
            System.out.println("Buscar error");
        }
        return e;
    }

    @Override
    public boolean agregarusuario(Prestamo prestamo) {
        String consulta = " insert into  "
                + " prestamo(Fecha_Devolucion, Fecha_Prestamo, estado, idusuario, idlibro) "
                + " values('" + prestamo.getFecha_devolucion() + "', "
                + " '" + prestamo.getFecha_prestamo() + "', "
                + " '" + prestamo.getEstado() + "', "
                + " '" + prestamo.getIdusuario() + "', "
                + " '" + prestamo.getIdlibro() + "')";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println("Agregar error");
        }
        return true;
    }

    @Override
    public boolean editarusuario(Prestamo prestamo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarusuario(int idprestamo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
