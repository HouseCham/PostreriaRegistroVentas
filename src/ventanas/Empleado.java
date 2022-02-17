
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.WindowConstants;

public class Empleado extends javax.swing.JFrame {

    public Empleado() {
        initComponents();
        setTitle("Empleado");
        setLocationRelativeTo(null);
        setSize(1280,720); 
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonInfo = new javax.swing.JButton();
        jButtonVenta = new javax.swing.JButton();
        jButtonPostre = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        credits = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info1.png"))); // NOI18N
        jButtonInfo.setBorder(null);
        jButtonInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info2.png"))); // NOI18N
        jButtonInfo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info2.png"))); // NOI18N
        jButtonInfo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info2.png"))); // NOI18N
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 290, 240));

        jButtonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newVenta1.png"))); // NOI18N
        jButtonVenta.setBorder(null);
        jButtonVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newVenta2.png"))); // NOI18N
        jButtonVenta.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newVenta2.png"))); // NOI18N
        jButtonVenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newVenta2.png"))); // NOI18N
        jButtonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 290, 240));

        jButtonPostre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postres1.png"))); // NOI18N
        jButtonPostre.setBorder(null);
        jButtonPostre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPostre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postres2.png"))); // NOI18N
        jButtonPostre.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postres2.png"))); // NOI18N
        jButtonPostre.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postres2.png"))); // NOI18N
        getContentPane().add(jButtonPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 290, 240));

        jButton_Salir.setBackground(new java.awt.Color(60, 63, 65));
        jButton_Salir.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButton_Salir.setForeground(new java.awt.Color(222, 146, 222));
        jButton_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salir1.png"))); // NOI18N
        jButton_Salir.setBorder(null);
        jButton_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salir2.png"))); // NOI18N
        jButton_Salir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salir2.png"))); // NOI18N
        jButton_Salir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salir2.png"))); // NOI18N
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MarcaAgua.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        credits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        credits.setForeground(new java.awt.Color(222, 146, 222));
        credits.setText("Creado por Ramsés Ramírez Vallejo");
        getContentPane().add(credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 700, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin_fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        dispose();
        ExtraInfoEmpleado inf = new ExtraInfoEmpleado();
        inf.setVisible(true);
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButtonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentaActionPerformed
        dispose();
        NuevaVentaEmpleado nuevaEmpleado = new NuevaVentaEmpleado();
        nuevaEmpleado.setVisible(true);
    }//GEN-LAST:event_jButtonVentaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel credits;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonPostre;
    private javax.swing.JButton jButtonVenta;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
