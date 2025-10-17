package Proyecto;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @jandry Gutierrez 
 */
public class Ejp20_binarioDecimal extends javax.swing.JPanel {
    public Ejp20_binarioDecimal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTNumeroD = new javax.swing.JTextField();
        jTValorB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTNumeroB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTValorD = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora decimal a binario y binario a decimal ");
        jLabel1.setOpaque(true);
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESE EL NÚMERO DECIMAL: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(59, 31, 331, 40);

        jTNumeroD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTNumeroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumeroDActionPerformed(evt);
            }
        });
        jPanel1.add(jTNumeroD);
        jTNumeroD.setBounds(60, 80, 350, 44);

        jTValorB.setEditable(false);
        jTValorB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTValorB);
        jTValorB.setBounds(60, 190, 360, 45);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EL VALOR BINARIO ES:  ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(59, 145, 331, 27);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("DECIMAL A BINARIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 270, 220, 99);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("INGRESE UN NUMERO BINARIO:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 40, 302, 22);

        jTNumeroB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTNumeroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumeroBActionPerformed(evt);
            }
        });
        jPanel1.add(jTNumeroB);
        jTNumeroB.setBounds(440, 80, 340, 44);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("EL VALOR DECIMAL ES");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 140, 302, 27);

        jTValorD.setEditable(false);
        jTValorD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTValorD);
        jTValorD.setBounds(440, 190, 340, 45);

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("BINARIO A DECIMAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(540, 270, 220, 99);

        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setText("LIMPIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(300, 270, 190, 100);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTNumeroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNumeroDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNumeroDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            int numero = Integer.parseInt(jTNumeroD.getText());
            String binario = "";
            int n = numero;

            // Manejar el caso del número 0
            if (n == 0) {
                binario = "0";
            } else if (n < 0) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese números positivos");
                jTValorB.setText("");
                return;
            } else {
                while (n > 0) {
                    int residuo = n % 2;
                    binario = residuo + binario;
                    n = n / 2;
                }
            }

            jTValorB.setText(binario);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores numéricos válidos");
            jTValorB.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTNumeroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNumeroBActionPerformed

    }//GEN-LAST:event_jTNumeroBActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            String binario = jTNumeroB.getText().trim();
            int decimal = 0;
            for (int i = 0; i < binario.length(); i++) {
                char digito = binario.charAt(i);
                if (digito != '0' && digito != '1') {
                    JOptionPane.showMessageDialog(null, "Solo ingrese 0s y 1s");
                    jTNumeroB.setText("");
                    return;
                }
                decimal = decimal * 2 + (digito - '0');
            }
            jTValorD.setText(String.valueOf(decimal));
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en conversión");
            jTNumeroD.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jTNumeroD.setText("");
        jTValorB.setText("");
        jTNumeroB.setText("");
        jTValorD.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTNumeroB;
    private javax.swing.JTextField jTNumeroD;
    private javax.swing.JTextField jTValorB;
    private javax.swing.JTextField jTValorD;
    // End of variables declaration//GEN-END:variables
}
