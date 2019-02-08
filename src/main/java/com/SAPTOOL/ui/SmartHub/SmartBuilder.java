package com.SAPTOOL.ui.SmartHub;


import com.SAPTOOL.frameworkbuilder.FrameworkBuilder;
import com.SAPTOOL.ui.SmartHub.Methods.CreateNewMethod;
import com.SAPTOOL.tables.ViewPagesTable;
import com.SAPTOOL.tables.ViewPagesTableModel;
import com.SAPTOOL.ui.SmartHub.SmartComponent.SmartComponent;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bvatrapu
 */
public class SmartBuilder extends JPanel {

    public static ViewPagesTableModel viewPagesTableModel = null;
    public static String selected_Page = null;
    public static SmartBuilder_New smartBuilder_new=null;
    /**
     * Creates new form Projects
     */
    public SmartBuilder() {
        initComponents();
        initLoad();
    }


    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        tblPages = new JTable();
        btnObjectBuilder = new JButton();
        btncomponentBuilder = new JButton();
        imgRobo = new JLabel();
        jLabel9 = new JLabel();
        btnCreatePage = new JButton();
        txtCreate = new JLabel();
        btnViewPage = new JButton();
        txtViewPage = new JLabel();
        btnDelete = new JButton();
        txtDelete = new JLabel();

        setBackground(new Color(255, 255, 255));

