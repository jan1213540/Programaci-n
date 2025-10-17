package Proyecto;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @Jandry Gutierrez
 */
public class Ejp28_SistemaImporte extends javax.swing.JPanel {

    double total = 0;

    public Ejp28_SistemaImporte() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtSubtotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtIvaP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTVuelto = new javax.swing.JTextField();
        jTPago = new javax.swing.JTextField();
        btnCalcularDevolucion = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnAñadirBoton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE IMPORTE");
        jLabel1.setOpaque(true);
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Tabla.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Prescio untario", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(76, 14, 613, 270);

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSubtotal.setFocusable(false);
        jPanel1.add(txtSubtotal);
        txtSubtotal.setBounds(150, 300, 255, 42);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Subtotal");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(70, 310, 80, 25);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Descuento");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 360, 100, 22);

        txtDescuento.setEditable(false);
        txtDescuento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtDescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDescuento.setFocusable(false);
        jPanel1.add(txtDescuento);
        txtDescuento.setBounds(150, 350, 255, 42);

        txtIvaP.setEditable(false);
        txtIvaP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtIvaP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIvaP.setText("12");
        txtIvaP.setFocusable(false);
        txtIvaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvaPActionPerformed(evt);
            }
        });
        jPanel1.add(txtIvaP);
        txtIvaP.setBounds(150, 410, 255, 42);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Iva %");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(90, 410, 50, 22);

        txtIva.setEditable(false);
        txtIva.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtIva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIva.setFocusable(false);
        jPanel1.add(txtIva);
        txtIva.setBounds(150, 460, 255, 42);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Iva calculado");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 470, 120, 22);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Total a pagar");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 520, 120, 22);

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setFocusable(false);
        jPanel1.add(txtTotal);
        txtTotal.setBounds(150, 510, 255, 42);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("vuelto :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(470, 540, 70, 31);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Pago:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(480, 480, 57, 35);

        jTVuelto.setEditable(false);
        jTVuelto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTVuelto.setFocusable(false);
        jPanel1.add(jTVuelto);
        jTVuelto.setBounds(540, 530, 189, 44);

        jTPago.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTPago);
        jTPago.setBounds(540, 470, 189, 44);

        btnCalcularDevolucion.setBackground(new java.awt.Color(204, 204, 204));
        btnCalcularDevolucion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCalcularDevolucion.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcularDevolucion.setText("Calcular devolucion");
        btnCalcularDevolucion.setOpaque(true);
        btnCalcularDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularDevolucionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcularDevolucion);
        btnCalcularDevolucion.setBounds(540, 400, 210, 53);

        btnCalcular.setBackground(new java.awt.Color(204, 204, 204));
        btnCalcular.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.setOpaque(true);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular);
        btnCalcular.setBounds(540, 350, 210, 47);

        btnAñadirBoton.setBackground(new java.awt.Color(204, 204, 204));
        btnAñadirBoton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAñadirBoton.setForeground(new java.awt.Color(0, 0, 0));
        btnAñadirBoton.setText("Añadir Producto");
        btnAñadirBoton.setOpaque(true);
        btnAñadirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirBotonActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadirBoton);
        btnAñadirBoton.setBounds(540, 300, 210, 45);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIvaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaPActionPerformed

    private void btnCalcularDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularDevolucionActionPerformed
        try {
            double pago = Double.valueOf(jTPago.getText());
            //validar que el pago sea mayor o igual al total
            if (pago < total) {
                throw new RuntimeException(); //salta al catch si pago es menor a total
            }
            double vuelto = pago - total;
            jTVuelto.setText(String.format("%.2f", vuelto));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "¡Error! Ingrese un pago mayor o igual al Total a Pagar");
        }
    }//GEN-LAST:event_btnCalcularDevolucionActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        try {
            int N = modelo.getRowCount(); 
            int fila = 0;
            double st = 0; 

            do {
                double cant = Double.valueOf(modelo.getValueAt(fila, 2).toString()); 
                double precio = Double.valueOf(modelo.getValueAt(fila, 3).toString()); 

                if (cant <= 0 || precio < 0) {
                    throw new RuntimeException();
                }
                double importe = cant * precio;
                st += importe;
                modelo.setValueAt(String.format("%.2f", importe), fila, 4); // mostrar importe
                fila++;
            } while (fila < N);
            txtSubtotal.setText(String.format("%.2f", st));
            // Calcular descuento según el subtotal
            double desc = (st > 1000) ? st * 0.10 : (st >= 500 ? st * 0.05 : 0);
            txtDescuento.setText(String.format("%.2f", desc));
            double iva = st * 0.12;
            txtIva.setText(String.format("%.2f", iva));
            double total = st + iva - desc;
            txtTotal.setText(String.format("%.2f", total));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "¡Error! Ingrese valores numéricos válidos (cantidad > 0, precio ≥ 0)");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnAñadirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirBotonActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        try {
            int N = modelo.getRowCount();
            modelo.setRowCount(++N);
            int i = 1;
            do {
                modelo.setValueAt("P" + i, i - 1, 0);
                i++;
            } while (i <= N);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAñadirBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAñadirBoton;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularDevolucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTPago;
    private javax.swing.JTextField jTVuelto;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtIvaP;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
