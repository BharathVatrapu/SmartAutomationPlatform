package com.SAPTOOL.ui.Projects;


import com.SAPTOOL.tables.ViewProjectsTable;
import com.SAPTOOL.tables.ViewProjectsTableModel;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bvatrapu
 */
public class Projects extends JPanel {

    public static ViewProjectsTableModel viewProjectsTableModel = null;
    public static String selected_Project = null;

    public static Project_Confirm project_confirm=null;
    public static Project_Warning project_warning=null;
    /**
     * Creates new form Projects
     */
    public Projects() {
        initComponents();
        initLoad();
    }


    private void initComponents() {

        txtProjectName = new JLabel();
        jScrollPane1 = new JScrollPane();
        tblProjects = new JTable();
        btnConfigProject = new JButton();
        btnLoadProject = new JButton();
        btnCreateProject = new JButton();
        btnDeleteProject = new JButton();
        btnImportProject = new JButton();
        chkboxSATProjets = new JCheckBox();
        imgRobo = new JLabel();
        btnExportProject = new JButton();

        setBackground(new Color(255, 255, 255));

        txtProjectName.setFont(new Font("Tahoma", 0, 24));
        txtProjectName.setForeground(new Color(102, 102, 255));
        txtProjectName.setText("Current Project:");
        txtProjectName.setToolTipText("");
        txtProjectName.setBorder(null);
       // txtProjectName.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 153, 255), null));

        tblProjects.setAutoCreateRowSorter(true);
        tblProjects.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Sno", "Project Name", "Created Date"
                }
        ));
        //tblProjects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        tblProjects.setFont(new Font("Tahoma", 0, 18));
        tblProjects.setFocusable(false);
        tblProjects.setIntercellSpacing(new Dimension(0, 0));
        tblProjects.setRowHeight(25);
        tblProjects.setShowVerticalLines(true);
        tblProjects.getTableHeader().setFont(new Font("Segoe UI", 0, 24));
        tblProjects.getTableHeader().setReorderingAllowed(false);
        tblProjects.getTableHeader().setOpaque(false);
        tblProjects.getTableHeader().setBackground(new Color(32,136,203));
        tblProjects.getTableHeader().setForeground(new Color(255,255,255));


        tblProjects.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                tblProjectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProjects);
        tblProjects.getSelectionModel().addListSelectionListener(new SelectionListener());

        btnConfigProject.setBackground(new Color(0, 122, 181));
       // btnConfigProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testomatio_v5/icons/HAL_9000_48px.png")));
        btnConfigProject.setText("Config Project");
        btnConfigProject.setFont(new Font("Tahoma", 0, 18));
        btnConfigProject.setForeground(new Color(255, 255, 255));
        btnConfigProject.setBorderPainted(false);
        btnConfigProject.setFocusPainted(false);
        btnConfigProject.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnConfigProjectActionPerformed(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                btnConfigProject.setBackground(new Color(255, 255, 255));
                btnConfigProject.setForeground(new Color(0, 122, 181));
                btnConfigProject.setIcon(new ImageIcon(getClass().getResource("/icons/projects/config_project.png")));
            }
            public void mouseExited(MouseEvent evt) {
                btnConfigProject.setBackground(new Color(0, 122, 181));
                btnConfigProject.setForeground(new Color(255, 255, 255));
                btnConfigProject.setIcon(null);
            }
        });

        btnLoadProject.setBackground(new Color(0, 122, 181));
       // btnLoadProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testomatio_v5/icons/Select_Project_48px.png")));
        btnLoadProject.setText("Load Project");
        btnLoadProject.setFont(new Font("Tahoma", 0, 18));
        btnLoadProject.setForeground(new Color(255, 255, 255));
        btnLoadProject.setBorderPainted(false);
        btnLoadProject.setFocusPainted(false);
        btnLoadProject.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnSelectProjectActionPerformed(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                btnLoadProject.setBackground(new Color(255, 255, 255));
                btnLoadProject.setForeground(new Color(0, 122, 181));
                btnLoadProject.setIcon(new ImageIcon(getClass().getResource("/icons/projects/load_project.png")));
            }
            public void mouseExited(MouseEvent evt) {
                btnLoadProject.setBackground(new Color(0, 122, 181));
                btnLoadProject.setForeground(new Color(255, 255, 255));
                btnLoadProject.setIcon(null);
            }
        });


        btnCreateProject.setBackground(new Color(0, 122, 181));
       // btnCreateProject.setIcon(new javax.swing.ImageIcon(getClass().getResour0, 122, 181e("/testomatio_v5/icons/CreateProject_32px.png")));
        btnCreateProject.setText("Create Project");
        btnCreateProject.setFont(new Font("Tahoma", 0, 18));
        btnCreateProject.setForeground(new Color(255, 255, 255));
        btnCreateProject.setBorderPainted(false);
        btnCreateProject.setFocusPainted(false);
        btnCreateProject.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnCreateProjectActionPerformed(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                btnCreateProject.setBackground(new Color(255, 255, 255));
                btnCreateProject.setForeground(new Color(0, 122, 181));
                btnCreateProject.setIcon(new ImageIcon(getClass().getResource("/icons/projects/create_project.png")));
            }
            public void mouseExited(MouseEvent evt) {
                btnCreateProject.setBackground(new Color(0, 122, 181));
                btnCreateProject.setForeground(new Color(255, 255, 255));
                btnCreateProject.setIcon(null);
            }
        });



        btnDeleteProject.setBackground(new Color(0, 122, 181));
       // btnDeleteProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I/Button-Red-Cancel-icon_48px.png")));
        btnDeleteProject.setText("Delete Project");
        btnDeleteProject.setFont(new Font("Tahoma", 0, 18));
        btnDeleteProject.setForeground(new Color(255, 255, 255));
        btnDeleteProject.setBorderPainted(false);
        btnDeleteProject.setFocusPainted(false);
        btnDeleteProject.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnDeleteProjectActionPerformed(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                btnDeleteProject.setBackground(new Color(255, 255, 255));
                btnDeleteProject.setForeground(new Color(0, 122, 181));
                btnDeleteProject.setIcon(new ImageIcon(getClass().getResource("/icons/projects/delete_project.png")));
            }
            public void mouseExited(MouseEvent evt) {
                btnDeleteProject.setBackground(new Color(0, 122, 181));
                btnDeleteProject.setForeground(new Color(255, 255, 255));
                btnDeleteProject.setIcon(null);
            }
        });

        btnImportProject.setBackground(new Color(0, 122, 181));
        btnImportProject.setText("Import Project");
        btnImportProject.setFont(new Font("Tahoma", 0, 18));
        btnImportProject.setForeground(new Color(255, 255, 255));
        btnImportProject.setBorderPainted(false);
        btnImportProject.setFocusPainted(false);
        btnImportProject.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnImportProjectActionPerformed(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                btnImportProject.setBackground(new Color(255, 255, 255));
                btnImportProject.setForeground(new Color(0, 122, 181));
                btnImportProject.setIcon(new ImageIcon(getClass().getResource("/icons/projects/import_project.png")));
            }
            public void mouseExited(MouseEvent evt) {
                btnImportProject.setBackground(new Color(0, 122, 181));
                btnImportProject.setForeground(new Color(255, 255, 255));
                btnImportProject.setIcon(null);
            }
        });

        chkboxSATProjets.setBackground(new Color(255, 255, 255));
        chkboxSATProjets.setFont(new Font("Tahoma", 1, 24));
        chkboxSATProjets.setForeground(new Color(51, 0, 255));
        chkboxSATProjets.setSelected(true);
        chkboxSATProjets.setText("    SAT Projects");
        chkboxSATProjets.setBorder(null);
        chkboxSATProjets.setPreferredSize(new Dimension(157, 40));
        chkboxSATProjets.setFocusPainted(false);




        imgRobo.setIcon(new ImageIcon(getClass().getResource("/icons/projects/projects_robo.png")));

        btnExportProject.setBackground(new Color(0, 122, 181));
        btnExportProject.setText("Export Project");
        btnExportProject.setToolTipText("");
        btnExportProject.setFont(new Font("Tahoma", 0, 18));
        btnExportProject.setForeground(new Color(255, 255, 255));
        btnExportProject.setBorderPainted(false);
        btnExportProject.setFocusPainted(false);
        btnExportProject.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnExportProjectActionPerformed(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                btnExportProject.setBackground(new Color(255, 255, 255));
                btnExportProject.setForeground(new Color(0, 122, 181));
                btnExportProject.setIcon(new ImageIcon(getClass().getResource("/icons/projects/export_project.png")));
            }
            public void mouseExited(MouseEvent evt) {
                btnExportProject.setBackground(new Color(0, 122, 181));
                btnExportProject.setForeground(new Color(255, 255, 255));
                btnExportProject.setIcon(null);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 770, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(1, 1, 1)
                                                                                .addComponent(btnLoadProject, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(btnCreateProject, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnDeleteProject, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnConfigProject, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(46, 46, 46)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnExportProject, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnImportProject, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtProjectName)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(chkboxSATProjets, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                                                .addGap(119, 119, 119)))
                                .addComponent(imgRobo, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtProjectName)
                                        .addComponent(chkboxSATProjets, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCreateProject, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnConfigProject, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnImportProject, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnDeleteProject, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLoadProject, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnExportProject, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(imgRobo, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void btnConfigProjectActionPerformed(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSelectProjectActionPerformed(MouseEvent evt) {
        GlobalConstants.project_Button_clicked_name = "SELECT";

        if(selected_Project==null||selected_Project.isEmpty()){
            if(project_warning == null){
                project_warning = new Project_Warning();
            }
            Project_Warning.txtProjectName.setText("Project is not selected");
            Project_Warning.txtMessage.setText("Select project from table...");

        } else{
            if(project_confirm == null){
                project_confirm = new Project_Confirm();
            }
            Project_Confirm.txtProjectName.setText(selected_Project.toUpperCase());
            Project_Confirm.txtMessage.setText("project is Loading .....");
            Generic.createProject_Setup(selected_Project);
            GlobalConstants.SELECTED_PROJECT= GlobalConstants.TABLE_SELECTED_PROJECT;
        }
    }

    private void btnCreateProjectActionPerformed(MouseEvent evt) {
        new Project_Create().setVisible(true);
        btnCreateProject.setEnabled(false);


    }

    private void btnDeleteProjectActionPerformed(MouseEvent evt) {
        GlobalConstants.project_Button_clicked_name = "DELETE";
        if(selected_Project==null||selected_Project.isEmpty()){
            if(project_warning == null){
                project_warning = new Project_Warning();
            }
            //JOptionPane.showMessageDialog(null,"Project is not Selected");
            Project_Warning.txtProjectName.setText("Project is not selected");
            Project_Warning.txtMessage.setText("Select project from table...");

        } else{
            if(project_confirm == null){
                project_confirm = new Project_Confirm();
            }
            Generic.deleteProject_Setup(selected_Project);
            Project_Confirm.txtProjectName.setText(selected_Project.toUpperCase());
            Project_Confirm.txtMessage.setText("project is Deleting .....");

//            initLoad();

        }

    }

    private void btnImportProjectActionPerformed(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void tblProjectsMouseClicked(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void btnExportProjectActionPerformed(MouseEvent evt) {
        // TODO add your handling code here:
    }

    public static void initLoad(){
        tblProjects.setModel(getModel(GlobalConstants.PROJECTS_FOLDER_PATH));
        txtProjectName.setText("");

    }
    public static ViewProjectsTableModel getModel(String dirPath) {
        int i=1;
        if(dirPath!=null) {
            File file = new File(dirPath);
            String[] names = file.list();
            //build the list
            List<ViewProjectsTable> viewFileList = new ArrayList<ViewProjectsTable>();
            if (names != null) {
                for (String name : names) {
                    // if (new File(dirPath + name).isFile()) {

                    ViewProjectsTable viewFileTable = new ViewProjectsTable(i, name, Generic.getFolderCreateDate(dirPath+File.separator + name).toString());
                    viewFileList.add(viewFileTable);
                    i = i + 1;
                    //  }
                }

            }
            viewProjectsTableModel = new ViewProjectsTableModel(viewFileList);
        }
        return viewProjectsTableModel;
    }

    class SelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            if(e.getValueIsAdjusting())
                return;
            int row = tblProjects.getSelectedRow();
            if(row < 0)
                return;
            int col = tblProjects.getSelectedColumn();
            if(col < 0)
                return;

            //tblProjects.clearSelection();
            selected_Project = (String) tblProjects.getModel().getValueAt(row, 1);
            GlobalConstants.TABLE_SELECTED_PROJECT = selected_Project;

            tblProjects.setSelectionBackground(Color.ORANGE);
            txtProjectName.setText(selected_Project.toUpperCase());

        }
    }
    public static void loadProjectTable(){
        tblProjects.setModel(getModel(GlobalConstants.PROJECTS_FOLDER_PATH));
    }

    // Variables declaration - do not modify
    private JButton btnConfigProject;
    public static JButton btnCreateProject;
    public static JButton btnDeleteProject;
    public static JButton btnExportProject;
    public static JButton btnImportProject;
    public static JButton btnLoadProject;
    private JCheckBox chkboxSATProjets;
    private JLabel imgRobo;
    private JScrollPane jScrollPane1;
    public static JTable tblProjects;
    public static JLabel txtProjectName;
    // End of variables declaration
}

