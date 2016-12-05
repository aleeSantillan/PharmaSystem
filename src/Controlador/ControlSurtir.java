
package Controlador;

import Modelo.Receta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ControlSurtir {
  // Declaro variables para conectar a la base de datos 
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    private String sSQL3 = "";

  //Metodo que permitira registrar receta en la BD tabla Receta y a su vez ingresar la informacion requerida en tablas relacionadas.  
    public boolean RegistrarReceta(Receta dts, int ex) {
        sSQL  = "insert into Receta (Folio,Fecha,NoExpediente,ClaveMed,CantidadPres,CantidadSurtida)" + "values (?,?,?,?,?,?)";
        sSQL2 = "Update Inventario Set Existencia=?  WHERE ClaveMed=" + dts.getClaveMed();
        sSQL3  = "Insert into Historial (ClaveMed, FechaMov, CantidadIO, Movimiento, Existencia, FolioReceta)" + "values (?,?,?,?,?,?)";

        int n, m;
        {
            try {
                PreparedStatement pst = cn.prepareStatement(sSQL);
                pst.setInt(1, dts.getFolio());
                pst.setDate(2, dts.getFecha());
                pst.setInt(3, dts.getNoExpediente());
                pst.setInt(4, dts.getClaveMed());
                pst.setInt(5, dts.getCantidadPres());
                pst.setInt(6, dts.getCantidadSurtida());

                n = pst.executeUpdate();

            }
            catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
        
        {
            try 
            {
                PreparedStatement pst = cn.prepareStatement(sSQL2);
                pst.setInt(1, ex - dts.getCantidadSurtida());
                //pst.setDate(2, dts.getFecha());
                //pst.setInt(3, dts.getNoExpediente());

                m = pst.executeUpdate();

            } 
            
            catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
         {
            try 
            {
                PreparedStatement pst = cn.prepareStatement(sSQL3);
                pst.setInt(1, dts.getClaveMed());
                pst.setDate(2, dts.getFecha());
                pst.setInt(3, dts.getCantidadSurtida());
                pst.setString(4, "Salida");
                pst.setInt(5, ex);
                pst.setInt(6, dts.getFolio());

                m = pst.executeUpdate();

            } 
            
            catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
         
        if (n != 0 && m != 0) {
            return true;
        }  
        return false;
       
    }
}
