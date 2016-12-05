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
public class InterfazCosultar extends javax.swing.JPanel {

    /**
     * Creates new form InterfazCosultar
     */
    public InterfazCosultar() {
        initComponents();
        ValidarNumeros(txtBuscar);
    }

  //llamado a metodo mostrar, muestra los medicamentos registrados en una tabla 
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
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlLogo = new javax.swing.JLabel();
        JpConsultar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBuscar = new javax.swing.JTable();
        JlBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        JbBuscar = new javax.swing.JButton();
        JbSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pharma System: Mantenimiento Medicamentos: Consultar Medicamentos.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(255, 102, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(722, 535));
        setLayout(null);

        JlLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        JlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logosalud.jpg"))); // NOI18N
        JlLogo.setText("      Consulta de Medicamentos:");
        JlLogo.setMaximumSize(new java.awt.Dimension(587, 80));
        JlLogo.setMinimumSize(new java.awt.Dimension(587, 80));
        JlLogo.setPreferredSize(new java.awt.Dimension(587, 80));
        add(JlLogo);
        JlLogo.setBounds(10, 20, 710, 80);

        JpConsultar.setBackground(new java.awt.Color(122, 122, 122));

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
        jScrollPane1.setViewportView(TablaBuscar);

        JlBuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlBuscar.setForeground(new java.awt.Color(255, 255, 255));
        JlBuscar.setText("Buscar por Clave:");

        JbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        JbBuscar.setText("Buscar");
        JbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBuscarActionPerformed(evt);
            }
        });

        JbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        JbSalir.setText("Salir");

        javax.swing.GroupLayout JpConsultarLayout = new javax.swing.GroupLayout(JpConsultar);
        JpConsultar.setLayout(JpConsultarLayout);
        JpConsultarLayout.setHorizontalGroup(
            JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpConsultarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JbSalir)
                    .addGroup(JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JpConsultarLayout.createSequentialGroup()
                            .addComponent(JlBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JbBuscar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        JpConsultarLayout.setVerticalGroup(
            JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpConsultarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbBuscar))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(JbSalir)
                .addGap(24, 24, 24))
        );

        add(JpConsultar);
        JpConsultar.setBounds(10, 100, 700, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void JbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBuscarActionPerformed
     //Muesta lo ingresado en el campo txtBuscar dentro de la tabla   
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_JbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbBuscar;
    private javax.swing.JButton JbSalir;
    private javax.swing.JLabel JlBuscar;
    private javax.swing.JLabel JlLogo;
    private javax.swing.JPanel JpConsultar;
    private javax.swing.JTable TablaBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
