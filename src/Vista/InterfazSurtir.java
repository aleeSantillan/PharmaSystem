package Vista;

import Controlador.Conexion;
import Modelo.Receta;
import Controlador.ControlSurtir;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfazSurtir extends javax.swing.JPanel {
    int Existencia;

    public InterfazSurtir() {
        initComponents();

        try {
            Conexion mysql = new Conexion();
            Connection cn = mysql.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from Inventario");
            while (rs.next()) {
                this.CbClave.addItem(rs.getInt("ClaveMed"));
            }

        } catch (Exception e) {
        }

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlLogo = new javax.swing.JLabel();
        JpSurtir = new javax.swing.JPanel();
        JlFolio = new javax.swing.JLabel();
        JlNoExp = new javax.swing.JLabel();
        JlClave = new javax.swing.JLabel();
        JlIngrese1 = new javax.swing.JLabel();
        TxtFolio = new javax.swing.JTextField();
        CbClave = new javax.swing.JComboBox();
        TxtNoExpediente = new javax.swing.JTextField();
        JbAceptar = new javax.swing.JButton();
        TxtNombre = new javax.swing.JTextField();
        JlDisponibilidad = new javax.swing.JLabel();
        JlCantPres = new javax.swing.JLabel();
        JlCantSurt = new javax.swing.JLabel();
        TxtCantPres = new javax.swing.JTextField();
        TxtCantidadSurtida = new javax.swing.JTextField();
        JbSurtir = new javax.swing.JButton();
        JbCancelar = new javax.swing.JButton();
        JbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtBuscar = new javax.swing.JTable();
        DcFecha = new com.toedter.calendar.JDateChooser();
        JlNoExp1 = new javax.swing.JLabel();
        TxtDisponible = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pharma System: Surtir", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(255, 102, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(722, 535));
        setLayout(null);

        JlLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        JlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logosalud.jpg"))); // NOI18N
        JlLogo.setText("                 Surtir Receta");
        JlLogo.setMaximumSize(new java.awt.Dimension(587, 80));
        JlLogo.setMinimumSize(new java.awt.Dimension(587, 80));
        JlLogo.setPreferredSize(new java.awt.Dimension(587, 80));
        add(JlLogo);
        JlLogo.setBounds(10, 20, 710, 80);

        JpSurtir.setBackground(new java.awt.Color(122, 122, 122));
        JpSurtir.setPreferredSize(new java.awt.Dimension(700, 420));

        JlFolio.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlFolio.setForeground(new java.awt.Color(255, 255, 255));
        JlFolio.setText("Folio:");

        JlNoExp.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlNoExp.setForeground(new java.awt.Color(255, 255, 255));
        JlNoExp.setText("No. Expediente:");

        JlClave.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlClave.setForeground(new java.awt.Color(255, 255, 255));
        JlClave.setText("Clave:");

        JlIngrese1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlIngrese1.setForeground(new java.awt.Color(255, 255, 255));
        JlIngrese1.setText("Porfavor ingrese la siguiente informacion:");

        TxtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFolioActionPerformed(evt);
            }
        });

        CbClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbClaveActionPerformed(evt);
            }
        });

        TxtNoExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNoExpedienteActionPerformed(evt);
            }
        });

        JbAceptar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JbAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        JbAceptar.setText("Aceptar");
        JbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAceptarActionPerformed(evt);
            }
        });

        JlDisponibilidad.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlDisponibilidad.setForeground(new java.awt.Color(255, 255, 255));
        JlDisponibilidad.setText("Disponibles:");

        JlCantPres.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlCantPres.setForeground(new java.awt.Color(255, 255, 255));
        JlCantPres.setText("Cantidad Prescrita:");

        JlCantSurt.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlCantSurt.setForeground(new java.awt.Color(255, 255, 255));
        JlCantSurt.setText("Cantidad Surtida:");

        TxtCantidadSurtida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCantidadSurtidaActionPerformed(evt);
            }
        });

        JbSurtir.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JbSurtir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/surtir.png"))); // NOI18N
        JbSurtir.setText("Surtir");
        JbSurtir.setMaximumSize(new java.awt.Dimension(97, 25));
        JbSurtir.setMinimumSize(new java.awt.Dimension(97, 25));
        JbSurtir.setPreferredSize(new java.awt.Dimension(97, 25));
        JbSurtir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSurtirActionPerformed(evt);
            }
        });

        JbCancelar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        JbCancelar.setText("Cancelar");
        JbCancelar.setMaximumSize(new java.awt.Dimension(97, 25));
        JbCancelar.setMinimumSize(new java.awt.Dimension(97, 25));
        JbCancelar.setPreferredSize(new java.awt.Dimension(97, 25));
        JbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCancelarActionPerformed(evt);
            }
        });

        JbSalir.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        JbSalir.setText("Salir");
        JbSalir.setMaximumSize(new java.awt.Dimension(97, 25));
        JbSalir.setMinimumSize(new java.awt.Dimension(97, 25));
        JbSalir.setPreferredSize(new java.awt.Dimension(97, 25));

        JtBuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JtBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "No. Expediente", "Clave", "Medicamento", "Cant. Prescrita", "Cant. Surtida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JtBuscar);

        JlNoExp1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JlNoExp1.setForeground(new java.awt.Color(255, 255, 255));
        JlNoExp1.setText("Fecha:");

        TxtDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDisponibleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpSurtirLayout = new javax.swing.GroupLayout(JpSurtir);
        JpSurtir.setLayout(JpSurtirLayout);
        JpSurtirLayout.setHorizontalGroup(
            JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpSurtirLayout.createSequentialGroup()
                .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpSurtirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JlIngrese1))
                    .addGroup(JpSurtirLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpSurtirLayout.createSequentialGroup()
                                .addComponent(JbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JbAceptar)
                                .addGap(1, 1, 1)))))
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(JpSurtirLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpSurtirLayout.createSequentialGroup()
                        .addComponent(JlCantPres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCantPres, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JlCantSurt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCantidadSurtida, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbSurtir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpSurtirLayout.createSequentialGroup()
                        .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JlClave)
                            .addComponent(JlFolio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbClave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JpSurtirLayout.createSequentialGroup()
                                .addComponent(JlNoExp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNoExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpSurtirLayout.createSequentialGroup()
                                .addComponent(JlNoExp1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpSurtirLayout.createSequentialGroup()
                                .addComponent(JlDisponibilidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpSurtirLayout.setVerticalGroup(
            JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpSurtirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlIngrese1)
                .addGap(18, 18, 18)
                .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpSurtirLayout.createSequentialGroup()
                        .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlFolio)
                            .addComponent(TxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlNoExp)
                            .addComponent(TxtNoExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlClave)
                            .addComponent(CbClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlDisponibilidad)
                            .addComponent(TxtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JlNoExp1)
                    .addComponent(DcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JbSurtir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JlCantPres)
                        .addComponent(JlCantSurt)
                        .addComponent(TxtCantPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtCantidadSurtida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(JpSurtirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbAceptar))
                .addGap(22, 22, 22))
        );

        add(JpSurtir);
        JpSurtir.setBounds(10, 100, 700, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNoExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNoExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNoExpedienteActionPerformed

    private void TxtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFolioActionPerformed

    private void JbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAceptarActionPerformed
       Receta dts = new Receta();
        ControlSurtir func = new ControlSurtir();

        dts.setFolio(Integer.parseInt(TxtFolio.getText()));
        dts.setNoExpediente(Integer.parseInt(TxtNoExpediente.getText()));
        dts.setClaveMed(Integer.parseInt(CbClave.getSelectedItem().toString()));
        dts.setCantidadPres(Integer.parseInt(TxtCantPres.getText()));
        dts.setCantidadSurtida(Integer.parseInt(TxtCantidadSurtida.getText()));
        
        
        Calendar cal;
        int d, m, a;
        cal = DcFecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha(new Date(a, m, d));
        

        
            if (func.RegistrarReceta(dts, this.Existencia)) {
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "Medicamento Surtido");
            } else {
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "No pudo surtirse el medicamento");
            }
    }//GEN-LAST:event_JbAceptarActionPerformed

    private void TxtCantidadSurtidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCantidadSurtidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCantidadSurtidaActionPerformed

    private void CbClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbClaveActionPerformed
    ////Metodo que permite seleccionar una medicamento y su cantidad y mostrarlo en un combo box y text field    
        try {
            Conexion mysql = new Conexion();
            Connection cn = mysql.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from Inventario where ClaveMed = '" + this.CbClave.getSelectedItem() + "'");
            
            rs.next();
            this.TxtNombre.setText(rs.getString("Nombre"));
            this.TxtDisponible.setText(rs.getString("Existencia"));
            this.Existencia = Integer.parseInt(rs.getString("Existencia"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_CbClaveActionPerformed

    private void JbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbCancelarActionPerformed

    private void JbSurtirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSurtirActionPerformed
    //Valido que no haya campos vacios.    
        if (TxtFolio.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese el folio de la receta");
            TxtFolio.requestFocus();
            return;
        }
        if (TxtNoExpediente.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese numero de expediente");
            TxtNoExpediente.requestFocus();
            return;
        }
        if (TxtCantPres.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese la cantidad prescrita");
            TxtCantPres.requestFocus();
            return;
        }

        if (TxtCantidadSurtida.getText().length() == 0) {
            Component rootPane = null;
            JOptionPane.showConfirmDialog(rootPane, "Ingrese la cantidad surtida");
            TxtCantidadSurtida.requestFocus();
            return;
        }
       
        DefaultTableModel modelo= (DefaultTableModel) JtBuscar.getModel();
        Object [] fila=new Object[6];
        
        fila[0]=TxtFolio.getText();
        fila[1]=TxtNoExpediente.getText();
        fila[2]=CbClave.getSelectedItem();
        fila[3]=TxtNombre.getText();
        fila[4]=TxtCantPres.getText();
        fila[5]=TxtCantidadSurtida.getText();

        modelo.addRow(fila);


        JtBuscar.setModel(modelo);
        
    }//GEN-LAST:event_JbSurtirActionPerformed

    private void TxtDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDisponibleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CbClave;
    private com.toedter.calendar.JDateChooser DcFecha;
    private javax.swing.JButton JbAceptar;
    private javax.swing.JButton JbCancelar;
    private javax.swing.JButton JbSalir;
    private javax.swing.JButton JbSurtir;
    private javax.swing.JLabel JlCantPres;
    private javax.swing.JLabel JlCantSurt;
    private javax.swing.JLabel JlClave;
    private javax.swing.JLabel JlDisponibilidad;
    private javax.swing.JLabel JlFolio;
    private javax.swing.JLabel JlIngrese1;
    private javax.swing.JLabel JlLogo;
    private javax.swing.JLabel JlNoExp;
    private javax.swing.JLabel JlNoExp1;
    private javax.swing.JPanel JpSurtir;
    private javax.swing.JTable JtBuscar;
    private javax.swing.JTextField TxtCantPres;
    private javax.swing.JTextField TxtCantidadSurtida;
    private javax.swing.JTextField TxtDisponible;
    private javax.swing.JTextField TxtFolio;
    private javax.swing.JTextField TxtNoExpediente;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
