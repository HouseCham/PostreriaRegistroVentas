
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Login extends javax.swing.JFrame {
    
    public static String user = "";
    String pass = "";

    public Login() {
        initComponents();
        setResizable(false); //No permitimos que el usuario modifique las dimensiones
        setTitle("Login");
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    //Codigo perteneciente al icono de la ventana
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        credits = new javax.swing.JLabel();
        jButtonAcceder = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        braket_user = new javax.swing.JLabel();
        braket_password = new javax.swing.JLabel();
        Login_logo = new javax.swing.JLabel();
        Login_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit2.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, 40));

        credits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        credits.setForeground(new java.awt.Color(222, 146, 222));
        credits.setText("Creado por Ramsés Ramírez Vallejo");
        getContentPane().add(credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        jButtonAcceder.setBackground(new java.awt.Color(60, 63, 65));
        jButtonAcceder.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButtonAcceder.setForeground(new java.awt.Color(222, 146, 222));
        jButtonAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_Ingresar1.png"))); // NOI18N
        jButtonAcceder.setBorder(null);
        jButtonAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcceder.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_Ingresar2.png"))); // NOI18N
        jButtonAcceder.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_Ingresar2.png"))); // NOI18N
        jButtonAcceder.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_Ingresar2.png"))); // NOI18N
        jButtonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 160, 40));

        jPasswordField1.setBackground(new java.awt.Color(246, 234, 246));
        jPasswordField1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(222, 146, 222));
        jPasswordField1.setBorder(null);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 150, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(222, 146, 222));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_PW.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_user_1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 50));

        jTextField_User.setBackground(new java.awt.Color(246, 234, 246));
        jTextField_User.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jTextField_User.setForeground(new java.awt.Color(222, 146, 222));
        jTextField_User.setBorder(null);
        getContentPane().add(jTextField_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 180, 30));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 146, 222));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 80, 30));

        braket_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/braket_1.png"))); // NOI18N
        getContentPane().add(braket_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        braket_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/braket_1.png"))); // NOI18N
        getContentPane().add(braket_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, 50));

        Login_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_logo.png"))); // NOI18N
        getContentPane().add(Login_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 550));

        Login_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_fondo.png"))); // NOI18N
        getContentPane().add(Login_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccederActionPerformed
        
        user = jTextField_User.getText().trim();    //Obtenemos de casilla user 
        pass = jPasswordField1.getText().trim();    //password
        
        if(!user.equals("") || !pass.equals("")){
            try {
                Connection cn = Conexion.conectar();    //Hacemos la conexión a la base de datos
                PreparedStatement pst = cn.prepareStatement("select tipo_nivel from usuarios where username = '" + user + "' and password = '" + pass + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {    //En caso de encontrar información
                    
                    String tipoNivel = rs.getString("tipo_nivel");  //Campo de la base de datos
                    
                    if(tipoNivel.equalsIgnoreCase("Administrador")){
                        new Administrador().setVisible(true);
                        dispose();  //Se destruye el JFrame login
                        
                    } else if(tipoNivel.equalsIgnoreCase("Empleado")){
                        new Empleado().setVisible(true);
                        dispose();
                    } 
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos");
                    jTextField_User.setText("");
                    jPasswordField1.setText("");
                }
            } catch (SQLException e) {
                System.out.println("Error en el botón Acceder: " + e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión, contacta al administrador.");
            }
            
        } else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
    }//GEN-LAST:event_jButtonAccederActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_Fondo;
    private javax.swing.JLabel Login_logo;
    private javax.swing.JLabel braket_password;
    private javax.swing.JLabel braket_user;
    private javax.swing.JLabel credits;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAcceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_User;
    // End of variables declaration//GEN-END:variables
}
