<%-- 
    Document   : RegistrarVenta
    Created on : 31/10/2023, 19:12:30
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ventas</title>
        <style>
            @media print{
                .parte01, .btn, .accion{
                    display: none;
                }
            }
        </style>
    </head>
    <body>
        <div class="d-flex">
                  <div class="col-lg-5 parte01"> 
            
                <div class="card">
                    <form action="controlador?menu=RegistrarVenta" method="POST">
                    <div class="card-body">
                         <div class="form-group">
                        <label>Datos del cliente</label>
                         </div>
                        <div class="form-group d-flex">
                            <div class="col-sm-6 d-flex"  >

                                <input type="text" name="codigocliente" value="${cm.getDnic()}"  class="form-control col-sm-5" placeholder="Cod">  
                              <input type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-info" >   
                            </div>
                               <div class="col-sm-6">
                                <input type="text" name="nombrescliente" value="${cm.getNomc()}"  class="form-control col-sm-10" placeholder="Nombre">  
                            </div>
                            
                        </div>
                            
                            
                        
                        <div class="form-group">
                            <label>Datos producto</label>
                            
                        </div>
                        <div class="form-group d-flex">
                           <div class="col-sm-6 d-flex">
                            <input type="text" name="codigoproducto" value="${producto.getIdp()}"class="form-control col-sm-5" placeholder="Codigo">    
                             <input type="submit" name="accion" value="BuscarProducto" class="btn btn-outline-info" > 
                             
                            </div>
                            
                            <div class="col-sm-6">
                              <input type="text" name="nombreproducto" value="${producto.getNomp()}" class="form-control col-sm-10" placeholder="DatosP">  
                           
                            </div>
                            
                        </div>
                         
                        <div class="form-group d-flex">
                           <div class="col-sm-6 d-flex">
                            <input type="text" name="precio" value="${producto.getPrecio()}" class="form-control col-sm-9" placeholder="precio">    
  
                            </div>
              <div class="col-sm-3">
                            <input type="number" name="cantidad" value="1" class="form-control col-sm-9" placeholder="Cantidad">    
  
                            </div>
                            <div class="col-sm-4 d-flex">
                            <input type="text" name="stock" value="${producto.getStock()}" class="form-control col-sm-9" placeholder="stock">    
  
                            </div>
                            <!-- AGREGAT EL REGISTRO -->
                        </div>
                        <div class="form-group">
                            <input type="submit" name="accion" value="Agregar" class="btn btn-outline-info">
                            
                        </div>
                        
                    </div>
                    </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex col-sm-5 ml-auto">
                            <label>NumeroSerie</label>
                            <input type="text" name="NroSerie" value="${nserie}" class="form-control">
                </div>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Nro</th>
                                <th>Codigo</th>
                                <th>Descripcion</th>
                                <th>Precio</th>
                                <th>Cantidad</th>
                                <th>SubTotal</th>
                                <th class="accion">Acciones</th>
                   
                            </tr>
                        </thead>
                  
                        
                        <tbody>
                            <c:forEach var="list" items="${lista}" >
                                
                          
                            <tr>
                                <td>${list.getItem()}</td>
                                <td>${list.getIdProducto()}</td>
                                <td>${list.getDescripcionp()}</td>
                                <td>${list.getCantidad()}</td>
                                 <td>${list.getSubtotal()}</td>
                                 <td class="d-flex">
                                     <a href="#" class="btn btn-warning">Editar</a>
                                     <a href="#" class="btn btn-danger" style="margin-left: 10px;">Eliminar</a>
                                     
                                 </td>
                                 
                            </tr>
                              </c:forEach>
                            
                        </tbody>
                          </table>
                    </div>
                    <div class="card-footet d-flex">
                        <div class="col-sm-6">
                            
                            <a href="controlador?menu=RegistrarVenta&accion=GenerarVenta"  onclick="print()" class="btn btn-success">Generar Venta</a>
                            <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
                            
                        </div>
                        <div class="col-sm-3" ml-auto>
                            <input type="text" name="txtTotal" value=" Q. ${totalPagar}" class="form-control">
                        </div>
                        
                    </div>
                </div>
                
        </div>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
