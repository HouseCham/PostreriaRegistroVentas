
package ventanas;

import javax.swing.WindowConstants;

public class Extra_Info extends javax.swing.JFrame {

    public Extra_Info() {
        initComponents();
        setResizable(false); //No permitimos que el usuario modifique las dimensiones
        setTitle("Extra_Info");
        setLocationRelativeTo(null);
        setSize(1280,720); 
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Salir = new javax.swing.JButton();
        Creator = new javax.swing.JLabel();
        credits = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MarcaAgua = new javax.swing.JLabel();
        plantilla = new javax.swing.JLabel();
        adminFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        Creator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ram.png"))); // NOI18N
        getContentPane().add(Creator, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        credits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        credits.setForeground(new java.awt.Color(222, 146, 222));
        credits.setText("Creado por Ramsés Ramírez Vallejo");
        getContentPane().add(credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 700, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("https://www.linkedin.com/in/rams%C3%A9s-ram%C3%ADrez-vallejo-701367229/");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Creador:    Ramsés Ramírez Vallejo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("como IDE y Adobe Photoshop para el diseño y estética de la aplicación.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 1000, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Linkedin: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contacto:   A00344520@tec.mx");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("aplicación guarda la información obtenida en una base de datos a través de SQL.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 1000, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Las herramientas usadas durante el desarrollo de este proyecto fueron NetBeans ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 1000, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Este proyecto está programado en Java y es capaz de registrar nuevos usuarios,  ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 1000, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("hacer registros de ventas y estadística de las mismas. Cabe destacar que esta ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 1000, -1));

        MarcaAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MarcaAgua.png"))); // NOI18N
        getContentPane().add(MarcaAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 670, 500));

        plantilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plantilla_Info.png"))); // NOI18N
        getContentPane().add(plantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        adminFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin_fondo.png"))); // NOI18N
        getContentPane().add(adminFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        this.dispose();
        new Administrador().setVisible(true);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Extra_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Creator;
    private javax.swing.JLabel MarcaAgua;
    private javax.swing.JLabel adminFondo;
    private javax.swing.JLabel credits;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel plantilla;
    // End of variables declaration//GEN-END:variables
}
