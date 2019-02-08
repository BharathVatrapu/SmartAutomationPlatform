package com.SAPTOOL.ui.Projects;


import java.awt.*;

/**
 *
 * @author bvatrapu
 */
public class Project_Create_Frame extends javax.swing.JFrame {

    GridBagLayout gridBagLayout = new GridBagLayout();


    static Project_Create_Success project_create_success;
    /**
     * Creates new form CreateProject
     */
    public Project_Create_Frame() {
        initComponents();


        project_create_success = new Project_Create_Success();

        panelBody.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();



        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelBody.add(project_create_success,gridBagConstraints);
        imgProcessing.setVisible(true);
        project_create_success.setVisible(false);

        dispose();

        new Project_Create();

    }


    private void initComponents() {

        panelBody = new javax.swing.JPanel();
        imgProcessing = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBody.setBackground(new Color(255, 255, 255));

        imgProcessing.setBackground(new Color(255, 255, 255));
        imgProcessing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/createProject_loading.gif"))); // NOI18N

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
                panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBodyLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(imgProcessing)
                                .addContainerGap(154, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
                panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBodyLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(imgProcessing, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project_Create_Frame().setVisible(true);
                try{
                    Thread t=Thread.currentThread();
                    t.sleep(4500);

                }catch (Exception e){
                    e.printStackTrace();
                }
                imgProcessing.setVisible(false);
                project_create_success.setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify
    private static javax.swing.JLabel imgProcessing;
    private javax.swing.JPanel panelBody;
    // End of variables declaration
}
