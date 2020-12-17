package modelo_DAO;

import modelos.*;
import config.bd.ConectaBd;
import java.sql.*;
import java.util.*;
import interfaces.CRUD_usuario;

public class UsuarioDAO implements CRUD_usuario {

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
            System.out.println("reportedao error");
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
            System.out.println("reportedao error");
            System.out.println(error.getMessage());
        }
        return e;
    }

    @Override
    public boolean agregarusuario(Usuario usuario) {
        String consulta = " insert into  "
                + " usuario (nombre, apellidos, dni, estado) "
                + " values('" + usuario.getNombre() + "', "
                + " '" + usuario.getApellidos() + "', "
                + " '" + usuario.getDni() + "', "
                + " '" + usuario.getEstado() + "')";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("reportedao error");
            return false;
        }
        return true;
    }

    @Override
    public boolean editarusuario(Usuario usuario) {
        String consulta = " update usuario "
                + " set "
                + " nombre = '" + usuario.getNombre() + "', "
                + " apellidos = '" + usuario.getApellidos() + "', "
                + " dni = '" + usuario.getDni() + "', "
                + " estado = '" + usuario.getEstado() + "' "
                + " where "
                + " idusuario = " + usuario.getIdusuario() + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println("reportedao error");
        }
        return true;
    }

    @Override
    public boolean eliminarusuario(int idusuario) {
        String consulta = " delete from usuario "
                + " where  "
                + " idusuario =  " + idusuario;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("reportedao error");
            return false;
        }
        return true;
    }
}
