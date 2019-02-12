package com.SAPTOOL.ui.SmartHub.Methods;

import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.io.File;

/**
 *
 * @author bvatrapu
 */
public class CreateNewMethod extends JFrame {

    public static ButtonGroup accessModifier = new ButtonGroup();
    /**
     * Creates new form CreateMethod
     */
    public CreateNewMethod() {
        initComponents();
    }


    private void initComponents() {

        txtPageName = new JLabel();
        jLabel2 = new JLabel();
        inputMethodName = new JTextField();
        btnNext = new JButton();
        jPanel1 = new JPanel();
        rbPublic = new JRadioButton();
        rbPrivate = new JRadioButton();
        rbProtected = new JRadioButton();
        jLabel1 = new JLabel();
        listReturntype = new JComboBox<>();
        jLabel3 = new JLabel();
        inputMethodDesc = new JTextField();
        cbArguments = new JCheckBox();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        txtPageName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPageName.setText("PageName");

        jLabel2.setText("Method Name: ");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jPanel1.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbPublic.setText("public");

        rbPrivate.setText("private");

        rbProtected.setText("protected");
        accessModifier.add(rbPublic);
        accessModifier.add(rbPrivate);
        accessModifier.add(rbProtected);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(rbPublic)
                                .addGap(158, 158, 158)
                                .addComponent(rbPrivate)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbProtected)
                                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbPublic)
                                        .addComponent(rbPrivate)
                                        .addComponent(rbProtected))
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel1.setText("Returntype: ");

        listReturntype.setModel(new DefaultComboBoxModel<>(new String[] { "void", "boolean", "String", "int", "double" }));

        jLabel3.setText("Description:");

        cbArguments.setText("Arguments");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(303, 303, 303)
                                                .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabel1)
                                                .addGap(48, 48, 48)
                                                .addComponent(listReturntype, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addComponent(cbArguments)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtPageName)
                                                .addContainerGap(700, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(inputMethodDesc, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jPanel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                                .addComponent(inputMethodName, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtPageName)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputMethodName, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputMethodDesc, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(45, 45, 45)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(listReturntype, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbArguments))
                                .addGap(60, 60, 60)
                                .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void initLoad(){
        rbPublic.setSelected(true);
        txtPageName.setText(GlobalConstants.TestScript_Selected_Page_Name);

//        cbPageName.removeAllItems();
//        String[] pages=null;
//        String page=null;
//        pages = Generic.getAllFileNames(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.PROJECT_PAGESr_PATH);
//        for(int i=0;i<=pages.length-1;i++){
//            page=pages[i].replace(".java", "");
//            cbPageName.addItem(page);
//        }
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {
        GlobalConstants.Method_Name= inputMethodName.getText().toString();
        GlobalConstants.Method_Description=inputMethodDesc.getText();
        GlobalConstants.Method_AccessModifier=getAccessModifier();
        GlobalConstants.Method_Return_Type = listReturntype.getSelectedItem().toString();
        GlobalConstants.Method_args_status = cbArguments.isSelected();

        SmartComponent smartComponent=new SmartComponent();
        smartComponent.setVisible(true);
        SmartComponent.initload();
        dispose();
    }

    public String getAccessModifier(){
        if(rbPublic.isSelected()){
            return rbPublic.getText();
        }else if(rbPrivate.isSelected()){
            return rbPrivate.getText();
        } else {
            return rbProtected.getText();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JButton btnNext;
    private JCheckBox cbArguments;
    private JTextField inputMethodName;
    private JTextField inputMethodDesc;;
    private JComboBox<String> listReturntype;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    public static JRadioButton rbPrivate;
    public static JRadioButton rbProtected;
    public static JRadioButton rbPublic;
    public static JLabel txtPageName;
    // End of variables declaration
}
