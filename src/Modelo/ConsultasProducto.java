package Modelo;

import java.sql.Connection;
import java.sql.*;

public class ConsultasProducto extends Conexion{
    
    public boolean registrar(Producto pro)
    {
        PreparedStatement ps = null;
        Connection con = (Connection) getConexion();
        
        String sql = "INSERT INTO productos (idFactura, NumeroFactura, Fecha, TipodePago, DocumentoCliente, NombreCliente, Subtotal, IVA, TotalDescuento, TotalImpuesto, Total) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.setString(2, pro.getNombre());
            ps.execute();
            return true;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
    
    public boolean modificar(Producto pro)
    {
        PreparedStatement ps = null;
        Connection con = (Connection) getConexion();
        
        String sql = "UPDATE productos SET idProducto=?, Producto=? WHERE id=?";
        
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.setString(2, pro.getNombre());
            ps.setInt(3, pro.getId());
            ps.execute();
            return true;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
    
    public boolean eliminar(Producto pro)
    {
        PreparedStatement ps = null;
        Connection con = (Connection) getConexion();
        
        String sql = "DELETE FROM productos WHERE id=?";
        
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.execute();
            return true;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
    
    public boolean buscar(Producto pro)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) getConexion();
        
        String sql = "SELECT * FROM productos WHERE id=?";
        
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                pro.setId( Integer.parseInt(rs.getString("id")));
                pro.setNombre(rs.getString("nombre"));
                return true;
            }
            return false;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
}
