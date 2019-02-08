package com.SAPTOOL.ui;

//import com.SAPTOOL.examples.CustomTask;
import com.SAPTOOL.ui.main.Main;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;
import com.SAPTOOL.utils.RestApi;
import com.SAPTOOL.utils.UnZip;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 *
 * @author Bharath Kumar Reddy Vatrapu
 */
public class Launcher extends JFrame {

    public Launcher() {
        initComponents();

    }

    private void initComponents() {

        imgHome = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setUndecorated(true);
       // setIconImage(createImage("/icons/Origami_62px.png").getImage());
      //  imgHome.setIcon(new ImageIcon(getClass().getResource("/img/DomExtractor_783_590.gif")));
        imgHome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                dispose();
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(imgHome, GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(imgHome, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {


//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Launcher().setVisible(true);
//            }
//        });

        Launcher launcher=new Launcher();
        launcher.setVisible(true);
        Thread t=Thread.currentThread();
        //t.sleep(7500);
        t.sleep(500);
        if(setupExtractor()){
            initLoad();
            t.sleep(500);
            new Main().setVisible(true);
            launcher.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Setup Incomplete", "Terminating.. " , JOptionPane.INFORMATION_MESSAGE);
            launcher.dispose();
        }


    }

    public static boolean setupExtractor(){
        boolean flag=true;
        if(!Generic.createFolder(GlobalConstants.ROOT_FOLDER_PATH)){
            flag=false;
        }
        if(!Generic.createFolder(GlobalConstants.PROJECTS_FOLDER_PATH)){
            flag=false;
        }
        if(!Generic.createFolder(GlobalConstants.CONFIG_FOLDER_PATH)){
            flag=false;
        }
        if(!Generic.createFolder(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH)){
            flag=false;
        }
        if(!Generic.createFolder(GlobalConstants.CONFIG_TEMP_FOLDER_PATH)){
            flag=false;
        }
        if(!Generic.createFolder(GlobalConstants.EXECUTIONS_FOLDER_PATH)){
            flag=false;
        }

        return flag;
    }
    public ImageIcon createImage(String path){
        return new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getClass().getResource(path));
    }
    // Variables declaration - do not modify
    private JLabel imgHome;
    // End of variables declaration

    public static void initLoad(){
        String hubStatus=null;
        //CustomTask customTask=new CustomTask();
        //customTask.runTask();
        try {
            File temp_page = new File(GlobalConstants.CONFIG_TEMP_FOLDER_PATH+File.separator+"Temp_PageModel.java");
            File temp_script = new File(GlobalConstants.CONFIG_TEMP_FOLDER_PATH+File.separator+"Temp_TestScript.java");

            File temp_testdaat = new File(GlobalConstants.CONFIG_TEMP_FOLDER_PATH+File.separator+"Temp_TestScript.java");
            if(!temp_page.exists()){
                UnZip.unZipIt(GlobalConstants.Config_Temp_page_model_Path, GlobalConstants.CONFIG_TEMP_FOLDER_PATH);
            }
            if(!temp_script.exists()){
                UnZip.unZipIt(GlobalConstants.Config_Temp_testScript_model_Path, GlobalConstants.CONFIG_TEMP_FOLDER_PATH);
            }

          //  Thread t = Thread.currentThread();
//            String project = Generic.readProp(GlobalConstants.Prop_Selected_Project);
            //t.sleep(1500);

//            if (!project.equalsIgnoreCase("") || !project.equalsIgnoreCase("null")) {
//
//            }

            GlobalConstants.SELECTED_PROJECT = Generic.readProp(GlobalConstants.Prop_Selected_Project);
            GlobalConstants.SELECTED_PROJECT_PATH = Generic.readProp(GlobalConstants.Prop_Project_Path, GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH + File.separator + GlobalConstants.SELECTED_PROJECT + File.separator + GlobalConstants.config_properties);

            hubStatus = RestApi.callRestApi("http://localhost:4444/grid/api/hub");
            System.out.println("status:"+hubStatus);

            if(!hubStatus.contains("no resp")){
                GlobalConstants.HUB_STATUS=true;
            }
            if(hubStatus.contains("\"total\":20")){
                GlobalConstants.NODE_STATUS=true;
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
