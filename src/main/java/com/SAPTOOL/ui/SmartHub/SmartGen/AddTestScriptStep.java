package com.SAPTOOL.ui.SmartHub.SmartGen;


import com.SAPTOOL.frameworkbuilder.PageBuilder;
import com.SAPTOOL.ui.Init;
import com.SAPTOOL.ui.SmartHub.SmartComponent.SmartComponent;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 *
 * @author bvatrapu
 */
public class AddTestScriptStep extends javax.swing.JFrame {

    private static final String upString = "Move up";
    private static final String downString = "Move down";
    private static final String deleteString = "Delete";

    /**
     * Creates new form AddTestScriptStep
     */
    public AddTestScriptStep() {
        initComponents();
    }


    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputExpected = new javax.swing.JTextArea();
        panelControls = new javax.swing.JPanel();
        btnObjects = new javax.swing.JButton();
        btnOperations = new javax.swing.JButton();
        btnMethods = new javax.swing.JButton();
        btnActions = new javax.swing.JButton();
        btnComment = new javax.swing.JButton();
        btnWait = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        btnUtils = new javax.swing.JButton();
        btnAssert = new javax.swing.JButton();
        panelScriptControls = new javax.swing.JPanel();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSwap = new javax.swing.JButton();
        btnDevelopUtils = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listScriptSteps = new javax.swing.JList<>();
        btnCreate = new javax.swing.JButton();
        txtStepNo = new javax.swing.JLabel();
        txtStepCounter = new javax.swing.JLabel();
        btnAddTestdata = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddTestScriptStep");

        inputDescription.setColumns(20);
        inputDescription.setRows(5);
        inputDescription.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane1.setViewportView(inputDescription);

        inputExpected.setColumns(20);
        inputExpected.setRows(5);
        inputExpected.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expected", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane2.setViewportView(inputExpected);

