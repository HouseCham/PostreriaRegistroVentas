package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RegistroUsuarios extends javax.swing.JFrame {

    String user;

    public RegistroUsuarios() {
        initComponents();
        user = Login.user;  //Nombre de quien ha iniciado sesión
        setTitle("Registro de nuevo usuario");
        setSize(700, 400);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //Evitamos que el programa termine cuando la interfaz cierre
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono.png"));   //Establecemos icono ventana
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPuesto = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        cmb_niveles = new javax.swing.JComboBox<>();
        jButtonRegister = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        credits = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Users_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Rockwell", 1, 21)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(222, 146, 222));
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Rockwell", 1, 21)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(222, 146, 222));
        jLabelPassword.setText("Contraseña:");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabelUsername.setFont(new java.awt.Font("Rockwell", 1, 21)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(222, 146, 222));
        jLabelUsername.setText("Username:");
        getContentPane().add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabelEmail.setFont(new java.awt.Font("Rockwell", 1, 21)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(222, 146, 222));
        jLabelEmail.setText("Correo:");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 205, -1, 40));

        jLabelPuesto.setFont(new java.awt.Font("Rockwell", 1, 21)); // NOI18N
        jLabelPuesto.setForeground(new java.awt.Color(222, 146, 222));
        jLabelPuesto.setText("Permiso:");
        getContentPane().add(jLabelPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabelTel.setFont(new java.awt.Font("Rockwell", 1, 21)); // NOI18N
        jLabelTel.setForeground(new java.awt.Color(222, 146, 222));
        jLabelTel.setText("Teléfono:");
        getContentPane().add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 50));

        jTextFieldTel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTel.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextFieldTel.setForeground(new java.awt.Color(222, 146, 222));
        jTextFieldTel.setBorder(null);
        getContentPane().add(jTextFieldTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 350, -1));

        jTextFieldMail.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMail.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextFieldMail.setForeground(new java.awt.Color(222, 146, 222));
        jTextFieldMail.setBorder(null);
        getContentPane().add(jTextFieldMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 350, -1));

        jTextFieldPassword.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPassword.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextFieldPassword.setForeground(new java.awt.Color(222, 146, 222));
        jTextFieldPassword.setBorder(null);
        getContentPane().add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 350, -1));

        jTextFieldUsername.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(222, 146, 222));
        jTextFieldUsername.setBorder(null);
        getContentPane().add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 350, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(222, 146, 222));
        jTextFieldNombre.setBorder(null);
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 350, -1));

        cmb_niveles.setBackground(new java.awt.Color(255, 255, 255));
        cmb_niveles.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        cmb_niveles.setForeground(new java.awt.Color(222, 146, 222));
        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        cmb_niveles.setBorder(null);
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 350, -1));

        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Register.png"))); // NOI18N
        jButtonRegister.setBorder(null);
        jButtonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegister.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Register2.png"))); // NOI18N
        jButtonRegister.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Register2.png"))); // NOI18N
        jButtonRegister.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Register2.png"))); // NOI18N
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 130, 30));

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
        getContentPane().add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 110, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plantilla.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        credits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        credits.setForeground(new java.awt.Color(222, 146, 222));
        credits.setText("Creado por Ramsés Ramírez Vallejo");
        getContentPane().add(credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 390, 40));

        Users_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin_fondo.png"))); // NOI18N
        getContentPane().add(Users_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        int permisos_cmb, validacion = 0;
        String nombre, username, password, correo, telefono, permiso_string = "";

        nombre = jTextFieldNombre.getText().trim(); //Con trim eliminamos espacios en blanco de extremos
        username = jTextFieldUsername.getText().trim();
        password = jTextFieldPassword.getText().trim();
        correo = jTextFieldMail.getText().trim();
        telefono = jTextFieldTel.getText().trim();
        permisos_cmb = cmb_niveles.getSelectedIndex();

        //En caso que las casillas están vacías, cambian su color a rojo
        if (nombre.equals("")) {
            jTextFieldNombre.setBackground(Color.red);
            validacion++;
        }
        if (username.equals("")) {
            jTextFieldUsername.setBackground(Color.red);
            validacion++;
        }
        if (password.equals("")) {
            jTextFieldPassword.setBackground(Color.red);
            validacion++;
        }
        if (correo.equals("")) {
            jTextFieldMail.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            jTextFieldTel.setBackground(Color.red);
            validacion++;
        }

        //Asignamos a permiso_string el nivel de seguridad
        if (permisos_cmb == 0) {
            permiso_string = "Administrador";
        } else if (permisos_cmb == 1) {
            permiso_string = "Empleado";
        }

        //Comprobar si ya existe username con ese mote
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select username from usuarios where username = '" + username + "'");
            ResultSet rs = pst.executeQuery();  //Ejecutamos la instruccion pasada

            if (rs.next()) {
                jTextFieldUsername.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                cn.close();
                
            } else {
                
                cn.close();
                
                if (validacion == 0) {
                    
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement("insert into usuarios values (?,?,?,?,?,?,?,?)");

                        pst2.setInt(1, 0);              //Perteneciente al ID
                        pst2.setString(2, nombre);
                        pst2.setString(3, correo);
                        pst2.setString(4, telefono);
                        pst2.setString(5, username);
                        pst2.setString(6, password);
                        pst2.setString(7, permiso_string);
                        pst2.setString(8, user);        //Registrado por

                        pst2.executeUpdate();
                        cn2.close();

                        Clean();

                        jTextFieldMail.setBackground(Color.GREEN);
                        jTextFieldNombre.setBackground(Color.GREEN);
                        jTextFieldPassword.setBackground(Color.GREEN);
                        jTextFieldTel.setBackground(Color.GREEN);
                        jTextFieldUsername.setBackground(Color.GREEN);

                        JOptionPane.showMessageDialog(null, "Registro exitoso");
                        this.dispose();
                        Administrador admin = new Administrador();
                        admin.setVisible(true);

                    } catch (SQLException e) {
                        System.err.println("Error al registrar usuario. " + e);
                        JOptionPane.showMessageDialog(null, "Error al registrar. Contacte al administrador");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
                }
            }

        } catch (SQLException e) {
            System.err.println("Error en validar nombre de usuario. " + e);
            JOptionPane.showMessageDialog(null, "Error al comparar usuario, contacte al administrador");
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        this.dispose();
        new Administrador().setVisible(true); 
    }//GEN-LAST:event_jButton_SalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Users_Fondo;
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JLabel credits;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPuesto;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

    private void Clean() {
        jTextFieldMail.setText("");
        jTextFieldNombre.setText("");
        jTextFieldPassword.setText("");
        jTextFieldTel.setText("");
        jTextFieldUsername.setText("");
        
        cmb_niveles.setSelectedIndex(0);
    }
}
