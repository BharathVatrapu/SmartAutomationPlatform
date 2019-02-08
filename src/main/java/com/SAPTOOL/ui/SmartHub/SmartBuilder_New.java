package com.SAPTOOL.ui.SmartHub;

import java.awt.*;

/**
 *
 * @author bvatrapu
 */
public class SmartBuilder_New extends javax.swing.JFrame {

    GridBagLayout gridBagLayout = new GridBagLayout();
    public static SmartBuilder_New_1 smartBuilder_new_1;
    public static SmartBuilder_New_2 smartBuilder_new_2;
    public static SmartBuilder_New_3 smartBuilder_new_3;
    /**
     * Creates new form SmartBuilder_New
     */
    public SmartBuilder_New() {
        initComponents();

        smartBuilder_new_1 = new SmartBuilder_New_1();
        smartBuilder_new_2 = new SmartBuilder_New_2();
        smartBuilder_new_3 = new SmartBuilder_New_3();

        panelBody.setLayout(gridBagLayout);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        panelBody.add(smartBuilder_new_1,c);

        c.gridx = 0;
        c.gridy = 0;
        panelBody.add(smartBuilder_new_2,c);

        c.gridx = 0;
        c.gridy = 0;
        panelBody.add(smartBuilder_new_3,c);

        setpanelNotVisible();
        smartBuilder_new_1.setVisible(true);
    }

    public static void setpanelNotVisible(){
        smartBuilder_new_1.setVisible(false);
        smartBuilder_new_2.setVisible(false);
        smartBuilder_new_3.setVisible(false);
    }
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        imgProgressbar = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        panelMain.setBackground(new Color(255, 255, 255));

        panelHeader.setBackground(new Color(255, 255, 255));
        panelHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 102, 204)));

        imgProgressbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/smarthub/progressbar_1.png")));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
                panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                                .addContainerGap(244, Short.MAX_VALUE)
                                .addComponent(imgProgressbar)
                                .addGap(242, 242, 242))
        );
        panelHeaderLayout.setVerticalGroup(
                panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelHeaderLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(imgProgressbar)
                                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelBody.setBackground(new Color(255, 255, 255));
        panelBody.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 102, 153)));

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
                panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBodyLayout.setVerticalGroup(
                panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 457, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
                panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMainLayout.setVerticalGroup(
                panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                new SmartBuilder_New().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    public static javax.swing.JLabel imgProgressbar;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    // End of variables declaration
}

