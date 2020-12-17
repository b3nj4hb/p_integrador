/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;
import Interface.CRUDusuarios;
import Modelo.Usuario;
import java.util.List;
import java.util.List;
import config.bd.ConectaBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author Alvaro Alva Chipana
 */
public class UsuarioDao implements CRUDusuarios{
    ConectaBd cn = new ConectaBd();
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     Usuario e = new Usuario();

    @Override
    public List listarusuarios() {
         ArrayList<Usuario> usuarios = new ArrayList<>();
        String consulta = " select * from usuario ORDER BY apellidos";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Usuario usuario = new Usuario();
                usuario.setIdusuario(rs.getInt("idusuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setDni(rs.getString("dni"));
                usuario.setEstado(rs.getString("estado"));
                usuarios.add(usuario);
                
            }
        } catch (Exception error) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(error.getMessage());
        }
        return usuarios;
    }

    @Override
    public Usuario buscarusuario(int idusuario) {
        String consulta = " select * "
                        + " from usuario  "
                        + " where idusuario =  " + idusuario;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                   e.setIdusuario(rs.getInt("idusuario"));
                e.setNombre(rs.getString("nombre"));
                e.setApellidos(rs.getString("apellidos"));
                e.setDni(rs.getString("dni"));
                e.setEstado(rs.getString("estado"));
            }
        } catch (Exception error) {
            System.out.println("Error: Problemas con la BUSQUEDA");
            System.out.println(error.getMessage());
        }
        return e;
    }

    @Override
    public boolean agregarusuario(Usuario usuario) {
         String consulta= " insert into  "
                        + " usuario (nombre, apellidos, dni, estado) "
                        + " values('"+ usuario.getNombre() +"', "
                          + " '"+ usuario.getApellidos()+"', "
                  + " '"+ usuario.getDni()+"', "
                        + " '"+ usuario.getEstado()+"')";
            try {
                con=cn.getConnection();
                pst=con.prepareStatement(consulta);
                pst.executeUpdate();
                    
        } catch (SQLException e) {
                System.out.println("Error: Problemas con el Agregar");
                return false;
        }
        return true;
    }

    @Override
    public boolean editarusuario(Usuario usuario) {
        String consulta = " update usuario "
                        + " set "
                        + " nombre = '"+ usuario.getNombre()+"', "
                        + " apellidos = '"+ usuario.getApellidos()+"', "
                        + " dni = '"+ usuario.getDni()+"', "
                       
                       
                        + " estado = '"+ usuario.getEstado()+"' "
                        + " where "
                        + " idusuario = " + usuario.getIdusuario()+ "; ";
         try {
            con=cn.getConnection();
            pst=con.prepareStatement(consulta);
            pst.executeUpdate();
          
                    
        } catch (Exception e) {
            System.out.println("Editar error");
        }
        return true;
    }

    @Override
    public boolean eliminarusuario(int idusuario) {
       String consulta= " delete from usuario "
                        + " where  "
                        + " idusuario =  " + idusuario;
          try {
             con= cn.getConnection();
            pst=con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en Eliminar");
            return false;
        }
        return true;
    }
}
