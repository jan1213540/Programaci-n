package Proyecto;
import javax.swing.JOptionPane;

/**
 *
 * @Jandry Gutierrez
 */
public class Ejp22_GenerarNumerosPrimos extends javax.swing.JPanel {
    public Ejp22_GenerarNumerosPrimos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMaximo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNnaturales = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNprimos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNcompuestos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GENERAR NUMEROS PRIMOS ");
        jLabel1.setOpaque(true);
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NUMEROS NATURALES: ");

        txtMaximo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaximoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESE EL MAXIMO: ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("LOS NUMEROS PRIMOS SON: ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("LOS NUMEROS COMPUESTOS SON: ");

        txtN1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN1ActionPerformed(evt);
            }
        });

        btnGenerar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("GENERAR SERIE");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        txtNnaturales.setColumns(20);
        txtNnaturales.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNnaturales.setRows(5);
        jScrollPane1.setViewportView(txtNnaturales);

        txtNprimos.setColumns(20);
        txtNprimos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNprimos.setRows(5);
        jScrollPane2.setViewportView(txtNprimos);

        txtNcompuestos.setColumns(20);
        txtNcompuestos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNcompuestos.setRows(5);
        jScrollPane3.setViewportView(txtNcompuestos);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtN1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        try {
            int maximo = Integer.parseInt(txtMaximo.getText());
            if (maximo < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros positivos");
                txtMaximo.setText("");
                txtNnaturales.setText("");
                txtNprimos.setText("");
                txtNcompuestos.setText("");
                return; // Agregar return para que no continúe
            }

            String comodin = "";
            String comodinPrimos = "";
            String comodinCompuestos = "";
            int i, j, r, contadorDivisores = 0;

            for (i = 1; i <= maximo; i++) {
                comodin += i + "\n";
            }
            txtNnaturales.setText(comodin);

            for (i = 1; i <= maximo; i++) {
                contadorDivisores = 0;
                for (j = 1; j <= i; j++) {
                    r = i % j;
                    if (r == 0) {
                        contadorDivisores++;
                    }
                }
                if (contadorDivisores == 2) {
                    comodinPrimos += i + "\n";
                }
            }
            txtNprimos.setText(comodinPrimos);
            for (i = 1; i <= maximo; i++) {
                contadorDivisores = 0;
                // Contar divisores
                for (j = 1; j <= i; j++) {
                    r = i % j;
                    if (r == 0) {
                        contadorDivisores++;
                    }
                }
                if (contadorDivisores > 2) {
                    comodinCompuestos += i + "\n";
                }
            }
            txtNcompuestos.setText(comodinCompuestos);

            txtN1.setText("El número 1 no es primo ni compuesto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo valores numericos validos");
            txtMaximo.setText("");
            txtNnaturales.setText("");
            txtNprimos.setText("");
            txtNcompuestos.setText("");
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaximoActionPerformed

    }//GEN-LAST:event_txtMaximoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        txtMaximo.setText("");
        txtNnaturales.setText("");
        txtNprimos.setText("");
        txtNcompuestos.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtMaximo;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextArea txtNcompuestos;
    private javax.swing.JTextArea txtNnaturales;
    private javax.swing.JTextArea txtNprimos;
    // End of variables declaration//GEN-END:variables
}
