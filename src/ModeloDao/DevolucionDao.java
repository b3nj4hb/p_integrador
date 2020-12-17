/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;
import java.sql.*;
import config.bd.ConectaBd;
import java.util.ArrayList;
import java.util.List;
import Modelo.Devolucion;
import Interface.CRUDdevolucion;

/**
 *
 * @author Alvaro Alva Chipana
 */
public class DevolucionDao implements CRUDdevolucion{
    ConectaBd cn = new ConectaBd();
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     Devolucion e = new Devolucion();
     @Override
     public boolean lacosadelstock(int idlibro) {
         String consulta = " update libro " + " set " + " Stock_disponibles = Stock_disponibles+1 " + " where idlibro= " + idlibro;
        try {
            con=cn.getConnection();
            pst=con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ga error");
        }
        return true;
    }
    @Override
    public List listarlibrosprestados(String dni) {
         ArrayList<Devolucion>devoluciones=new ArrayList<>();
       String consulta=" select p.idprestamo, p.Fecha_Prestamo, p.Fecha_Devolucion, u.nombre,u.apellidos, l.idlibro, l.titulo, p.estado"+" from prestamo p, usuario u, libro l"+" where l.idlibro=p.idlibro and u.idusuario=p.idusuario and p.estado= 'P' and dni="+dni+" ORDER BY p.idprestamo";
       try {
            con=cn.getConnection();
            pst=con.prepareStatement(consulta);
            rs=pst.executeQuery();
            while (rs.next()) {                
                  Devolucion devolucion=new Devolucion();
               devolucion.setIdprestamo(rs.getInt("p.idprestamo"));
               devolucion.setFecha_prestamo(rs.getString("p.Fecha_Prestamo"));
               devolucion.setFecha_devolucion(rs.getString("p.Fecha_Devolucion"));
               devolucion.setAnombre(rs.getString("u.nombre"));
               devolucion.setApellidos(rs.getString("u.apellidos"));
                devolucion.setIdlibro(rs.getInt("l.idlibro"));
               devolucion.setLnombre(rs.getString("l.titulo"));
               devolucion.setEstado(rs.getString("p.estado"));
               devoluciones.add(devolucion);
            
            }
                    
        } catch (Exception error) {
            System.out.println("Listar error");
            
        }
        return devoluciones;
    }

    @Override
    public Devolucion buscardevolucion(int idprestamo) {
        String consulta=" select *"+" from prestamo "+" where idprestamo = "+idprestamo;
         try {
            con=cn.getConnection();
            pst=con.prepareStatement(consulta);
            rs=pst.executeQuery();
            while (rs.next()) {                
              
                e.setIdprestamo(rs.getInt("idprestamo"));
                
                e.setEstado(rs.getString("estado"));
            }
                    
        } catch (Exception e) {
            System.out.println("Buscar error");
        }
        return e;
    }

    @Override
    public boolean editardevolucion(Devolucion devolucion) {
         String consulta = " update prestamo "
                        + " set "
                        
                        + " estado = '"+ devolucion.getEstado()+"' "
                        + " where "
                        + " idprestamo = " + devolucion.getIdprestamo();
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();            
        } catch (Exception error) {
            System.out.println("Error: Problemas con la EDICIÓN");
            System.out.println(error.getMessage());
            return false;            
        }
        return true;
    }

    @Override
    public List listardevolucion() {
        ArrayList<Devolucion>reportes=new ArrayList<>();
       String consulta=" select p.idprestamo, p.Fecha_Prestamo, p.Fecha_Devolucion, u.nombre,u.apellidos, l.titulo, p.estado"+" from prestamo p, usuario u, libro l"+" where l.idlibro=p.idlibro and u.idusuario=p.idusuario and p.estado= 'D' ORDER BY p.idprestamo";
       try {
            con=cn.getConnection();
            pst=con.prepareStatement(consulta);
            rs=pst.executeQuery();
            while (rs.next()) {                
                Devolucion reporte=new Devolucion();
               reporte.setIdprestamo(rs.getInt("p.idprestamo"));
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
}
