package com.SAPTOOL.ui.SmartHub.SmartGen;

import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import java.io.File;

/**
 *
 * @author bvatrapu
 */
public class CreateTestScript extends javax.swing.JFrame {

    /**
     * Creates new form CreateNewMethod
     */
    public CreateTestScript() {
        initComponents();
    }


    private void initComponents() {

        txtScriptname = new javax.swing.JLabel();
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
        btnUtils = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTestScriptSteps = new javax.swing.JList<>();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSwap = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboSelectpage = new javax.swing.JComboBox<>();
        btnAaddStep = new javax.swing.JButton();
        txtScriptStepsCounter = new javax.swing.JLabel();
        ttCounter = new javax.swing.JLabel();
        btnTestdataConfig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtScriptname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtScriptname.setText("Scriptname");

        panelOperations.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        btnUtils.setText("Utils");
        btnUtils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtilsActionPerformed(evt);
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
                                                .addGap(37, 37, 37)
                                                .addComponent(btnComment)
                                                .addGap(40, 40, 40)
                                                .addComponent(btnWait, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnUtils, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelOperationsLayout.createSequentialGroup()
                                                .addComponent(btnOperations)
                                                .addGap(40, 40, 40)
                                                .addComponent(btnMethods)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnActions, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(btnDevelopUtils, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
        );
        panelOperationsLayout.setVerticalGroup(
                panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperationsLayout.createSequentialGroup()
                                .addGroup(panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelOperationsLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnDevelopUtils, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(panelOperationsLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnMethods, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnActions, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                                .addGroup(panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAssert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnComment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnWait, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnUtils, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26))
        );

        jScrollPane1.setViewportView(listTestScriptSteps);

        btnUp.setText("UP");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        btnDown.setText("Down");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        btnDelete.setText("Del");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSwap.setText("Swap");
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Page:  ");

        btnAaddStep.setText("Add Step");
        btnAaddStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAaddStepActionPerformed(evt);
            }
        });

        txtScriptStepsCounter.setText("Script Steps Counter:  ");

        ttCounter.setText("0");

        btnTestdataConfig.setText("Testdata setup");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(439, 439, 439))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnAaddStep, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(47, 47, 47)
                                                                .addComponent(txtScriptStepsCounter)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(ttCounter))
                                                        .addComponent(txtScriptname))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(comboSelectpage, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(227, 227, 227)
                                                                .addComponent(btnTestdataConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(panelOperations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnDown)
                                                        .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSwap, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtScriptname)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(comboSelectpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(btnTestdataConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAaddStep, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtScriptStepsCounter)
                                        .addComponent(ttCounter))
                                .addGap(18, 18, 18)
                                .addComponent(panelOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnSwap, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void initLoad(){
        comboSelectpage.removeAllItems();
        String[] allPages=null;
        String page=null;
        allPages = Generic.getAllFileNames(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+"/");
        for(int i=0;i<=allPages.length-1;i++){
            if(allPages[i].contains(".java")){
                page=allPages[i].replaceAll(".java","");
            }
            comboSelectpage.addItem(page);
        }
    }

    private void btnObjectsActionPerformed(java.awt.event.ActionEvent evt) {
       PageObjects pageObjects=new PageObjects();
        pageObjects.setVisible(true);
        GlobalConstants.Method_Selected_Page_Name=comboSelectpage.getSelectedItem().toString();
        pageObjects.initLoad();
    }

    private void btnOperationsActionPerformed(java.awt.event.ActionEvent evt) {
        PageOperations pageOperations=new PageOperations();
        pageOperations.setVisible(true);
        GlobalConstants.Method_Selected_Page_Name=comboSelectpage.getSelectedItem().toString();
        pageOperations.initLoad();
    }

    private void btnMethodsActionPerformed(java.awt.event.ActionEvent evt) {
        PageMethods pageMethods = new PageMethods();
        pageMethods.setVisible(true);
        GlobalConstants.Method_Selected_Page_Name=comboSelectpage.getSelectedItem().toString();
        pageMethods.initLoad();
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
        // TODO add your handling code here:
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnWaitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnActionsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnAssertActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnUtilsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void btnAaddStepActionPerformed(java.awt.event.ActionEvent evt) {
        AddStep addStep=new AddStep();
        addStep.setVisible(true);
        AddStep.initLoad();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateTestScript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTestScript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTestScript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTestScript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTestScript().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAaddStep;
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
    private javax.swing.JButton btnTestdataConfig;
    private javax.swing.JButton btnUp;
    private javax.swing.JButton btnUtils;
    private javax.swing.JButton btnVerify;
    private javax.swing.JButton btnWait;
    public static javax.swing.JComboBox<String> comboSelectpage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> listTestScriptSteps;
    private javax.swing.JPanel panelOperations;
    public static javax.swing.JLabel ttCounter;
    public static javax.swing.JLabel txtScriptStepsCounter;
    private javax.swing.JLabel txtScriptname;
    // End of variables declaration
}
