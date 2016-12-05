/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Conexion;
import Controlador.ControlMedi;
import Modelo.Inventario;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InterfazActulizar extends javax.swing.JPanel {

    public InterfazActulizar() {
        initComponents();
        ValidarNumeros(txtCantidad);

        try {
            Conexion mysql = new Conexion();
            Connection cn = mysql.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from Medicamento");
            while (rs.next()) {
                this.CbClave.addItem(rs.getInt("Clave"));
            }

        } catch (Exception e) {
        }

    }

    private String accion = "aceptar";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlLogo = new javax.swing.JLabel();
        JpActualizar = new javax.swing.JPanel();
        JlClave = new javax.swing.JLabel();
        JlFecha = new javax.swing.JLabel();
        JlNombre = new javax.swing.JLabel();
        JlCantidad = new javax.swing.JLabel();
        JlIngrese1 = new javax.swing.JLabel();
        DcFechaReg = new com.toedter.calendar.JDateChooser();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        CbClave = new javax.swing.JComboBox();
        JbCancelar = new javax.swing.JButton();
        JbAceptar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pharma System: Mantenimiento Medicamentos: Actualizar Stock..", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(255, 102, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(722, 535));
        setLayout(null);

        JlLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        JlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logosalud.jpg"))); // NOI18N
        JlLogo.setText("             Actualizar Stock");
        JlLogo.setMaximumSize(new java.awt.Dimension(587, 80));
        JlLogo.setMinimumSize(new java.awt.Dimension(587, 80));
        JlLogo.setPreferredSize(new java.awt.Dimension(587, 80));
        add(JlLogo);
        JlLogo.setBounds(10, 20, 710, 80);

        JpActualizar.setBackground(new java.awt.Color(122, 122, 122));
        JpActualizar.setMinimumSize(new java.awt.Dimension(700, 420));

        JlClave.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlClave.setForeground(new java.awt.Color(255, 255, 255));
        JlClave.setText("Clave:");

        JlFecha.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlFecha.setForeground(new java.awt.Color(255, 255, 255));
        JlFecha.setText("Fecha:");

        JlNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlNombre.setForeground(new java.awt.Color(255, 255, 255));
        JlNombre.setText("Medicamento:");

        JlCantidad.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlCantidad.setForeground(new java.awt.Color(255, 255, 255));
        JlCantidad.setText("Cantidad:");

        JlIngrese1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlIngrese1.setForeground(new java.awt.Color(255, 255, 255));
        JlIngrese1.setText("Porfavor ingrese la siguiente informacion:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        CbClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbClaveActionPerformed(evt);
            }
        });

        JbCancelar.setBackground(new java.awt.Color(204, 204, 204));
        JbCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        JbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        JbCancelar.setText("Cancelar");

        JbAceptar.setBackground(new java.awt.Color(204, 204, 204));
        JbAceptar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        JbAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        JbAceptar.setText("Aceptar");
        JbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpActualizarLayout = new javax.swing.GroupLayout(JpActualizar);
        JpActualizar.setLayout(JpActualizarLayout);
        JpActualizarLayout.setHorizontalGroup(
            JpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpActualizarLayout.createSequentialGroup()
                .addGroup(JpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JpActualizarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpActualizarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(JpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpActualizarLayout.createSequentialGroup()
                                .addComponent(JlClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CbClave, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(JlNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpActualizarLayout.createSequentialGroup()
                                .addGroup(JpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JpActualizarLayout.createSequentialGroup()
                                        .addComponent(JlCantidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JpActualizarLayout.createSequentialGroup()
                                        .addComponent(JlFecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DcFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JlIngrese1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(59, 59, 59)
                .addComponent(JbAceptar)
                .addGap(59, 59, 59))
        );
        JpActualizarLayout.setVerticalGroup(
            JpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpActualizarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JlIngrese1)
                .addGap(49, 49, 49)
                .addGroup(JpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlFecha)
                    .addComponent(DcFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(JpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlClave)
                    .addComponent(JlNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(JpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(JpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbAceptar)
                    .addComponent(JbCancelar))
                .addGap(31, 31, 31))
        );

        add(JpActualizar);
        JpActualizar.setBounds(10, 100, 700, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void CbClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbClaveActionPerformed
        //Metodo que permite seleccionar una medicamento y mostrarlo en un combo box y text field
        try {
            Conexion mysql = new Conexion();
            Connection cn = mysql.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from Medicamento where Clave = '" + this.CbClave.getSelectedItem() + "'");
            rs.next();
            this.txtNombre.setText(rs.getString("Nombre"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_CbClaveActionPerformed

    private void JbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAceptarActionPerformed
       //Validacion para no dejar campos vacios
        if (txtCantidad.getText().length() == 0) 
        {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese una cantidad");
            txtCantidad.requestFocus();
            return;
        }
       
       // 
        Inventario dts = new Inventario();
        ControlMedi func = new ControlMedi(); 
        
        dts.setClave(Integer.parseInt(CbClave.getSelectedItem().toString()));

        Calendar cal;
        int d, m, a;
        cal = DcFechaReg.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechaReg(new Date(a, m, d));
        dts.setNombre(txtNombre.getText());
   

     
    //Condicion que envia mensaje si el medicamento fue ingresado o no 
        if (accion.equals("aceptar")) {
            if (func.ActualizarMedicamentos(dts, Integer.parseInt(txtCantidad.getText()))) 
            {
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "Medicamento Actualizado exitosamente");
            } else {
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "Creo que no actualiza");
            }
        }
    }//GEN-LAST:event_JbAceptarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
       
    }//GEN-LAST:event_txtCantidadActionPerformed
 
    public void ValidarNumeros(JTextField a){
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e){
                char c=e.getKeyChar();
                if(!Character.isDigit(c)){
                    getToolkit().beep();
                    e.consume();
                }
            }
});
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CbClave;
    private com.toedter.calendar.JDateChooser DcFechaReg;
    private javax.swing.JButton JbAceptar;
    private javax.swing.JButton JbCancelar;
    private javax.swing.JLabel JlCantidad;
    private javax.swing.JLabel JlClave;
    private javax.swing.JLabel JlFecha;
    private javax.swing.JLabel JlIngrese1;
    private javax.swing.JLabel JlLogo;
    private javax.swing.JLabel JlNombre;
    private javax.swing.JPanel JpActualizar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
