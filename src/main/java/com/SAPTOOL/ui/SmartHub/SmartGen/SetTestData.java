package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;
import com.SAPTOOL.utils.Json;
import org.json.simple.JSONObject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bvatrapu
 */
public class SetTestData extends javax.swing.JFrame {

    /**
     * Creates new form SetTestData
     */
    public SetTestData() {
        initComponents();
    }

    private void initComponents() {

        txtMethodArgName = new javax.swing.JLabel();
        comboMethodarg = new javax.swing.JComboBox<>();
        txtTestdataKey = new javax.swing.JLabel();
        comboTestDataKey = new javax.swing.JComboBox<>();
        txtTestDatValue = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTestDataArgs = new javax.swing.JList<>();
        btnDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMethodArgName.setText("Method Arg name:  ");

        txtTestdataKey.setText("Test data Key: ");
        comboTestDataKey.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setTestdataValue();
            }
        });

        txtTestDatValue.setText("value");

        btnAdd.setText("Add");

        jScrollPane1.setViewportView(listTestDataArgs);

        btnDone.setText("Done");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtMethodArgName)
                                                        .addComponent(txtTestdataKey))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(comboMethodarg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(comboTestDataKey, 0, 236, Short.MAX_VALUE))
                                                .addGap(47, 47, 47)
                                                .addComponent(txtTestDatValue, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(319, 319, 319)
                                                .addComponent(btnAdd))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(340, 340, 340)
                                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtMethodArgName)
                                        .addComponent(comboMethodarg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTestdataKey)
                                        .addComponent(comboTestDataKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTestDatValue))
                                .addGap(31, 31, 31)
                                .addComponent(btnAdd)
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void initLoad(String[] listMethods){
        comboMethodarg.removeAllItems();
        String[] methodArgs=null;
        String methodarg=null;


        //testSuites = Generic.getAllFileNames(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTEXECUTION_FOLDER+"/");
        for(int i=0;i<=listMethods.length-1;i++){
            comboMethodarg.addItem(listMethods[i]);
        }
        String jpath=GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME+File.separator+GlobalConstants.NEW_SCRIPT_NAME.toUpperCase()+".json";
        //JSONObject jsonObject = Json.parseStringToJsonObject(jpath);
        List<String> listTestdatavalues = new ArrayList<String>();
        //String keyStr;
//        String valStr;
//        String[] testdata;
        listTestdatavalues = Json.getKeys(jpath);

        for (int j=0;j<=listTestdatavalues.size()-1;j++) {
//            testdata= listTestdatavalues.get(j).split("=");
//            keyStr=testdata[0];
//            valStr=testdata[1];
            comboTestDataKey.addItem(listTestdatavalues.get(j));
        }
    }

    public void setTestdataValue(){
        String jpath=GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER+File.separator+GlobalConstants.TEST_MODULE_NAME+File.separator+GlobalConstants.NEW_SCRIPT_NAME.toUpperCase()+".json";
        txtTestDatValue.setText(Json.getValue(jpath,comboTestDataKey.getSelectedItem().toString()));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetTestData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDone;
    public static javax.swing.JComboBox<String> comboMethodarg;
    public static javax.swing.JComboBox<String> comboTestDataKey;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listTestDataArgs;
    private javax.swing.JLabel txtMethodArgName;
    private javax.swing.JLabel txtTestDatValue;
    private javax.swing.JLabel txtTestdataKey;
    // End of variables declaration
}
