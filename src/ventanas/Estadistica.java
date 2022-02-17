package ventanas;

import clases.Conexion;
import com.mysql.jdbc.ResultSetMetaData;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Estadistica extends javax.swing.JFrame {

    public Estadistica() {
        initComponents();
        setResizable(false); //No permitimos que el usuario modifique las dimensiones
        setTitle("Estadistica");
        setLocationRelativeTo(null);
        setSize(1280, 720);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        tablaTotal();
        cargarTabla();
        tablaRetiro();
        tablaDinero();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRetiro = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TbRetiros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbDinero = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbVentas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        credits = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRetiro.setBackground(new java.awt.Color(222, 146, 222));
        jButtonRetiro.setFont(new java.awt.Font("Rockwell", 0, 21)); // NOI18N
        jButtonRetiro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRetiro.setText("Nuevo Retiro");
        jButtonRetiro.setBorder(null);
        jButtonRetiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetiroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 170, 40));

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

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(222, 146, 222));
        jLabel3.setText("Retiros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 140, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(222, 146, 222));
        jLabel4.setText("Dinero");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, 30));

        TbRetiros.setBackground(new java.awt.Color(255, 255, 255));
        TbRetiros.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        TbRetiros.setForeground(new java.awt.Color(0, 0, 0));
        TbRetiros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Monto", "Tipo", "Descripción", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TbRetiros);
        if (TbRetiros.getColumnModel().getColumnCount() > 0) {
            TbRetiros.getColumnModel().getColumn(0).setMaxWidth(80);
            TbRetiros.getColumnModel().getColumn(1).setMaxWidth(80);
            TbRetiros.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 660, 130));

        TbDinero.setBackground(new java.awt.Color(255, 255, 255));
        TbDinero.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TbDinero.setForeground(new java.awt.Color(0, 0, 0));
        TbDinero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cartera", "Tarjeta", "Total"
            }
        ));
        jScrollPane2.setViewportView(TbDinero);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 330, 60));

        TbVentas.setBackground(new java.awt.Color(255, 255, 255));
        TbVentas.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        TbVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Venta", "Postre", "Tamaño", "Precio", "Cantidad", "Total", "Pago", "Fecha", "Hora", "Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TbVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 1020, 350));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(222, 146, 222));
        jLabel2.setText("Ventas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 140, 30));

        credits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        credits.setForeground(new java.awt.Color(222, 146, 222));
        credits.setText("Creado por Ramsés Ramírez Vallejo");
        getContentPane().add(credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 700, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plantilla_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 1270, 730));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin_fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        this.dispose();
        new Administrador().setVisible(true);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButtonRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetiroActionPerformed
        dispose();
        Retiro retiro = new Retiro();
        retiro.setVisible(true);
    }//GEN-LAST:event_jButtonRetiroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadistica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable TbDinero;
    private javax.swing.JTable TbRetiros;
    private javax.swing.JTable TbVentas;
    private javax.swing.JLabel credits;
    private javax.swing.JButton jButtonRetiro;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TbVentas.getModel();
        modeloTabla.setRowCount(0); //Limpiar la tabla

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection cn = Conexion.conectar();
            ps = cn.prepareStatement("SELECT id_venta, postre, tamaño, precio, cantidad, Total, pago, fecha, hora, usuario FROM ventas");
            rs = ps.executeQuery();
            rsmd = (ResultSetMetaData) rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (SQLException e) {
            System.out.println("Algo salió mal al mostrar la tabla. " + e);
            JOptionPane.showMessageDialog(null, "Algo salió mal. Contacte al administrador");
        }
    }

    private void tablaRetiro() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TbRetiros.getModel();
        modeloTabla.setRowCount(0); //Limpiar la tabla

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection cn = Conexion.conectar();
            ps = cn.prepareStatement("SELECT Monto, Tipo, Descripcion, Fecha FROM retiro");
            rs = ps.executeQuery();
            rsmd = (ResultSetMetaData) rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (SQLException e) {
            System.out.println("Algo salió mal al mostrar la tabla. " + e);
            JOptionPane.showMessageDialog(null, "Algo salió mal. Contacte al administrador");
        }
    }

    private void tablaDinero() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TbDinero.getModel();
        modeloTabla.setRowCount(0); //Limpiar la tabla

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection cn = Conexion.conectar();
            ps = cn.prepareStatement("SELECT Cartera, Tarjeta, Total FROM dinero");
            rs = ps.executeQuery();
            rsmd = (ResultSetMetaData) rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (SQLException e) {
            System.out.println("Algo salió mal al mostrar la tabla. " + e);
            JOptionPane.showMessageDialog(null, "Algo salió mal. Contacte al administrador");
        }
    }

    private void tablaTotal(){

        int cartera = 0, tarjeta = 0, total;
        
        //Obtener valor cartera
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT Cartera FROM `dinero` WHERE id_dinero = 1");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cartera = Integer.valueOf(rs.getString("Cartera"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener valor Cartera " + e);
        }
        
        //Obtener valor tarjeta
        try {
            Connection cn1 = Conexion.conectar();
            PreparedStatement pst1 = cn1.prepareStatement("SELECT Tarjeta FROM `dinero` WHERE id_dinero = 1");
            ResultSet rs1 = pst1.executeQuery();

            if (rs1.next()) {
                tarjeta = Integer.valueOf(rs1.getString("Tarjeta"));
            }
            cn1.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener valor tarjeta. " + e);
        }
        
        //Tabla Total
        try {
            total = cartera + tarjeta;
            Connection cn2 = Conexion.conectar();
            PreparedStatement pst2 = cn2.prepareStatement("UPDATE `dinero` SET `Total` = '" + total + "' WHERE `dinero`.`id_dinero` = 1");
            pst2.executeUpdate();
            cn2.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar tabla Total. " + e);
        }
        
    }
}
