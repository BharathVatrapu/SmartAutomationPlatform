package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import java.io.File;

/**
 *
 * @author bvatrapu
 */
public class SmartGen extends javax.swing.JPanel {

    /**
     * Creates new form Projects
     */
    public SmartGen() {
        initComponents();
    }


    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTestScripts = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtSelectModule = new javax.swing.JLabel();
        comboSelectModule = new javax.swing.JComboBox<>();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));


        tblTestScripts.setAutoCreateRowSorter(true);
        tblTestScripts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        tblTestScripts.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tblTestScripts.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Sno", "Test Script"
                }
        ));
        tblTestScripts.setFocusable(false);
        tblTestScripts.setGridColor(new java.awt.Color(255, 255, 255));
        tblTestScripts.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblTestScripts.setRowHeight(25);
        tblTestScripts.setSelectionBackground(new java.awt.Color(204, 0, 255));
        tblTestScripts.setShowVerticalLines(false);
        tblTestScripts.getTableHeader().setReorderingAllowed(false);
        tblTestScripts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTestScriptsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTestScripts);

        jLabel9.setText("         ");

        txtSelectModule.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSelectModule.setForeground(new java.awt.Color(0, 102, 153));
        txtSelectModule.setText("Select Module:  ");

        comboSelectModule.setToolTipText("");

        btnNew.setBackground(new java.awt.Color(255, 255, 255));
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNew.setForeground(new java.awt.Color(0, 0, 153));
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 153));
        btnUpdate.setText("Update");

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 153));
        btnDelete.setText("Delete");

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 0, 153));
        btnView.setText("View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtSelectModule)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(comboSelectModule, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel9))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(71, 71, 71)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(txtSelectModule)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(comboSelectModule, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(108, Short.MAX_VALUE))
        );
    }

    public static void initLoad(){
        comboSelectModule.removeAllItems();
        String[] allModules=null;
        String moduleName=null;

        allModules = Generic.getAllFileNames(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTSUITES_FOLDER+"/");
        for(int i=0;i<=allModules.length-1;i++){
            comboSelectModule.addItem(allModules[i]);
        }
    }
    private void tblTestScriptsMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
        NewTestScript newTestScript = new NewTestScript();
        newTestScript.setVisible(true);
        NewTestScript.initLoad();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    public static javax.swing.JComboBox<String> comboSelectModule;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTestScripts;
    private javax.swing.JLabel txtSelectModule;
    // End of variables declaration
}
