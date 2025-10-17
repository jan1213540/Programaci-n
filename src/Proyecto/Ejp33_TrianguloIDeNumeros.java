package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @Jandry Gutierrez
 */
public class Ejp33_TrianguloIDeNumeros extends javax.swing.JPanel {

    public Ejp33_TrianguloIDeNumeros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTriangulo = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMPRIMIR TRIANGULO");
        jLabel1.setOpaque(true);
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESE LA LONGITUD DE LA PRIMERA FILA DEL TRIANGULO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 30, 580, 49);

        txtBf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtBf);
        txtBf.setBounds(150, 90, 146, 55);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("GENERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(339, 90, 130, 55);

        txtTriangulo.setColumns(20);
        txtTriangulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTriangulo.setRows(5);
        jScrollPane2.setViewportView(txtTriangulo);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(110, 190, 430, 270);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            int f = Integer.parseInt(txtBf.getText());
            if (f <= 0) {
                JOptionPane.showMessageDialog(null, "¡Error! Ingrese valores positivos");
                return;
            }
            String acumulador = "";
            for (int i = f; i >= 1; i--) {
                // Espacios antes de los números
                for (int e = f; e > i; e--) {
                    acumulador += "  ";
                }
                for (int j = 1; j <= i; j++) {
                    acumulador += j + " ";
                }
                acumulador += "\n"; 
            }
            txtTriangulo.setText(acumulador);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error! Ingrese valores numéricos enteros");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBf;
    private javax.swing.JTextArea txtTriangulo;
    // End of variables declaration//GEN-END:variables
}
