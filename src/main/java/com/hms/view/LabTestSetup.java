/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hms.view;

import com.hms.controller.LabTestSetupController;
import com.hms.controller.RouteController;
import java.util.List;
import java.util.ArrayList;
import com.hms.model.SaveingData;
import com.hms.model.TestReport;

/**
 *
 * @author Tamzid
 *
 */
public class LabTestSetup extends javax.swing.JFrame {

    RouteController route = new RouteController();

    public LabTestSetup() {

        initComponents();
        //populateTestTypeComboBox();
        //comboBoxTestType.setModel(new javax.swing.DefaultComboBoxModel<>(comboBoxTestType.validate());

//        checkBoxTestType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
//            "Blood Test",
//            "Urine Test",
//            "X-Ray",
//            "MRI-Scan"
//        }));
    }

    private void populateTestTypeComboBox(List<String> testTypes) {
        comboBoxTestType.removeAllItems();
        for (String testType : testTypes) {
            comboBoxTestType.addItem(testType);
        }
    }

    private void updateTestTypeComboBox(String type) {
        List<String> testTypes = new ArrayList<>();
        if ("Pathological".equals(type)) {
            for (String testType : route.getPathologicalTestTypes()) {
                testTypes.add(testType);
            }
        } else if ("Radiological".equals(type)) {
            for (String testType : route.getRadiologicalTestType()) {
                testTypes.add(testType);
            }
        }
        populateTestTypeComboBox(testTypes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTestType = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        labelTitle = new javax.swing.JLabel();
        labelCost = new javax.swing.JLabel();
        labelAvailable = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        checkBoxAvailable = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        outputlabel = new javax.swing.JLabel();
        success = new javax.swing.JLabel();
        btnGoToHome = new javax.swing.JButton();
        labelType = new javax.swing.JLabel();
        comboBoxTestType = new javax.swing.JComboBox<>();
        RadioBtnPathological = new javax.swing.JRadioButton();
        RadioBtnRadiological = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        txtTestType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtTestType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestTypeActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setText("Test Title :");

        labelCost.setText("Test Cost :");

        labelAvailable.setText("Available  :");

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        checkBoxAvailable.setText("Yes");
        checkBoxAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAvailableActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        success.setForeground(java.awt.Color.green);

        btnGoToHome.setText("Back");
        btnGoToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToHomeActionPerformed(evt);
            }
        });

        labelType.setText("Test type :");

        comboBoxTestType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxTestType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTestTypeActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioBtnPathological);
        RadioBtnPathological.setText("Pathological");
        RadioBtnPathological.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnPathologicalActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioBtnRadiological);
        RadioBtnRadiological.setText("Radiological");
        RadioBtnRadiological.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnRadiologicalActionPerformed(evt);
            }
        });

        jLabel1.setText("Test Group");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(success, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(checkBoxAvailable))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCost, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboBoxTestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSubmit)
                                                .addGap(68, 68, 68)
                                                .addComponent(btnCancel))
                                            .addComponent(outputlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(labelType))
                                .addGap(87, 87, 87)
                                .addComponent(RadioBtnPathological)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RadioBtnRadiological)))))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGoToHome))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RadioBtnPathological)
                    .addComponent(RadioBtnRadiological))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelType)
                    .addComponent(comboBoxTestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxAvailable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(success, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnCancel))
                .addGap(37, 37, 37)
                .addComponent(outputlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnGoToHome))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if (txtTitle.getText().isEmpty() || txtCost.getText().isEmpty()) {
            success.setForeground(java.awt.Color.red);
            success.setText("Error: All fields are required!");
        } else {
            try {
                LabTestSetupController pTest = new LabTestSetupController(
                        txtTitle.getText(),
                        comboBoxTestType.getSelectedItem().toString(),
                        Double.parseDouble(txtCost.getText()),
                        checkBoxAvailable.isSelected()
                );

                success.setForeground(java.awt.Color.green);
                success.setText("Add Success!");
                outputlabel.setText(pTest.testSetup());
                // Clear fields after submission

                pTest.saveFile();//save data

                txtTitle.setText("");
                txtCost.setText("");
                comboBoxTestType.setSelectedIndex(0);
                checkBoxAvailable.setSelected(false);

            } catch (NumberFormatException e) {
                success.setForeground(java.awt.Color.red);
                success.setText("Error: Invalid cost format!");

            }

        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void checkBoxAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAvailableActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnGoToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToHomeActionPerformed
        route.viewHome();
        this.dispose();
    }//GEN-LAST:event_btnGoToHomeActionPerformed

    private void txtTestTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTestTypeActionPerformed

    private void comboBoxTestTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTestTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTestTypeActionPerformed

    private void RadioBtnPathologicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnPathologicalActionPerformed
        // TODO add your handling code here:
        updateTestTypeComboBox("Pathological");
    }//GEN-LAST:event_RadioBtnPathologicalActionPerformed

    private void RadioBtnRadiologicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnRadiologicalActionPerformed
        // TODO add your handling code here:
        updateTestTypeComboBox("Radiological");
    }//GEN-LAST:event_RadioBtnRadiologicalActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LabTestSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LabTestSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LabTestSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LabTestSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LabTestSetup().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioBtnPathological;
    private javax.swing.JRadioButton RadioBtnRadiological;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnGoToHome;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox checkBoxAvailable;
    private javax.swing.JComboBox<String> comboBoxTestType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAvailable;
    private javax.swing.JLabel labelCost;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel outputlabel;
    private javax.swing.JLabel success;
    private javax.swing.JTextField txtCost;
    private javax.swing.JComboBox<String> txtTestType;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
