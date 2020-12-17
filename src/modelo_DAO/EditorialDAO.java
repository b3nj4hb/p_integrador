package modelo_DAO;

import java.sql.*;
import config.bd.ConectaBd;
import java.util.*;
import modelos.*;
import interfaces.CRUDeditorial;

public class EditorialDAO implements CRUDeditorial {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Editorial e = new Editorial();

    @Override
    public List listareditoriales() {
        ArrayList<Editorial> editoriales = new ArrayList<>();
        String consulta = " select * from editorial ORDER BY nombre";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Editorial editorial = new Editorial();
                editorial.setIdeditorial(rs.getInt("ideditorial"));
                editorial.setNombre(rs.getString("nombre"));
                editorial.setCodigo(rs.getString("codigo"));
                editorial.setDireccion(rs.getString("direccion"));
                editorial.setURL(rs.getString("URL"));
                editorial.setEstado(rs.getString("estado"));
                editoriales.add(editorial);
            }
        } catch (Exception error) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(error.getMessage());
        }
        return editoriales;
    }

    @Override
    public Editorial buscareditorial(int ideditorial) {
        String consulta = " select * "
                + " from editorial  "
                + " where ideditorial =  " + ideditorial;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdeditorial(rs.getInt("idep"));
                e.setNombre(rs.getString("nombre"));
                e.setCodigo(rs.getString("codigo"));
                e.setDireccion(rs.getString("direccion"));
                e.setURL(rs.getString("URL"));
                e.setEstado(rs.getString("estado"));
            }
        } catch (Exception error) {
            System.out.println("Error: Problemas con la BUSQUEDA");
            System.out.println(error.getMessage());
        }
        return e;
    }

    @Override
    public boolean agregareditorial(Editorial editorial) {
        String consulta = " insert into  "
                + " editorial (nombre, codigo, direccion, URL, estado) "
                + " values('" + editorial.getNombre() + "', "
                + " '" + editorial.getCodigo() + "', "
                + " '" + editorial.getDireccion() + "', "
                + " '" + editorial.getURL() + "', "
                + " '" + editorial.getEstado() + "')";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en agregar");
            return false;
        }
        return true;
    }

    @Override
    public boolean editareditorial(Editorial ep) {
        String consulta = " update editorial "
                + " set "
                + " nombre = '" + ep.getNombre() + "', "
                + " codigo = '" + ep.getCodigo() + "', "
                + " direccion = '" + ep.getDireccion() + "', "
                + " URL = '" + ep.getURL() + "', "
                + " estado = '" + ep.getEstado() + "' "
                + " where "
                + " ideditorial = " + ep.getIdeditorial();
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
    public boolean eliminareditorial(int ideditorial) {
        String consulta = " delete from editorial"
                + " where  "
                + " ideditorial =  " + ideditorial;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en Eliminar");
            return false;
        }
        return true;
    }

}
