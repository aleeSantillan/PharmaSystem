
package Controlador;

import Modelo.Inventario;
import Modelo.Medicamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import java.awt.Component;

public class ControlMedi {
//Declaro variables para conectar a la base de datos
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
//    private String sSQL3 = "";
    
//Metodo que mmostrara la informacion de los medicamentos en una tabla
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"Clave", "Nombre", "NombreComer", "FormaFarm", "Dosis", "Presentacion"};

        String[] registro = new String[6];

        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from Medicamento where Clave like '%" + buscar + "%' order by Clave";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Clave");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("NombreComer");
                registro[3] = rs.getString("FormaFarm");
                registro[4] = rs.getString("Dosis");
                registro[5] = rs.getString("Presentacion");

                modelo.addRow(registro);

            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
//Metodo que registrara los medicamentos dentro de la BD en la tabla Medicamento
    public boolean RegistrarMedicamentos(Medicamento dts) {
        sSQL = "insert into Medicamento (Clave,Nombre,NombreComer,FormaFarm,Dosis,Presentacion)" + "values (?,?,?,?,?,?)";
        sSQL2 = "insert into Inventario (ClaveMed,Nombre,Existencia)" + "values (?,?,?)";
        
        int n, m;
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getClave());
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getNombreComer());
            pst.setString(4, dts.getFormaFarm());
            pst.setString(5, dts.getDosis());
            pst.setString(6, dts.getPresentacion());

            n = pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
         try 
        {
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst2.setInt(1, dts.getClave());
            pst2.setString(2, dts.getNombre());
            pst2.setInt(3, 0);

            m = pst2.executeUpdate();

        } catch (Exception e) 
        {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

        if (n != 0 && m != 0) {
            return true;
        }

        return false;
    }

 //Metodo para modificar la informacion ingresada en el metodo anterior   
    public boolean ModificarMedicamento(Medicamento dts) {
        sSQL = "update Medicamento set Nombre=?,NombreComer=?,FormaFarm=?,Dosis=?,Presentacion=? where Clave=" + dts.getClave();

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getNombreComer());
            pst.setString(3, dts.getFormaFarm());
            pst.setString(4, dts.getDosis());
            pst.setString(5, dts.getPresentacion());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }

 //Metodo que permite la eliminacion de los medicamentos registrados.   
    public boolean EliminarMedicamentos(Medicamento dts) {
        sSQL = "delete from Medicamento where Clave=?";
        sSQL2 = "delete from Inventario where ClaveMed=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getClave());
            pst2.setInt(1, dts.getClave());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
//Metodo que permite actualizar la cantidad de los medicamentos existentes 
    public boolean ActualizarMedicamentos(Inventario dts, int c) {
        sSQL = "Update Inventario Set Nombre=?,  Existencia=?  WHERE ClaveMed=" + dts.getClave();
        sSQL2 = "Insert into Historial (ClaveMed, FechaMov, CantidadIO, Movimiento, Existencia, FolioReceta)" + "values (?,?,?,?,?,?)";
        
       /* Statement st  = this.cn.createStatement();
        ResultSet rs = st.executeQuery("select * from Inventario where Clave = '" + dts.getClave() + "'");
            rs.next();
            */
        int n, m;

       // int actualizarStock = rs.getString("Existencia") + c;

        {
            try {
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery("select * from Inventario where ClaveMed = '" + dts.getClave() + "'");
                rs.next();

                PreparedStatement pst = cn.prepareStatement(sSQL);

                pst.setString(1, dts.getNombre());
                pst.setInt(2, rs.getInt("Existencia") + c);

                n = pst.executeUpdate();

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }

        {
            try {
                
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery("select * from Inventario where ClaveMed = '" + dts.getClave() + "'");
                rs.next();

                PreparedStatement pst2 = cn.prepareStatement(sSQL2);

                pst2.setInt(1, dts.getClave());
                pst2.setDate(2, dts.getFechaReg());
                pst2.setInt(3, c);
                pst2.setString(4, "Entrada");
                pst2.setInt(5, rs.getInt("Existencia") + c);
                pst2.setInt(6, 0);

                m = pst2.executeUpdate();

            } catch (Exception e) {

                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
        
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "n == 0");
        }

        if (m == 0) {
            JOptionPane.showMessageDialog(null, "m == 0");
        }

        if (n != 0 && m != 0) {

            return true;
        }
        return false;
    }
}
