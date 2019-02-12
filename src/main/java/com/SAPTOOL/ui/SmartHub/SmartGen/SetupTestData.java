package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.GlobalConstants;
import com.SAPTOOL.utils.Json;

import javax.swing.*;
import java.io.File;

/**
 *
 * @author bvatrapu
 */
public class SetupTestData extends javax.swing.JFrame {
    public static DefaultListModel testdataListmodel= new DefaultListModel();
    /**
     * Creates new form SetupTestData
     */
    public SetupTestData() {
        initComponents();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputKey = new javax.swing.JTextField();
        txtValue = new javax.swing.JLabel();
        inputValue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTestData = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SetupTestData");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TestData Setup", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Key:  ");
        jLabel1.setToolTipText("");

        txtValue.setText("Value:  ");
        txtValue.setToolTipText("");

        jScrollPane1.setViewportView(listTestData);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(inputKey, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(56, 56, 56)
                                                                .addComponent(txtValue)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(inputValue, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(355, 355, 355)
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputValue, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(inputKey)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtValue)
                                                        .addComponent(jLabel1))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        btnCreate.setText("Create");
        btnCreate.setToolTipText("");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void initLoad(){
//        String jpath= GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME+File.separator+GlobalConstants.SCRIPT_NAME.toUpperCase()+".json";
//        testdataListmodel=Json.getKeyandValues(jpath);
//        listTestData.setModel(testdataListmodel);

    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        boolean flag = true;
        if (inputKey.getText().isEmpty()||inputValue.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Enter Test data key && value");
            flag=false;
            //return;
        }
        if(flag) {
            testdataListmodel.addElement(inputKey.getText()+"="+inputValue.getText());
            listTestData.setModel(testdataListmodel);
            listTestData.setSelectedIndex(0);
            inputValue.setText("");
            inputKey.setText("");
        }
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        String[] testdata=null;
       // String jpath=GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME+File.separator+GlobalConstants.SCRIPT_NAME.toUpperCase()+".json";
       // Json.writeExistingJsonFile(testdataListmodel,GlobalConstants.SCRIPT_NAME,jpath);
//        SetupTestArgs.comboTestDataKey.removeAllItems();
        for (int j=0;j<=testdataListmodel.size()-1;j++) {
            if(Init.testdataListmodel.get(j).toString().contains("=")){
                testdata=testdataListmodel.get(j).toString().split("=");
                Init.testdataListmodel.addElement(testdataListmodel.get(j).toString());
                //   testdataKey=testdata[0];
                SetupTestArgs.comboTestDataKey.addItem(testdata[0]);
            }

        }
        //SetupTestArgs.initLoad();
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetupTestData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreate;
    private javax.swing.JTextField inputKey;
    private javax.swing.JTextField inputValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> listTestData;
    private javax.swing.JLabel txtValue;
    // End of variables declaration
}

