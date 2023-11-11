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
public class ClienteDAO {
      conexion cn=new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Cliente buscar(String dnic){
        Cliente cm=new Cliente();
        String sql= "select * from cliente where Dni="+dnic;
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                cm.setIdc(rs.getInt(1));
                cm.setDnic(rs.getString(2));
                cm.setNomc(rs.getString(3));
                cm.setDireccion(rs.getString(4));
                cm.setEstac(rs.getString(5));
            }
        }catch (Exception e){   
        }
        return cm;
    }
     
     //**********OPERACIONES CRUD**********************
   public List listar(){
        String sql= "select * from cliente";
        List<Cliente>lista=new ArrayList<>();
        try{
           con=cn.conexion();
           ps= con.prepareStatement(sql);
           rs=ps.executeQuery();
           while (rs.next()){
               Cliente cm= new Cliente();
               cm.setIdc(rs.getInt(1));
              cm.setDnic(rs.getString(2));
              cm.setNomc(rs.getString(3));
              cm.setDireccion(rs.getString(4));
              cm.setEstac(rs.getString(5));
               
              
               lista.add(cm);
           }
        } catch (Exception e){
            
        }
        return lista;
        
    }
    
     public int agregar(Cliente cm){
        String sql="insert into cliente(Dni,Nombres,Direccion,Estado)values (?,?,?,?)";
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, cm.getDnic());
            ps.setString(2, cm.getNomc());
            ps.setString(3, cm.getDireccion());
            ps.setString(4, cm.getEstac());
            ps.executeUpdate();
            
            
        }catch (Exception e){
            
        }
        return r;
        
    }
    public Cliente listarId(int id){
        Cliente cl=new Cliente();
        String sql="select * from cliente where IdCliente="+id; 
       try{
           con=cn.conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               cl.setDnic(rs.getString(2));
               cl.setNomc(rs.getString(3));
               cl.setDireccion(rs.getString(4));
               cl.setEstac(rs.getString(5));
               
           }
       }catch (Exception e){
           
       }
        return cl;
        
    }
    
    public int actualizar(Cliente cm){
        String sql="update cliente set Dni=?,Nombres=?,Direccion=?,Estado=? where IdCliente=?";
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, cm.getDnic());
            ps.setString(2, cm.getNomc());
            ps.setString(3, cm.getDireccion());
            ps.setString(4, cm.getEstac());
            ps.setInt(5, cm.getIdc());
            ps.executeUpdate();
            
            
        }catch (Exception e){
            
        }
        return r;   
        
    }
    
    public void delete (int id){
        String sql="delete from cliente where IdCliente="+id;
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
            
        }
        
    }
}
