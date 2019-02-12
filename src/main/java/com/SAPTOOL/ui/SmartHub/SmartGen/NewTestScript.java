package com.SAPTOOL.ui.SmartHub.SmartGen;

import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;
import com.SAPTOOL.utils.Json;

import javax.swing.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bvatrapu
 */
public class NewTestScript extends javax.swing.JFrame {
    public static HashMap<String,String> addEnvvalu_Hashmap=null;

    /**
     * Creates new form NewTestScript1
     */
    public NewTestScript() {
        initComponents();
    }


    private void initComponents() {

        txtMethodName = new javax.swing.JLabel();
        inputScriptName = new javax.swing.JTextField();
        txtModule = new javax.swing.JLabel();
        comboModule = new javax.swing.JComboBox<>();
        btnAddmodule = new javax.swing.JButton();
        txtENV = new javax.swing.JLabel();
        comboEnv = new javax.swing.JComboBox<>();
        btnAddEnv = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputKey = new javax.swing.JTextField();
        txtValue = new javax.swing.JLabel();
        inputValue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTestData = new javax.swing.JList<>();
        btnAddTestData = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NewTestScript");

        txtMethodName.setText("Script Name: ");

        //inputScriptName.setText("    ");

        txtModule.setText("Module:  ");

        btnAddmodule.setText("+");
        btnAddmodule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddmoduleActionPerformed(evt);
            }
        });

        txtENV.setText("ENV:  ");

        btnAddEnv.setText("+");
        btnAddEnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnvActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TestData Setup", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Key:  ");
        jLabel1.setToolTipText("");

        txtValue.setText("Value:  ");
        txtValue.setToolTipText("");

        jScrollPane1.setViewportView(listTestData);

        btnAddTestData.setText("Add");
        btnAddTestData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTestDataActionPerformed(evt);
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
                                                .addComponent(btnAddTestData, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(btnAddTestData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtMethodName)
                                                .addGap(34, 34, 34)
                                                .addComponent(inputScriptName, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(txtModule)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(comboModule, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnAddmodule)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                                                .addComponent(txtENV)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(comboEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnAddEnv)))
                                                .addGap(29, 29, 29))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(344, 344, 344))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtMethodName)
                                        .addComponent(inputScriptName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtModule)
                                        .addComponent(comboModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddmodule)
                                        .addComponent(txtENV)
                                        .addComponent(comboEnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddEnv))
                                .addGap(26, 26, 26)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void initLoad(){
        comboModule.removeAllItems();
        comboEnv.removeAllItems();
        String[] allModules=null;
        String moduleName=null;

        allModules = Generic.getAllFileNames(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTSUITES_FOLDER+"/");
        for(int i=0;i<=allModules.length-1;i++){
            comboModule.addItem(allModules[i]);
        }
        addEnvvalu_Hashmap =new HashMap<String,String>();
        addEnvvalu_Hashmap = Generic.readAllProp(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+GlobalConstants.SELECTED_PROJECT+File.separator+ "environment.properties");
        for (Map.Entry<String, String> entry : addEnvvalu_Hashmap.entrySet()) {
            comboEnv.addItem(entry.getValue());
        }
    }
    private void btnAddmoduleActionPerformed(java.awt.event.ActionEvent evt) {
            AddModule addModule=new AddModule();
            addModule.setVisible(true);
    }
    private void btnAddEnvActionPerformed(java.awt.event.ActionEvent evt) {
        AddEnvironment addEnvironment=new AddEnvironment();
        addEnvironment.setVisible(true);
    }
    private static void btnAddTestDataActionPerformed(java.awt.event.ActionEvent evt) {
        boolean flag = true;
        if (inputKey.getText().isEmpty()||inputValue.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Enter Test data key && value");
            flag=false;
            //return;
        }
        if(flag) {
            Init.testdataListmodel.addElement(inputKey.getText()+"="+inputValue.getText());
            listTestData.setModel(Init.testdataListmodel);
            listTestData.setSelectedIndex(0);
            inputValue.setText("");
            inputKey.setText("");
        }

    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {
        GlobalConstants.TEST_MODULE_NAME=comboModule.getSelectedItem().toString();
//        GlobalConstants.TEST_ENV_NAME=comboEnv.getSelectedItem().toString();
        //Generic.writeTestdataJsonFile(testdataListmodel,inputScriptName.getText());
        GlobalConstants.SCRIPT_NAME=inputScriptName.getText();
//        String jpath=GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME+File.separator+inputScriptName.getText().toUpperCase()+".json";
        //Json.writeExistingJsonFile(testdataListmodel,inputScriptName.getText(),jpath);
       CreateTestScript createTestScript=new CreateTestScript();
       createTestScript.setVisible(true);
        CreateTestScript.initLoad();
        Init.TestScript_ManualSteps=new HashMap<String,String>();
       dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
               /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTestScript().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAddTestData;
    private javax.swing.JButton btnAddEnv;
    private javax.swing.JButton btnAddmodule;
    private javax.swing.JButton btnNext;
    public static javax.swing.JComboBox<String> comboEnv;
    public static javax.swing.JComboBox<String> comboModule;
    public static javax.swing.JTextField inputKey;
    public static javax.swing.JTextField inputScriptName;
    public static javax.swing.JTextField inputValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> listTestData;
    private javax.swing.JLabel txtENV;
    private javax.swing.JLabel txtMethodName;
    private javax.swing.JLabel txtModule;
    private javax.swing.JLabel txtValue;
    // End of variables declaration
}
