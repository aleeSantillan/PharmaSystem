
package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal () {
        super("Pharma System");
        initComponents();
        this.setLayout(new FlowLayout());
    }
    private InterfazRegistrar ir;
    private InterfazCosultar ic;
    private InterfazModificar im;
    private InterfazEliminar ie;
    private InterfazActulizar ia;
    private InterfazPedido ip;
    private InterfazSurtir is;
  
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MbPrincipal = new javax.swing.JMenuBar();
        JmMantenimientoMed = new javax.swing.JMenu();
        MiRegistrarMed = new javax.swing.JMenuItem();
        MiConsultarMedi = new javax.swing.JMenuItem();
        MiModificarMedi = new javax.swing.JMenuItem();
        MiEliminarMedi = new javax.swing.JMenuItem();
        MiActualizarStock = new javax.swing.JMenuItem();
        JmGenerarPedido = new javax.swing.JMenu();
        MiGenerarPedido = new javax.swing.JMenuItem();
        JmSurtir = new javax.swing.JMenu();
        MiSurtirMed = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharma System");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(722, 534));
        setResizable(false);
        getContentPane().setLayout(null);

        MbPrincipal.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        MbPrincipal.setMinimumSize(new java.awt.Dimension(6, 6));

        JmMantenimientoMed.setBorder(null);
        JmMantenimientoMed.setText("Mantenimiento Medicamentos");

        MiRegistrarMed.setText("Registrar Medicamento");
        MiRegistrarMed.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                MiRegistrarMedComponentShown(evt);
            }
        });
        MiRegistrarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiRegistrarMedActionPerformed(evt);
            }
        });
        JmMantenimientoMed.add(MiRegistrarMed);

        MiConsultarMedi.setText("Consultar Medicamento");
        MiConsultarMedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiConsultarMediActionPerformed(evt);
            }
        });
        JmMantenimientoMed.add(MiConsultarMedi);

        MiModificarMedi.setText("Modificar Medicamento");
        MiModificarMedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiModificarMediActionPerformed(evt);
            }
        });
        JmMantenimientoMed.add(MiModificarMedi);

        MiEliminarMedi.setText("Eliminar Medicamento");
        MiEliminarMedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiEliminarMediActionPerformed(evt);
            }
        });
        JmMantenimientoMed.add(MiEliminarMedi);

        MiActualizarStock.setText("Actualizar Stock");
        MiActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiActualizarStockActionPerformed(evt);
            }
        });
        JmMantenimientoMed.add(MiActualizarStock);

        MbPrincipal.add(JmMantenimientoMed);

        JmGenerarPedido.setText("Pedidos");

        MiGenerarPedido.setText("Generar Pedido");
        MiGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiGenerarPedidoActionPerformed(evt);
            }
        });
        JmGenerarPedido.add(MiGenerarPedido);

        MbPrincipal.add(JmGenerarPedido);

        JmSurtir.setText("Surtir");

        MiSurtirMed.setText("Surtir Medicamento");
        MiSurtirMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiSurtirMedActionPerformed(evt);
            }
        });
        JmSurtir.add(MiSurtirMed);

        MbPrincipal.add(JmSurtir);

        setJMenuBar(MbPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiEliminarMediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiEliminarMediActionPerformed
        try {
            this.remove(im);
        } catch (Exception e) {
        }
        try {
            this.remove(ir);
        } catch (Exception e) {
        }
        
        try {
            this.remove(ia);
        } catch (Exception e) {
        }
        try {
            this.remove(ie);
        } catch (Exception e) {
        }
         try {
            this.remove(ic);
        } catch (Exception e) {
        }
         try {
            this.remove(ip);
        } catch (Exception e) {
        }
          try {
            this.remove(is);
        } catch (Exception e) {
        }
         
        ie=new InterfazEliminar();
        this.add(ie,BorderLayout.CENTER);
        this.pack();
    }//GEN-LAST:event_MiEliminarMediActionPerformed

    private void MiRegistrarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiRegistrarMedActionPerformed
          try {
            this.remove(im);
        } catch (Exception e) {
        }
        try {
            this.remove(ir);
        } catch (Exception e) {
        }
        
        try {
            this.remove(ia);
        } catch (Exception e) {
        }
        try {
            this.remove(ie);
        } catch (Exception e) {
        }
         try {
            this.remove(ic);
        } catch (Exception e) {
        }
         try {
            this.remove(ip);
        } catch (Exception e) {
        }
        try {
            this.remove(is);
        } catch (Exception e) {
        }
        
       ir=new InterfazRegistrar();
       this.add(ir,BorderLayout.CENTER);
       this.pack();
    }//GEN-LAST:event_MiRegistrarMedActionPerformed

    private void MiConsultarMediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiConsultarMediActionPerformed
      try {
            this.remove(im);
        } catch (Exception e) {
        }
        try {
            this.remove(ir);
        } catch (Exception e) {
        }
        
        try {
            this.remove(ia);
        } catch (Exception e) {
        }
        try {
            this.remove(ie);
        } catch (Exception e) {
        }
         try {
            this.remove(ic);
        } catch (Exception e) {
        }
         try {
            this.remove(ip);
        } catch (Exception e) {
        }
         try {
            this.remove(is);
        } catch (Exception e) {
        }
        ic=new InterfazCosultar();
        this.add(ic,BorderLayout.CENTER);
        this.pack();
    }//GEN-LAST:event_MiConsultarMediActionPerformed

    private void MiRegistrarMedComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_MiRegistrarMedComponentShown
    
    }//GEN-LAST:event_MiRegistrarMedComponentShown

    private void MiModificarMediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiModificarMediActionPerformed
        try {
            this.remove(im);
        } catch (Exception e) {
        }
        try {
            this.remove(ir);
        } catch (Exception e) {
        }
        
        try {
            this.remove(ia);
        } catch (Exception e) {
        }
        try {
            this.remove(ie);
        } catch (Exception e) {
        }
         try {
            this.remove(ic);
        } catch (Exception e) {
        }
         try {
            this.remove(ip);
        } catch (Exception e) {
        }
         try {
            this.remove(is);
        } catch (Exception e) {
        }
         
        im=new InterfazModificar();
        this.add(im,BorderLayout.CENTER);
        this.pack();
    }//GEN-LAST:event_MiModificarMediActionPerformed

    private void MiActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiActualizarStockActionPerformed
         try {
            this.remove(im);
        } catch (Exception e) {
        }
        try {
            this.remove(ir);
        } catch (Exception e) {
        }
        
        try {
            this.remove(ia);
        } catch (Exception e) {
        }
        try {
            this.remove(ie);
        } catch (Exception e) {
        }
         try {
            this.remove(ic);
        } catch (Exception e) {
        }
         try {
            this.remove(ip);
        } catch (Exception e) {
        }
         try {
            this.remove(is);
        } catch (Exception e) {
        }
         
        ia=new InterfazActulizar();
        this.add(ia,BorderLayout.CENTER);
        this.pack();
    }//GEN-LAST:event_MiActualizarStockActionPerformed

    private void MiGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiGenerarPedidoActionPerformed
         try {
            this.remove(im);
        } catch (Exception e) {
        }
        try {
            this.remove(ir);
        } catch (Exception e) {
        }
        
        try {
            this.remove(ia);
        } catch (Exception e) {
        }
        try {
            this.remove(ie);
        } catch (Exception e) {
        }
         try {
            this.remove(ic);
        } catch (Exception e) {
        }
         try {
            this.remove(ir);
        } catch (Exception e) {
        }
         try {
            this.remove(ip);
        } catch (Exception e) {
        }
         try {
            this.remove(is);
        } catch (Exception e) {
        }
         
            ip=new InterfazPedido();
            this.add(ip,BorderLayout.CENTER);
            this.pack();
    }//GEN-LAST:event_MiGenerarPedidoActionPerformed

    private void MiSurtirMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiSurtirMedActionPerformed
          try {
            this.remove(im);
        } catch (Exception e) {
        }
        try {
            this.remove(ir);
        } catch (Exception e) {
        }
        
        try {
            this.remove(ia);
        } catch (Exception e) {
        }
        try {
            this.remove(ie);
        } catch (Exception e) {
        }
         try {
            this.remove(ic);
        } catch (Exception e) {
        }
         try {
            this.remove(ir);
        } catch (Exception e) {
        }
         try {
            this.remove(ip);
        } catch (Exception e) {
        }
         try {
            this.remove(is);
        } catch (Exception e) {
        }
         
            is=new InterfazSurtir();
            this.add(is,BorderLayout.CENTER);
            this.pack();
    }//GEN-LAST:event_MiSurtirMedActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmGenerarPedido;
    private javax.swing.JMenu JmMantenimientoMed;
    private javax.swing.JMenu JmSurtir;
    private javax.swing.JMenuBar MbPrincipal;
    private javax.swing.JMenuItem MiActualizarStock;
    private javax.swing.JMenuItem MiConsultarMedi;
    private javax.swing.JMenuItem MiEliminarMedi;
    private javax.swing.JMenuItem MiGenerarPedido;
    private javax.swing.JMenuItem MiModificarMedi;
    private javax.swing.JMenuItem MiRegistrarMed;
    private javax.swing.JMenuItem MiSurtirMed;
    // End of variables declaration//GEN-END:variables
}
