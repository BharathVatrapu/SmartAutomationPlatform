package com.SAPTOOL.ui.Projects;


import javax.swing.*;

/**
 *
 * @author bvatrapu
 */
public class Project_Warning extends JFrame {

    /**
     * Creates new form Projects_Confirm
     */
    public Project_Warning() {
        initComponents();
    }


    private void initComponents() {

        panelBody = new JPanel();
        imgRobo = new JLabel();
        txtProjectName = new JLabel();
        txtMessage = new JLabel();
        btnOk = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);
        setUndecorated(true);
        setTitle("Projects - Warning");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2,new java.awt.Color(0,122,181) ));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        imgRobo.setIcon(new ImageIcon(getClass().getResource("/icons/projects/Msg_robo.gif")));

        txtProjectName.setFont(new java.awt.Font("Tahoma", 0, 24));
        txtProjectName.setForeground(new java.awt.Color(102, 0, 204));
        txtProjectName.setText("projectname");

        txtMessage.setFont(new java.awt.Font("Tahoma", 0, 24));
        txtMessage.setForeground(new java.awt.Color(0, 153, 153));
        txtMessage.setText("jLabel1");

        btnOk.setBackground(new java.awt.Color(255, 255, 255));
        btnOk.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnOk.setForeground(new java.awt.Color(153, 255, 153));
        btnOk.setIcon(new ImageIcon(getClass().getResource("/icons/projects/ok.png")));
        btnOk.setText("Ok");
        btnOk.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOk.setBorderPainted(false);
        btnOk.setFocusPainted(false);
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkActionPerformed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOk.setBackground(new java.awt.Color(153,255,153));
                btnOk.setForeground(new java.awt.Color(255, 255, 255));

            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOk.setBackground(new java.awt.Color(255, 255, 255));
                btnOk.setForeground(new java.awt.Color(0, 204, 0));
            }
        });

        GroupLayout panelBodyLayout = new GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
                panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelBodyLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(imgRobo)
                                .addGroup(panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelBodyLayout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(txtMessage))
                                        .addGroup(panelBodyLayout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(txtProjectName, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(108, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246))
        );
        panelBodyLayout.setVerticalGroup(
                panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelBodyLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(panelBodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelBodyLayout.createSequentialGroup()
                                                .addComponent(txtProjectName)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                                .addComponent(txtMessage)
                                                .addGap(71, 71, 71)
                                                .addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                .addGap(59, 59, 59))
                                        .addGroup(panelBodyLayout.createSequentialGroup()
                                                .addComponent(imgRobo)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBody, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBody, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void btnOkActionPerformed(java.awt.event.MouseEvent evt) {
        Projects.project_warning =null;
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project_Warning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JButton btnOk;
    private JLabel imgRobo;
    private JPanel panelBody;
    public static JLabel txtMessage;
    public static JLabel txtProjectName;
    // End of variables declaration
}

