package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.tables.ViewPageOperationsTable;
import com.SAPTOOL.tables.ViewPageOperationsTableModel;
import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;
import org.apache.commons.lang3.StringUtils;

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
public class PageMethods extends javax.swing.JFrame {

    public static ViewPageOperationsTableModel viewPageOperationsTableModel = null;
    public static String selected_Page_Method = null;
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
        setTitle("PageMethods");

        jScrollPane1.setViewportView(tblPageComponents);
        tblPageComponents.getSelectionModel().addListSelectionListener(new SelectionListener());
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


        if(selected_Page_Method.contains("String[] args")){
            GlobalConstants.SELECTED_METHOD=selected_Page_Method.substring(0,selected_Page_Method.indexOf("String[] args"));

            System.out.println("GlobalConstants.SELECTED_METHOD::"+GlobalConstants.SELECTED_METHOD);
            String methodname=null;
            //methodname=selected_Page_Method.replaceAll("\(String\[\] args\)","");
            String readPageModel = Generic.readText(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+ File.separator+GlobalConstants.TestScript_Selected_Page_Name+".java");
            methodname=readPageModel.substring(readPageModel.indexOf("public String "+selected_Page_Method+"{"),readPageModel.indexOf("//SAP-END - METHOD"));

            //int count = methodname.length() - methodname.replaceAll("args","").length() - 1;
            int count = StringUtils.countMatches(methodname, "args[");
            System.out.println("count::"+count);
            String[] listMethodargs = new String[count];
            Scanner scanner = new Scanner(methodname);
            String step=null;
            int i=0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if(line.contains("args[")){
                    step=line.substring(0, line.indexOf("(args["));
                    step=step.trim();
//                            .replaceAll("args","");
                    System.out.println("Step::"+step);
                    listMethodargs[i]=step;
                    i=i+1;
                    //listMethodargs.add(step);
                }
//            if(!line.equals("\t")){
//                System.out.println(line);
//                System.out.println("----------------------");
//                //
//            }
            }

            SetupTestArgs setTestData=new SetupTestArgs();
            setTestData.setVisible(true);
            SetupTestArgs.initLoad(listMethodargs);

        } else {
            if(GlobalConstants.VERIFY_SCRIPT_COMMAND){
                Init.Add_TestScript_step_ListModel.addElement("verify("+GlobalConstants.TestScript_Selected_Page_Name.toLowerCase() + "." + selected_Page_Method+");");
                AddTestScriptStep.listScriptSteps.setModel(Init.Add_TestScript_step_ListModel);
                AddTestScriptStep.btnVerify.setEnabled(true);
                AddTestScriptStep.listScriptSteps.setBorder(BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            } else {
//            int count = string.length() - string.replaceAll("g","").length()
                Init.Add_TestScript_step_ListModel.addElement(GlobalConstants.TestScript_Selected_Page_Name.toLowerCase() + "." + selected_Page_Method+";");
                AddTestScriptStep.listScriptSteps.setModel(Init.Add_TestScript_step_ListModel);
            }

        }

        dispose();
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
            selected_Page_Method = (String) tblPageComponents.getModel().getValueAt(row, 1);


            tblPageComponents.setSelectionBackground(Color.ORANGE);
            // txtProjectName.setText(selected_Project.toUpperCase());

        }
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

