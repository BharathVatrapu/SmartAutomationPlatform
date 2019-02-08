package com.SAPTOOL.ui.SmartHub.SmartGen;

import com.SAPTOOL.ui.Init;
import com.SAPTOOL.ui.SmartHub.SmartComponent.SmartComponent;
import com.SAPTOOL.utils.GlobalConstants;

/**
 *
 * @author bvatrapu
 */
public class AddStep extends javax.swing.JFrame {

    /**
     * Creates new form AddStep
     */
    public AddStep() {
        initComponents();
    }

    private void initComponents() {

        txtStepNo = new javax.swing.JLabel();
        txtStepCounter = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        txtExpected = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputExpected = new javax.swing.JTextArea();
        txtFailMessage = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputFailMsg = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtStepNo.setText("Step NO: ");

        txtStepCounter.setText("0");

        txtDescription.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(0, 0, 204));
        txtDescription.setText("Description: ");

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        inputDescription.setColumns(20);
        inputDescription.setRows(5);
        jScrollPane1.setViewportView(inputDescription);

        txtExpected.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtExpected.setForeground(new java.awt.Color(0, 153, 0));
        txtExpected.setText("Expected: ");

        inputExpected.setColumns(20);
        inputExpected.setForeground(new java.awt.Color(0, 153, 0));
        inputExpected.setRows(5);
        jScrollPane2.setViewportView(inputExpected);

        txtFailMessage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFailMessage.setForeground(new java.awt.Color(255, 0, 0));
        txtFailMessage.setText("Fail Message: ");

        inputFailMsg.setColumns(20);
        inputFailMsg.setForeground(new java.awt.Color(255, 0, 51));
        inputFailMsg.setRows(5);
        jScrollPane3.setViewportView(inputFailMsg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtFailMessage)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtExpected)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtDescription)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(txtStepNo)
                                                                        .addGap(27, 27, 27)
                                                                        .addComponent(txtStepCounter)))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(62, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(338, 338, 338))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtStepNo)
                                        .addComponent(txtStepCounter))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDescription)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(txtExpected))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFailMessage))
                                .addGap(40, 40, 40)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void initLoad(){
        GlobalConstants.STEP_NO=GlobalConstants.STEP_NO+1;
        txtStepCounter.setText(Integer.toString(GlobalConstants.STEP_NO));
    }
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        GlobalConstants.STEP_DESCRIPTION=inputDescription.getText();
        GlobalConstants.STEP_EXPECTED=inputExpected.getText();
        GlobalConstants.STEP_FAILMESSAGE=inputFailMsg.getText();
        Init.testScript_steps_ListModel.addElement(System.lineSeparator());
        Init.testScript_steps_ListModel.addElement("//"+"Step No: "+GlobalConstants.STEP_NO);
        Init.testScript_steps_ListModel.addElement("//"+"Description: "+GlobalConstants.STEP_DESCRIPTION);
        CreateTestScript.listTestScriptSteps.setModel(Init.testScript_steps_ListModel);
        CreateTestScript.ttCounter.setText(Integer.toString(GlobalConstants.STEP_NO));
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCreate;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JTextArea inputExpected;
    private javax.swing.JTextArea inputFailMsg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtExpected;
    private javax.swing.JLabel txtFailMessage;
    public static javax.swing.JLabel txtStepCounter;
    public static javax.swing.JLabel txtStepNo;
    // End of variables declaration
}

