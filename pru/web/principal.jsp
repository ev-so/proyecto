<%-- 
    Document   : principal
    Created on : 30/10/2023, 18:17:34
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <nav class="navbar navbar-light" style="background-color: #88dc65;">
 <nav class="navbar navbar-expand-lg navbar-light" style="color: #5DC1B9;" >
 

  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home </a>
      </li>
      <li class="nav-item">
          <a  style="margin-left: 10px; border: none" class="btn btn-outline-dark" href="controlador?menu=Productos&accion=Listar" target="myFrame">Producto</a>
      </li>
      <li class="nav-item">
        <a style="margin-left: 10px; border: none"  class="btn btn-outline-dark" href="controlador?menu=Empleado&accion=Listar" target="myFrame">Empleado</a>
      </li>
      <li class="nav-item">
          <a style="margin-left: 10px; border: none" class="btn btn-outline-dark" href="controlador?menu=Clientes&accion=Listar" target="myFrame">Clientes</a>
      </li>
      <li class="nav-item">
        <a  style="margin-left: 10px; border: none" class="btn btn-outline-dark" href="controlador?menu=RegistrarVenta&accion=default" target="myFrame">Nueva Venta</a>
      </li>
      
    </ul>
      
  </div>
</nav>
                  
   
          
            <div class="dropdown">
                <button style="border: none" class="btn btn-outline-dark dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
   ${usuario.getNom()}
  </button>
  <div class="dropdown-menu text-center">
    <a class="dropdown-item" href="#"></a>
    
     <img src="img/ava.png" alt="60" width="60"/>
    <a class="dropdown-item" href="#">${usuario.getUser()}</a>
    <a class="dropdown-item" href="#">usuario@gmail.com</a>
    <div class="dropdown-divider">
    </div>
    <form action="validar" method="POST">
        <button name="accion" value="Salir" class="dropdown-item" href="#">Salir </button>
    </form>
     
  </div>
</div>

</nav>
    <div class="m-4" style="height: 480px;">
        <iframe name="myFrame" style="height: 100%; width: 100%; border: none" >
            
        </iframe>
    </div>


      
         
     
    

            </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
