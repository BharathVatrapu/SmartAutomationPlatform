package com.SAPTOOL.ui.SmartHub.Methods;


import com.SAPTOOL.ui.Init;
import com.SAPTOOL.frameworkbuilder.PageBuilder;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bvatrapu
 */
public class SmartComponent extends JFrame {

    private static final String upString = "Move up";
    private static final String downString = "Move down";
    private static final String deleteString = "Delete";
    /**
     * Creates new form SmartComponent
     */
    public SmartComponent() {
        initComponents();
    }


    private void initComponents() {

        txtMethodName = new JLabel();
        btnOperations = new JButton();
        btnMethods = new JButton();
        btnObjects = new JButton();
        btnDevelopUtils = new JButton();
        jScrollPane1 = new JScrollPane();
        listPageMethodSteps = new JList<>();
        btnDone = new JButton();
        btnUp = new JButton();
        btnDown = new JButton();
        btnDelete = new JButton();
        btnSwap = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        txtMethodName.setText("jLabel1");

        btnOperations.setText("Operations");
        btnOperations.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnOperationsActionPerformed(evt);
            }
        });

        btnMethods.setText("Methods");
        btnMethods.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMethodsActionPerformed(evt);
            }
        });

        btnObjects.setText("Objects");
        btnObjects.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnObjectsActionPerformed(evt);
            }
        });

        btnDevelopUtils.setText("Developer Mode");
        btnDevelopUtils.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDevelopUtilsActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listPageMethodSteps);

        btnDone.setText("Done");
        btnDone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });


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
        btnSwap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(330, 330, 330)
                                                .addComponent(btnDone, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 762, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btnUp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(btnDown, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                                                        .addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(btnSwap, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnObjects)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(btnOperations)
                                                                .addGap(36, 36, 36)
                                                                .addComponent(btnMethods)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(btnDevelopUtils))
                                                        .addComponent(txtMethodName, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txtMethodName)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addComponent(btnUp, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(btnDown, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(btnSwap, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btnObjects)
                                                                        .addComponent(btnOperations)
                                                                        .addComponent(btnMethods))
                                                                .addGap(26, 26, 26))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnDevelopUtils)
                                                                .addGap(43, 43, 43)))
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addComponent(btnDone, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void initload(){
        txtMethodName.setText(GlobalConstants.TestScript_Selected_Page_Name+" >>> "+GlobalConstants.Method_Name);
    }
    private void btnObjectsActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnOperationsActionPerformed(ActionEvent evt) {
        PageComponents pageComponents=new PageComponents();
        pageComponents.setVisible(true);
        PageComponents.initOperations();
    }

    private void btnMethodsActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnDevelopUtilsActionPerformed(ActionEvent evt) {

    }

    private void btnDoneActionPerformed(ActionEvent evt) {
        DefaultListModel defaultListModel=new DefaultListModel();
        defaultListModel.clear();
        for (int i = 0; i < listPageMethodSteps.getModel().getSize(); i++) {
            defaultListModel.addElement(String.valueOf(listPageMethodSteps.getModel().getElementAt(i)));
        }
        PageBuilder.pageBuilder(PageBuilder.method_Builder(defaultListModel),"METHOD");
        listPageMethodSteps.removeSelectionInterval(0,listPageMethodSteps.getModel().getSize());
        Init.page_method_steps_ListModel.clear();

        dispose();
    }

    private void btnSwapActionPerformed(ActionEvent evt) {
        int swapEle[]=listPageMethodSteps.getSelectedIndices();
        swap(swapEle[0], swapEle[1]);
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
    private JButton btnDelete;
    private JButton btnDevelopUtils;
    private JButton btnDone;
    private JButton btnDown;
    private JButton btnMethods;
    private JButton btnObjects;
    private JButton btnOperations;
    private JButton btnUp;
    private JButton btnSwap;
    public static JList<String> listPageMethodSteps;
    private JScrollPane jScrollPane1;
    public static JLabel txtMethodName;


    // End of variables declaration
}

