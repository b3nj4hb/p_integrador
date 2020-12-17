package modelo_DAO;

import java.sql.*;
import config.bd.ConectaBd;
import java.util.*;
import modelos.*;
import interfaces.CRUD_pais;

public class PaisDAO implements CRUD_pais {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Pais pa = new Pais();

    @Override
    public List listarpaises() {
        ArrayList<Pais> paises = new ArrayList<>();
        String consulta = " select p.idpais, p.nombre, p.estado" + " from pais p ORDER BY p.nombre";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Pais pais = new Pais();
                pais.setIdpais(rs.getInt("p.idpais"));
                pais.setNombre(rs.getString("p.nombre"));
                pais.setEstado(rs.getString("p.estado"));
                paises.add(pais);
            }
        } catch (Exception error) {
            System.out.println("paisdao error");
            System.out.println(error.getMessage());
        }
        return paises;
    }

    @Override
    public Pais buscarpais(int idpais) {
        String consulta = " select * "
                + " from pais  "
                + " where idpais =  " + idpais;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Pais pais = new Pais();
                pa.setIdpais(rs.getInt("idlibro"));
                pa.setNombre(rs.getString("nombre"));
                pa.setEstado(rs.getString("estado"));
            }
        } catch (Exception error) {
            System.out.println("paisdao error");
            System.out.println(error.getMessage());
        }
        return pa;
    }

    @Override
    public boolean agregarpais(Pais pais) {
        String consulta = " insert into  "
                + " pais (nombre, estado) "
                + " values('" + pais.getNombre() + "', "
                + " '" + pais.getEstado() + "')";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("paisdao error");
            return false;
        }
        return true;
    }

    @Override
    public boolean editarpais(Pais pais) {
        String consulta = " update pais "
                + " set "
                + " nombre = '" + pais.getNombre() + "', "
                + " estado = '" + pais.getEstado() + "' "
                + " where "
                + " idpais = " + pais.getIdpais();
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (SQLException error) {
            System.out.println("paisdao error");
            System.out.println(error.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean eliminarpais(int idpais) {
        String consulta = " delete from pais "
                + " where  "
                + " idpais =  " + idpais;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("paisdao error");
            return false;
        }
        return true;
    }

}
