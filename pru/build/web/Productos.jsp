<%-- 
    Document   : Productos
    Created on : 31/10/2023, 19:11:43
    Author     : HP
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-5">
            <div class="card-body">
                <form action="controlador?menu=Productos" method="POST">
                    
                    <div class="form-group">
                        
                        <label>Nombre</label>
                        <input type="text" value="${producto.getNomp()}" name="txtNombrep" class="form-control">  
                    </div>
                  <div class="form-group">
                  <label>Precio</label>
                        <input type="text" value="${producto.getPrecio()}" name="txtPreciop" class="form-control">  
                  </div>
                  <div class="form-group">
                  <label>Stock</label>
                        <input type="text" value="${producto.getStock()}" name="txtStock" class="form-control">  
                  </div>
                  <div class="form-group">
                  <label>Estado</label>
                        <input type="text" value="${producto.getEstp()}" name="txtEstadop" class="form-control">  
                  </div>
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                </form>
          
        </div>
        </div>
            <div class="col-sm-6">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRES</th>
                        <th>PRECIO</th>
                        <th>STOCK</th>
                        <th>ESTADO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="pm" items="${productos}">
                        <tr>
                            <td>${pm.getIdp()}</td>
                            <td>${pm.getNomp()}</td>
                            <td>${pm.getPrecio()}</td>
                            <td>${pm.getStock()}</td>
                            <td>${pm.getEstp()}</td>
                            
                                  <td class="d-flex">
                                <a class="btn btn-warning " href="controlador?menu=Productos&accion=Editar&id=${pm.getIdp()}">Editar</a>
                                <a class="btn btn-danger " href="controlador?menu=Productos&accion=Delete&id=${pm.getIdp()}">Eliminar</a>
                            </td>
                           
                        </tr>
                </c:forEach>
                </tbody>
                
            </table>
</div>
        </div>
        
         <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
