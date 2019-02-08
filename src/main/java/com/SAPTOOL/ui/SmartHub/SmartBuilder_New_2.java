package com.SAPTOOL.ui.SmartHub;


import com.SAPTOOL.ui.Class_Frame_Init;
import com.SAPTOOL.frameworkbuilder.FrameworkBuilder;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;
import com.SAPTOOL.frameworkbuilder.PageBuilder;

import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 *
 * @author bvatrapu
 */
public class SmartBuilder_New_2 extends JPanel {

    /**
     * Creates new form SmartBuilder_New_1
     */
    public SmartBuilder_New_2() {
        initComponents();

    }

    private void initComponents() {

        txtPageName = new JLabel();
        inputPageName = new JTextField();
        btnCreate = new JButton();
        btnGet = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        txtPageName.setFont(new java.awt.Font("Tahoma", 0, 36));
        txtPageName.setForeground(new java.awt.Color(0, 102, 204));
        txtPageName.setText("Page Name: ");
        txtPageName.setToolTipText("");

        inputPageName.setFont(new java.awt.Font("Tahoma", 0, 24));
        inputPageName.setForeground(new java.awt.Color(51, 0, 204));

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnGet.setBackground(new java.awt.Color(255, 255, 255));
        btnGet.setText("Get");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(345, 345, 345)
                                                .addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(txtPageName)
                                                .addGap(18, 18, 18)
                                                .addComponent(inputPageName, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(btnGet, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtPageName)
                                                .addComponent(inputPageName, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnGet, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(108, Short.MAX_VALUE))
        );
    }

    public static void init_load(){
        System.out.println(GlobalConstants.webDriver.getTitle());
        inputPageName.setText(GlobalConstants.webDriver.getTitle());
    }
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        String newfileName = inputPageName.getText();
        newfileName=Generic.removeSpecialChars(newfileName).trim();
        System.out.println("PAge anme:"+newfileName);
        String pageName=null;
        try {
            if(newfileName.isEmpty()){
                JOptionPane.showInputDialog("Enter page name");
            } else {
                Path source = Paths.get(GlobalConstants.CONFIG_TEMP_FOLDER_PATH + File.separator + "Temp_PageModel.java");
                Path newdir = Paths.get(GlobalConstants.SELECTED_PROJECT_PATH + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER);
                // UnZip.unZipIt(GlobalConstants.Temp_PAGE_MODEL_Path, GlobalConstants.PROJECTS_FOLDER_PATH + File.separator + GlobalConstants.SELECTED_PROJECT+File.separator+"src/test/java/com/testProject/pages");
                //UnZip.unZipIt(GlobalConstants.Config_Temp_page_model_Path, GlobalConstants.CONFIG_TEMP_FOLDER_PATH);
                pageName = newfileName+"Page";
                Files.copy(source, newdir.resolve(pageName+".java"), REPLACE_EXISTING);
                String readPage = Generic.readText(GlobalConstants.SELECTED_PROJECT_PATH + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+File.separator+pageName+".java");

                readPage = readPage.replace("Temp_PageModel",pageName);

                Generic.writeText(readPage,GlobalConstants.SELECTED_PROJECT_PATH + File.separator +GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+File.separator+pageName+".java",false);
                GlobalConstants.New_Created_Page_Name = pageName;
                FrameworkBuilder.updatePageInit_TestBase(newfileName);

                GlobalConstants.PAGE_NAME = inputPageName.getText();
                GlobalConstants.PAGE_PATH = GlobalConstants.SELECTED_PROJECT_PATH + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+File.separator+pageName+".java";
                SmartBuilder_New.setpanelNotVisible();
                Class_Frame_Init.objectBuilder = new ObjectBuilder();
                Class_Frame_Init.objectBuilder.setVisible(true);

            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify
    private JButton btnCreate;
    private JButton btnGet;
    public static JTextField inputPageName;
    private JLabel txtPageName;
    // End of variables declaration
}

