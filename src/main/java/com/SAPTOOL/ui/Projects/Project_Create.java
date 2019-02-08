package com.SAPTOOL.ui.Projects;


import com.SAPTOOL.frameworkbuilder.FrameworkBuilder;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;
import com.SAPTOOL.utils.UnZip;

import javax.swing.*;
import java.io.File;

/**
 *
 * @author bvatrapu
 */
public class Project_Create extends JFrame {


    /**
     * Creates new form Project_Create
     */
    public Project_Create() {
        initComponents();
    }


    private void initComponents() {

        panelBody = new JPanel();
        panelHeader = new JPanel();
        txtCreateNewProject = new JLabel();
        txtMavenJavaTestNG = new JLabel();
        txtProjectName = new JLabel();
        inputProjectName = new JTextField();
        btnCreateProject = new JButton();
        imgRobo = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        panelHeader.setBackground(new java.awt.Color(0, 122, 181));

        txtCreateNewProject.setFont(new java.awt.Font("Segoe UI", 1, 36));
        txtCreateNewProject.setForeground(new java.awt.Color(255, 255, 255));
        txtCreateNewProject.setText("Create New Project");

        txtMavenJavaTestNG.setFont(new java.awt.Font("Tahoma", 3, 16));
        txtMavenJavaTestNG.setForeground(new java.awt.Color(204, 204, 255));
        txtMavenJavaTestNG.setText("Maven, Java, TestNG");

        GroupLayout panelHeaderLayout = new GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
                panelHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelHeaderLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtCreateNewProject, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMavenJavaTestNG)
                                .addGap(36, 36, 36))
        );
        panelHeaderLayout.setVerticalGroup(
                panelHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelHeaderLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtCreateNewProject)
                                .addContainerGap(26, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMavenJavaTestNG)
                                .addContainerGap())
        );

        txtProjectName.setBackground(new java.awt.Color(255, 255, 255));
        txtProjectName.setFont(new java.awt.Font("Tahoma", 0, 36));
        txtProjectName.setText("Project name: ");

        inputProjectName.setFont(new java.awt.Font("Tahoma", 0, 24));

        btnCreateProject.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateProject.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnCreateProject.setForeground(new java.awt.Color(0, 122, 181));
        btnCreateProject.setText("Create Project");
        btnCreateProject.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCreateProject.setBorderPainted(false);
        btnCreateProject.setFocusPainted(false);
        btnCreateProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateProjectActionPerformed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateProject.setBackground(new java.awt.Color(0, 122, 181));
                btnCreateProject.setForeground(new java.awt.Color(255, 255, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateProject.setBackground(new java.awt.Color(255, 255, 255));
                btnCreateProject.setForeground(new java.awt.Color(0, 122, 181));
            }
        });
        imgRobo.setIcon(new ImageIcon(getClass().getResource("/icons/projects/enter_project_robo.png")));

        GroupLayout panelBodyLayout = new GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
                panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelHeader, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBodyLayout.createSequentialGroup()
                                .addGap(0, 42, Short.MAX_VALUE)
                                .addGroup(panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                                                .addComponent(btnCreateProject, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                                                .addComponent(txtProjectName)
                                                .addGap(40, 40, 40)
                                                .addComponent(inputProjectName, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(imgRobo)
                                .addContainerGap())
        );
        panelBodyLayout.setVerticalGroup(
                panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelBodyLayout.createSequentialGroup()
                                .addComponent(panelHeader, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelBodyLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(imgRobo))
                                        .addGroup(panelBodyLayout.createSequentialGroup()
                                                .addGap(156, 156, 156)
                                                .addGroup(panelBodyLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtProjectName)
                                                        .addComponent(inputProjectName, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
                                .addGap(29, 29, 29)
                                .addComponent(btnCreateProject, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(77, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBody, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBody, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    private void btnCreateProjectActionPerformed(java.awt.event.MouseEvent evt) {
        String projectName=inputProjectName.getText();

        if(projectName ==null || projectName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Project name field is empty", "Warning ", JOptionPane.INFORMATION_MESSAGE);

        }else{
            try {
                GlobalConstants.Project_Name = projectName;
                if (!Generic.createFolder(GlobalConstants.PROJECTS_FOLDER_PATH + File.separator, projectName)) {
                    // Generic.folderDelete(GlobalConstants.PROJECTS_FOLDER_PATH+ File.separator+projectName+File.separator+"src");
                    //Generic.folderDelete(GlobalConstants.PROJECTS_FOLDER_PATH+ File.separator+projectName+File.separator+"pom.xml");
                    UnZip.unZipIt(GlobalConstants.Temp_TEST_FRAMEWORK_Path, GlobalConstants.PROJECTS_FOLDER_PATH + File.separator + projectName);
                    Generic.createFolder(GlobalConstants.PROJECTS_FOLDER_PATH + File.separator + projectName + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER);

                    Generic.createFolder(GlobalConstants.PROJECTS_FOLDER_PATH + File.separator + projectName + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTSUITES_FOLDER);
                    Generic.createFolder(GlobalConstants.PROJECTS_FOLDER_PATH + File.separator + projectName + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTRESOURCES_FOLDER);
                    Generic.createFolder(GlobalConstants.PROJECTS_FOLDER_PATH + File.separator + projectName + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTDATA_FOLDER);
                    Generic.createFolder(GlobalConstants.PROJECTS_FOLDER_PATH + File.separator + projectName + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTEXECUTION_FOLDER);
                    Generic.createFolder(GlobalConstants.PROJECTS_FOLDER_PATH + File.separator + projectName + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTREPORTS_FOLDER);

                    Generic.createProjectConfig(projectName);
                    Generic.createProject_Setup(projectName);
                    FrameworkBuilder.updatePOM_ProjectName(projectName);
                    dispose();
                    new Project_Create_Success();
                    // Projects.loadProjectTable();
//                Project_Create_Success project_create_success =new Project_Create_Success();
//                project_create_success.setVisible(true);

//                try{
//                    Thread t=Thread.currentThread();
//                    //t.sleep(7500);
//                    t.sleep(5500);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//               Project_Create_Success.imgTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tick.png")));
                } else {
                    JOptionPane.showMessageDialog(null, "Project Already Exists", "DONE ", JOptionPane.INFORMATION_MESSAGE);
                }
                // ProcessCommander.createProject_Maven(projectName,"SAPTOOL");

            } catch (Exception e) {
                // Throwing an exception
                e.printStackTrace();
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project_Create().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify
    private JButton btnCreateProject;
    private JLabel imgRobo;
    private JTextField inputProjectName;
    private JPanel panelBody;
    private JPanel panelHeader;
    private JLabel txtCreateNewProject;
    private JLabel txtMavenJavaTestNG;
    private JLabel txtProjectName;
    // End of variables declaration
}
