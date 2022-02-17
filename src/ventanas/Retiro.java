package ventanas;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static ventanas.NuevaVenta.fechaActual;


public class Retiro extends javax.swing.JFrame {

    public Retiro() {
        initComponents();
        setResizable(false); //No permitimos que el usuario modifique las dimensiones
        setTitle("Retiro");
        setLocationRelativeTo(null);
        setSize(1100, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioTarjeta = new javax.swing.JRadioButton();
        RadioEfectivo = new javax.swing.JRadioButton();
        jButton_Salir = new javax.swing.JButton();
        jTextMonto = new javax.swing.JTextField();
        RegistrarRetiro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDescripcion = new javax.swing.JTextArea();
        Mxn = new javax.swing.JLabel();
        $ = new javax.swing.JLabel();
        Monto1 = new javax.swing.JLabel();
        Monto = new javax.swing.JLabel();
        Titulo_Retiro = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RadioTarjeta.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        RadioTarjeta.setForeground(new java.awt.Color(222, 93, 208));
        RadioTarjeta.setText("Tarjeta");
        RadioTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RadioTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioTarjetaActionPerformed(evt);
            }
        });
        getContentPane().add(RadioTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, 30));

        RadioEfectivo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        RadioEfectivo.setForeground(new java.awt.Color(222, 93, 208));
        RadioEfectivo.setText(" Efectivo");
        RadioEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RadioEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioEfectivoActionPerformed(evt);
            }
        });
        getContentPane().add(RadioEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, 30));

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
        getContentPane().add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 110, 40));

        jTextMonto.setBackground(new java.awt.Color(255, 255, 255));
        jTextMonto.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextMonto.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 130, -1));

        RegistrarRetiro.setBackground(new java.awt.Color(222, 146, 222));
        RegistrarRetiro.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        RegistrarRetiro.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarRetiro.setText("Registrar retiro");
        RegistrarRetiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarRetiroActionPerformed(evt);
            }
        });
        getContentPane().add(RegistrarRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 180, 80));

        jTextDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jTextDescripcion.setColumns(20);
        jTextDescripcion.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jTextDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 196, 480, 120));

        Mxn.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        Mxn.setForeground(new java.awt.Color(222, 93, 208));
        Mxn.setText("mxn");
        getContentPane().add(Mxn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 70, -1));

        $.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        $.setForeground(new java.awt.Color(222, 93, 208));
        $.setText("$");
        getContentPane().add($, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 20, 50));

        Monto1.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        Monto1.setForeground(new java.awt.Color(222, 93, 208));
        Monto1.setText("Descripción");
        getContentPane().add(Monto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 190, 40));

        Monto.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        Monto.setForeground(new java.awt.Color(222, 93, 208));
        Monto.setText("Monto");
        getContentPane().add(Monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, 40));

        Titulo_Retiro.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        Titulo_Retiro.setForeground(new java.awt.Color(222, 93, 208));
        Titulo_Retiro.setText("Nuevo Retiro");
        getContentPane().add(Titulo_Retiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 270, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin_fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        this.dispose();
        new Administrador().setVisible(true);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void RadioEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioEfectivoActionPerformed

    }//GEN-LAST:event_RadioEfectivoActionPerformed

    private void RadioTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioTarjetaActionPerformed

    private void RegistrarRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarRetiroActionPerformed
        String monto = "", descripcion = "", tipo = "";
        int dinero;
        

        monto = jTextMonto.getText().trim();
        descripcion = jTextDescripcion.getText();

        if (RadioEfectivo.isSelected() == true && RadioTarjeta.isSelected() == false) {
            tipo = "Efectivo";
        } else if (RadioEfectivo.isSelected() == false && RadioTarjeta.isSelected() == true) {
            tipo = "Tarjeta";
        } else if (RadioEfectivo.isSelected() == true && RadioTarjeta.isSelected() == true) {
            JOptionPane.showMessageDialog(null, "Por favor selecciona solo un tipo de retiro");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un tipo de retiro");
        }
        
        //Actualizar dinero Total
        if(tipo.equals("Efectivo")){
            
            try {
                    Connection cn3 = Conexion.conectar();
                    PreparedStatement pst = cn3.prepareStatement("SELECT Cartera FROM `dinero` WHERE id_dinero = 1");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        dinero = Integer.valueOf(rs.getString("Cartera"));
                        dinero -= Integer.valueOf(monto);
                        
                        Connection cn4 = Conexion.conectar();
                        PreparedStatement pst2 = cn4.prepareStatement("UPDATE `dinero` SET `Cartera` = '" + dinero + "' WHERE `dinero`.`id_dinero` = 1");
                        pst2.executeUpdate();
                        cn4.close();
                    }
                    
                } catch (SQLException e) {
                    System.out.println("Error al actualizar total efectivo. " + e);
                }
            
        } else if(tipo.equals("Tarjeta")){
            
            try {
                    Connection cn3 = Conexion.conectar();
                    PreparedStatement pst = cn3.prepareStatement("SELECT Tarjeta FROM `dinero` WHERE id_dinero = 1");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        dinero = Integer.valueOf(rs.getString("Tarjeta"));
                        dinero -= Integer.valueOf(monto);;
                        
                        Connection cn4 = Conexion.conectar();
                        PreparedStatement pst2 = cn4.prepareStatement("UPDATE `dinero` SET `Tarjeta` = '" + dinero + "' WHERE `dinero`.`id_dinero` = 1");
                        pst2.executeUpdate();
                        cn4.close();
                    }
                    
                } catch (SQLException e) {
                    System.out.println("Error al actualizar total efectivo. " + e);
                }
        }
        
        //Agregar información a base de datos "Retiros"
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("insert into retiro values (?,?,?,?,?)");

            pst.setInt(1, 0);
            pst.setString(2,monto);
            pst.setString(3,tipo);
            pst.setString(4,descripcion);
            pst.setString(5,fechaActual());

            pst.executeUpdate();
            cn.close();
            
            JOptionPane.showMessageDialog(null, "El retiro se ha registrado de manera exitosa");
            this.dispose();
            new Estadistica().setVisible(true);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar retiro. " + e);
        }
    }//GEN-LAST:event_RegistrarRetiroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel $;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Monto;
    private javax.swing.JLabel Monto1;
    private javax.swing.JLabel Mxn;
    private javax.swing.JRadioButton RadioEfectivo;
    private javax.swing.JRadioButton RadioTarjeta;
    private javax.swing.JButton RegistrarRetiro;
    private javax.swing.JLabel Titulo_Retiro;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextDescripcion;
    private javax.swing.JTextField jTextMonto;
    // End of variables declaration//GEN-END:variables
}
