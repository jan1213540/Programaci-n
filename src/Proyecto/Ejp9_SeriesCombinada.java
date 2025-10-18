package Proyecto;
import javax.swing.JOptionPane;
/**
 *
 * @Jandry Gutierrez
 */
public class Ejp9_SeriesCombinada extends javax.swing.JPanel {
    /**
     * Creates new form Ejp9_SeriesCombinada
     */
    public Ejp9_SeriesCombinada() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSerie = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SERIE COMBINADA ASCII");
        jLabel1.setOpaque(true);
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("SERIE GENERADA:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(266, 212, 195, 40);

        txtMax.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtMax);
        txtMax.setBounds(270, 80, 180, 50);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GENERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 150, 180, 50);

        txtSerie.setColumns(20);
        txtSerie.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSerie.setRows(5);
        jScrollPane1.setViewportView(txtSerie);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 270, 400, 90);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESE CUANTO CARACTERES MOSTRAR (1 a 52):");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(129, 28, 484, 40);

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(290, 380, 160, 50);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int entrada= Integer.parseInt(txtMax.getText());
        int N;
        try {
            N = entrada;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero válido.");
            return;
        }
        if (N < 1 || N > 52) {
            JOptionPane.showMessageDialog(null, "El número debe estar entre 1 y 52.");
            return;
        }
        char min = 'a';
        char may = 'Z';
        String serie = "";
        for (int i = 0; i < N; i++) {
            if (i > 0) {
                serie += ", ";
            }else if (i % 2 == 0) {
                serie += min;
                min++;
            } else {
                serie += may;
                may--;
            }
        } 
        txtSerie.setText("\n" + serie);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtMax.setText("");
        txtSerie.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextArea txtSerie;
    // End of variables declaration//GEN-END:variables
}
