package com.SAPTOOL.ui.executionlab;

import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bvatrapu
 */
public class AddValue extends javax.swing.JFrame {

    public static HashMap<String,String> addvalu_Hashmap=null;

    //DefaultListModel listModel= null;
    /**
     * Creates new form AddValue
     */
    public AddValue() {

        initComponents();
        initLoad();
    }


    private void initComponents() {

        cbparamvalue = new javax.swing.JComboBox<>();
        txtparam = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtparam.setText("param");

        btnSave.setText("Save");
        btnSave.setFocusPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel1.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(txtparam)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbparamvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbparamvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtparam)
                                        .addComponent(jLabel1))
                                .addGap(67, 67, 67)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println(Init.paramNameandValuesListModel);
        Init.paramNameandValuesListModel.removeElement(Init.param_Selected);
        System.out.println(Init.paramNameandValuesListModel.size());
        Init.paramNameandValuesListModel.addElement(Init.param_Name+"="+cbparamvalue.getSelectedItem().toString());
        System.out.println(Init.paramNameandValuesListModel.size());

//        ConfigParams.listparams.setModel(Init.paramNameandValuesListModel);
        Generic.writeParamAndValueProp(Init.paramNameandValuesListModel,GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+GlobalConstants.SELECTED_PROJECT+File.separator+GlobalConstants.param_properties);
        ExecutionLab.listparams.setModel(Init.paramNameandValuesListModel);
        dispose();
    }

    public static void initLoad(){
//        MultiValuedMap<K, String> map = new MultiValuedHashMap<K, String>();
//
//        map.put(key, "A");
//        map.put(key, "B");
//        map.put(key, "C");
//
//        Collection<String> coll = map.get(key);




        txtparam.setText(Init.param_Name);
        addvalu_Hashmap =new HashMap<String,String>();
        addvalu_Hashmap = Generic.readAllProp(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+GlobalConstants.SELECTED_PROJECT+File.separator+Init.param_Name+".properties");
        for (Map.Entry<String, String> entry : addvalu_Hashmap.entrySet()) {
            cbparamvalue.addItem(entry.getValue());
        }

    }
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddValue().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnSave;
    public static javax.swing.JComboBox<String> cbparamvalue;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel txtparam;
    // End of variables declaration
}

