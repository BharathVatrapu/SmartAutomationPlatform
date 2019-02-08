package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bvatrapu
 */
public class AddEnvironment extends javax.swing.JFrame {

    public static HashMap<String,String> mapParamvalues=new HashMap<String,String>();
    public static DefaultListModel paramvaluesListmodel= new DefaultListModel();

    /**
     * Creates new form AddModule
     */
    public AddEnvironment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        inputEnv = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        txtEnv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputEnv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inputEnv.setForeground(new java.awt.Color(0, 0, 153));

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(51, 0, 153));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtEnv.setText("Environemt:  ");

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
                                                        .addComponent(txtEnv)
                                                        .addComponent(inputEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtEnv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        mapParamvalues = Generic.readAllProp(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+GlobalConstants.SELECTED_PROJECT+File.separator+"environment.properties");
        for (Map.Entry<String, String> entry : mapParamvalues.entrySet()) {
            paramvaluesListmodel.addElement(entry.getValue());
        }
        paramvaluesListmodel.addElement(inputEnv.getText());
        Generic.writeParamValuesProp(paramvaluesListmodel,"environment");
        NewTestScript.initLoad();
        NewTestScript.comboEnv.setSelectedItem(inputEnv.getText());
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEnvironment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCreate;
    private javax.swing.JTextField inputEnv;
    private javax.swing.JLabel txtEnv;
    // End of variables declaration
}
