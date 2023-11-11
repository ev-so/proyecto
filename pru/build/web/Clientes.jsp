<%-- 
    Document   : Clientes
    Created on : 31/10/2023, 19:12:07
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
                <form action="controlador?menu=Clientes" method="POST">
                    
                    <div class="form-group">
                        
                        <label>Dni</label>
                        <input type="text" value="${cliente.getDnic()}" name="txtDnic" class="form-control">  
                    </div>
                  <div class="form-group">
                  <label>Nombre</label>
                        <input type="text" value="${cliente.getNomc()}" name="txtNombrec" class="form-control">  
                  </div>
                  <div class="form-group">
                  <label>Direccion</label>
                        <input type="text" value="${cliente.getDireccion()}" name="txtDireccion" class="form-control">  
                  </div>
                  <div class="form-group">
                  <label>Estado</label>
                        <input type="text" value="${cliente.getEstac()}" name="txtEstadoc" class="form-control">  
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
                        <th>DNI</th>
                        <th>NOMBRES</th>
                        <th>DIRECCION</th>
                        <th>ESTADO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="cm" items="${clientes}">
                        <tr>
                            <td>${cm.getIdc()}</td>
                            <td>${cm.getDnic()}</td>
                            <td>${cm.getNomc()}</td>
                            <td>${cm.getDireccion()}</td>
                            <td>${cm.getEstac()}</td>
                            
                                  <td class="d-flex">
                                <a class="btn btn-warning " href="controlador?menu=Clientes&accion=Editar&id=${cm.getIdc()}">Editar</a>
                                <a class="btn btn-danger " href="controlador?menu=Clientes&accion=Delete&id=${cm.getIdc()}">Eliminar</a>
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
