
package ventanas;
import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
//import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Administrador extends javax.swing.JFrame {
    
    String user, username;
    public static int sesion_usuario;

    public Administrador() {
        initComponents();
        
        user = Login.user;
        sesion_usuario = 1; //bandera
        
        setSize(1280,720); 
        setTitle("Administrador - Sesión de " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //Evitamos que el programa se siga ejecutando en 2do plano con interfaz derrada
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select username from usuarios where username = '" + user + "'");
            ResultSet rs = pst.executeQuery();  //ejecutamos lo obtenido con la instrucción anterior
            if (rs.next()) {
                username = rs.getString("username");
                jLabel1.setText(username);
            }
        } catch (SQLException e) {
            System.err.println("Error en conexión desde la interfaz Administrador");
        }
    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton_Salir = new javax.swing.JButton();
        jButtonNewUser = new javax.swing.JButton();
        jButtonVenta = new javax.swing.JButton();
        jButtonEstadistica = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jButtonPostre = new javax.swing.JButton();
        MarcaAgua = new javax.swing.JLabel();
        credits = new javax.swing.JLabel();
        adminFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 40));

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

        jButtonNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newuser1.png"))); // NOI18N
        jButtonNewUser.setBorder(null);
        jButtonNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewUser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newuser2.png"))); // NOI18N
        jButtonNewUser.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newuser2.png"))); // NOI18N
        jButtonNewUser.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newuser2.png"))); // NOI18N
        jButtonNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewUserActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 290, 240));

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
        getContentPane().add(jButtonVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 290, 240));

        jButtonEstadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estadistica1.png"))); // NOI18N
        jButtonEstadistica.setBorder(null);
        jButtonEstadistica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEstadistica.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estadistica2.png"))); // NOI18N
        jButtonEstadistica.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estadistica2.png"))); // NOI18N
        jButtonEstadistica.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estadistica2.png"))); // NOI18N
        jButtonEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstadisticaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEstadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 290, 240));

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
        getContentPane().add(jButtonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 290, 240));

        jButtonPostre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postres1.png"))); // NOI18N
        jButtonPostre.setBorder(null);
        jButtonPostre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPostre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postres2.png"))); // NOI18N
        jButtonPostre.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postres2.png"))); // NOI18N
        jButtonPostre.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postres2.png"))); // NOI18N
        jButtonPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPostreActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 290, 240));

        MarcaAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MarcaAgua.png"))); // NOI18N
        getContentPane().add(MarcaAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 670, 500));

        credits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        credits.setForeground(new java.awt.Color(222, 146, 222));
        credits.setText("Creado por Ramsés Ramírez Vallejo");
        getContentPane().add(credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 700, -1, -1));

        adminFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin_fondo.png"))); // NOI18N
        getContentPane().add(adminFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewUserActionPerformed
        this.dispose();
        RegistroUsuarios registroUsuarios = new RegistroUsuarios();
        registroUsuarios.setVisible(true);
    }//GEN-LAST:event_jButtonNewUserActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        this.dispose();
        Extra_Info extraInfo = new Extra_Info();
        extraInfo.setVisible(true);
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButtonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentaActionPerformed
        this.dispose();
        NuevaVenta nv = new NuevaVenta();
        nv.setVisible(true);
    }//GEN-LAST:event_jButtonVentaActionPerformed

    private void jButtonEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstadisticaActionPerformed
        this.dispose();
        Estadistica estadistica = new Estadistica();
        estadistica.setVisible(true); 
    }//GEN-LAST:event_jButtonEstadisticaActionPerformed

    private void jButtonPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPostreActionPerformed
        this.dispose();
        Postres postres = new Postres();
        postres.setVisible(true);
    }//GEN-LAST:event_jButtonPostreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MarcaAgua;
    private javax.swing.JLabel adminFondo;
    private javax.swing.JLabel credits;
    private javax.swing.JButton jButtonEstadistica;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonNewUser;
    private javax.swing.JButton jButtonPostre;
    private javax.swing.JButton jButtonVenta;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
