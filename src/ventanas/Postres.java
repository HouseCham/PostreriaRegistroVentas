
package ventanas;

import javax.swing.WindowConstants;

public class Postres extends javax.swing.JFrame {

    public Postres() {
        initComponents();
        setSize(1280,720); 
        setTitle("Postres");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Salir = new javax.swing.JButton();
        mostachon = new javax.swing.JLabel();
        redVelvet = new javax.swing.JLabel();
        berries = new javax.swing.JLabel();
        zanahoria = new javax.swing.JLabel();
        mostaPlatano = new javax.swing.JLabel();
        aleman = new javax.swing.JLabel();
        plantillaPostres = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        mostachon.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        mostachon.setForeground(new java.awt.Color(255, 255, 255));
        mostachon.setText("Mostachón");
        getContentPane().add(mostachon, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, -1, -1));

        redVelvet.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        redVelvet.setForeground(new java.awt.Color(255, 255, 255));
        redVelvet.setText("Red Velvet");
        getContentPane().add(redVelvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, -1, -1));

        berries.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        berries.setForeground(new java.awt.Color(255, 255, 255));
        berries.setText("Cheesecake Berries");
        getContentPane().add(berries, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, -1, -1));

        zanahoria.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        zanahoria.setForeground(new java.awt.Color(255, 255, 255));
        zanahoria.setText("Zanahoria");
        getContentPane().add(zanahoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        mostaPlatano.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        mostaPlatano.setForeground(new java.awt.Color(255, 255, 255));
        mostaPlatano.setText("Mostachón Plátano");
        getContentPane().add(mostaPlatano, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, -1));

        aleman.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        aleman.setForeground(new java.awt.Color(255, 255, 255));
        aleman.setText("Chocolate Aleman");
        getContentPane().add(aleman, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        plantillaPostres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plantilla postres.png"))); // NOI18N
        getContentPane().add(plantillaPostres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin_fondo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        this.dispose();
        new Administrador().setVisible(true);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Postres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Postres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Postres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Postres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Postres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aleman;
    private javax.swing.JLabel berries;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel mostaPlatano;
    private javax.swing.JLabel mostachon;
    private javax.swing.JLabel plantillaPostres;
    private javax.swing.JLabel redVelvet;
    private javax.swing.JLabel zanahoria;
    // End of variables declaration//GEN-END:variables
}
