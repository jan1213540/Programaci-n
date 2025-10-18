package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @Jandry Gutierrez
 */
public class Ejp29_NumeroCombinaciones extends javax.swing.JPanel {

    public Ejp29_NumeroCombinaciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        txtK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CalcularCombinaciones = new javax.swing.JButton();
        txtCom = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NÚMERO DE COMBINACIONES");
        jLabel1.setOpaque(true);
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESE k");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 100, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESE n ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 20, 110, 50);

        txtN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtN);
        txtN.setBounds(150, 20, 100, 50);

        txtK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtK);
        txtK.setBounds(150, 90, 100, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Numero de combinaciones .png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(310, 20, 220, 110);

        CalcularCombinaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CalcularCombinaciones.setText("CALCULAR LAS COMBINACIONES");
        CalcularCombinaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularCombinacionesActionPerformed(evt);
            }
        });
        jPanel1.add(CalcularCombinaciones);
        CalcularCombinaciones.setBounds(30, 160, 340, 60);

        txtCom.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txtCom);
        txtCom.setBounds(390, 160, 140, 60);

        Limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar);
        Limpiar.setBounds(390, 260, 180, 60);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularCombinacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularCombinacionesActionPerformed
        try {
            long n = Long.parseLong(txtN.getText());
            long k = Long.parseLong(txtK.getText());
            if (n <= 0 || k <= 0) {
                JOptionPane.showMessageDialog(null, "¡Error! Ingrese valores positivos");
                return;
            }
            long na = n + k - 1;
            long factorial_na = 1; 
            long factorial_k = 1;
            long factorial_n1 = 1;
            for (int i = 1; i <= na; i++) {
                factorial_na *= i;
            }
            for (int j = 1; j <= k; j++) {
                factorial_k *= j;
            }
            for (int l = 1; l <= (n - 1); l++) {
                factorial_n1 *= l;
            }
            long total = factorial_na / (factorial_k * factorial_n1);
            String resultado = String.valueOf(total);
            txtCom.setText(resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error! Ingrese valores numéricos válidos");
        }
    }//GEN-LAST:event_CalcularCombinacionesActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        txtK.setText("");
        txtN.setText("");
        txtCom.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularCombinaciones;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCom;
    private javax.swing.JTextField txtK;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
