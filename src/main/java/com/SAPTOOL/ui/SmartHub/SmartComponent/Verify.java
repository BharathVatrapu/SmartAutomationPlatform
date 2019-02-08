package com.SAPTOOL.ui.SmartHub.SmartComponent;


import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.io.File;

/**
 *
 * @author bvatrapu
 */
public class Verify extends javax.swing.JFrame {

    public static String Selected_Page=null;
    /**
     * Creates new form Verify
     */
    public Verify() {
        initComponents();
    }


    private void initComponents() {

        comboPage = new javax.swing.JComboBox<>();
        txtPage = new javax.swing.JLabel();
        btnObjects = new javax.swing.JButton();
        btnMethods = new javax.swing.JButton();
        btnActions = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listVerificationPoint = new javax.swing.JList<>();
        btnDone = new javax.swing.JButton();
        cbVerifyUrl = new javax.swing.JCheckBox();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPage.setText("Page:  ");

        btnObjects.setText("Objects");
        btnObjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjectsActionPerformed(evt);
            }
        });

        btnMethods.setText("Methods");
        btnMethods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethodsActionPerformed(evt);
            }
        });

        btnActions.setText("Actions");
        btnActions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionsActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listVerificationPoint);

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        cbVerifyUrl.setText("Verify Url");

        btnDelete.setText("Del");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(41, 41, 41)
                                                                .addComponent(btnObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(73, 73, 73)
                                                                .addComponent(btnMethods)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnActions, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(txtPage)
                                                                                .addGap(64, 64, 64)
                                                                                .addComponent(comboPage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(57, 57, 57)
                                                                                .addComponent(cbVerifyUrl)
                                                                                .addGap(2, 2, 2)))))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDelete))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(239, 239, 239)
                                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPage)
                                        .addComponent(cbVerifyUrl))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMethods, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnActions, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDelete))
                                .addGap(36, 36, 36)
                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void initLoad(){
        Selected_Page=GlobalConstants.Method_Selected_Page_Name;
        String[] pages=null;
        String page=null;

        pages = Generic.getAllFileNames(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER);
        for(int i=0;i<=pages.length-1;i++){
            if(pages[i].contains(".java")){
                page=pages[i].replace(".java", "");
            }
            comboPage.addItem(page);
        }
    }

    private void btnObjectsActionPerformed(java.awt.event.ActionEvent evt) {

        GlobalConstants.Method_Selected_Page_Name = comboPage.getSelectedItem().toString();

        PageObjects pageObjects=new PageObjects();
        pageObjects.setVisible(true);
        pageObjects.initLoad();
    }


    private void btnMethodsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnActionsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {
        String veri=null;
        String final_veri=null;
        GlobalConstants.Method_Selected_Page_Name = Selected_Page;
        DefaultListModel defaultListModelVerify=new DefaultListModel();
        defaultListModelVerify.clear();
        for (int i = 0; i < listVerificationPoint.getModel().getSize(); i++) {
            if(veri==null){
                veri=String.valueOf(listVerificationPoint.getModel().getElementAt(i));
            } else {
                veri = veri +" && "+String.valueOf(listVerificationPoint.getModel().getElementAt(i));
            }
        }
        final_veri = "return verify("+veri+")";
        Init.page_method_steps_ListModel.addElement(final_veri);


        SmartComponent.listPageMethodSteps.setModel(Init.page_method_steps_ListModel);
        GlobalConstants.Method_Verify=false;
        dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnActions;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnMethods;
    private javax.swing.JButton btnObjects;
    private javax.swing.JCheckBox cbVerifyUrl;
    private javax.swing.JComboBox<String> comboPage;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> listVerificationPoint;
    private javax.swing.JLabel txtPage;
    // End of variables declaration
}
