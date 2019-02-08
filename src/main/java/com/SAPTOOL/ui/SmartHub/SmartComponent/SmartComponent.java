package com.SAPTOOL.ui.SmartHub.SmartComponent;


import com.SAPTOOL.frameworkbuilder.PageBuilder;
import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bvatrapu
 */
public class SmartComponent extends javax.swing.JFrame {
    private static final String upString = "Move up";
    private static final String downString = "Move down";
    private static final String deleteString = "Delete";
    /**
     * Creates new form CreateNewMethod
     */
    public SmartComponent() {
        initComponents();
    }


    private void initComponents() {

        txtPageName = new javax.swing.JLabel();
        txtMethodName = new javax.swing.JLabel();
        inputMethodName = new javax.swing.JTextField();
        txtDescription = new javax.swing.JLabel();
        inputMethodDesc = new javax.swing.JTextField();
        cbMethodParameters = new javax.swing.JCheckBox();
        panelOperations = new javax.swing.JPanel();
        btnObjects = new javax.swing.JButton();
        btnOperations = new javax.swing.JButton();
        btnMethods = new javax.swing.JButton();
        btnDevelopUtils = new javax.swing.JButton();
        btnComment = new javax.swing.JButton();
        btnActions = new javax.swing.JButton();
        btnWait = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        btnAssert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPageMethodSteps = new javax.swing.JList<>();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSwap = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPageName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPageName.setText("PageName");

        txtMethodName.setText("Method Name: ");

        inputMethodName.setText("    ");

        txtDescription.setText("Description:");

        cbMethodParameters.setText("    Method Parameters");

        panelOperations.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnObjects.setText("Objects");
        btnObjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjectsActionPerformed(evt);
            }
        });

        btnOperations.setText("Operations");
        btnOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationsActionPerformed(evt);
            }
        });

        btnMethods.setText("Methods");
        btnMethods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethodsActionPerformed(evt);
            }
        });

        btnDevelopUtils.setText("Developer Mode");
        btnDevelopUtils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevelopUtilsActionPerformed(evt);
            }
        });

        btnComment.setText("Comment");
        btnComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentActionPerformed(evt);
            }
        });

        btnActions.setText("Actions");
        btnActions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionsActionPerformed(evt);
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

        btnAssert.setText("Assert");
        btnAssert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOperationsLayout = new javax.swing.GroupLayout(panelOperations);
        panelOperations.setLayout(panelOperationsLayout);
        panelOperationsLayout.setHorizontalGroup(
                panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelOperationsLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelOperationsLayout.createSequentialGroup()
                                                .addComponent(btnAssert, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(btnComment)
                                                .addGap(48, 48, 48)
                                                .addComponent(btnWait, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelOperationsLayout.createSequentialGroup()
                                                .addComponent(btnOperations)
                                                .addGap(40, 40, 40)
                                                .addComponent(btnMethods)
                                                .addGap(46, 46, 46)
                                                .addComponent(btnActions, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDevelopUtils)
                                .addGap(79, 79, 79))
        );
        panelOperationsLayout.setVerticalGroup(
                panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelOperationsLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMethods, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnActions, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAssert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnComment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnWait, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperationsLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDevelopUtils, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
        );

        jScrollPane1.setViewportView(listPageMethodSteps);

        btnUp.setText("UP");
        btnUp.setActionCommand(upString);
        btnUp.addActionListener(new UpDownListener());

        btnDown.setText("Down");
        btnDown.setActionCommand(downString);
        btnDown.addActionListener(new UpDownListener());


        btnDelete.setText("Del");
        btnDelete.setActionCommand(deleteString);
        btnDelete.addActionListener(new DeleteButtonListener());

        btnSwap.setText("Swap");
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(369, 369, 369))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtPageName)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(panelOperations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtMethodName)
                                                                        .addComponent(txtDescription))
                                                                .addGap(34, 34, 34)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(inputMethodName, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                                                                .addComponent(cbMethodParameters))
                                                                        .addComponent(inputMethodDesc))))
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnDown)
                                                        .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSwap, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtPageName)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtMethodName)
                                        .addComponent(inputMethodName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbMethodParameters))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputMethodDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDescription))
                                .addGap(23, 23, 23)
                                .addComponent(panelOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnSwap, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initLoad() {
        txtPageName.setText(GlobalConstants.Method_Selected_Page_Name);
    }

    private void btnObjectsActionPerformed(java.awt.event.ActionEvent evt) {
        PageObjects pageObjects=new PageObjects();
        pageObjects.setVisible(true);
        pageObjects.initLoad();
    }

    private void btnOperationsActionPerformed(java.awt.event.ActionEvent evt) {
        PageOperations pageOperations=new PageOperations();
        pageOperations.setVisible(true);
        pageOperations.initLoad();
    }

    private void btnMethodsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnDevelopUtilsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {
        int swapEle[]=listPageMethodSteps.getSelectedIndices();
        swap(swapEle[0], swapEle[1]);
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        GlobalConstants.Method_Name= Generic.removeSpecialChars(inputMethodName.getText());
        GlobalConstants.Method_Description = inputMethodDesc.getText();
        GlobalConstants.Method_args_status = cbMethodParameters.isSelected();

        DefaultListModel defaultListModel=new DefaultListModel();
        defaultListModel.clear();
        for (int i = 0; i < listPageMethodSteps.getModel().getSize(); i++) {
            defaultListModel.addElement(String.valueOf(listPageMethodSteps.getModel().getElementAt(i)));
        }
        defaultListModel.addElement("//SAP-END - METHOD");
        PageBuilder.pageBuilder(PageBuilder.method_Builder(defaultListModel),"METHOD");
        listPageMethodSteps.removeSelectionInterval(0,listPageMethodSteps.getModel().getSize());
        Init.page_method_steps_ListModel.clear();

        dispose();
    }

    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnWaitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {
        //listPageMethodSteps.setBorder(BorderFactory.createMatteBorder(2, 2, 5, 5,new Color(0,122,181) ));
        GlobalConstants.Method_Verify=true;
        Verify verify=new Verify();
        verify.setVisible(true);
        verify.initLoad();
    }

    private void btnAssertActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnActionsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    class UpDownListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //This method can be called only when
            //there's a valid selection,
            //so go ahead and move the list item.

            int moveMe = listPageMethodSteps.getSelectedIndex();

            if (e.getActionCommand().equals(upString)) {
                //UP ARROW BUTTON
                if (moveMe != 0) {
                    //not already at top
                    swap(moveMe, moveMe - 1);
                    listPageMethodSteps.setSelectedIndex(moveMe - 1);
                    listPageMethodSteps.ensureIndexIsVisible(moveMe - 1);
                }
            } else {
                //DOWN ARROW BUTTON
                if (moveMe != Init.page_method_steps_ListModel.getSize() - 1) {
                    //not already at bottom
                    swap(moveMe, moveMe + 1);
                    listPageMethodSteps.setSelectedIndex(moveMe + 1);
                    listPageMethodSteps.ensureIndexIsVisible(moveMe + 1);
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

            ListSelectionModel lsm = listPageMethodSteps.getSelectionModel();
            int firstSelected = lsm.getMinSelectionIndex();
            int lastSelected = lsm.getMaxSelectionIndex();
            Init.page_method_steps_ListModel.removeRange(firstSelected, lastSelected);

            int size = Init.page_method_steps_ListModel.size();

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
                listPageMethodSteps.setSelectedIndex(firstSelected);
            }
        }
    }
    //Swap two elements in the list.
    private void swap(int a, int b) {
        Object aObject = Init.page_method_steps_ListModel.getElementAt(a);
        Object bObject = Init.page_method_steps_ListModel.getElementAt(b);
        Init.page_method_steps_ListModel.set(a, bObject);
        Init.page_method_steps_ListModel.set(b, aObject);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartComponent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnActions;
    private javax.swing.JButton btnAssert;
    private javax.swing.JButton btnComment;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDevelopUtils;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnMethods;
    private javax.swing.JButton btnObjects;
    private javax.swing.JButton btnOperations;
    private javax.swing.JButton btnSwap;
    private javax.swing.JButton btnUp;
    private javax.swing.JButton btnVerify;
    private javax.swing.JButton btnWait;
    private javax.swing.JCheckBox cbMethodParameters;
    private javax.swing.JTextField inputMethodDesc;
    private javax.swing.JTextField inputMethodName;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> listPageMethodSteps;
    private javax.swing.JPanel panelOperations;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtMethodName;
    private javax.swing.JLabel txtPageName;
    // End of variables declaration
}
