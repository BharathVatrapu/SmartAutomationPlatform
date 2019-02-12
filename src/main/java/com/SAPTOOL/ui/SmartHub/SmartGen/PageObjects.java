package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.tables.ViewPageOperationsTable;
import com.SAPTOOL.tables.ViewPageOperationsTableModel;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

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
public class PageObjects extends javax.swing.JFrame {
    public static ViewPageOperationsTableModel viewPageOperationsTableModel = null;
    public static int arg_incrementer=0;
    public static String selected_Page_Object = null;

    /**
     * Creates new form PageComponents
     */
    public PageObjects() {
        initComponents();
    }


    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPageComponents = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        panelObjectControls = new javax.swing.JPanel();
        rbLink = new javax.swing.JRadioButton();
        rbRadioButton = new javax.swing.JRadioButton();
        rbEditBox = new javax.swing.JRadioButton();
        rbText = new javax.swing.JRadioButton();
        rbButton = new javax.swing.JRadioButton();
        rbCheckBox = new javax.swing.JRadioButton();
        rbCombobox = new javax.swing.JRadioButton();
        rbImage = new javax.swing.JRadioButton();
        cbAll = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PageObjects");
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

        panelObjectControls.setBackground(new Color(255, 255, 255));
        panelObjectControls.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controls", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 0, 16), new Color(0, 204, 204))); // NOI18N

        rbLink.setBackground(new Color(255, 255, 255));
        rbLink.setText("Link");

        rbRadioButton.setBackground(new Color(255, 255, 255));
        rbRadioButton.setText("Radio button");

        rbEditBox.setBackground(new Color(255, 255, 255));
        rbEditBox.setText("EditBox");

        rbText.setBackground(new Color(255, 255, 255));
        rbText.setText("Text");

        rbButton.setBackground(new Color(255, 255, 255));
        rbButton.setText("Button");

        rbCheckBox.setBackground(new Color(255, 255, 255));
        rbCheckBox.setText("CheckBox");

        rbCombobox.setBackground(new Color(255, 255, 255));
        rbCombobox.setText("Combobox");

        rbImage.setBackground(new Color(255, 255, 255));
        rbImage.setText("Image");

        javax.swing.GroupLayout panelObjectControlsLayout = new javax.swing.GroupLayout(panelObjectControls);
        panelObjectControls.setLayout(panelObjectControlsLayout);
        panelObjectControlsLayout.setHorizontalGroup(
                panelObjectControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelObjectControlsLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbLink)
                                        .addComponent(rbButton))
                                .addGap(70, 70, 70)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbRadioButton)
                                        .addComponent(rbCheckBox))
                                .addGap(130, 130, 130)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbEditBox)
                                        .addComponent(rbCombobox))
                                .addGap(131, 131, 131)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbImage)
                                        .addComponent(rbText))
                                .addContainerGap(189, Short.MAX_VALUE))
        );
        panelObjectControlsLayout.setVerticalGroup(
                panelObjectControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelObjectControlsLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbLink)
                                        .addComponent(rbRadioButton)
                                        .addComponent(rbEditBox)
                                        .addComponent(rbText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbButton)
                                        .addComponent(rbCheckBox)
                                        .addComponent(rbCombobox)
                                        .addComponent(rbImage))
                                .addGap(21, 21, 21))
        );

        cbAll.setText("Select All");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(cbAll)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(319, 319, 319)
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 378, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(panelObjectControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(47, Short.MAX_VALUE)
                                .addComponent(cbAll)
                                .addGap(18, 18, 18)
                                .addComponent(panelObjectControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static ViewPageOperationsTableModel getModel() {
        int i=1;
        List<String> listObjects = new ArrayList<String>();
        listObjects = getObjects();
        List<ViewPageOperationsTable> viewFileList = new ArrayList<ViewPageOperationsTable>();
        for (int j=0;j<=listObjects.size()-1;j++) {
            ;
            ViewPageOperationsTable viewFileTable = new ViewPageOperationsTable(i, listObjects.get(j), "");
            viewFileList.add(viewFileTable);
            i = i + 1;
        }
        viewPageOperationsTableModel = new ViewPageOperationsTableModel(viewFileList);


        return viewPageOperationsTableModel;
    }
    public void initLoad(){
       // txtPageName.setText(GlobalConstants.TestScript_Selected_Page_Name+" >>> "+GlobalConstants.Method_Name +" >>> Operations");
        loadTable();
    }
    public static void loadTable(){
        tblPageComponents.setModel(getModel());
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        SelectWebdriverOperation webdriverOperation = new SelectWebdriverOperation();
        webdriverOperation.setVisible(true);
        webdriverOperation.initload(selected_Page_Object);
        dispose();
    }

    public static List<String> getObjects() {
        List<String> listObjects = new ArrayList<String>();
        String readPageModel = Generic.readText(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+ File.separator+GlobalConstants.TestScript_Selected_Page_Name+".java");

        String objects=null;
        objects=readPageModel.substring(readPageModel.indexOf("//SAP-START - OBJECT DECLARAITON"),readPageModel.indexOf("//SAP-END - OBJECT DECLARAITON"));

        objects = objects.replaceAll("//SAP-START - OBJECT DECLARAITON","");

//        String[] lines = operations.split(System.getProperty("line.separator"));
//        System.out.println(lines.length);
        Scanner scanner = new Scanner(objects);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("line::"+line);
            if(line.contains("public WebElement")){
                 System.out.println(line);
                listObjects.add(line.substring(line.indexOf("\tpublic WebElement "), line.indexOf(";")).replaceAll("public WebElement ",""));
            }
//            if(!line.equals("\t")){
//                System.out.println(line);
//                System.out.println("----------------------");
//                //
//            }
        }
        scanner.close();
        return listObjects;
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
            selected_Page_Object = (String) tblPageComponents.getModel().getValueAt(row, 1);


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
                new PageObjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JCheckBox cbAll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelObjectControls;
    private javax.swing.JRadioButton rbButton;
    private javax.swing.JRadioButton rbCheckBox;
    private javax.swing.JRadioButton rbCombobox;
    private javax.swing.JRadioButton rbEditBox;
    private javax.swing.JRadioButton rbImage;
    private javax.swing.JRadioButton rbLink;
    private javax.swing.JRadioButton rbRadioButton;
    private javax.swing.JRadioButton rbText;
    public static javax.swing.JTable tblPageComponents;
    // End of variables declaration
}