        tblPages.setAutoCreateRowSorter(true);
        //tblPages.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        tblPages.setFont(new Font("Tahoma", 0, 24));
//        tblPages.setModel(new javax.swing.table.DefaultTableModel(
//                new Object [][] {
//                        {null, null},
//                        {null, null},
//                        {null, null},
//                        {null, null},
//                        {null, null},
//                        {null, null},
//                        {null, null}
//                },
//                new String [] {
//                        "Sno", "Page"
//                }
//        ));
        tblPages.setFocusable(false);
       // tblPages.setGridColor(new java.awt.Color(255, 255, 255));
        tblPages.setIntercellSpacing(new Dimension(0, 0));
        tblPages.setRowHeight(50);
        tblPages.setShowVerticalLines(true);
        tblPages.setRowMargin(5);
        tblPages.getTableHeader().setReorderingAllowed(false);
        tblPages.getTableHeader().setFont(new Font("Segoe UI", 0, 24));
        tblPages.getTableHeader().setReorderingAllowed(false);
        tblPages.getTableHeader().setOpaque(false);
        tblPages.getTableHeader().setBackground(new Color(32,136,203));
        tblPages.getTableHeader().setForeground(new Color(255,255,255));
        tblPages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPagesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPages);
        tblPages.getSelectionModel().addListSelectionListener(new SelectionListener());

        btnObjectBuilder.setFont(new Font("Tahoma", 0, 24));
        btnObjectBuilder.setBorderPainted(true);
        btnObjectBuilder.setFocusPainted(false);
        btnObjectBuilder.setBackground(new Color(0, 122, 181));
        btnObjectBuilder.setForeground(new Color(255, 255, 255));
        //btnObjectBuilder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/smarthub/Select_Project_48px.png")));
        btnObjectBuilder.setText("Smart Object");
        btnObjectBuilder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjectBuilderActionPerformed(evt);
            }
        });

        btncomponentBuilder.setFont(new Font("Tahoma", 0, 24));
        btncomponentBuilder.setBorderPainted(true);
        btncomponentBuilder.setFocusPainted(false);
        btncomponentBuilder.setBackground(new Color(0, 122, 181));
        btncomponentBuilder.setForeground(new Color(255, 255, 255));
     //   btncomponentBuilder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/smarthub/Button-Red-Cancel-icon_48px.png")));
        btncomponentBuilder.setText("Smart Component");
        btncomponentBuilder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomponentBuilderActionPerformed(evt);
            }
        });

        imgRobo.setIcon(new ImageIcon(getClass().getResource("/icons/smarthub/projects_robo.png")));

        jLabel9.setText("         ");
        txtCreate.setFont(new Font("Tahoma", 1, 12));
        txtCreate.setForeground(new Color(255, 255, 255));
        txtCreate.setText("Create New Page");

        btnCreatePage.setBackground(new Color(255, 255, 255));
        btnCreatePage.setBorderPainted(false);
        btnCreatePage.setFocusPainted(false);
        btnCreatePage.setIcon(new ImageIcon(getClass().getResource("/icons/smarthub/Add_List_48px.png")));
        btnCreatePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreatePageActionPerformed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCreate.setForeground(new Color(0, 102, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCreate.setForeground(new Color(255, 255, 255));
            }
        });

        txtViewPage.setFont(new Font("Tahoma", 1, 12));
        txtViewPage.setForeground(new Color(255, 255, 255));
        txtViewPage.setText("View/Edit Page");

        btnViewPage.setBackground(new Color(255, 255, 255));
        btnViewPage.setBorderPainted(false);
        btnViewPage.setFocusPainted(false);
        btnViewPage.setIcon(new ImageIcon(getClass().getResource("/icons/smarthub/View_48px.png")));
        btnViewPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewPageActionPerformed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtViewPage.setForeground(new Color(0, 102, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtViewPage.setForeground(new Color(255, 255, 255));
            }
        });


        txtDelete.setFont(new Font("Tahoma", 1, 12));
        txtDelete.setForeground(new Color(255, 255, 255));
        txtDelete.setText("Delete Page");

        btnDelete.setBackground(new Color(255, 255, 255));
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.setIcon(new ImageIcon(getClass().getResource("/icons/smarthub/Delete_File_48px.png")));

        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteActionPerformed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDelete.setForeground(new Color(0, 102, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDelete.setForeground(new Color(255, 255, 255));
            }
        });



        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(btnObjectBuilder, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                                .addGap(154, 154, 154)
                                                .addComponent(btncomponentBuilder, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 770, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnCreatePage, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtCreate))
                                                                .addGap(85, 85, 85)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnViewPage, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(txtViewPage)))
                                                                .addGap(84, 84, 84)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(txtDelete)))))
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel9)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(imgRobo, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(btnCreatePage, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtCreate))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnViewPage, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtViewPage))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtDelete)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnObjectBuilder, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btncomponentBuilder, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                                .addGap(64, 64, 64))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(imgRobo, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(35, Short.MAX_VALUE))))
        );
    }

    private void btnObjectBuilderActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btncomponentBuilderActionPerformed(java.awt.event.ActionEvent evt) {
//        CreateMethod createMethod =new CreateMethod();
//        createMethod.setVisible(true);
//        CreateMethod.initLoad();

        if(selected_Page!=null) {
            SmartComponent smartComponent = new SmartComponent();
            smartComponent.setVisible(true);
            smartComponent.initLoad();
        }else{
            JOptionPane.showMessageDialog(null, "Select Page from Table", "Warning" , JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void tblPagesMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCreatePageActionPerformed(java.awt.event.MouseEvent evt) {
        if(GlobalConstants.SELECTED_PROJECT.isEmpty()){
            JOptionPane.showMessageDialog(null,"Create / load Project...and then try to create Page model.","Warning",JOptionPane.INFORMATION_MESSAGE);
        } else {
            smartBuilder_new = new SmartBuilder_New();
            smartBuilder_new.setVisible(true);
        }
    }

    private void btnViewPageActionPerformed(java.awt.event.MouseEvent evt) {
        Thread object = new Thread(new openPage());
        object.start();
    }
    class openPage implements Runnable{
        @Override
        public void run() {
            try {

                ProcessBuilder pb = new ProcessBuilder(GlobalConstants.SublimeText_Path, GlobalConstants.SELECTED_PROJECT_PATH + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+File.separator+selected_Page+".java");
                pb.start();
            }catch (Exception e)
            {
                // Throwing an exception
                e.printStackTrace();
            }
        }
    }
    private void btnDeleteActionPerformed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        System.out.println("delte::"+Generic.fileDelete(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+ File.separator+selected_Page+".java"));
        FrameworkBuilder.deletePageInit_TestBase(selected_Page);
        loadPagesTable();
    }

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
        smartBuilder_new = new SmartBuilder_New();
        smartBuilder_new.setVisible(true);
    }

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

//    private void tblPagesMouseClicked(java.awt.event.MouseEvent evt) {
//        // TODO add your handling code here:
//    }

    private void btnTrashActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    public static void initLoad(){
        loadPagesTable();
       // txtPageName.setText("");

    }
    public static ViewPagesTableModel getModel(String dirPath) {
        int i=1;
        if(dirPath!=null) {
            File file = new File(dirPath);
            String[] names = file.list();
            //build the list
            List<ViewPagesTable> viewFileList = new ArrayList<ViewPagesTable>();
            if (names != null) {
                for (String name : names) {
                    // if (new File(dirPath + name).isFile()) {
                    name=name.replaceAll(".java","");
                    ViewPagesTable viewFileTable = new ViewPagesTable(i, name);

                    viewFileList.add(viewFileTable);
                    i = i + 1;
                    //  }
                }

            }
            viewPagesTableModel = new ViewPagesTableModel(viewFileList);
        }
        return viewPagesTableModel;
    }
    class SelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            if(e.getValueIsAdjusting())
                return;
            int row = tblPages.getSelectedRow();
            if(row < 0)
                return;
            int col = tblPages.getSelectedColumn();
            if(col < 0)
                return;

            //tblPages.clearSelection();
            selected_Page = (String) tblPages.getModel().getValueAt(row, 1);
            GlobalConstants.Method_Selected_Page_Name=selected_Page;

            tblPages.setSelectionBackground(Color.ORANGE);
           // txtProjectName.setText(selected_Project.toUpperCase());

        }
    }
    public static void loadPagesTable(){
     //   tblPages.setModel(getModel(GlobalConstants.PROJECTS_FOLDER_PATH));
//        System.out.println("SELECTEDPROJECT:"+GlobalConstants.SELECTED_PROJECT_PATH);
        tblPages.setModel(getModel(GlobalConstants.SELECTED_PROJECT_PATH + File.separator +GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER));
    }
    // Variables declaration - do not modify
    private JButton btnCreatePage;
    private JButton btnDelete;
    private JButton btnObjectBuilder;
    private JButton btnViewPage;
    private JButton btncomponentBuilder;
    private JLabel imgRobo;
    private JLabel jLabel9;
    private JScrollPane jScrollPane1;
    public static JTable tblPages;
    private JLabel txtCreate;
    private JLabel txtDelete;
    private JLabel txtViewPage;
    // End of variables declaration
}

