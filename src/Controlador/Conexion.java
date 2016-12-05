
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


//Creando la conexion a la Base de datos.
public class Conexion {
    public String bd="centrodesalud";
    public String url="jdbc:mysql://127.0.0.1/"+bd;
    public String user="root";
    public String pass="";

    public Conexion() {
    }
    
    public Connection conectar(){
        Connection link=null;
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url,this.user, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error con la Base de datos");  
        }
        return link;
    }
}
