package com.SAPTOOL.ui.SmartHub;


import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bvatrapu
 */
public class SmartBuilder_New_3 extends JPanel {

    /**
     * Creates new form SmartBuilder_New_1
     */
    public SmartBuilder_New_3() {
        initComponents();
        btnFinish.setVisible(false);
        //timer_createPage.start();
    }

    public static Timer timer_createPage = new Timer(4000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            update();
        }
    });
    public static void update() {
        System.out.println("PAGE BUIDER ###########################");
        //PageBuilder.init_PageBuilder(GlobalConstants.PAGE_PATH,GlobalConstants.PAGE_URL,GlobalConstants.PAGE_NAME);
        btnFinish.setVisible(true);
        spinner.setIcon(new ImageIcon(GlobalConstants.resources_path+"icons/projects/Tick.png"));
        timer_createPage.stop();
    }

    private void initComponents() {

        btnFinish = new JButton();
        spinner = new JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnFinish.setBackground(new java.awt.Color(255, 255, 255));
        btnFinish.setText("Finish");
        btnFinish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        spinner.setIcon(new ImageIcon(getClass().getResource("/icons/smarthub/spinner.gif")));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(343, 343, 343)
                                                .addComponent(btnFinish, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(377, 377, 377)
                                                .addComponent(spinner)))
                                .addContainerGap(377, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(100, Short.MAX_VALUE)
                                .addComponent(spinner)
                                .addGap(49, 49, 49)
                                .addComponent(btnFinish, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
        );
    }

    private void btnFinishActionPerformed(ActionEvent evt) {
        SmartBuilder.loadPagesTable();
        GlobalConstants.webDriver.quit();
        SmartBuilder.smartBuilder_new.dispose();
    }

    // Variables declaration - do not modify
    public static JButton btnFinish;
    public static JLabel spinner;
    // End of variables declaration
}

