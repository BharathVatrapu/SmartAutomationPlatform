package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.io.File;

/**
 *
 * @author bvatrapu
 */
public class AddModule extends javax.swing.JFrame {

    /**
     * Creates new form AddModule
     */
    public AddModule() {
        initComponents();
    }


    private void initComponents() {

        inputModuleName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        txtModuleName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddModule");

        inputModuleName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inputModuleName.setForeground(new java.awt.Color(0, 0, 153));

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(51, 0, 153));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtModuleName.setText("Module Name:   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(165, 165, 165)
                                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtModuleName)
                                                        .addComponent(inputModuleName, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtModuleName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputModuleName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        createFolder(GlobalConstants.SELECTED_PROJECT_PATH+File.separator+GlobalConstants.TEST_FRAMEWORK_TESTSUITES_FOLDER+File.separator+inputModuleName.getText().toLowerCase());
        createFolder(GlobalConstants.SELECTED_PROJECT_PATH+File.separator+GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER+File.separator+inputModuleName.getText().toLowerCase());
        NewTestScript.initLoad();
        NewTestScript.comboModule.setSelectedItem(inputModuleName.getText());
        dispose();
    }

    public void createFolder(String dirPath){
        try {
            File file = new File(dirPath);
            if (file.exists()) {
                JOptionPane.showMessageDialog(null, inputModuleName.getText()+"  Already Exists..", "Warning " , JOptionPane.INFORMATION_MESSAGE);
            } else {
                file.mkdir();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCreate;
    private javax.swing.JTextField inputModuleName;
    private javax.swing.JLabel txtModuleName;
    // End of variables declaration
}

