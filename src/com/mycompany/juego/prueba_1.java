package com.mycompany.juego;
//IMPORTAMOS
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class prueba_1 extends javax.swing.JFrame {

    public prueba_1() {
        initComponents();
    }
    //Icono del JFrame
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/fondogeneral.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_torre = new javax.swing.JButton();
        bt_mini2 = new javax.swing.JButton();
        bt_mini3 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        presentacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        bt_torre.setBackground(new java.awt.Color(120, 107, 147));
        bt_torre.setForeground(new java.awt.Color(243, 245, 246));
        bt_torre.setText("Torre de Hanoi");
        bt_torre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_torreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_torreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_torreMouseExited(evt);
            }
        });
        bt_torre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_torreActionPerformed(evt);
            }
        });

        bt_mini2.setBackground(new java.awt.Color(120, 107, 147));
        bt_mini2.setForeground(new java.awt.Color(243, 245, 246));
        bt_mini2.setText("Laberinto ");
        bt_mini2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_mini2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_mini2MouseExited(evt);
            }
        });
        bt_mini2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mini2ActionPerformed(evt);
            }
        });

        bt_mini3.setBackground(new java.awt.Color(120, 107, 147));
        bt_mini3.setForeground(new java.awt.Color(243, 245, 246));
        bt_mini3.setText("Figuras");
        bt_mini3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_mini3MouseEntered(evt);
            }
        });
        bt_mini3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mini3ActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        titulo.setText("¡Elige algún minijuego ahora!");

        presentacion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(presentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_torre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_mini2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_mini3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titulo)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_torre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mini2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mini3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        bt_torre.getAccessibleContext().setAccessibleName("boton_1");
        bt_mini2.getAccessibleContext().setAccessibleName("boton_2");
        bt_mini3.getAccessibleContext().setAccessibleName("boton_3");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
//EVENTO MOUSE DENTRO DEL BOTÓN TORRE
    private void bt_torreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_torreMouseEntered
        bt_torre.setBackground(new Color(74,62,100));
        presentacion.setText("<html><center>Es un famoso rompecabezas matemático que consiste en mover una serie de discos de diferentes tamaños de una varilla a otra, siguiendo ciertas reglas.<p>¡VAMOS A JUGARLO!");
    }//GEN-LAST:event_bt_torreMouseEntered
    
//EVENTO MOUSE FUERA DEL BOTÓN TORRE
    private void bt_torreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_torreMouseExited
        bt_torre.setBackground(new Color(120,107,147));
        presentacion.setText("");
    }//GEN-LAST:event_bt_torreMouseExited
   
//EVENTO BOTÓN CLICKADO
    private void bt_torreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_torreMouseClicked
        torre_hanoi mtorre_hanoi = new torre_hanoi();
        mtorre_hanoi.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_torreMouseClicked

    private void bt_torreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_torreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_torreActionPerformed

    private void bt_mini2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mini2ActionPerformed
        JuegoLaberinto MJL = new JuegoLaberinto();
        MJL.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_mini2ActionPerformed

    private void bt_mini3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mini3ActionPerformed
        FigurasGeometricasApp MFGA = new FigurasGeometricasApp();
        MFGA.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_mini3ActionPerformed

    private void bt_mini2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mini2MouseEntered
        bt_mini2.setBackground(new Color(74,62,100));
        presentacion.setText("<html><center>El jugador debe encontrar la salida del laberinto resolviendo correctamente las operaciones matemáticas presentadas en cada nivel.<p>¡VAMOS A JUGARLO!");   
    }//GEN-LAST:event_bt_mini2MouseEntered

    private void bt_mini2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mini2MouseExited
        bt_mini2.setBackground(new Color(120,107,147));
        presentacion.setText("");
    }//GEN-LAST:event_bt_mini2MouseExited

    private void bt_mini3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mini3MouseEntered
        bt_mini3.setBackground(new Color(74,62,100));
        presentacion.setText("<html><center>El jugador debe elegir la opción que corresponde a la figura geométrica mostrada.<p>¡VAMOS A JUGARLO!");
    }//GEN-LAST:event_bt_mini3MouseEntered

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prueba_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_mini2;
    private javax.swing.JButton bt_mini3;
    private javax.swing.JButton bt_torre;
    private javax.swing.JLabel presentacion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
