/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgb;

import java.awt.Color;

/**
 *
 * @author melikekecelioglu
 */
public class renkpaneli extends javax.swing.JFrame {

    /**
     * Creates new form renkpaneli
     */
    public renkpaneli() {
        initComponents();
        label_Baslik.setText("RGB COLOR RENK SECIMI YAPINIZ");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        label_Baslik = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        slider_kirmizi = new javax.swing.JSlider();
        slider_yesil = new javax.swing.JSlider();
        slider_mavi = new javax.swing.JSlider();
        lbl_kirmizi = new javax.swing.JLabel();
        lbl_yesil = new javax.swing.JLabel();
        lbk_mavi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        slider_kirmizi.setBackground(new java.awt.Color(204, 0, 51));
        slider_kirmizi.setForeground(new java.awt.Color(255, 255, 255));
        slider_kirmizi.setMaximum(255);
        slider_kirmizi.setMinimum(15);
        slider_kirmizi.setPaintLabels(true);
        slider_kirmizi.setPaintTicks(true);
        slider_kirmizi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_kirmiziStateChanged(evt);
            }
        });
        slider_kirmizi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                slider_kirmiziMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slider_kirmiziMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slider_kirmiziMouseClicked(evt);
            }
        });

        slider_yesil.setBackground(new java.awt.Color(51, 255, 51));
        slider_yesil.setForeground(new java.awt.Color(255, 255, 255));
        slider_yesil.setMaximum(255);
        slider_yesil.setMinimum(15);
        slider_yesil.setPaintLabels(true);
        slider_yesil.setPaintTicks(true);
        slider_yesil.setToolTipText("");
        slider_yesil.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_yesilStateChanged(evt);
            }
        });

        slider_mavi.setBackground(new java.awt.Color(0, 0, 204));
        slider_mavi.setForeground(new java.awt.Color(255, 255, 255));
        slider_mavi.setMaximum(255);
        slider_mavi.setMinimum(15);
        slider_mavi.setPaintLabels(true);
        slider_mavi.setPaintTicks(true);
        slider_mavi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_maviStateChanged(evt);
            }
        });

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, slider_kirmizi, org.jdesktop.beansbinding.ELProperty.create("${value}"), jLabel1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, slider_yesil, org.jdesktop.beansbinding.ELProperty.create("${value}"), jLabel2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, slider_mavi, org.jdesktop.beansbinding.ELProperty.create("${value}"), jLabel3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Baslik, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(lbk_mavi))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(slider_kirmizi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slider_mavi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slider_yesil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_yesil)
                                    .addComponent(lbl_kirmizi)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(219, 219, 219)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(label_Baslik, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slider_kirmizi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_kirmizi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slider_yesil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_yesil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slider_mavi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbk_mavi)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slider_kirmiziStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_kirmiziStateChanged

        renkSecimi();
    }//GEN-LAST:event_slider_kirmiziStateChanged

    private void slider_yesilStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_yesilStateChanged

        renkSecimi();
    }//GEN-LAST:event_slider_yesilStateChanged

    private void slider_maviStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_maviStateChanged
        renkSecimi();
        //jPanel
        //&&optiın-shift in bi küçüküğ altındaki k


    }//GEN-LAST:event_slider_maviStateChanged

    private void slider_kirmiziMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider_kirmiziMouseClicked
        // TODO add your handling code here:
    
    }//GEN-LAST:event_slider_kirmiziMouseClicked

    private void slider_kirmiziMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider_kirmiziMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_slider_kirmiziMousePressed

    private void slider_kirmiziMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider_kirmiziMouseReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_slider_kirmiziMouseReleased

    private void renkSecimi() {
        int R, G, B;
        R = slider_kirmizi.getValue();
        G = slider_yesil.getValue();
        B = slider_mavi.getValue();
        jPanel1.setBackground(new Color(R, G, B));
       

    }

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
            java.util.logging.Logger.getLogger(renkpaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(renkpaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(renkpaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(renkpaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new renkpaneli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Baslik;
    private javax.swing.JLabel lbk_mavi;
    private javax.swing.JLabel lbl_kirmizi;
    private javax.swing.JLabel lbl_yesil;
    private javax.swing.JSlider slider_kirmizi;
    private javax.swing.JSlider slider_mavi;
    private javax.swing.JSlider slider_yesil;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}