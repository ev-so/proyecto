/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import configuracion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ProductoDAO {
    conexion cn=new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
   

    
     //********************OPERACIONES CRUD****************
   public List listar(){
        String sql= "select * from producto";
        List<Producto>lista=new ArrayList<>();
        try{
           con=cn.conexion();
           ps= con.prepareStatement(sql);
           rs=ps.executeQuery();
           while (rs.next()){
               Producto pm= new Producto();
               pm.setIdp(rs.getInt(1));
               pm.setNomp(rs.getString(2));
               pm.setPrecio(rs.getString(3));
               pm.setStock(rs.getString(4));
               pm.setEstp(rs.getString(5));
              
               lista.add(pm);
           }
        } catch (Exception e){
            
        }
        return lista;
        
    }
    
    public int agregar(Producto pm){
        String sql="insert into producto(Nombres,Precio,Stock,Estado)values (?,?,?,?,?)";
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
           ps.setString(1, pm.getNomp());
          ps.setString(2,pm.getPrecio());
          ps.setString(3, pm.getStock());
            ps.setString(4, pm.getEstp());
            ps.executeUpdate();
            
            
        }catch (Exception e){
            
        }
        return r;
        
    }
    public Producto listarId(int id){
        Producto pro=new Producto();
        String sql="select * from producto where IdProducto="+id; 
       try{
           con=cn.conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               pro.setNomp(rs.getString(2));
              pro.setPrecio(rs.getString(3));
              pro.setStock(rs.getString(4));
             pro.setEstp(rs.getString(5));
           }
       }catch (Exception e){
           
       }
        return pro;
        
    }
    
    public int actualizar(Producto pm){
        String sql="update producto set Nombres=?,Precio=?,Stock=?,Estado=? where IdProducto=?";
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
          ps.setString(1, pm.getNomp());
          ps.setString(2, pm.getPrecio());
          ps.setString(3, pm.getStock());
          ps.setString(4, pm.getEstp());
          ps.setInt(5,pm.getIdp());
            ps.executeUpdate();
            
            
        }catch (Exception e){
            
        }
        return r;   
        
    }
    
    public void delete (int id){
        String sql="delete from producto where IdProducto="+id;
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
            
        }
        
    }
}
