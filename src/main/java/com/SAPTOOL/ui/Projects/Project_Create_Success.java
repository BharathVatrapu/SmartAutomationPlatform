package com.SAPTOOL.ui.Projects;


import com.SAPTOOL.ui.main.Main;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bvatrapu
 */
public class Project_Create_Success extends JFrame {


    /**
     * Creates new form Project_Create_1
     */
    public Project_Create_Success() {
        initComponents();
        initLoad();
        timer.start();
    }

    private Timer timer = new Timer(10000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            update();
        }
    });
    private void update() {
        txtProjectName.setText(GlobalConstants.Project_Name.toUpperCase());
        txtProjectName.setVisible(true);
        txtMsg1.setVisible(true);
        txtMsg2.setVisible(true);
        btnDone.setVisible(true);
        imgTick.setIcon(new ImageIcon(getClass().getResource("/icons/projects/Tick.png")));
        timer.stop();
    }
    private void initComponents() {

        panelBody = new JPanel();
        imgTick = new JLabel();
        txtProjectName = new JLabel();
        txtMsg1 = new JLabel();
        txtMsg2 = new JLabel();
        btnDone = new JButton();
        imgRobo = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setUndecorated(true);
//        setTitle("SAPTOOL-Smart,Intelligent Automation");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2,new java.awt.Color(0,122,181) ));
        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        imgTick.setIcon(new ImageIcon(getClass().getResource("/icons/projects/waiting_icon.gif")));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));



        txtProjectName.setFont(new java.awt.Font("Tahoma", 1, 24));
        txtProjectName.setForeground(new java.awt.Color(102, 0, 255));
        txtProjectName.setText("Project Name");

        txtMsg1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24));
        txtMsg1.setForeground(new java.awt.Color(0, 153, 153));
        txtMsg1.setText("Project is created on SAT platform...");

        txtMsg2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18));
        txtMsg2.setForeground(new java.awt.Color(0, 153, 153));
        txtMsg2.setText("... SMART HUB is ready for SmartHub.");

        btnDone.setBackground(new java.awt.Color(234, 248, 249));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnDone.setForeground(new java.awt.Color(0, 153, 153));
        btnDone.setText("Done !");
        btnDone.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDone.setBorderPainted(false);
        btnDone.setFocusPainted(false);

        btnDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoneActionPerformed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDone.setBackground(new java.awt.Color(0, 122, 181));
                btnDone.setForeground(new java.awt.Color(255, 255, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDone.setBackground(new java.awt.Color(255, 255, 255));
                btnDone.setForeground(new java.awt.Color(0, 122, 181));
            }
        });

        imgRobo.setIcon(new ImageIcon(getClass().getResource("/icons/projects/createProjecy_success.png")));

        GroupLayout panelBodyLayout = new GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
                panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelBodyLayout.createSequentialGroup()
                                .addGroup(panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelBodyLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtMsg1)
                                                        .addComponent(txtProjectName, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                                                                .addGroup(panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                                                                                .addComponent(btnDone, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(23, 23, 23))
                                                                        .addComponent(txtMsg2, GroupLayout.Alignment.TRAILING))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                                                                .addComponent(imgTick)
                                                                .addGap(167, 167, 167)))))
                                .addComponent(imgRobo, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
                panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelBodyLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgTick)
                                .addGap(18, 18, 18)
                                .addComponent(txtProjectName)
                                .addGap(35, 35, 35)
                                .addComponent(txtMsg1)
                                .addGap(46, 46, 46)
                                .addComponent(txtMsg2)
                                .addGap(49, 49, 49)
                                .addComponent(btnDone, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                        .addGroup(panelBodyLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(imgRobo, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBody, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBody, GroupLayout.PREFERRED_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void btnDoneActionPerformed(java.awt.event.MouseEvent evt) {
        Projects.loadProjectTable();
        Main.txtLoadProjectName.setText(GlobalConstants.Project_Name);
        Projects.btnCreateProject.setEnabled(true);
        dispose();
    }

    public void initLoad(){
        txtProjectName.setVisible(false);
        txtMsg1.setVisible(false);
        txtMsg2.setVisible(false);
        btnDone.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project_Create_Success().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JButton btnDone;
    private JLabel imgRobo;
    private JLabel imgTick;
    private JPanel panelBody;
    private JLabel txtMsg1;
    private JLabel txtMsg2;
    private JLabel txtProjectName;
    // End of variables declaration
}

