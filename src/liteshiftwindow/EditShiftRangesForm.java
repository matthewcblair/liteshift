/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liteshiftwindow;

import java.awt.Font;
import java.awt.Frame;
import java.text.DecimalFormat;
import javax.swing.JLabel;

/**
 *
 * @author Matt
 */
public class EditShiftRangesForm extends javax.swing.JFrame {

    /**
     * Creates new form editShiftRangesForm
     */
    public EditShiftRangesForm() {
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

        jPanel1 = new javax.swing.JPanel();
        slideMorning = new com.visutools.nav.bislider.BiSlider();
        slideAfternoon = new com.visutools.nav.bislider.BiSlider();
        slideEvening = new com.visutools.nav.bislider.BiSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelMorningRange = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelAfternoonRange = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelEveningRange = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slideMorning.setDecimalFormater(new DecimalFormat("#':00'"));
        slideMorning.setFont(new Font("SansSerif", Font.ITALIC, 0));
        slideMorning.setMaximumColor(new java.awt.Color(51, 255, 51));
        slideMorning.setMaximumValue(24.0);
        slideMorning.setMinimumColor(new java.awt.Color(51, 255, 51));
        slideMorning.setPrecise(true);
        slideMorning.setSegmentSize(1.0);
        slideMorning.setUnit(":00");
        slideMorning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slideMorningMouseReleased(evt);
            }
        });
        jPanel1.add(slideMorning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 557, 63));

        slideAfternoon.setDecimalFormater(new DecimalFormat("#':00'"));
        slideAfternoon.setFont(new Font("SansSerif", Font.ITALIC, 0));
        slideAfternoon.setDefaultColor(new java.awt.Color(0, 229, 0));
        slideAfternoon.setMaximumColor(new java.awt.Color(51, 255, 51));
        slideAfternoon.setMaximumValue(24.0);
        slideAfternoon.setMinimumColor(new java.awt.Color(51, 255, 51));
        slideAfternoon.setPrecise(true);
        slideAfternoon.setSegmentSize(1.0);
        slideAfternoon.setUnit(":00");
        slideAfternoon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slideAfternoonMouseReleased(evt);
            }
        });
        jPanel1.add(slideAfternoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 557, 63));

        slideEvening.setDecimalFormater(new DecimalFormat("#':00'"));
        slideEvening.setFont(new Font("SansSerif", Font.ITALIC, 0));
        slideEvening.setMaximumColor(new java.awt.Color(51, 255, 51));
        slideEvening.setMaximumValue(24.0);
        slideEvening.setMinimumColor(new java.awt.Color(51, 255, 51));
        slideEvening.setPrecise(true);
        slideEvening.setSegmentSize(1.0);
        slideEvening.setUnit(":00");
        slideEvening.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slideEveningMouseReleased(evt);
            }
        });
        jPanel1.add(slideEvening, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 557, 63));

        jLabel3.setText("          2AM       4AM       6AM       8AM     10AM    12PM     2PM       4PM      6PM       8PM     10PM ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setText("          2AM       4AM       6AM       8AM     10AM    12PM     2PM       4PM      6PM       8PM     10PM ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel1.setText("Morning");

        labelMorningRange.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
        labelMorningRange.setText("12AM-12AM");

        jLabel5.setText("Afternoon");

        labelAfternoonRange.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
        labelAfternoonRange.setText("12AM-12AM");

        jLabel7.setText("Evening");

        labelEveningRange.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
        labelEveningRange.setText("12AM-12AM");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Shift Time Ranges");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMorningRange, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAfternoonRange, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEveningRange, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMorningRange)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAfternoonRange)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEveningRange))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void updateAfterRelease(java.awt.event.MouseEvent evt, com.visutools.nav.bislider.BiSlider slider, JLabel labelTime){
        String minString = "AM";
        String maxString = "PM";
        double selectionMin = slider.getMinimumColoredValue();
        double selectionMax = slider.getMaximumColoredValue();
        slider.setColoredValues(Math.round(selectionMin), Math.round(selectionMax));
        
        if(Math.round(selectionMin) >= 12 && Math.round(selectionMin) < 24){
            if(Math.round(selectionMin) != 12)
                selectionMin -= 12;
            minString = "PM";
        }
        else if(Math.round(selectionMin) == 24){
            selectionMin = 12;
            minString = "AM";
        }
        else{
            if(Math.round(selectionMin) == 0)
                selectionMin = 12;
            minString = "AM";
        }
                
        if(Math.round(selectionMax) >= 12 && Math.round(selectionMax) < 24){
            if(Math.round(selectionMax) != 12)
                selectionMax -= 12;
            maxString = "PM";
        }
        else if(Math.round(selectionMax) == 24){
            selectionMax = 12;
            maxString = "AM";
        }
        else{
            if(Math.round(selectionMax) == 0)
                selectionMax = 12;
            maxString = "AM";
        }
        
        labelTime.setText(Long.toString(Math.round(selectionMin)) + minString + "-" + Long.toString(Math.round(selectionMax)) + maxString);
    }
    
    private void slideMorningMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideMorningMouseReleased
        //biSlider1.setMinimumValue(10);
        //biSlider1.setFont(new Font("SansSerif", Font.ITALIC, 1));
        //DecimalFormat df = new DecimalFormat("#.0");
        //time = Double.valueOf(df.format(time));
        //System.out.println(time);
        /*
        getMinimumColoredValue()
        getMaximumColoredValue()
        biSlider1.setColoredValues()
        */
        updateAfterRelease(evt, slideMorning, labelMorningRange);

    }//GEN-LAST:event_slideMorningMouseReleased

    private void slideAfternoonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideAfternoonMouseReleased
        updateAfterRelease(evt, slideAfternoon, labelAfternoonRange);
    }//GEN-LAST:event_slideAfternoonMouseReleased

    private void slideEveningMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideEveningMouseReleased
        updateAfterRelease(evt, slideEvening, labelEveningRange);
    }//GEN-LAST:event_slideEveningMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Frame [] frameArray = Frame.getFrames();
        boolean firstRun = false;
        for (Frame curFrame : frameArray){
            if (curFrame.getTitle().equals("Setup Wizard")) {
                firstRunWizard frw = (firstRunWizard) curFrame;
                firstRun = true;
                setupShiftRanges(frw);
            }
        }
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void setupShiftRanges(firstRunWizard frw){
        
        frw.labelOpenTime.setText(  ((labelMorningRange.getText()).split("-"))[0]  );
        frw.labelCloseTime.setText(  ((labelEveningRange.getText()).split("-"))[1]  );
        frw.labelMorningRange.setText(labelMorningRange.getText());
        frw.labelAfternoonRange.setText(labelAfternoonRange.getText());
        frw.labelEveningRange.setText(labelEveningRange.getText());
        this.dispose();
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
            java.util.logging.Logger.getLogger(EditShiftRangesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditShiftRangesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditShiftRangesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditShiftRangesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditShiftRangesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAfternoonRange;
    private javax.swing.JLabel labelEveningRange;
    private javax.swing.JLabel labelMorningRange;
    private com.visutools.nav.bislider.BiSlider slideAfternoon;
    private com.visutools.nav.bislider.BiSlider slideEvening;
    private com.visutools.nav.bislider.BiSlider slideMorning;
    // End of variables declaration//GEN-END:variables
}
