package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.tables.ViewPageOperationsTable;
import com.SAPTOOL.tables.ViewPageOperationsTableModel;
import com.SAPTOOL.ui.Init;
import com.SAPTOOL.ui.SmartHub.SmartComponent.SmartComponent;
import com.SAPTOOL.ui.SmartHub.SmartComponent.Verify;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bvatrapu
 */
public class PageOperations extends JFrame {
    public static ViewPageOperationsTableModel viewPageOperationsTableModel = null;
    public static String selected_Page_Operation = null;
    public static int arg_incrementer=0;
    /**
     * Creates new form PageComponents
     */
    public PageOperations() {
        initComponents();
    }


    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        tblPageComponents = new JTable();
        btnAdd = new JButton();
        txtPageName = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        tblPageComponents.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(tblPageComponents);
        tblPageComponents.getSelectionModel().addListSelectionListener(new SelectionListener());
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtPageName.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        txtPageName.setForeground(new Color(0, 51, 204));
        txtPageName.setText("PageName");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(244, 244, 244)
                                                .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 764, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(txtPageName)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(txtPageName)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static ViewPageOperationsTableModel getModel() {
        int i=1;
        List<String> listOperations = new ArrayList<String>();
        listOperations = getOperations();
        List<ViewPageOperationsTable> viewFileList = new ArrayList<ViewPageOperationsTable>();
        for (int j=0;j<=listOperations.size()-1;j++) {
            ;
            ViewPageOperationsTable viewFileTable = new ViewPageOperationsTable(i, listOperations.get(j), "");
            viewFileList.add(viewFileTable);
            i = i + 1;
        }
        viewPageOperationsTableModel = new ViewPageOperationsTableModel(viewFileList);


        return viewPageOperationsTableModel;
    }
    public void initLoad(){
        txtPageName.setText(GlobalConstants.Method_Selected_Page_Name+" >>> "+GlobalConstants.Method_Name +" >>> Operations");
        loadTable();
    }
    public static void loadTable(){
        tblPageComponents.setModel(getModel());
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        boolean flag = true;
        if (selected_Page_Operation==null){
            JOptionPane.showMessageDialog(null,"Select Operation !!!");
            flag=false;
            return;
        }
        if(flag) {
            // paramNamesAndvaluesListModel.addElement(inputParameter.getText());
            //System.out.println("selected_Page_Operation::"+selected_Page_Operation);
            if(!selected_Page_Operation.contains("()")){
                selected_Page_Operation=selected_Page_Operation.replaceAll("String input_value","args["+arg_incrementer+"]");
                arg_incrementer=arg_incrementer+1;
            }
            if(GlobalConstants.Method_Verify){
                Init.verification_steps_ListModel.addElement(selected_Page_Operation);
                Verify.listVerificationPoint.setModel(Init.verification_steps_ListModel);
            }else {
                Init.testScript_steps_ListModel.addElement(selected_Page_Operation);
                CreateTestScript.listTestScriptSteps.setModel(Init.testScript_steps_ListModel);
            }

            dispose();
        }
    }
    public static List<String> getOperations() {
        List<String> listOperations = new ArrayList<String>();
        String readPageModel = Generic.readText(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+ File.separator+GlobalConstants.Method_Selected_Page_Name+".java");

        String operations=null;
        operations=readPageModel.substring(readPageModel.indexOf("//SAP-START - OPERATION DECLARAITON"),readPageModel.indexOf("//SAP-END - OPERATION DECLARAITON"));

        operations = operations.replaceAll("//SAP-START - OPERATION DECLARAITON","");
        //  System.out.println(operations);
//        String[] lines = operations.split(System.getProperty("line.separator"));
//        System.out.println(lines.length);
        Scanner scanner = new Scanner(operations);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.contains("public")){
                // System.out.println();
                listOperations.add(line.substring(line.indexOf("public void "), line.indexOf("{")).replaceAll("public void ",""));
            }
//            if(!line.equals("\t")){
//                System.out.println(line);
//                System.out.println("----------------------");
//                //
//            }
        }
        scanner.close();
        return listOperations;
    }

    class SelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            if(e.getValueIsAdjusting())
                return;
            int row = tblPageComponents.getSelectedRow();
            if(row < 0)
                return;
            int col = tblPageComponents.getSelectedColumn();
            if(col < 0)
                return;

            //tblPages.clearSelection();
            selected_Page_Operation = (String) tblPageComponents.getModel().getValueAt(row, 1);


            tblPageComponents.setSelectionBackground(Color.ORANGE);
            // txtProjectName.setText(selected_Project.toUpperCase());

        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    public static JButton btnAdd;
    private JScrollPane jScrollPane1;
    public static JTable tblPageComponents;
    public static JLabel txtPageName;
    // End of variables declaration
}

