package com.mycompany.sosr_rs;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jpnButtons = new javax.swing.JPanel();
        btnRegstDisease = new javax.swing.JButton();
        btnRegstSymptom = new javax.swing.JButton();
        btnSearchDisease = new javax.swing.JButton();
        btnSearchSymptom = new javax.swing.JButton();
        btnLocalizeDisease = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("MAIN MENU");

        btnRegstDisease.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnRegstDisease.setText("REGISTER DISEASE");
        btnRegstDisease.setPreferredSize(new java.awt.Dimension(150, 150));
        btnRegstDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegstDiseaseActionPerformed(evt);
            }
        });

        btnRegstSymptom.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnRegstSymptom.setText("REGISTER SYMPTOM");
        btnRegstSymptom.setPreferredSize(new java.awt.Dimension(150, 150));
        btnRegstSymptom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegstSymptomActionPerformed(evt);
            }
        });

        btnSearchDisease.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSearchDisease.setText("SEARCH DISEASE");
        btnSearchDisease.setPreferredSize(new java.awt.Dimension(150, 150));
        btnSearchDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDiseaseActionPerformed(evt);
            }
        });

        btnSearchSymptom.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSearchSymptom.setText("SEARCH SYMPTOM");
        btnSearchSymptom.setPreferredSize(new java.awt.Dimension(150, 150));
        btnSearchSymptom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSymptomActionPerformed(evt);
            }
        });

        btnLocalizeDisease.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnLocalizeDisease.setText("LOCALIZE DISEASE");
        btnLocalizeDisease.setPreferredSize(new java.awt.Dimension(150, 150));
        btnLocalizeDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizeDiseaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonsLayout = new javax.swing.GroupLayout(jpnButtons);
        jpnButtons.setLayout(jpnButtonsLayout);
        jpnButtonsLayout.setHorizontalGroup(
            jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonsLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSearchSymptom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchDisease, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegstDisease, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegstSymptom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLocalizeDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jpnButtonsLayout.setVerticalGroup(
            jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegstDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegstSymptom, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchDisease, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchSymptom, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizeDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegstDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegstDiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegstDiseaseActionPerformed

    private void btnLocalizeDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizeDiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLocalizeDiseaseActionPerformed

    private void btnRegstSymptomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegstSymptomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegstSymptomActionPerformed

    private void btnSearchDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchDiseaseActionPerformed

    private void btnSearchSymptomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSymptomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchSymptomActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocalizeDisease;
    private javax.swing.JButton btnRegstDisease;
    private javax.swing.JButton btnRegstSymptom;
    private javax.swing.JButton btnSearchDisease;
    private javax.swing.JButton btnSearchSymptom;
    private javax.swing.JPanel jpnButtons;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
