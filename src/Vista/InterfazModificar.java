
package Vista;

import Controlador.ControlMedi;
import Modelo.Medicamento;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InterfazModificar extends javax.swing.JPanel {

    /**
     * Creates new form InterfazModificar
     */
    public InterfazModificar() {
        initComponents();
        ValidarNumeros(txtClave);
        ValidarLetras(txtNombre);
        ValidarLetras(txtFormaFarm);
        ValidarLetras(txtPresentacion);
    }

    private String accion = "aceptar";

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            ControlMedi func = new ControlMedi();
            modelo = func.mostrar(buscar);

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
        JpModificar = new javax.swing.JPanel();
        JlBuscarMod = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        JlNombreMod = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        JlNomComerMod = new javax.swing.JLabel();
        txtNomComer = new javax.swing.JTextField();
        JlForma = new javax.swing.JLabel();
        txtFormaFarm = new javax.swing.JTextField();
        JlDosis = new javax.swing.JLabel();
        txtDosis = new javax.swing.JTextField();
        JlPresentacion = new javax.swing.JLabel();
        txtPresentacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBuscar = new javax.swing.JTable();
        JbBuscarMod = new javax.swing.JButton();
        JbSalir = new javax.swing.JButton();
        JbAceptar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pharma System: Mantenimiento Medicamentos: Modificar Medicamentos.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(255, 102, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(722, 535));
        setLayout(null);

        JlLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        JlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logosalud.jpg"))); // NOI18N
        JlLogo.setText("         Modificar Medicamento");
        JlLogo.setMaximumSize(new java.awt.Dimension(587, 80));
        JlLogo.setMinimumSize(new java.awt.Dimension(587, 80));
        JlLogo.setPreferredSize(new java.awt.Dimension(587, 80));
        add(JlLogo);
        JlLogo.setBounds(10, 20, 710, 80);

        JpModificar.setBackground(new java.awt.Color(122, 122, 122));
        JpModificar.setMinimumSize(new java.awt.Dimension(700, 420));
        JpModificar.setPreferredSize(new java.awt.Dimension(700, 420));

        JlBuscarMod.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlBuscarMod.setForeground(new java.awt.Color(255, 255, 255));
        JlBuscarMod.setText("Clave:");

        JlNombreMod.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlNombreMod.setForeground(new java.awt.Color(255, 255, 255));
        JlNombreMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlNombreMod.setText("Nombre:");

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JlNomComerMod.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlNomComerMod.setForeground(new java.awt.Color(255, 255, 255));
        JlNomComerMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlNomComerMod.setText("Nombre comercial:");

        txtNomComer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomComer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomComerActionPerformed(evt);
            }
        });

        JlForma.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlForma.setForeground(new java.awt.Color(255, 255, 255));
        JlForma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlForma.setText("Forma farmaceutica:");

        txtFormaFarm.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JlDosis.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlDosis.setForeground(new java.awt.Color(255, 255, 255));
        JlDosis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlDosis.setText("Dosis:");

        txtDosis.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JlPresentacion.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        JlPresentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlPresentacion.setText("Presentacion:");

        txtPresentacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        JbBuscarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        JbBuscarMod.setText("Buscar");
        JbBuscarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBuscarModActionPerformed(evt);
            }
        });

        JbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        JbSalir.setText("Salir");

        JbAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        JbAceptar.setText("Aceptar");
        JbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpModificarLayout = new javax.swing.GroupLayout(JpModificar);
        JpModificar.setLayout(JpModificarLayout);
        JpModificarLayout.setHorizontalGroup(
            JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpModificarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(JpModificarLayout.createSequentialGroup()
                            .addComponent(JlBuscarMod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JbBuscarMod))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpModificarLayout.createSequentialGroup()
                            .addComponent(JlForma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFormaFarm, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpModificarLayout.createSequentialGroup()
                            .addComponent(JlNomComerMod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomComer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpModificarLayout.createSequentialGroup()
                            .addComponent(JlNombreMod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpModificarLayout.createSequentialGroup()
                        .addComponent(JlDosis)
                        .addGap(4, 4, 4)
                        .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpModificarLayout.createSequentialGroup()
                        .addComponent(JlPresentacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(JpModificarLayout.createSequentialGroup()
                .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpModificarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpModificarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(JbAceptar)))
                .addContainerGap())
        );
        JpModificarLayout.setVerticalGroup(
            JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpModificarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlBuscarMod)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbBuscarMod))
                .addGap(18, 18, 18)
                .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpModificarLayout.createSequentialGroup()
                        .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpModificarLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(JlNombreMod)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlNomComerMod)
                            .addComponent(txtNomComer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlForma)
                            .addComponent(txtFormaFarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpModificarLayout.createSequentialGroup()
                        .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpModificarLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(JlDosis)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlPresentacion))
                        .addGap(11, 38, Short.MAX_VALUE)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(JpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbSalir)
                    .addComponent(JbAceptar))
                .addGap(42, 42, 42))
        );

        add(JpModificar);
        JpModificar.setBounds(10, 100, 700, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomComerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomComerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomComerActionPerformed

    private void TablaBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBuscarMouseClicked
         //Envia los datos seleccionados en la tabla a los campos correspondientes.
        int fila = TablaBuscar.rowAtPoint(evt.getPoint());

        txtClave.setText(TablaBuscar.getValueAt(fila, 0).toString());
        txtNombre.setText(TablaBuscar.getValueAt(fila, 1).toString());
        txtNomComer.setText(TablaBuscar.getValueAt(fila, 2).toString());
        txtFormaFarm.setText(TablaBuscar.getValueAt(fila, 3).toString());
        txtDosis.setText(TablaBuscar.getValueAt(fila, 4).toString());
        txtPresentacion.setText(TablaBuscar.getValueAt(fila, 5).toString());
       
    }//GEN-LAST:event_TablaBuscarMouseClicked

    private void JbBuscarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBuscarModActionPerformed
       //Valida que no haya campos vacios.
        if (txtClave.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese clave de medicamento");
            txtClave.requestFocus();
            return;
        }
        mostrar(txtClave.getText());
    }//GEN-LAST:event_JbBuscarModActionPerformed

    private void JbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAceptarActionPerformed

        Medicamento dts = new Medicamento();
        ControlMedi func = new ControlMedi();

        dts.setClave(Integer.parseInt(txtClave.getText()));
        dts.setNombre(txtNombre.getText());
        dts.setNombreComer(txtNomComer.getText());
        dts.setFormaFarm(txtFormaFarm.getText());
        dts.setDosis(txtDosis.getText());
        dts.setPresentacion(txtPresentacion.getText());
        
       
//Condicion que envia mensaje de modificacion exitosa o fallida
        if (accion.equals("aceptar")) {
            dts.setClave(Integer.parseInt(txtClave.getText()));
            if (func.ModificarMedicamento(dts)) {
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "Medicamento modificado exitosamente");
            } else {
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, " No se puedo modificar el medicamento");
            }
        }

    }//GEN-LAST:event_JbAceptarActionPerformed

    public void ValidarLetras(JTextField a){
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(Character.isDigit(c)){
                    getToolkit().beep();
                    e.consume();
                }
            }
});
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAceptar;
    private javax.swing.JButton JbBuscarMod;
    private javax.swing.JButton JbSalir;
    private javax.swing.JLabel JlBuscarMod;
    private javax.swing.JLabel JlDosis;
    private javax.swing.JLabel JlForma;
    private javax.swing.JLabel JlLogo;
    private javax.swing.JLabel JlNomComerMod;
    private javax.swing.JLabel JlNombreMod;
    private javax.swing.JLabel JlPresentacion;
    private javax.swing.JPanel JpModificar;
    private javax.swing.JTable TablaBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtFormaFarm;
    private javax.swing.JTextField txtNomComer;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPresentacion;
    // End of variables declaration//GEN-END:variables
}
