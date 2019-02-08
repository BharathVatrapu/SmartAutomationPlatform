package com.SAPTOOL.ui.executionlab;


import com.SAPTOOL.ui.Class_Frame_Init;
import com.SAPTOOL.ui.Init;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;
import com.SAPTOOL.utils.ProcessCommander;
import org.testng.annotations.Test;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * @author bvatrapu
 * Bharath Kumar Reddy V
 */
public class ExecutionLab extends JPanel {

    public static ButtonGroup bgBrowsers = new ButtonGroup();


    HashMap<String,String> testngProjectParams=new HashMap<String,String>();

    public ExecutionLab() {
        initComponents();
    }


    private void initComponents() {

        btnEditXML = new JLabel();
        robo = new JLabel();
        jPanel1 = new JPanel();
        iconChrome = new JLabel();
        rbChrome = new JRadioButton();
        rbFirefox = new JRadioButton();
        iconChrome1 = new JLabel();
        rbIE11 = new JRadioButton();
        iconChrome2 = new JLabel();
        rbSafari = new JRadioButton();
        iconChrome3 = new JLabel();
        rbEdge = new JRadioButton();
        iconChrome4 = new JLabel();
        jPanel2 = new JPanel();
        cbCodebasefromGithub = new JCheckBox();
        cbHeadless = new JCheckBox();
        cbTestNgXml = new JComboBox<>();
        btnConfigTestNGParams = new JButton();
        btnEditTestNGXml = new JButton();
        btnRun = new JButton();
        btnAddQueue = new JButton();
        jScrollPane1 = new JScrollPane();
        listparams = new JList<>();

        setBackground(new java.awt.Color(255, 255, 255));

        btnEditXML.setBackground(new java.awt.Color(255, 255, 255));

//        btnEditXML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testomatio_v5/icons/Text-Edit_48px.png")));

        robo.setIcon(new ImageIcon(getClass().getResource("/icons/ExecutionLab/androidrun.png")));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Select Browser", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 204)));

        iconChrome.setIcon(new ImageIcon(getClass().getResource("/icons/ExecutionLab/Chrome_62px.png")));
        iconChrome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                rbChrome.setSelected(true);
            }
        });
        rbChrome.setBackground(new java.awt.Color(255, 255, 255));
        rbChrome.setFont(new java.awt.Font("Tahoma", 1, 18));
        rbChrome.setText("Chrome");

        rbFirefox.setBackground(new java.awt.Color(255, 255, 255));
        rbFirefox.setFont(new java.awt.Font("Tahoma", 1, 18));
        rbFirefox.setText("Firefox");

        iconChrome1.setIcon(new ImageIcon(getClass().getResource("/icons/ExecutionLab/Firefox_62px.png")));
        iconChrome1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                rbFirefox.setSelected(true);
            }
        });
        rbIE11.setBackground(new java.awt.Color(255, 255, 255));
        rbIE11.setFont(new java.awt.Font("Tahoma", 1, 18));
        rbIE11.setText("IE11");

        iconChrome2.setIcon(new ImageIcon(getClass().getResource("/icons/ExecutionLab/Internet_Explorer_62px.png")));
        iconChrome2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                rbIE11.setSelected(true);
            }
        });

        rbSafari.setBackground(new java.awt.Color(255, 255, 255));
        rbSafari.setFont(new java.awt.Font("Tahoma", 1, 18));
        rbSafari.setText("Safari");

        iconChrome3.setIcon(new ImageIcon(getClass().getResource("/icons/ExecutionLab/Safari_62px.png")));
        iconChrome3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                rbSafari.setSelected(true);
            }
        });

        rbEdge.setBackground(new java.awt.Color(255, 255, 255));
        rbEdge.setFont(new java.awt.Font("Tahoma", 1, 18));
        rbEdge.setText("Edge");

        iconChrome4.setIcon(new ImageIcon(getClass().getResource("/icons/ExecutionLab/Microsoft_Edge_62px.png")));
        iconChrome4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                rbEdge.setSelected(true);
            }
        });

        bgBrowsers.add(rbChrome);
        bgBrowsers.add(rbFirefox);
        bgBrowsers.add(rbEdge);
        bgBrowsers.add(rbIE11);
        bgBrowsers.add(rbSafari);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(rbChrome))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(iconChrome)))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(rbFirefox)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(iconChrome1)
                                                .addGap(11, 11, 11)))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbIE11, GroupLayout.Alignment.TRAILING)
                                        .addComponent(iconChrome2, GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbSafari, GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(iconChrome3)
                                                .addGap(17, 17, 17)))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbEdge, GroupLayout.Alignment.TRAILING)
                                        .addComponent(iconChrome4, GroupLayout.Alignment.TRAILING))
                                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(iconChrome4)
                                        .addComponent(iconChrome3)
                                        .addComponent(iconChrome2)
                                        .addComponent(iconChrome1)
                                        .addComponent(iconChrome))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(rbEdge)
                                        .addComponent(rbSafari)
                                        .addComponent(rbIE11)
                                        .addComponent(rbFirefox)
                                        .addComponent(rbChrome))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createTitledBorder(""));

        cbCodebasefromGithub.setBackground(new java.awt.Color(255, 255, 255));
        cbCodebasefromGithub.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbCodebasefromGithub.setText("Codebase from GitHub");

        cbHeadless.setBackground(new java.awt.Color(255, 255, 255));
        cbHeadless.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbHeadless.setText("Headless");
        cbHeadless.addActionListener(actionListener);

        cbTestNgXml.setMaximumRowCount(500);

        btnConfigTestNGParams.setBackground(new java.awt.Color(255, 255, 255));
        btnConfigTestNGParams.setText("Config TestNG Params");
        btnConfigTestNGParams.setFocusPainted(false);
        btnConfigTestNGParams.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnConfigTestNGParamsActionPerformed(evt);
            }
        });

        btnEditTestNGXml.setBackground(new java.awt.Color(255, 255, 255));
        btnEditTestNGXml.setText("Edit");
        btnEditTestNGXml.setFocusPainted(false);
        btnEditTestNGXml.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEditTestNGXmlActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(cbTestNgXml, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEditTestNGXml, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnConfigTestNGParams, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cbCodebasefromGithub)
                                                .addGap(45, 45, 45)
                                                .addComponent(cbHeadless)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbCodebasefromGithub)
                                        .addComponent(cbHeadless))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbTestNgXml, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEditTestNGXml, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(btnConfigTestNGParams, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
        );

        btnRun.setBackground(new java.awt.Color(255, 255, 255));
        btnRun.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnRun.setForeground(new java.awt.Color(0, 51, 153));
        btnRun.setText("  Run");
        btnRun.setFocusPainted(false);
        btnRun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        btnAddQueue.setBackground(new java.awt.Color(255, 255, 255));
        btnAddQueue.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnAddQueue.setForeground(new java.awt.Color(0, 51, 153));
        btnAddQueue.setText("Add Queue");
        btnAddQueue.setFocusPainted(false);
        btnAddQueue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAddQueueActionPerformed(evt);
            }
        });

        listparams.setBorder(BorderFactory.createTitledBorder(null, "TestNG Params", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        listparams.setFont(new java.awt.Font("Tahoma", 0, 24));
        listparams.setForeground(new java.awt.Color(0, 51, 204));
        //listparams.addListSelectionListener(listSelectionListener);
        listparams.addMouseListener(mouseListener);
        //listparams.addActionListener(actionListener);
        jScrollPane1.setViewportView(listparams);


        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(33, 33, 33)
                                                .addComponent(robo))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(226, 226, 226)
                                                .addComponent(btnRun, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105)
                                                .addComponent(btnAddQueue, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(405, 405, 405)
                                                .addComponent(btnEditXML)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(128, 128, 128))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(robo)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnAddQueue, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnRun, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)))
                                .addComponent(btnEditXML)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }


    private void btnAddQueueActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    public static void initLoad(){
        cbTestNgXml.removeAllItems();
        String[] testSuites=null;
        String testsuite=null;
        Init.readParams_Prop();

        rbChrome.setSelected(true);
        listparams.setModel(Init.paramNameandValuesListModel);

        testSuites = Generic.getAllFileNames(GlobalConstants.SELECTED_PROJECT_PATH+ File.separator+GlobalConstants.TEST_FRAMEWORK_TESTEXECUTION_FOLDER+"/");
        for(int i=0;i<=testSuites.length-1;i++){
            if(testSuites[i].contains("xml")){
                testsuite=testSuites[i].replace(".xml", "");
            }
            cbTestNgXml.addItem(testsuite);
        }
    }

    private void btnConfigParamsActionPerformed(ActionEvent evt) {
        Init.configParams = new ConfigParams();
        Init.configParams.setVisible(true);
    }

    private void btnEditTestNGXmlActionPerformed(ActionEvent evt) {
        Thread object = new Thread(new openSuiteXmlFile());
        object.start();
    }
    private void btnConfigTestNGParamsActionPerformed(ActionEvent evt) {
       SetupParams setupParams = new SetupParams();
       setupParams.setVisible(true);

    }


    private void btnRunActionPerformed(ActionEvent evt) {

        try {
            GlobalConstants.DATE_TIME = Generic.getTime() + "_" + Generic.getDate();

            GlobalConstants.EXECUTION_PROJECT = GlobalConstants.EXECUTIONS_FOLDER_PATH + File.separator + GlobalConstants.DATE_TIME;


            File srcDir  = new File(GlobalConstants.SELECTED_PROJECT_PATH);
            File destDir = new File(GlobalConstants.EXECUTION_PROJECT);
            Generic.copyDirectory(srcDir,destDir);
            Init.testBrowser = getBrowser().toLowerCase();
            Init.testNGFile = cbTestNgXml.getSelectedItem().toString();
            Init.TestNG_Params.put("browser", Init.testBrowser);
            Init.TestNG_Params.put("suitefile", cbTestNgXml.getSelectedItem().toString());
            Init.TestNG_Params.put("platform", Init.testPlatform);
            testngProjectParams = Init.readParams_PropHash();
            for (Map.Entry<String, String> entry : testngProjectParams.entrySet()) {
                Init.TestNG_Params.put(entry.getKey(), entry.getValue());
               // System.out.println(entry.getKey() + ":" + entry.getValue());
            }
           GlobalConstants.EXECUTION_NAME = cbTestNgXml.getSelectedItem().toString()+"_"+Init.testBrowser;

            Class_Frame_Init class_frame_init=new Class_Frame_Init();
            class_frame_init.runExecutor =  new RunExecutor();

            class_frame_init.runExecutor.setVisible(true);
            class_frame_init.runExecutor.txtExecName.setText(GlobalConstants.EXECUTION_NAME);
            class_frame_init.runExecutor.Run();
        }catch (Exception e){
            e.printStackTrace();
        }

        // testngParams.put("param")
    }

    public static String getBrowser(){
        if(rbSafari.isSelected()){
            return rbEdge.getText();
        }else if(rbEdge.isSelected()){
            return rbEdge.getText();
        } else if(rbIE11.isSelected()){
            return rbIE11.getText();
        } else if (rbFirefox.isSelected()){
            return rbFirefox.getText();
        } else{
            return rbChrome.getText();
        }
    }
    class openSuiteXmlFile implements Runnable{
        @Override
        public void run() {
            try {

                ProcessBuilder pb = new ProcessBuilder(GlobalConstants.SublimeText_Path, GlobalConstants.SELECTED_PROJECT_PATH+File.separator+GlobalConstants.TEST_FRAMEWORK_TESTEXECUTION_FOLDER+"/"+cbTestNgXml.getSelectedItem()+".xml");
                pb.start();
            }catch (Exception e)
            {
                // Throwing an exception
                e.printStackTrace();
            }
        }
    }

    ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
            boolean selected = abstractButton.getModel().isSelected();

            if(selected){
                Init.testPlatform = "headless";
                rbEdge.setEnabled(false);
                rbIE11.setEnabled(false);
                rbSafari.setEnabled(false);
            } else {
                Init.testPlatform = "desktop";
                rbEdge.setEnabled(true);
                rbIE11.setEnabled(true);
                rbSafari.setEnabled(true);
            }
            rbChrome.setSelected(true);
            // abstractButton.setText(newLabel);
        }
    };


    MouseListener mouseListener = new MouseAdapter() {
        public void mouseClicked(MouseEvent mouseEvent) {
            if(listparams.getSelectedValue()==null){
                JOptionPane.showMessageDialog(null, "Select parameter", "Warning " , JOptionPane.INFORMATION_MESSAGE);
            } else {
                    Init.param_Selected = listparams.getSelectedValue();
                    if (Init.param_Selected.contains("=")) {
                        String[] param = Init.param_Selected.split("=");
                        Init.param_Name = param[0];
                    } else {
                        Init.param_Name = listparams.getSelectedValue();
                    }

                AddValue addValue = new AddValue();
                addValue.setVisible(true);
                System.out.println("param selected::"+Init.param_Selected);
            }
        }
    };

    // Variables declaration - do not modify
    private JButton btnAddQueue;
    private JButton btnConfigTestNGParams;
    private JButton btnEditTestNGXml;
    private JLabel btnEditXML;
    private JButton btnRun;
    private JCheckBox cbCodebasefromGithub;
    private JCheckBox cbHeadless;
    public static JComboBox<String> cbTestNgXml;
    private JLabel iconChrome;
    private JLabel iconChrome1;
    private JLabel iconChrome2;
    private JLabel iconChrome3;
    private JLabel iconChrome4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    public static JList<String> listparams;
    public static JRadioButton rbChrome;
    public static JRadioButton rbEdge;
    public static JRadioButton rbFirefox;
    public static JRadioButton rbIE11;
    public static JRadioButton rbSafari;
    private JLabel robo;
    // End of variables declaration
}


