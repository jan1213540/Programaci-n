
package Proyecto;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @Jandry Gutierrez
 */
public class PanelGeneral extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PanelGeneral.class.getName());

    /**
     * Creates new form PanelGeneral
     */
    public PanelGeneral() {
        initComponents();
        // INICIALIZACIÓN Y CONFIGURACIÓN BÁSICA DE LA VENTANA:
        // Crea los componentes, cierra la app al salir y maximiza la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // CONFIGURACIÓN DEL LABEL:
        // Centra el contenido del label tanto horizontal como verticalmente
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setVerticalAlignment(SwingConstants.CENTER);
        // CARGA DE IMAGEN DE FONDO:
        // Establece la imagen inicial como fondo del label
        SetImageLabel(jLabel3, "src/Recursos/FONDO.jpg");
        // LISTENER PARA REDIMENSIONAMIENTO:
        // Vuelve a cargar la imagen cuando cambia el tamaño del panel para adaptarla
        jPEjercicio1.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                SetImageLabel(jLabel3, "src/Recursos/FONDO.jpg");
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IbTitulo = new javax.swing.JLabel();
        IbPie = new javax.swing.JLabel();
        jPMenu = new javax.swing.JPanel();
        btnEjercicio1 = new javax.swing.JButton();
        btnEjercicio2 = new javax.swing.JButton();
        Ejercicio16 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Ejercicio22 = new javax.swing.JButton();
        Ejeercicio9 = new javax.swing.JButton();
        Ejercicio28 = new javax.swing.JButton();
        Ejercicio29 = new javax.swing.JButton();
        Ejercicio33 = new javax.swing.JButton();
        Ejercicio39 = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPEjercicio1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IbTitulo.setBackground(new java.awt.Color(0, 0, 0));
        IbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        IbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbTitulo.setText("PROYECTO PARCIAL 1 - FUNDAMENTOS DE PROGRAMACION");
        IbTitulo.setOpaque(true);
        IbTitulo.setPreferredSize(new java.awt.Dimension(327, 25));
        getContentPane().add(IbTitulo, java.awt.BorderLayout.PAGE_START);

        IbPie.setBackground(new java.awt.Color(255, 255, 255));
        IbPie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IbPie.setForeground(new java.awt.Color(0, 0, 0));
        IbPie.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        IbPie.setText("©UTMACH 2025 - JANDRY GUTIERREZ");
        IbPie.setOpaque(true);
        IbPie.setPreferredSize(new java.awt.Dimension(195, 25));
        getContentPane().add(IbPie, java.awt.BorderLayout.PAGE_END);

        jPMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPMenu.setPreferredSize(new java.awt.Dimension(150, 551));

        btnEjercicio1.setBackground(new java.awt.Color(204, 204, 204));
        btnEjercicio1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEjercicio1.setForeground(new java.awt.Color(0, 0, 0));
        btnEjercicio1.setText("Ejercicio 4");
        btnEjercicio1.setOpaque(true);
        btnEjercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicio1ActionPerformed(evt);
            }
        });

        btnEjercicio2.setBackground(new java.awt.Color(204, 204, 204));
        btnEjercicio2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEjercicio2.setForeground(new java.awt.Color(0, 0, 0));
        btnEjercicio2.setText("Ejercicio 5");
        btnEjercicio2.setOpaque(true);
        btnEjercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicio2ActionPerformed(evt);
            }
        });

        Ejercicio16.setBackground(new java.awt.Color(204, 204, 204));
        Ejercicio16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ejercicio16.setForeground(new java.awt.Color(0, 0, 0));
        Ejercicio16.setText("Ejercicio 16");
        Ejercicio16.setOpaque(true);
        Ejercicio16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio16ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ejercicio 20");
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Ejercicio22.setBackground(new java.awt.Color(204, 204, 204));
        Ejercicio22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ejercicio22.setForeground(new java.awt.Color(0, 0, 0));
        Ejercicio22.setText("Ejercicio 22");
        Ejercicio22.setOpaque(true);
        Ejercicio22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio22ActionPerformed(evt);
            }
        });

        Ejeercicio9.setBackground(new java.awt.Color(204, 204, 204));
        Ejeercicio9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ejeercicio9.setForeground(new java.awt.Color(0, 0, 0));
        Ejeercicio9.setText("Ejercicio 9");
        Ejeercicio9.setOpaque(true);
        Ejeercicio9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejeercicio9ActionPerformed(evt);
            }
        });

        Ejercicio28.setBackground(new java.awt.Color(204, 204, 204));
        Ejercicio28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ejercicio28.setForeground(new java.awt.Color(0, 0, 0));
        Ejercicio28.setText("Ejercicio 28");
        Ejercicio28.setOpaque(true);
        Ejercicio28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio28ActionPerformed(evt);
            }
        });

        Ejercicio29.setBackground(new java.awt.Color(204, 204, 204));
        Ejercicio29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ejercicio29.setForeground(new java.awt.Color(0, 0, 0));
        Ejercicio29.setText("Ejercicio 29");
        Ejercicio29.setOpaque(true);
        Ejercicio29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio29ActionPerformed(evt);
            }
        });

        Ejercicio33.setBackground(new java.awt.Color(204, 204, 204));
        Ejercicio33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ejercicio33.setForeground(new java.awt.Color(0, 0, 0));
        Ejercicio33.setText("Ejercicio 33");
        Ejercicio33.setOpaque(true);
        Ejercicio33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio33ActionPerformed(evt);
            }
        });

        Ejercicio39.setBackground(new java.awt.Color(204, 204, 204));
        Ejercicio39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ejercicio39.setForeground(new java.awt.Color(0, 0, 0));
        Ejercicio39.setText("Ejercicio 39");
        Ejercicio39.setOpaque(true);
        Ejercicio39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio39ActionPerformed(evt);
            }
        });

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/HOME.png"))); // NOI18N
        Home.setBorder(null);
        Home.setContentAreaFilled(false);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Salida boton .png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ejercicio29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEjercicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEjercicio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ejercicio39, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(Ejercicio33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ejercicio28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ejercicio22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ejeercicio9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ejercicio16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEjercicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ejeercicio9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ejercicio16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ejercicio22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ejercicio28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ejercicio29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ejercicio33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ejercicio39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPMenu, java.awt.BorderLayout.LINE_START);

        jPEjercicio1.setLayout(new java.awt.CardLayout());

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPEjercicio1.add(jLabel3, "Fondo");

        getContentPane().add(jPEjercicio1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio1ActionPerformed

        jPEjercicio1.add(new Ejp4_GenerarCaracteresASCII(),"Ejercicio 4");
        try{
            CardLayout cl=(CardLayout)(jPEjercicio1.getLayout());
            cl.show(jPEjercicio1, "Ejercicio 4");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_btnEjercicio1ActionPerformed

    private void btnEjercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio2ActionPerformed
         jPEjercicio1.add(new Ejp5_CaracteresASCII(),"Ejercicio 5");
        try{
            CardLayout cl=(CardLayout)(jPEjercicio1.getLayout());
            cl.show(jPEjercicio1, "Ejercicio 5");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_btnEjercicio2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPEjercicio1.add(new Ejp20_binarioDecimal(),"Ejercicio 20");
        try{
            CardLayout sc=(CardLayout)(jPEjercicio1.getLayout());
            sc.show(jPEjercicio1, "Ejercicio 20");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Ejercicio22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio22ActionPerformed
        // TODO add your handling code here:
        jPEjercicio1.add(new Ejp22_GenerarNumerosPrimos(),"Ejercicio 22");
        try{
            CardLayout sc=(CardLayout)(jPEjercicio1.getLayout());
            sc.show(jPEjercicio1, "Ejercicio 22");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_Ejercicio22ActionPerformed

    private void Ejercicio16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio16ActionPerformed
        // TODO add your handling code here:
        jPEjercicio1.add(new Ejp16_Clasificaionedad(),"Ejercicio 16");
        try{
            CardLayout sc=(CardLayout)(jPEjercicio1.getLayout());
            sc.show(jPEjercicio1, "Ejercicio 16");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_Ejercicio16ActionPerformed

    private void Ejeercicio9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejeercicio9ActionPerformed
         jPEjercicio1.add(new Ejp9_SeriesCombinada(),"Ejercicio 9");
        try{
            CardLayout cl=(CardLayout)(jPEjercicio1.getLayout());
            cl.show(jPEjercicio1, "Ejercicio 9");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_Ejeercicio9ActionPerformed

    private void Ejercicio28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio28ActionPerformed

        jPEjercicio1.add(new Ejp28_SistemaImporte(),"Ejercicio 28");
        try{
            CardLayout cl=(CardLayout)(jPEjercicio1.getLayout());
            cl.show(jPEjercicio1, "Ejercicio 28");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_Ejercicio28ActionPerformed

    private void Ejercicio29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio29ActionPerformed
        jPEjercicio1.add(new Ejp29_NumeroCombinaciones(),"Ejercicio 29");
        try{
            CardLayout cl=(CardLayout)(jPEjercicio1.getLayout());
            cl.show(jPEjercicio1, "Ejercicio 29");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_Ejercicio29ActionPerformed

    private void Ejercicio33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio33ActionPerformed
        jPEjercicio1.add(new Ejp33_TrianguloIDeNumeros(),"Ejercicio 33");
        try{
            CardLayout cl=(CardLayout)(jPEjercicio1.getLayout());
            cl.show(jPEjercicio1, "Ejercicio 33");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_Ejercicio33ActionPerformed

    private void Ejercicio39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio39ActionPerformed
        jPEjercicio1.add(new Ejp39_ImprimirFigura(),"Ejercicio 39");
        try{
            CardLayout cl=(CardLayout)(jPEjercicio1.getLayout());
            cl.show(jPEjercicio1, "Ejercicio 39");
        }catch(Exception ex){
        }
        jPEjercicio1.repaint();
    }//GEN-LAST:event_Ejercicio39ActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        try {
            CardLayout cl = (CardLayout) (jPEjercicio1.getLayout());
            cl.show(jPEjercicio1, "Fondo");
        } catch (Exception ex) {}
        jPEjercicio1.repaint();
        jPEjercicio1.revalidate();        
    }//GEN-LAST:event_HomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de salir?", "Panel General",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (r == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PanelGeneral().setVisible(true));
    }

    private void SetImageLabel(JLabel jLabel3, String root) {
        // CARGA LA IMAGEN DESDE LA RUTA ESPECIFICADA
        ImageIcon image = new ImageIcon(root);
        // REDIMENSIONA LA IMAGEN al tamaño actual del label
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
        // ESTABLECE LA IMAGEN REDIMENSIONADA como icono del label
        jLabel3.setIcon(icon);
        // ACTUALIZA LA VISUALIZACIÓN forzando un repintado
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ejeercicio9;
    private javax.swing.JButton Ejercicio16;
    private javax.swing.JButton Ejercicio22;
    private javax.swing.JButton Ejercicio28;
    private javax.swing.JButton Ejercicio29;
    private javax.swing.JButton Ejercicio33;
    private javax.swing.JButton Ejercicio39;
    private javax.swing.JButton Home;
    private javax.swing.JLabel IbPie;
    private javax.swing.JLabel IbTitulo;
    private javax.swing.JButton btnEjercicio1;
    private javax.swing.JButton btnEjercicio2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPEjercicio1;
    private javax.swing.JPanel jPMenu;
    // End of variables declaration//GEN-END:variables

}
