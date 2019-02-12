package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.GlobalConstants;
import com.SAPTOOL.utils.Json;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bvatrapu
 */
public class SetupTestArgs extends javax.swing.JFrame {
    static DefaultListModel TestdataListModel= new DefaultListModel();

    /**
     * Creates new form SetupTestArgs
     */
    public SetupTestArgs() {
        initComponents();
    }

    private void initComponents() {

        txtMethodArgName = new javax.swing.JLabel();
        comboMethodarg = new javax.swing.JComboBox<>();
        txtTestdataKey = new javax.swing.JLabel();
        comboTestDataKey = new javax.swing.JComboBox<>();
        txtTestDatValue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTestDataArgs = new javax.swing.JList<>();
        btnDone = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSetupTestData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SetupTestArgs");

        txtMethodArgName.setText("Method Arg Name:  ");

        txtTestdataKey.setText("Test data key Name: ");
//        comboTestDataKey.addActionListener (new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                setTestdataValue();
//            }
//        });
        txtTestDatValue.setText("test data value");

        jScrollPane1.setViewportView(listTestDataArgs);

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSetupTestData.setText("Setup TestData");
        btnSetupTestData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupTestDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtMethodArgName)
                                                                        .addComponent(txtTestdataKey))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(comboMethodarg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(comboTestDataKey, 0, 313, Short.MAX_VALUE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(32, 32, 32)
                                                                                .addComponent(txtTestDatValue, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(65, 65, 65)
                                                                                .addComponent(btnSetupTestData, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(376, 376, 376)
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(34, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(comboMethodarg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnSetupTestData))
                                        .addComponent(txtMethodArgName))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTestdataKey)
                                        .addComponent(comboTestDataKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTestDatValue))
                                .addGap(42, 42, 42)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void initLoad(String[] listMethods){
        comboMethodarg.removeAllItems();
        String[] testdata=null;
        String testdataKey=null;


        //testSuites = Generic.getAllFileNames(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTEXECUTION_FOLDER+"/");
        for(int i=0;i<=listMethods.length-1;i++){
            comboMethodarg.addItem(listMethods[i]);
        }

        for (int j=0;j<=Init.testdataListmodel.size()-1;j++) {
            if(Init.testdataListmodel.get(j).toString().contains("=")){
                testdata=Init.testdataListmodel.get(j).toString().split("=");
             //   testdataKey=testdata[0];
                comboTestDataKey.addItem(testdata[0]);
            }
        }
//        String jpath=GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME+File.separator+GlobalConstants.SCRIPT_NAME.toUpperCase()+".json";
//        //JSONObject jsonObject = Json.parseStringToJsonObject(jpath);
//        List<String> listTestdatavalues = new ArrayList<String>();
//        //String keyStr;
////        String valStr;
////        String[] testdata;
//        listTestdatavalues = Json.getKeys(jpath);
//
//        for (int j=0;j<=listTestdatavalues.size()-1;j++) {
////            testdata= listTestdatavalues.get(j).split("=");
////            keyStr=testdata[0];
////            valStr=testdata[1];
//            comboTestDataKey.addItem(listTestdatavalues.get(j));
//        }
    }

    public void setTestdataValue(){
        String testdata=null;
        String[] testdataArr=null;
//        String jpath=GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME+File.separator+GlobalConstants.SCRIPT_NAME.toUpperCase()+".json";
//        txtTestDatValue.setText(Json.getValue(jpath,comboTestDataKey.getSelectedItem().toString()));
        System.out.println(Init.testdataListmodel);
        System.out.println(Init.testdataListmodel.indexOf(comboTestDataKey.getSelectedItem().toString()));
        testdata = String.valueOf(Init.testdataListmodel.getElementAt(Init.testdataListmodel.indexOf(comboTestDataKey.getSelectedItem().toString())));
        testdataArr=testdata.split("=");
        txtTestDatValue.setText(testdataArr[1]);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        if(TestdataListModel.contains(comboTestDataKey.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, comboTestDataKey.getSelectedItem().toString()+":  Already Added !");
        } else{
            TestdataListModel.addElement(comboTestDataKey.getSelectedItem().toString());
            listTestDataArgs.setModel(TestdataListModel);
        }
    }
    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {
        int argsLen=comboMethodarg.getItemCount();
        int testargs=listTestDataArgs.getModel().getSize();
        String methodArgbuilder=null;
        if(argsLen==testargs){
            methodArgbuilder = "td(\""+TestdataListModel.get(0).toString()+"\")";
            for(int k=1;k<=testargs-1;k++){
                methodArgbuilder = methodArgbuilder+", td(\""+TestdataListModel.get(k).toString()+"\")";
            }
            methodArgbuilder=GlobalConstants.TestScript_Selected_Page_Name.toLowerCase() + "." + GlobalConstants.SELECTED_METHOD+methodArgbuilder+");";
           // System.out.println("methodArgbuilder::"+methodArgbuilder);
            Init.Add_TestScript_step_ListModel.addElement(methodArgbuilder);
            AddTestScriptStep.listScriptSteps.setModel(Init.Add_TestScript_step_ListModel);
            dispose();
        }else{
            System.out.println(argsLen+":::"+testargs);
            int baltestargs=argsLen - testargs;
            JOptionPane.showMessageDialog(null, "Add "+baltestargs+" more arguments !!");
        }
        TestdataListModel.removeAllElements();
        //Init.Add_TestScript_step_ListModel.removeAllElements();
    }
    private void btnSetupTestDataActionPerformed(java.awt.event.ActionEvent evt) {
       SetupTestData setupTestData=new SetupTestData();
       setupTestData.setVisible(true);
       SetupTestData.initLoad();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetupTestArgs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnSetupTestData;
    public static javax.swing.JComboBox<String> comboMethodarg;
    public static javax.swing.JComboBox<String> comboTestDataKey;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listTestDataArgs;
    private javax.swing.JLabel txtMethodArgName;
    private javax.swing.JLabel txtTestDatValue;
    private javax.swing.JLabel txtTestdataKey;
    // End of variables declaration
}
