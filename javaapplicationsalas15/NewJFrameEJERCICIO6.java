/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationsalas15;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author SENA
 */
public class NewJFrameEJERCICIO6 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameEJERCICIO6
     */
    public NewJFrameEJERCICIO6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCnumeros = new javax.swing.JComboBox<>();
        jBpares = new javax.swing.JButton();
        jBimpares = new javax.swing.JButton();
        jTresultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCnumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCnumerosActionPerformed(evt);
            }
        });

        jBpares.setText("PARES");
        jBpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBparesActionPerformed(evt);
            }
        });

        jBimpares.setText("IMPARES");
        jBimpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimparesActionPerformed(evt);
            }
        });

        jTresultado.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCnumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBpares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBimpares))
                    .addComponent(jTresultado))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCnumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBpares)
                    .addComponent(jBimpares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBparesActionPerformed
      int i;
      
      DefaultComboBoxModel modelo = new DefaultComboBoxModel();
      
      for (i=0;i<10;i+=2)
      {
      modelo.addElement("Nº"+i);
      }
      jCnumeros.setModel(modelo);
    }//GEN-LAST:event_jBparesActionPerformed

    private void jBimparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimparesActionPerformed
        int i;
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        for (i=1;i<10;i+=2)
        {
        modelo.addElement("Nº"+i);
        }
        jCnumeros.setModel(modelo);
    }//GEN-LAST:event_jBimparesActionPerformed

    private void jCnumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCnumerosActionPerformed
       jTresultado.setText(jCnumeros.getSelectedItem().toString());
    }//GEN-LAST:event_jCnumerosActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrameEJERCICIO6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameEJERCICIO6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameEJERCICIO6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameEJERCICIO6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameEJERCICIO6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBimpares;
    private javax.swing.JButton jBpares;
    private javax.swing.JComboBox<String> jCnumeros;
    private javax.swing.JTextField jTresultado;
    // End of variables declaration//GEN-END:variables
}
