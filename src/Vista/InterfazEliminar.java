/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlMedi;
import Modelo.Medicamento;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class InterfazEliminar extends javax.swing.JPanel {

    /**
     * Creates new form InterfazEliminar
     */
    public InterfazEliminar() {
        initComponents();
        ValidarNumeros(txtBuscar);
    }
  //Hace llamado a metodo mostrar ubicado en Controlador.ControlMedi  
     void mostrar(String buscar){
        try {
            DefaultTableModel modelo;
            ControlMedi func=new ControlMedi();
            modelo=func.mostrar(buscar);
            
            TablaBuscar.setModel(modelo);
        } catch (Exception e) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlLogo = new javax.swing.JLabel();
        JpEliminar = new javax.swing.JPanel();
        JlBuscarMod = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        JbBuscarMod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBuscar = new javax.swing.JTable();
        JbSalir = new javax.swing.JButton();
        JbEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pharma System: Mantenimiento Medicamentos: Eliminar Medicamentos.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(255, 102, 0))); // NOI18N
        setMinimumSize(new java.awt.Dimension(722, 535));
        setPreferredSize(new java.awt.Dimension(722, 535));
        setLayout(null);

        JlLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        JlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logosalud.jpg"))); // NOI18N
        JlLogo.setText("         Eliminar Medicamento");
        JlLogo.setMaximumSize(new java.awt.Dimension(587, 80));
        JlLogo.setMinimumSize(new java.awt.Dimension(587, 80));
        JlLogo.setPreferredSize(new java.awt.Dimension(587, 80));
        add(JlLogo);
        JlLogo.setBounds(10, 20, 710, 80);

        JpEliminar.setBackground(new java.awt.Color(122, 122, 122));
        JpEliminar.setMinimumSize(new java.awt.Dimension(700, 420));

        JlBuscarMod.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlBuscarMod.setForeground(new java.awt.Color(255, 255, 255));
        JlBuscarMod.setText("Buscar por Clave:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        JbBuscarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        JbBuscarMod.setText("Buscar");
        JbBuscarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBuscarModActionPerformed(evt);
            }
        });

        TablaBuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        TablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaBuscar);

        JbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        JbSalir.setText("Salir");

        JbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        JbEliminar.setText("Eliminar");
        JbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpEliminarLayout = new javax.swing.GroupLayout(JpEliminar);
        JpEliminar.setLayout(JpEliminarLayout);
        JpEliminarLayout.setHorizontalGroup(
            JpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpEliminarLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(JlBuscarMod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbBuscarMod)
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JpEliminarLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(JpEliminarLayout.createSequentialGroup()
                        .addComponent(JbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JbEliminar)
                        .addGap(20, 20, 20))))
        );
        JpEliminarLayout.setVerticalGroup(
            JpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpEliminarLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(JpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlBuscarMod)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbBuscarMod))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(JpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbSalir)
                    .addComponent(JbEliminar))
                .addGap(36, 36, 36))
        );

        add(JpEliminar);
        JpEliminar.setBounds(10, 100, 700, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void JbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbEliminarActionPerformed
      //condicion que muestra un mensaje de confirmacion para eliminar el medicamento seleccionado
        if(!txtBuscar.getText().equals("")){
           Component rootPane = null;
           int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Seguro que desea eliminar el medicamento seleccionado?","confirmar",2);
           
           if(confirmacion==0){
               ControlMedi func=new ControlMedi();
               Medicamento dts=new Medicamento();
               
               dts.setClave(Integer.parseInt(txtBuscar.getText()));
               func.EliminarMedicamentos(dts);
               mostrar("");
               
               JOptionPane.showConfirmDialog(rootPane, "Medicamento eliminado satisfactoriamente");
           }
          
       }
       
    }//GEN-LAST:event_JbEliminarActionPerformed

    private void JbBuscarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBuscarModActionPerformed
       //Valida que se haya ingresado una clave a buscar.  
        if (txtBuscar.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese clave de medicamento");
            txtBuscar.requestFocus();
            return;
        }
        //muestra el medicamento solicitado en la tabla.
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_JbBuscarModActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void TablaBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBuscarMouseClicked
      //Envia dato seleccionado en la tabla al campo txtBuscar.
        int fila=TablaBuscar.rowAtPoint(evt.getPoint());
        
        txtBuscar.setText(TablaBuscar.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_TablaBuscarMouseClicked

    public void ValidarNumeros(JTextField a){
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(!Character.isDigit(c)){
                    getToolkit().beep();
                    e.consume();
                }
            }
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbBuscarMod;
    private javax.swing.JButton JbEliminar;
    private javax.swing.JButton JbSalir;
    private javax.swing.JLabel JlBuscarMod;
    private javax.swing.JLabel JlLogo;
    private javax.swing.JPanel JpEliminar;
    private javax.swing.JTable TablaBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
