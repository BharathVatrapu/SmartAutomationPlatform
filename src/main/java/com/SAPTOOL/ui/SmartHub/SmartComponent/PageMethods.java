package com.SAPTOOL.ui.SmartHub.SmartComponent;


import com.SAPTOOL.tables.ViewPageOperationsTable;
import com.SAPTOOL.tables.ViewPageOperationsTableModel;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bvatrapu
 */
public class PageMethods extends javax.swing.JFrame {

    public static ViewPageOperationsTableModel viewPageOperationsTableModel = null;

    /**
     * Creates new form PageComponents
     */
    public PageMethods() {
        initComponents();
    }


    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPageComponents = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtSelectPage = new javax.swing.JLabel();
        listPages = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtSelectPage.setText("Select Page:  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(342, 342, 342)
                                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(txtSelectPage)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(listPages, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSelectPage)
                                        .addComponent(listPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void initLoad(){
        //txtPageName.setText(GlobalConstants.TestScript_Selected_Page_Name+" >>> "+GlobalConstants.Method_Name +" >>> Operations");
        loadTable();
    }
    public static void loadTable(){
        tblPageComponents.setModel(getModel());
    }
    public static ViewPageOperationsTableModel getModel() {
        int i=1;
        List<String> listMethods = new ArrayList<String>();
        listMethods = getMethods();
        List<ViewPageOperationsTable> viewFileList = new ArrayList<ViewPageOperationsTable>();
        for (int j=0;j<=listMethods.size()-1;j++) {
            ;
            ViewPageOperationsTable viewFileTable = new ViewPageOperationsTable(i, listMethods.get(j), "");
            viewFileList.add(viewFileTable);
            i = i + 1;
        }
        viewPageOperationsTableModel = new ViewPageOperationsTableModel(viewFileList);


        return viewPageOperationsTableModel;
    }
    public static List<String> getMethods() {
        List<String> listMethods = new ArrayList<String>();
        String readPageModel = Generic.readText(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+ File.separator+GlobalConstants.TestScript_Selected_Page_Name+".java");

        String methods=null;
        methods=readPageModel.substring(readPageModel.indexOf("//SAP-START - METHOD DECLARAITON"),readPageModel.indexOf("//SAP-END - METHOD DECLARAITON"));

        methods = methods.replaceAll("//SAP-START - METHOD DECLARAITON","");
        //  System.out.println(operations);
//        String[] lines = operations.split(System.getProperty("line.separator"));
//        System.out.println(lines.length);
        Scanner scanner = new Scanner(methods);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.contains("public")){
                // System.out.println();
                listMethods.add(line.substring(line.indexOf("public String "), line.indexOf("{")).replaceAll("public String ",""));
            }
//            if(!line.equals("\t")){
//                System.out.println(line);
//                System.out.println("----------------------");
//                //
//            }
        }
        scanner.close();
        return listMethods;
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listPages;
    public static javax.swing.JTable tblPageComponents;
    private javax.swing.JLabel txtSelectPage;
    // End of variables declaration
}

