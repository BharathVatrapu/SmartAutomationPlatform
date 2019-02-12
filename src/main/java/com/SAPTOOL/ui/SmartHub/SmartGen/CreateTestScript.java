package com.SAPTOOL.ui.SmartHub.SmartGen;

import com.SAPTOOL.frameworkbuilder.PageBuilder;
import com.SAPTOOL.tables.ViewProjectsTable;
import com.SAPTOOL.tables.ViewProjectsTableModel;
import com.SAPTOOL.tables.ViewTestScriptTable;
import com.SAPTOOL.tables.ViewTestScriptTableModel;
import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;
import com.SAPTOOL.utils.Json;
import com.SAPTOOL.utils.UnZip;

import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 *
 * @author bvatrapu
 */
public class CreateTestScript extends javax.swing.JFrame {
    public static ViewTestScriptTableModel viewTestScriptTableModel = null;

    /**
     * Creates new form CreateTestScript
     */
    public CreateTestScript() {
        initComponents();
    }

    private void initComponents() {

        txtScriptname = new javax.swing.JLabel();
        btnAddStep = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTestScriptSteps = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblManualSteps = new javax.swing.JTable();
        txtManualSteps = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnSetupTestdata = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CreateTestScript");

        txtScriptname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtScriptname.setText("Scriptname");

        btnAddStep.setText("Add Step");
        btnAddStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStepActionPerformed(evt);
            }
        });

        listTestScriptSteps.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Automation Steps", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane1.setViewportView(listTestScriptSteps);

//        tblManualSteps.setModel(new javax.swing.table.DefaultTableModel(
//                new Object [][] {
//                        {null, null, null, null},
//                        {null, null, null, null},
//                        {null, null, null, null},
//                        {null, null, null, null}
//                },
//                new String [] {
//                        "Title 1", "Title 2", "Title 3", "Title 4"
//                }
//        ));
        jScrollPane2.setViewportView(tblManualSteps);

        txtManualSteps.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtManualSteps.setText("Manual Steps");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnSetupTestdata.setText("Setup TestData");
        btnSetupTestdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupTestdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtScriptname)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnAddStep, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(187, 187, 187)
                                                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnSetupTestdata, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(68, 68, 68))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(502, 502, 502)
                                                                .addComponent(txtManualSteps)
                                                                .addGap(465, 465, 465)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtScriptname)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAddStep, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSetupTestdata, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtManualSteps)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void initLoad(){
        txtScriptname.setText(GlobalConstants.SCRIPT_NAME);
    }

    private void btnAddStepActionPerformed(java.awt.event.ActionEvent evt) {
        AddTestScriptStep addTestScriptStep=new AddTestScriptStep();
        addTestScriptStep.setVisible(true);
        AddTestScriptStep.initLoad();

    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        Path source = Paths.get(GlobalConstants.CONFIG_TEMP_FOLDER_PATH + File.separator + "Temp_TestScript.java");
        Path newdir = Paths.get(GlobalConstants.SELECTED_PROJECT_PATH + File.separator +GlobalConstants.TEST_FRAMEWORK_TESTSUITES_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME.toLowerCase());
        // UnZip.unZipIt(GlobalConstants.Temp_PAGE_MODEL_Path, GlobalConstants.PROJECTS_FOLDER_PATH + File.separator + GlobalConstants.SELECTED_PROJECT+File.separator+"src/test/java/com/testProject/pages");
        //UnZip.unZipIt(GlobalConstants.Config_Temp_page_model_Path, GlobalConstants.CONFIG_TEMP_FOLDER_PATH);
       try {
           Files.copy(source, newdir.resolve(GlobalConstants.SCRIPT_NAME + ".java"), REPLACE_EXISTING);
           //    UnZip.unZipIt(GlobalConstants.Config_Temp_testScript_model_Path, GlobalConstants.SELECTED_PROJECT_PATH + File.separator +GlobalConstants.TEST_FRAMEWORK_TESTSUITES_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME.toLowerCase()+File.separator);
//        Generic.createFolder(GlobalConstants.SELECTED_PROJECT_PATH + File.separator +GlobalConstants.TEST_FRAMEWORK_TESTSUITES_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME.toLowerCase()+File.separator+GlobalConstants.SCRIPT_NAME+".java");
           DefaultListModel defaultListModel = new DefaultListModel();
           defaultListModel.clear();
           for (int j = 0; j <= listTestScriptSteps.getModel().getSize() - 1; j++) {
               defaultListModel.addElement(listTestScriptSteps.getModel().getElementAt(j));
           }
           PageBuilder.scriptBuilder(PageBuilder.script_body_builder(defaultListModel));

           String jpath=GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME+File.separator+GlobalConstants.SCRIPT_NAME.toUpperCase()+".json";
           Json.writeExistingJsonFile(Init.testdataListmodel,GlobalConstants.SCRIPT_NAME.toUpperCase(),jpath);
           JOptionPane.showMessageDialog(null, "Successfully Created Test Script:"+GlobalConstants.SCRIPT_NAME, "Info " , JOptionPane.INFORMATION_MESSAGE);
           dispose();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    private void btnSetupTestdataActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

//    public static void initLoad(){
//        tblProjects.setModel(getModel(GlobalConstants.PROJECTS_FOLDER_PATH));
//        txtProjectName.setText("");
//    }
    public static ViewTestScriptTableModel getModel() {
        int i=1;
        List<ViewTestScriptTable> viewtestScriptList = new ArrayList<ViewTestScriptTable>();
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : Init.TestScript_ManualSteps.entrySet()) {
            ViewTestScriptTable viewTestScriptSteps = new ViewTestScriptTable(i, entry.getKey(), entry.getValue());
            viewtestScriptList.add(viewTestScriptSteps);
            i = i + 1;
        }


        viewTestScriptTableModel = new ViewTestScriptTableModel(viewtestScriptList);

        return viewTestScriptTableModel;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTestScript().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAddStep;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSetupTestdata;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JList<String> listTestScriptSteps;
    public static javax.swing.JTable tblManualSteps;
    private javax.swing.JLabel txtManualSteps;
    public static javax.swing.JLabel txtScriptname;
    // End of variables declaration
}