        panelControls.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controls", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnObjects.setText("Objects");
        btnObjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjectsActionPerformed(evt);
            }
        });

        btnOperations.setText("Object Operations");
        btnOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationsActionPerformed(evt);
            }
        });

        btnMethods.setText("Business Methods");
        btnMethods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethodsActionPerformed(evt);
            }
        });

        btnActions.setText("Actions");
        btnActions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionsActionPerformed(evt);
            }
        });

        btnComment.setText("Comment");
        btnComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentActionPerformed(evt);
            }
        });

        btnWait.setText("Wait");
        btnWait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaitActionPerformed(evt);
            }
        });

        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        btnUtils.setText("Utils");
        btnUtils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtilsActionPerformed(evt);
            }
        });

        btnAssert.setText("Assert");
        btnAssert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlsLayout = new javax.swing.GroupLayout(panelControls);
        panelControls.setLayout(panelControlsLayout);
        panelControlsLayout.setHorizontalGroup(
                panelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelControlsLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(panelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelControlsLayout.createSequentialGroup()
                                                .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAssert, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnComment)
                                                .addGap(33, 33, 33)
                                                .addComponent(btnWait, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelControlsLayout.createSequentialGroup()
                                                .addComponent(btnObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnOperations)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnMethods)))
                                .addGap(18, 18, 18)
                                .addGroup(panelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnActions, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUtils, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelControlsLayout.setVerticalGroup(
                panelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelControlsLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(panelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMethods, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnActions, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAssert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnComment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnWait, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUtils, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelScriptControls.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnUp.setText("Up");
        btnUp.setActionCommand(upString);
        btnUp.addActionListener(new UpDownListener());

        btnDown.setText("Down");
        btnDown.setActionCommand(downString);
        btnDown.addActionListener(new UpDownListener());

        btnDelete.setText("Delete");
        btnDelete.setActionCommand(deleteString);
        btnDelete.addActionListener(new DeleteButtonListener());

        btnSwap.setText("Swap");
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelScriptControlsLayout = new javax.swing.GroupLayout(panelScriptControls);
        panelScriptControls.setLayout(panelScriptControlsLayout);
        panelScriptControlsLayout.setHorizontalGroup(
                panelScriptControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelScriptControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelScriptControlsLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(panelScriptControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panelScriptControlsLayout.createSequentialGroup()
                                                        .addComponent(btnDelete)
                                                        .addGap(30, 30, 30)
                                                        .addComponent(btnSwap, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panelScriptControlsLayout.createSequentialGroup()
                                                        .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(38, Short.MAX_VALUE)))
        );
        panelScriptControlsLayout.setVerticalGroup(
                panelScriptControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 151, Short.MAX_VALUE)
                        .addGroup(panelScriptControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelScriptControlsLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(panelScriptControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnUp)
                                                .addComponent(btnDown))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addGroup(panelScriptControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnDelete)
                                                .addComponent(btnSwap))
                                        .addGap(32, 32, 32)))
        );

        btnDevelopUtils.setText("Developer Mode");
        btnDevelopUtils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevelopUtilsActionPerformed(evt);
            }
        });

        listScriptSteps.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Automation Code", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane3.setViewportView(listScriptSteps);

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(51, 51, 51));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtStepNo.setText("Step NO: ");

        txtStepCounter.setText("0");

        btnAddTestdata.setText("Add Testdata");
        btnAddTestdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTestdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(panelControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnDevelopUtils)
                                                        .addComponent(btnAddTestdata, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(panelScriptControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane3)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(txtStepNo)
                                                .addGap(27, 27, 27)
                                                .addComponent(txtStepCounter)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStepNo)
                                        .addComponent(txtStepCounter))
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(panelControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(panelScriptControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(btnDevelopUtils, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAddTestdata, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void initLoad(){
        GlobalConstants.STEP_NO=GlobalConstants.STEP_NO+1;
        txtStepCounter.setText(Integer.toString(GlobalConstants.STEP_NO));
        Init.Add_TestScript_step_ListModel.removeAllElements();

    }
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        GlobalConstants.STEP_DESCRIPTION=inputDescription.getText();
        GlobalConstants.STEP_EXPECTED=inputExpected.getText();

        Init.TestScript_LisModel.addElement(System.lineSeparator());
        Init.TestScript_LisModel.addElement("//Step No: "+GlobalConstants.STEP_NO);
        Init.TestScript_LisModel.addElement("//Step Description: "+GlobalConstants.STEP_DESCRIPTION);
        //Generic.createFolder(GlobalConstants.SELECTED_PROJECT_PATH + File.separator +GlobalConstants.TEST_FRAMEWORK_TESTSUITES_FOLDER+File.separator+GlobalConstants.SCRIPT_NAME+".java");
        //DefaultListModel defaultListModel=new DefaultListModel();
        //defaultListModel.clear();
        for (int i = 0; i < listScriptSteps.getModel().getSize(); i++) {
            //defaultListModel.addElement(String.valueOf(listScriptSteps.getModel().getElementAt(i)));
            Init.TestScript_LisModel.addElement(String.valueOf(listScriptSteps.getModel().getElementAt(i)));
        }

        CreateTestScript.listTestScriptSteps.setModel(Init.TestScript_LisModel);
        Init.TestScript_ManualSteps.put(GlobalConstants.STEP_DESCRIPTION,GlobalConstants.STEP_EXPECTED);

        CreateTestScript.tblManualSteps.setModel(CreateTestScript.getModel());
      //  defaultListModel.addElement("//SAP-END - METHOD");
//        PageBuilder.scriptBuilder(PageBuilder.script_body_builder(defaultListModel));
//        listScriptSteps.removeSelectionInterval(0,listScriptSteps.getModel().getSize());
       // Init.page_method_steps_ListModel.clear();

        dispose();
    }
    private void btnObjectsActionPerformed(java.awt.event.ActionEvent evt) {
        GlobalConstants.TestScript_Button_Name="OBJECT";
        SelectPage selectPage=new SelectPage();
        selectPage.setVisible(true);
        SelectPage.initLoad();
    }

    private void btnOperationsActionPerformed(java.awt.event.ActionEvent evt) {
        GlobalConstants.TestScript_Button_Name="OPERATION";
        SelectPage selectPage=new SelectPage();
        selectPage.setVisible(true);
        SelectPage.initLoad();
    }

    private void btnMethodsActionPerformed(java.awt.event.ActionEvent evt) {
        GlobalConstants.TestScript_Button_Name="METHOD";
        SelectPage selectPage=new SelectPage();
        selectPage.setVisible(true);
        SelectPage.initLoad();
    }

    private void btnActionsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {
        btnVerify.setEnabled(false);
        listScriptSteps.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3,new java.awt.Color(0,122,181) ));

        GlobalConstants.VERIFY_SCRIPT_COMMAND=true;
    }

    private void btnAssertActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnWaitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnUtilsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnDevelopUtilsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnAddTestdataActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    class UpDownListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //This method can be called only when
            //there's a valid selection,
            //so go ahead and move the list item.

            int moveMe = listScriptSteps.getSelectedIndex();

            if (e.getActionCommand().equals(upString)) {
                //UP ARROW BUTTON
                if (moveMe != 0) {
                    //not already at top
                    swap(moveMe, moveMe - 1);
                    listScriptSteps.setSelectedIndex(moveMe - 1);
                    listScriptSteps.ensureIndexIsVisible(moveMe - 1);
                }
            } else {
                //DOWN ARROW BUTTON
                if (moveMe != Init.Add_TestScript_step_ListModel.getSize() - 1) {
                    //not already at bottom
                    swap(moveMe, moveMe + 1);
                    listScriptSteps.setSelectedIndex(moveMe + 1);
                    listScriptSteps.ensureIndexIsVisible(moveMe + 1);
                }
            }
        }
    }
    class DeleteButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            /*
             * This method can be called only if there's a valid selection, so
             * go ahead and remove whatever's selected.
             */

            ListSelectionModel lsm = listScriptSteps.getSelectionModel();
            int firstSelected = lsm.getMinSelectionIndex();
            int lastSelected = lsm.getMaxSelectionIndex();
            Init.Add_TestScript_step_ListModel.removeRange(firstSelected, lastSelected);

            int size = Init.Add_TestScript_step_ListModel.size();

            if (size == 0) {
                //List is empty: disable delete, up, and down buttons.
                btnDelete.setEnabled(false);
                btnUp.setEnabled(false);
                btnDown.setEnabled(false);
                btnSwap.setEnabled(false);

            } else {
                //Adjust the selection.
                if (firstSelected == Init.page_method_steps_ListModel.getSize()) {
                    //Removed item in last position.
                    firstSelected--;
                }
                listScriptSteps.setSelectedIndex(firstSelected);
                btnDelete.setEnabled(true);
                btnUp.setEnabled(true);
                btnDown.setEnabled(true);
                btnSwap.setEnabled(true);
            }
        }
    }
    //Swap two elements in the list.
    private void swap(int a, int b) {
        Object aObject = Init.Add_TestScript_step_ListModel.getElementAt(a);
        Object bObject = Init.Add_TestScript_step_ListModel.getElementAt(b);
        Init.Add_TestScript_step_ListModel.set(a, bObject);
        Init.Add_TestScript_step_ListModel.set(b, aObject);
    }
    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {
        int swapEle[]=listScriptSteps.getSelectedIndices();
        swap(swapEle[0], swapEle[1]);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTestScriptStep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnActions;
    private javax.swing.JButton btnAddTestdata;
    private javax.swing.JButton btnAssert;
    private javax.swing.JButton btnComment;
    private javax.swing.JButton btnCreate;
    public static javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDevelopUtils;
    public static javax.swing.JButton btnDown;
    private javax.swing.JButton btnMethods;
    private javax.swing.JButton btnObjects;
    private javax.swing.JButton btnOperations;
    public static javax.swing.JButton btnSwap;
    public static javax.swing.JButton btnUp;
    private javax.swing.JButton btnUtils;
    public static javax.swing.JButton btnVerify;
    private javax.swing.JButton btnWait;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JTextArea inputExpected;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JList<String> listScriptSteps;
    private javax.swing.JPanel panelControls;
    private javax.swing.JPanel panelScriptControls;
    public static javax.swing.JLabel txtStepCounter;
    private javax.swing.JLabel txtStepNo;
    // End of variables declaration
}

