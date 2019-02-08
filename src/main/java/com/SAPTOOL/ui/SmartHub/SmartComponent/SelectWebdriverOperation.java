package com.SAPTOOL.ui.SmartHub.SmartComponent;


import com.SAPTOOL.ui.Init;
import com.SAPTOOL.ui.SmartHub.SmartGen.CreateTestScript;
import com.SAPTOOL.utils.GlobalConstants;

import java.sql.SQLOutput;

/**
 *
 * @author bvatrapu
 */
public class SelectWebdriverOperation extends javax.swing.JFrame {

    String object;

    /**
     * Creates new form SelectWebdriverOperation
     */
    public SelectWebdriverOperation() {
        initComponents();
    }


    private void initComponents() {

        cbWebdriverOperations = new javax.swing.JComboBox<>();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbWebdriverOperations.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "click()", "getText()", "isDisplayed()", "isEnabled()", "isSelected()", "sendKeys(\"\")", "clear()", "submit()" }));

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(cbWebdriverOperations, 0, 438, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(cbWebdriverOperations)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void initload(String object){
        this.object=object;
    }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {
        String pagename=null;
        String step= this.object+"."+cbWebdriverOperations.getSelectedItem().toString();

        if(GlobalConstants.Method_Verify){
            System.out.println(GlobalConstants.Method_Selected_Page_Name+">>>>"+Verify.Selected_Page);
            if(GlobalConstants.Method_Selected_Page_Name.equalsIgnoreCase(Verify.Selected_Page)){
                Init.verification_steps_ListModel.addElement(step);
                Verify.listVerificationPoint.setModel(Init.verification_steps_ListModel);
            } else{
                pagename = GlobalConstants.Method_Selected_Page_Name.substring(0, GlobalConstants.Method_Selected_Page_Name.length() - 4);
                step = pagename.toLowerCase()+"."+step;
                Init.verification_steps_ListModel.addElement(step);
                Verify.listVerificationPoint.setModel(Init.verification_steps_ListModel);
            }


        }else {
            Init.testScript_steps_ListModel.addElement(step);
            CreateTestScript.listTestScriptSteps.setModel(Init.testScript_steps_ListModel);
        }

        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectWebdriverOperation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cbWebdriverOperations;
    // End of variables declaration
}

