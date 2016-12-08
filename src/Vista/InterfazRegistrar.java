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

public class InterfazRegistrar extends javax.swing.JPanel {

    public InterfazRegistrar() {
        initComponents();
        ValidarLetras(txtNombre);
        ValidarLetras(txtFormaFarm);
        ValidarLetras(txtNomComer);
        ValidarLetras(txtPresentacion);
        ValidarNumeros(TxtClave);
       
    }

    private String accion = "aceptar";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlLogo = new javax.swing.JLabel();
        JpRegistro = new javax.swing.JPanel();
        TxtClave = new javax.swing.JTextField();
        JlDosis = new javax.swing.JLabel();
        JlIngrese1 = new javax.swing.JLabel();
        txtNomComer = new javax.swing.JTextField();
        JlNomComer = new javax.swing.JLabel();
        txtPresentacion = new javax.swing.JTextField();
        JlClave = new javax.swing.JLabel();
        txtDosis = new javax.swing.JTextField();
        JlForma = new javax.swing.JLabel();
        JlPresentacion = new javax.swing.JLabel();
        JlNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFormaFarm = new javax.swing.JTextField();
        JbCancelar = new javax.swing.JButton();
        JbAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pharma System: Mantenimiento Medicamentos: Registrar Medicamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(255, 102, 0))); // NOI18N
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(722, 535));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(null);

        JlLogo.setBackground(new java.awt.Color(204, 204, 255));
        JlLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        JlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logosalud.jpg"))); // NOI18N
        JlLogo.setText("       Registro de Medicamentos:");
        add(JlLogo);
        JlLogo.setBounds(10, 20, 710, 80);

        JpRegistro.setBackground(new java.awt.Color(122, 122, 122));

        TxtClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtClaveActionPerformed(evt);
            }
        });

        JlDosis.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlDosis.setForeground(new java.awt.Color(255, 255, 255));
        JlDosis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlDosis.setText("*Dosis:");

        JlIngrese1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlIngrese1.setForeground(new java.awt.Color(255, 255, 255));
        JlIngrese1.setText("Por favor ingrese la siguiente información :");

        txtNomComer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomComer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomComerActionPerformed(evt);
            }
        });

        JlNomComer.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlNomComer.setForeground(new java.awt.Color(255, 255, 255));
        JlNomComer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlNomComer.setText("Nombre comercial:");

        txtPresentacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JlClave.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlClave.setForeground(new java.awt.Color(255, 255, 255));
        JlClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlClave.setText("*Clave:");

        txtDosis.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JlForma.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlForma.setForeground(new java.awt.Color(255, 255, 255));
        JlForma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlForma.setText("*Forma farmaceutica:");

        JlPresentacion.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        JlPresentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlPresentacion.setText("*Presentacion:");

        JlNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlNombre.setForeground(new java.awt.Color(255, 255, 255));
        JlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlNombre.setText("*Nombre:");

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFormaFarm.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JbCancelar.setBackground(new java.awt.Color(204, 204, 204));
        JbCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        JbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        JbCancelar.setText("Cancelar");
        JbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCancelarActionPerformed(evt);
            }
        });

        JbAceptar.setBackground(new java.awt.Color(204, 204, 204));
        JbAceptar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        JbAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        JbAceptar.setText("Aceptar");
        JbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("* Informacion obligatoria");

        javax.swing.GroupLayout JpRegistroLayout = new javax.swing.GroupLayout(JpRegistro);
        JpRegistro.setLayout(JpRegistroLayout);
        JpRegistroLayout.setHorizontalGroup(
            JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbCancelar)
                .addGap(59, 59, 59)
                .addComponent(JbAceptar)
                .addGap(58, 58, 58))
            .addGroup(JpRegistroLayout.createSequentialGroup()
                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JlIngrese1))
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(JpRegistroLayout.createSequentialGroup()
                                .addComponent(JlDosis)
                                .addGap(4, 4, 4)
                                .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)
                                .addComponent(JlPresentacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpRegistroLayout.createSequentialGroup()
                                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpRegistroLayout.createSequentialGroup()
                                        .addComponent(JlClave)
                                        .addGap(4, 4, 4)
                                        .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(203, 203, 203))
                                    .addGroup(JpRegistroLayout.createSequentialGroup()
                                        .addComponent(JlNomComer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomComer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(JpRegistroLayout.createSequentialGroup()
                                        .addComponent(JlNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre))
                                    .addGroup(JpRegistroLayout.createSequentialGroup()
                                        .addComponent(JlForma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFormaFarm, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        JpRegistroLayout.setVerticalGroup(
            JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlIngrese1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JlClave)
                            .addComponent(JlNombre))))
                .addGap(60, 60, 60)
                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlNomComer)
                    .addComponent(txtNomComer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlForma)
                    .addComponent(txtFormaFarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JlPresentacion))
                    .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpRegistroLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(JlDosis))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbAceptar)
                    .addComponent(JbCancelar))
                .addGap(27, 27, 27))
        );

        add(JpRegistro);
        JpRegistro.setBounds(10, 100, 700, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomComerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomComerActionPerformed
         
    }//GEN-LAST:event_txtNomComerActionPerformed

    private void TxtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtClaveActionPerformed

    private void JbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JbCancelarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.setVisible(true);
    }//GEN-LAST:event_formComponentShown

    private void JbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAceptarActionPerformed
    //Valido que no haya campos vacios.    
        if (TxtClave.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese clave de medicamento");
            TxtClave.requestFocus();
            return;
        }
        if (txtNombre.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese nombre del medicamento");
            txtNombre.requestFocus();
            return;
        }
        if (txtFormaFarm.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese forma farmaceutica del medicamento");
            txtFormaFarm.requestFocus();
            return;
        }

        if (txtDosis.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese la dosis del medicamento");
            txtDosis.requestFocus();
            return;
        }
        if (txtPresentacion.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese la presentacion del medicamento");
            txtPresentacion.requestFocus();
            return;
        }

        Medicamento dts = new Medicamento();
        ControlMedi func = new ControlMedi();

 //Envio la informacion a los campos correspondientes.       
        dts.setClave(Integer.parseInt(TxtClave.getText()));
        dts.setNombre(txtNombre.getText());
        dts.setNombreComer(txtNomComer.getText());
        dts.setFormaFarm(txtFormaFarm.getText());
        dts.setDosis(txtDosis.getText());
        dts.setPresentacion(txtPresentacion.getText());
         ValidarLetras(txtNombre);


      //Condicion que envia mensaje si el registro fue exitoso o fallido.  
        if (accion.equals("aceptar")) {
            if (func.RegistrarMedicamentos(dts)) {
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "Medicamento Registrado exitosamente"); 
            }
            else{
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "La clave ya ha sido asignada a otro medicamento");
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
    private javax.swing.JButton JbCancelar;
    private javax.swing.JLabel JlClave;
    private javax.swing.JLabel JlDosis;
    private javax.swing.JLabel JlForma;
    private javax.swing.JLabel JlIngrese1;
    private javax.swing.JLabel JlLogo;
    private javax.swing.JLabel JlNomComer;
    private javax.swing.JLabel JlNombre;
    private javax.swing.JLabel JlPresentacion;
    private javax.swing.JPanel JpRegistro;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtFormaFarm;
    private javax.swing.JTextField txtNomComer;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPresentacion;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
