package Proyecto;
/**
 *
 * @Jandry Gutierrez
 */
import javax.swing.JOptionPane;
public class Ejp4_GenerarCaracteresASCII extends javax.swing.JPanel {
    public Ejp4_GenerarCaracteresASCII() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JtInferior = new javax.swing.JTextField();
        btGenerarASCII = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JtSuperior = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        JtError = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GENERAR CODIGO ASCII ");
        jLabel1.setOpaque(true);
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("SUPERIOR");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INFERIOR ");

        JtInferior.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        btGenerarASCII.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btGenerarASCII.setForeground(new java.awt.Color(0, 0, 0));
        btGenerarASCII.setText("GENERAR");
        btGenerarASCII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarASCIIActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JtSuperior.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JtSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtSuperiorActionPerformed(evt);
            }
        });

        txaResultado.setEditable(false);
        txaResultado.setColumns(20);
        txaResultado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txaResultado.setRows(5);
        txaResultado.setFocusable(false);
        jScrollPane1.setViewportView(txaResultado);

        JtError.setEditable(false);
        JtError.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JtError.setFocusable(false);
        JtError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btGenerarASCII, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(JtError, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtError, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btGenerarASCII, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btGenerarASCIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarASCIIActionPerformed
        // TODO add your handling code here:
        try {
            int inferior = Integer.parseInt(JtInferior.getText());
            int superior = Integer.parseInt(JtSuperior.getText());
            if (inferior<=0 || superior<=0){
                JtError.setText("Ingrese valores positivos");
                return;
            }
            if (inferior>superior){
                JtError.setText("El numero de inicio no puede ser mayor al final");
                return;
            }
            String resultado = "";
            for (int ascii = inferior; ascii <= superior; ascii++) {
                resultado += ascii + " ='" + (char) ascii + "' "+"\n";
            }
            txaResultado.setText(resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores numéricos válidos");
        }
    }//GEN-LAST:event_btGenerarASCIIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JtInferior.setText("");
        JtSuperior.setText("");
        JtError.setText("");
        txaResultado.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JtSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtSuperiorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtSuperiorActionPerformed

    private void JtErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtErrorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtError;
    private javax.swing.JTextField JtInferior;
    private javax.swing.JTextField JtSuperior;
    private javax.swing.JButton btGenerarASCII;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaResultado;
    // End of variables declaration//GEN-END:variables
}
