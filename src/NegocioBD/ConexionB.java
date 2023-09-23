
package NegocioBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionB {
    Connection con;
    
    public ConexionB(){
      try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnegocio","root","");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
       
       }

    public Connection getConnection(){
        return con;
    }

}
