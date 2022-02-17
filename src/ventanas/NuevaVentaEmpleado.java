
package ventanas;

import clases.Conexion;
import com.mysql.jdbc.ResultSetMetaData;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ventanas.Login.user;
import static ventanas.NuevaVenta.fechaActual;
import static ventanas.NuevaVenta.horaActual;

public class NuevaVentaEmpleado extends javax.swing.JFrame {

    public NuevaVentaEmpleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BoxPostre = new javax.swing.JComboBox<>();
        BoxSize = new javax.swing.JComboBox<>();
        jTextTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioSi = new javax.swing.JRadioButton();
        RegistrarVenta = new javax.swing.JButton();
        Add1 = new javax.swing.JButton();
        jTextCantidad1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextPagaCon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbVentas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        credits = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 14), new java.awt.Color(222, 146, 222))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(222, 146, 222));
        jLabel4.setText("¿Efectivo? :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 130, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(222, 146, 222));
        jLabel5.setText("Postre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(222, 146, 222));
        jLabel6.setText("Tamaño:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, 30));

        BoxPostre.setBackground(new java.awt.Color(246, 234, 246));
        BoxPostre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        BoxPostre.setForeground(new java.awt.Color(102, 102, 102));
        BoxPostre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red Velvet", "Chocolate Alemán", "Zanahoria", "Mostachón" }));
        BoxPostre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BoxPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 300, 30));

        BoxSize.setBackground(new java.awt.Color(246, 234, 246));
        BoxSize.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        BoxSize.setForeground(new java.awt.Color(102, 102, 102));
        BoxSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grande", "Mediano", "Chico", "Picky", "Individual" }));
        BoxSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BoxSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 300, 30));

        jTextTotal.setBackground(new java.awt.Color(246, 234, 246));
        jTextTotal.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jTextTotal.setForeground(new java.awt.Color(102, 102, 102));
        jTextTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotalActionPerformed(evt);
            }
        });
        jPanel1.add(jTextTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 170, 40));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(222, 146, 222));
        jLabel7.setText("Cantidad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 120, 30));

        jRadioSi.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jRadioSi.setForeground(new java.awt.Color(102, 102, 102));
        jRadioSi.setText("Si");
        jRadioSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSiActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, 30));

        RegistrarVenta.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        RegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NewVenta.png"))); // NOI18N
        RegistrarVenta.setBorder(null);
        RegistrarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NewVenta2_1.png"))); // NOI18N
        RegistrarVenta.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NewVenta2_1.png"))); // NOI18N
        RegistrarVenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NewVenta2_1.png"))); // NOI18N
        RegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarVentaActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 170, 90));

        Add1.setBackground(new java.awt.Color(246, 234, 246));
        Add1.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        Add1.setForeground(new java.awt.Color(102, 102, 102));
        Add1.setText("Agregar");
        Add1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });
        jPanel1.add(Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, 30));

        jTextCantidad1.setBackground(new java.awt.Color(246, 234, 246));
        jTextCantidad1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jTextCantidad1.setForeground(new java.awt.Color(102, 102, 102));
        jTextCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidad1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 50, 30));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(222, 146, 222));
        jLabel9.setText("Total:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 110, 40));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(222, 146, 222));
        jLabel10.setText("Paga con:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 180, 50));

        jTextPagaCon.setBackground(new java.awt.Color(246, 234, 246));
        jTextPagaCon.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jTextPagaCon.setForeground(new java.awt.Color(102, 102, 102));
        jTextPagaCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPagaConActionPerformed(evt);
            }
        });
        jPanel1.add(jTextPagaCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 1020, 220));

        TbVentas.setBackground(new java.awt.Color(255, 255, 255));
        TbVentas.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        TbVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Venta", "Postre", "Tamaño", "Precio", "Cantidad", "Total", "Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TbVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 1020, 280));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(222, 146, 222));
        jLabel3.setText("Nueva venta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plantilla_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        credits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        credits.setForeground(new java.awt.Color(222, 146, 222));
        credits.setText("Creado por Ramsés Ramírez Vallejo");
        getContentPane().add(credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 700, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(222, 146, 222));
        jLabel2.setText("Ventas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin_fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        this.dispose();
        new Empleado().setVisible(true);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jTextTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalActionPerformed

    }//GEN-LAST:event_jTextTotalActionPerformed

    private void jRadioSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioSiActionPerformed

    private void RegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarVentaActionPerformed

        int pagaCon, total, cambio, filas = 0;

        pagaCon = Integer.valueOf(jTextPagaCon.getText());
        total = Integer.valueOf(jTextTotal.getText());
        cambio = pagaCon - total;

        JOptionPane.showMessageDialog(null, "¡¡Muchas gracias por haber comprado en Ella!!, el cambio es de $ " + String.valueOf(cambio) + " mxn");

        filas = TbVentas.getRowCount();

        try {
            Connection cn1 = Conexion.conectar();
            for (int i = 1; i < filas + 1; i++) {
                PreparedStatement pst = cn1.prepareStatement("DELETE FROM `ventafugaz` WHERE id_ventaFugaz ='" + String.valueOf(i) + "'");
                //DELETE FROM `ventafugaz` WHERE `ventafugaz`.`id_ventaFugaz` = 18;
                pst.execute();
            }
            cn1.close();

        } catch (SQLException e) {
            System.err.println("Ocurrio un error al reiniciar la base de datos." + e);
        }

        this.dispose();
        new Empleado().setVisible(true);
    }//GEN-LAST:event_RegistrarVentaActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
        //Para registrar las ventas en la bases de datos GENERAL
        int postre_int, tamaño_int, costo = 0, validacion = 0, precio = 0, total = 0;
        String cantidad, postre_str = "", tamaño_str = "", efectivo_str;

        postre_int = BoxPostre.getSelectedIndex();
        tamaño_int = BoxSize.getSelectedIndex();

        cantidad = jTextCantidad1.getText();

        switch (postre_int) {
            case 0 ->
            postre_str = "Red Velvet";
            case 1 ->
            postre_str = "Chocolate Aleman";
            case 2 ->
            postre_str = "Zanahoria";
            case 3 ->
            postre_str = "Mostachon";
            default -> {
            }
        }
        switch (tamaño_int) {
            case 0 ->
            tamaño_str = "Grande";
            case 1 ->
            tamaño_str = "Mediano";
            case 2 ->
            tamaño_str = "Chico";
            case 3 ->
            tamaño_str = "Picky";
            case 4 ->
            tamaño_str = "Individual";
        }

        if (jRadioSi.isSelected() == true) {
            efectivo_str = "Efectivo";
        } else {
            efectivo_str = "Tarjeta";
        }

        if (cantidad.equals("")) {
            jTextTotal.setBackground(Color.red);
            validacion++;
        }

        if (validacion == 0) {

            //Obtener costo por producto
            switch (postre_str) {
                case "Red Velvet", "Zanahoria" -> {
                    switch (tamaño_str) {
                        case "Grande" -> {
                            precio = 500;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Mediano" -> {
                            precio = 380;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Chico" -> {
                            precio = 230;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Picky" -> {
                            precio = 160;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Individual" -> {
                            precio = 70;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        default -> {
                        }
                    }
                    break;
                }
                case "Chocolate Aleman" -> {
                    switch (tamaño_str) {
                        case "Grande" -> {
                            precio = 500;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Mediano" -> {
                            precio = 380;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Chico" -> {
                            precio = 260;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Picky" -> {
                            precio = 160;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Individual" -> {
                            precio = 70;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        default -> {
                        }
                    }
                    break;
                }
                case "Mostachon" -> {
                    switch (tamaño_str) {
                        case "Grande" -> {
                            precio = 400;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Mediano" -> {
                            precio = 380;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Chico" -> {
                            precio = 240;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Picky" -> {
                            precio = 160;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        case "Individual" -> {
                            precio = 70;
                            costo = precio * Integer.valueOf(cantidad);
                            break;
                        }
                        default -> {
                        }
                    }
                }
                default -> {
                }
            }

            total = total + costo;
            jTextTotal.setText(String.valueOf(total));

            //Agregar informacion a base de datos ventafugaz
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into ventafugaz values (?,?,?,?,?,?,?)");

                pst.setInt(1, 0);
                pst.setString(2, postre_str);
                pst.setString(3, tamaño_str);
                pst.setString(4, String.valueOf(precio));
                pst.setString(5, cantidad);
                pst.setString(6, String.valueOf(costo));
                pst.setString(7, efectivo_str);

                pst.executeUpdate();
                cn.close();

            } catch (SQLException e) {
                System.err.println("Error al cargar la información de la venta. " + e);
                JOptionPane.showMessageDialog(null, "Error al cargar la venta, contacte al administrador");
            }

            try {
                Connection cn1 = Conexion.conectar();
                PreparedStatement pst = cn1.prepareStatement("insert into ventas values (?,?,?,?,?,?,?,?,?,?)");

                pst.setInt(1, 0);
                pst.setString(2, postre_str);
                pst.setString(3, tamaño_str);
                pst.setString(4, String.valueOf(precio));
                pst.setString(5, cantidad);
                pst.setString(6, String.valueOf(costo));
                pst.setString(7, efectivo_str);
                pst.setString(8, fechaActual());
                pst.setString(9, horaActual());
                pst.setString(10, user);

                pst.executeUpdate();
                cn1.close();

                jTextCantidad1.setText("");
                jRadioSi.setSelected(false);

                JOptionPane.showMessageDialog(null, "Venta registrada exitosamente");
                cargarTabla();

            } catch (SQLException e) {
                System.err.println("Error al cargar la información de la venta. " + e);
                JOptionPane.showMessageDialog(null, "Error al cargar la venta, contacte al administrador");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingresa una cantidad");
        }

        cargarTabla();
    }//GEN-LAST:event_Add1ActionPerformed

    private void jTextCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidad1ActionPerformed

    }//GEN-LAST:event_jTextCantidad1ActionPerformed

    private void jTextPagaConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPagaConActionPerformed

    }//GEN-LAST:event_jTextPagaConActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaVentaEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add1;
    private javax.swing.JComboBox<String> BoxPostre;
    private javax.swing.JComboBox<String> BoxSize;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton RegistrarVenta;
    private javax.swing.JTable TbVentas;
    private javax.swing.JLabel credits;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioSi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCantidad1;
    private javax.swing.JTextField jTextPagaCon;
    private javax.swing.JTextField jTextTotal;
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
            ps = cn.prepareStatement("SELECT id_ventaFugaz, postreFugaz, tamañoFugaz, precioFugaz, cantidadFugaz, TotalFugaz, pagoFugaz FROM ventafugaz");
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
            
            cn.close();
            
        } catch (SQLException e) {
            System.out.println("Algo salió mal al mostrar la tabla. " + e);
            JOptionPane.showMessageDialog(null, "Algo salió mal. Contacte al administrador");
        }
    }
}
