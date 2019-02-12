package com.SAPTOOL.ui.SmartHub.Methods;


import com.SAPTOOL.ui.Init;
import com.SAPTOOL.ui.SmartHub.SmartBuilder;
import com.SAPTOOL.tables.ViewPageOperationsTable;
import com.SAPTOOL.tables.ViewPageOperationsTableModel;
import com.SAPTOOL.tables.ViewProjectsTableModel;
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
public class PageComponents extends JFrame {
    public static ViewPageOperationsTableModel viewPageOperationsTableModel = null;
    public static String selected_Page_Operation = null;
    public static int arg_incrementer=0;
    /**
     * Creates new form PageComponents
     */
    public PageComponents() {
        initComponents();
    }


    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        tblPageComponents = new JTable();
        btnAdd = new JButton();
        panelObjectControls = new JPanel();
        rbLink = new JRadioButton();
        rbRadioButton = new JRadioButton();
        rbEditBox = new JRadioButton();
        rbText = new JRadioButton();
        rbButton = new JRadioButton();
        rbCheckBox = new JRadioButton();
        rbCombobox = new JRadioButton();
        rbImage = new JRadioButton();
        cbAll = new JCheckBox();
        txtpageName = new JLabel();

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

        panelObjectControls.setBackground(new Color(255, 255, 255));
        panelObjectControls.setBorder(BorderFactory.createTitledBorder(null, "Controls", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 0, 16), new Color(0, 204, 204))); // NOI18N

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

        GroupLayout panelObjectControlsLayout = new GroupLayout(panelObjectControls);
        panelObjectControls.setLayout(panelObjectControlsLayout);
        panelObjectControlsLayout.setHorizontalGroup(
                panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelObjectControlsLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbLink)
                                        .addComponent(rbButton))
                                .addGap(57, 57, 57)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbRadioButton)
                                        .addComponent(rbCheckBox))
                                .addGap(143, 143, 143)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbEditBox)
                                        .addComponent(rbCombobox))
                                .addGap(131, 131, 131)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbImage)
                                        .addComponent(rbText))
                                .addContainerGap(189, Short.MAX_VALUE))
        );
        panelObjectControlsLayout.setVerticalGroup(
                panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelObjectControlsLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbLink)
                                        .addComponent(rbRadioButton)
                                        .addComponent(rbEditBox)
                                        .addComponent(rbText))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbButton)
                                        .addComponent(rbCheckBox)
                                        .addComponent(rbCombobox)
                                        .addComponent(rbImage))
                                .addGap(21, 21, 21))
        );

        cbAll.setText("All");

        txtpageName.setText("jLabel1");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1)
                                                        .addComponent(panelObjectControls, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(319, 319, 319)
                                                                .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(66, 66, 66)
                                                                .addComponent(cbAll)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtpageName)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(26, Short.MAX_VALUE)
                                .addComponent(txtpageName)
                                .addGap(18, 18, 18)
                                .addComponent(cbAll)
                                .addGap(18, 18, 18)
                                .addComponent(panelObjectControls, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
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
    public static void initOperations(){
        txtpageName.setText(GlobalConstants.TestScript_Selected_Page_Name+" >>> "+GlobalConstants.Method_Name +" >>> Operations");
        loadTable();
    }
    public static void loadTable(){
        tblPageComponents.setModel(getModel());
    }

    public static List<String> getOperations() {
        List<String> listOperations = new ArrayList<String>();
        String readPageModel = Generic.readText(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+ File.separator+GlobalConstants.TestScript_Selected_Page_Name+".java");

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
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        boolean flag = true;
        if (selected_Page_Operation==null){
            JOptionPane.showMessageDialog(null,"Select Operation !!!");
            flag=false;
            return;
        }
        if(flag) {
            // paramNamesAndvaluesListModel.addElement(inputParameter.getText());

            if(!selected_Page_Operation.contains("()")){
                selected_Page_Operation=selected_Page_Operation.replaceAll("String input_value","args["+arg_incrementer+"]");
                arg_incrementer=arg_incrementer+1;
            }
            Init.page_method_steps_ListModel.addElement(selected_Page_Operation);

            // paramNameListModel.addElement(inputParameter.getText());

            SmartComponent.listPageMethodSteps.setModel(Init.page_method_steps_ListModel);
            //listParams.setSelectedIndex(0);

            //inputParameter.setText("");
            dispose();


        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageComponents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JButton btnAdd;
    private JCheckBox cbAll;
    private JScrollPane jScrollPane1;
    private JPanel panelObjectControls;
    private JRadioButton rbButton;
    private JRadioButton rbCheckBox;
    private JRadioButton rbCombobox;
    private JRadioButton rbEditBox;
    private JRadioButton rbImage;
    private JRadioButton rbLink;
    private JRadioButton rbRadioButton;
    private JRadioButton rbText;
    public static JTable tblPageComponents;
    public static JLabel txtpageName;
    // End of variables declaration
}
