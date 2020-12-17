/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;
import Modelo.Libro;
import Modelo.ReporteLibro;
import Interface.Crud1;
import java.util.List;
import java.util.List;
import config.bd.ConectaBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alvaro Alva Chipana
 */
public class LibroDao implements Crud1{
ConectaBd cn= new ConectaBd();
Connection con;
PreparedStatement pst;
ResultSet rs;
Libro e= new Libro();
    @Override
    public List listarlibro() {
         ArrayList<ReporteLibro>reportes=new ArrayList<>();
       String consulta=" select l.idlibro, l.titulo, l.isbn, l.paginas, l.año, l.stock, l.Stock_disponibles, a.nombre, a.apellidos, p.nombre, e.nombre"+" from editorial e, pais p, autor a, libro l"+" where l.idpais=p.idpais and l.idautor=a.idautor and l.ideditorial=e.ideditorial ORDER BY l.titulo";
       try {
            con=cn.getConnection();
            pst=con.prepareStatement(consulta);
            rs=pst.executeQuery();
            while (rs.next()) {                
                ReporteLibro reporte=new ReporteLibro();
                reporte.setIdlibro(rs.getInt("l.idlibro"));
                reporte.setTitulo(rs.getString("l.titulo"));
               reporte.setIsbn(rs.getString("l.isbn"));
          reporte.setPaginas(rs.getString("l.paginas"));
            reporte.setAño(rs.getString("l.año"));
             reporte.setSotck(rs.getInt("l.stock"));
            reporte.setStock_disponibles(rs.getInt("l.Stock_disponibles"));
            reporte.setAnombre(rs.getString("a.nombre"));
            reporte.setAapellidos(rs.getString("a.apellidos"));
            reporte.setPnombre(rs.getString("p.nombre"));
         reporte.setEnombre(rs.getString("e.nombre"));
            reportes.add(reporte);
            
            }
                    
        } catch (Exception error) {
            System.out.println("Listar error");
            
        }
        return reportes;
    }

    @Override
    public Libro buscarlibro(int idlibro) {
      String consulta=" select *"+" from libro "+" where idlibro = "+idlibro;
         try {
            con=cn.getConnection();
            pst=con.prepareStatement(consulta);
            rs=pst.executeQuery();
            while (rs.next()) {                
              
                e.setIdlibro(rs.getInt("idlibro"));
                e.setTitulo(rs.getString("titulo"));
               e.setIsbn(rs.getString("isbn"));
          e.setPaginas(rs.getString("paginas"));
            e.setAño(rs.getString("año"));
            e.setStock(rs.getInt("stock"));
            e.setStock_disponibles(rs.getInt("Stock_disponibles"));
            e.setIdautor(rs.getInt("idautor"));
            e.setIdpais(rs.getInt("idpais"));
         e.setIdeditorial(rs.getInt("ideditorial"));
            }
                    
        } catch (Exception e) {
            System.out.println("Buscar error");
        }
        return e;
    }

    @Override
    public boolean agregarlibro(Libro libro) {
         String consulta= " insert into  "
                        + " libro(titulo, isbn, paginas, año, stock, Stock_disponibles, idautor, idpais, ideditorial) "
                        + " values('"+ libro.getTitulo()+"', "
                        + " '"+ libro.getIsbn()+"', "
                        + " '"+ libro.getPaginas()+"', "
                        + " '"+ libro.getAño()+"', "
                         + " '"+ libro.getStock()+"', "
                        + " '"+ libro.getStock_disponibles()+"', "
                        + " '"+ libro.getIdautor()+"', "
                        + " '"+ libro.getIdpais()+"', "
                        + " '"+ libro.getIdeditorial()+"')";
        try {
            con=cn.getConnection();
            pst=con.prepareStatement(consulta);
            pst.executeUpdate();
        
                    
        } catch (Exception e) {
            System.out.println("Agregar error");
        }
        return true;
    }

    @Override
    public boolean editarlibro(Libro libro) {
        String consulta = " update libro "
                        + " set "
                        + " titulo = '"+ libro.getTitulo()+"', "
                        + " isbn = '"+ libro.getIsbn()+"', "
                        + " paginas = '"+ libro.getPaginas()+"', "
                        + " año = '"+ libro.getAño()+"', "
                + " stock = '"+ libro.getStock()+"', "
                        + " Stock_disponibles = '"+ libro.getStock_disponibles()+"', "
                        + " idautor = '"+ libro.getIdautor()+"', "
                        + " idpais = '"+ libro.getIdpais()+"', "
                       
                        + " ideditorial = '"+ libro.getIdeditorial()+"' "
                        + " where "
                        + " idlibro = " + libro.getIdlibro()+ "; ";
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
    public boolean eliminarlibro(int idlibro) {
         String consulta= " delete from libro  "
                        + " where  "
                        + " idlibro =  " + idlibro;
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
    public List stock(int idlibro) {
         ArrayList<ReporteLibro>stocks=new ArrayList<>();
       String consulta=" select Stock_disponibles"+" from libro "+" where idlibro="+idlibro;
       try {
            con=cn.getConnection();
            pst=con.prepareStatement(consulta);
            rs=pst.executeQuery();
            while (rs.next()) {                
                ReporteLibro stock=new ReporteLibro();
             
            stock.setStock_disponibles(rs.getInt("Stock_disponibles"));
          
            stocks.add(stock);
            
            }
                    
        } catch (Exception error) {
            System.out.println("Listar error");
            
        }
        return stocks;
    }

   
    
}
