/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Venta;
import Modelo.VentaDAO;
import configuracion.GenerarSerie;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class controlador extends HttpServlet {

   Empleado em=new Empleado();
   EmpleadoDAO edao=new EmpleadoDAO();
   Producto pm=new Producto();
   ProductoDAO pdao=new ProductoDAO();
   Cliente cm = new Cliente();
   ClienteDAO cdao= new ClienteDAO();
    int ide;
    
    
   Venta v=new Venta();
   List<Venta>lista=new ArrayList<>();
   int item;
   int cod; 
   String descripcion;
   double precio;
   int cant;
   double subtotal;
   double totalPagar;
   
   String numeroserie;
   VentaDAO vdao=new VentaDAO();
  
  // int idc;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        String menu=request.getParameter("menu");
        if (menu.equals("principal")){
            request.getRequestDispatcher("principal.jsp").forward(request, response);
        }
        if(menu.equals("Empleado")){
            switch (accion){
                case"Listar":
                    List lista=edao.listar();
                    request.setAttribute("empleados",lista);
                    break;
                    
                case "Agregar":
                    String dni=request.getParameter("txtDni");
                    String nom=request.getParameter("txtNombres");
                    String tel=request.getParameter("txtTel");
                    String est=request.getParameter("txtEstado");
                    String user=request.getParameter("txtUser");
                    em.setDni(dni);
                    em.setNom(nom);
                    em.setTel(tel);
                    em.setEstado(est);
                    em.setUser(user);
                    edao.agregar(em);
                    request.getRequestDispatcher("controlador?menu=Empleado&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Editar":
                    ide=Integer.parseInt(request.getParameter("id"));
                    Empleado e = edao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                    
                case "Actualizar":
                    String dni1=request.getParameter("txtDni");
                    String nom1=request.getParameter("txtNombres");
                    String tel1=request.getParameter("txtTel");
                    String est1=request.getParameter("txtEstado");
                    String user1=request.getParameter("txtUser");
                    em.setDni(dni1);
                    em.setNom(nom1);
                    em.setTel(tel1);
                    em.setEstado(est1);
                    em.setUser(user1);
                    
                    em.setId(ide);
                    edao.actualizar(em);
                    request.getRequestDispatcher("controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                    
                case "Delete":
                    ide=Integer.parseInt(request.getParameter("id"));
                    edao.delete(ide);
                   request.getRequestDispatcher("controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
            
            default:
                throw new AssertionError();
                    
                
            }
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);
        }
        
        
        
        
        //CLIENTES
        
        if(menu.equals("Clientes")){
            switch (accion){
                case"Listar":
                    List lista=cdao.listar();
                    request.setAttribute("clientes",lista);
                    break;
                    
                 case "Agregar":
                    String dnic=request.getParameter("txtDnic");
                    String nomc=request.getParameter("txtNombrec");
                    String direccion=request.getParameter("txtDireccion");
                    String estac=request.getParameter("txtEstadoc");
                   
                    cm.setDnic(dnic);
                    cm.setNomc(nomc);
                    cm.setDireccion(direccion);
                    cm.setEstac(estac);
                    cdao.agregar(cm);
                    request.getRequestDispatcher("controlador?menu=Clientes&accion=Listar").forward(request, response);
                    
                    break;
                    
                    
                case "Editar":
                    ide=Integer.parseInt(request.getParameter("id"));
                    Cliente e = cdao.listarId(ide);
                    request.setAttribute("cliente", e);
                    request.getRequestDispatcher("controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                    
                case "Actualizar":
                    String dnic1=request.getParameter("txtDnic");
                    String nomc1=request.getParameter("txtNombrec");
                    String direccion1=request.getParameter("txtDireccion");
                    String estac1=request.getParameter("txtEstadoc");
                    
                    cm.setDnic(dnic1);
                    cm.setNomc(nomc1);
                    cm.setDireccion(direccion1);
                    cm.setEstac(estac1);
                    cm.setIdc(ide);
                 
                   cdao.actualizar(cm);
                    request.getRequestDispatcher("controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                    
                case "Delete":
                    ide=Integer.parseInt(request.getParameter("id"));
                    cdao.delete(ide);
                   request.getRequestDispatcher("controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
            
            default:
                throw new AssertionError();
                    
                
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }
        
        
        //PRODUCTOS
        if(menu.equals("Productos")){
            switch (accion){
               case"Listar":
                    List lista=pdao.listar();
                    request.setAttribute("productos", lista);
                    break;
                    
                case "Agregar":
                    String nomp=request.getParameter("txtNombrep");
                    String precio=request.getParameter("txtPreciop");
                    String stock=request.getParameter("txtStock");
                    String estadp=request.getParameter("txtEstadop");
                  
                 pm.setNomp(nomp);
                  pm.setPrecio(precio);
                  pm.setStock(stock);
                  pm.setEstp(estadp);
                    pdao.agregar(pm);
                    request.getRequestDispatcher("controlador?menu=Productos&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Editar":
                    ide=Integer.parseInt(request.getParameter("id"));
                    Producto e = pdao.listarId(ide);
                    request.setAttribute("producto", e);
                    request.getRequestDispatcher("controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                    
                case "Actualizar":
                    String nomp1=request.getParameter("txtNombrep");
                    String precio1=request.getParameter("txtPreciop");
                    String stock1=request.getParameter("txtStock");
                    String estadp1=request.getParameter("txtEstadop");
                    
                    pm.setNomp(nomp1);
                    pm.setPrecio(precio1);
                    pm.setStock(stock1);
                    pm.setEstp(estadp1);
                    
                    pm.setIdp(ide);
                  
                    pdao.actualizar(pm);
                    request.getRequestDispatcher("controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                    
                case "Delete":
                    ide=Integer.parseInt(request.getParameter("id"));
                    pdao.delete(ide);
                   request.getRequestDispatcher("controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
            
            default:
                throw new AssertionError();
                    
                
            }
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
        }
        if(menu.equals("RegistrarVenta")){
            switch(accion){
                case"BuscarCliente":
                    String dni=request.getParameter("codigocliente");
                    cm.setDnic(dni);
                   cm= cdao.buscar(dni);
                    request.setAttribute("cm", cm);
                    
                    break;
                case "BuscarProducto":
                    int id=Integer.parseInt(request.getParameter("codigoproducto"));
                    pm=pdao.listarId(id);
                     request.setAttribute("cm", cm);
                    request.setAttribute("producto", pm);
                       request.setAttribute("lista", lista);
                        request.setAttribute("totalPagar", totalPagar);
                    break;
                    
                case "Agregar":
                    totalPagar=0.0;
                    item = item + 1;
                    cod=pm.getIdp();
                    descripcion =request.getParameter("nombreproducto");
                    precio=Double.parseDouble(request.getParameter("precio"));
                    cant=Integer.parseInt(request.getParameter("cantidad"));
                     v= new Venta();
                    subtotal= precio*cant;
                    v.setItem(item);
                    v.setIdProducto(cod);
                    v.setDescripcionp(descripcion);
                    v.setPrecio(precio);
                    v.setCantidad(cant);
                    v.setSubtotal(subtotal);
                    lista.add(v);
                    for (int i=0; i<lista.size(); i++){
                        totalPagar=totalPagar + lista.get(i).getSubtotal();
                    }
                     request.setAttribute("cm", cm);
                    request.setAttribute("totalPagar", totalPagar);
                    request.setAttribute("lista", lista);
                   
                    break;
                    
                case "GenerarVenta":
                    //GUARDAR VENTA
                    v.setIdCliente(cm.getIdc());
                    v.setIdEmpleado(2);
                    v.setNumserie(numeroserie);
                    v.setFecha("2023-11-11");
                    v.setMonto(totalPagar);
                    v.setEstado("l");
                    vdao.guardarVenta(v);
                    //guardar detalleventa
                    
                    int idv=Integer.parseInt(vdao.idVenta());
                    for (int i=0; i<lista.size(); i++){
                        v=new Venta();
                        v.setId(idv);
                        v.setIdProducto(lista.get(i).getIdProducto());
                        v.setCantidad(lista.get(i).getCantidad());
                        v.setPrecio(lista.get(i).getPrecio());
                        vdao.guardarDetalleventas(v);
                    }
                    break;
                default:
                    v=new Venta();
                    lista=new ArrayList<>();
                    item=0;
                    totalPagar=0.0;
                    
                    numeroserie=vdao.GenerarSerie();
                    if(numeroserie==null){
                        numeroserie="00000001";
                        request.setAttribute("nserie", numeroserie);
                    }
                    else{
                        int incrementar=Integer.parseInt(numeroserie);
                        GenerarSerie gs=new GenerarSerie();
                        numeroserie=gs.NumeroSerie(incrementar);
                        request.setAttribute("nserie", numeroserie);
                    }
                    request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
            }
            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
