package com.SAPTOOL.ui.SmartHub;


import com.SAPTOOL.utils.GlobalConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author bvatrapu
 */
public class SmartBuilder_New_1 extends JPanel {


    /**
     * Creates new form SmartBuilder_New_1
     */
    public SmartBuilder_New_1() {
        initComponents();
        inputUrl.setText("https://ngcp-qa2.safeway.com/CMS/account/login/?FullSite=Y");
    }


    private void initComponents() {

        txtUrl = new JLabel();
        inputUrl = new JTextField();
        btnStart = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        txtUrl.setFont(new java.awt.Font("Tahoma", 0, 36));
        txtUrl.setForeground(new java.awt.Color(0, 102, 204));
        txtUrl.setText("URL: ");
        txtUrl.setToolTipText("");

        inputUrl.setFont(new java.awt.Font("Tahoma", 0, 24));
        inputUrl.setForeground(new java.awt.Color(51, 0, 204));

        btnStart.setBackground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(txtUrl)
                                                .addGap(18, 18, 18)
                                                .addComponent(inputUrl, GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(345, 345, 345)
                                                .addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtUrl)
                                        .addComponent(inputUrl, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(108, Short.MAX_VALUE))
        );
    }

    private void btnStartActionPerformed(ActionEvent evt) {
        try {
            System.setProperty(
                    "webdriver.chrome.driver", GlobalConstants.GRID_DRIVERS_PATH + "chromedriver.exe");
            GlobalConstants.webDriver = new ChromeDriver();

            GlobalConstants.webDriver.navigate().to(inputUrl.getText());
            //GlobalConstants.webDriver.manage().window().maximize();
            Thread.sleep(5000);
            String openDevTools = Keys.chord(Keys.CONTROL, Keys.SHIFT, "i");
            GlobalConstants.webDriver.findElement(By.tagName("body")).sendKeys(openDevTools);
            SmartBuilder_New.setpanelNotVisible();
            SmartBuilder_New.smartBuilder_new_2.setVisible(true);
            SmartBuilder_New.imgProgressbar.setIcon(new ImageIcon(getClass().getResource("/icons/smarthub/progressbar_2.png")));
            SmartBuilder_New_2.init_load();
            GlobalConstants.PAGE_URL=inputUrl.getText();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify
    private JButton btnStart;
    private JTextField inputUrl;
    private JLabel txtUrl;
    // End of variables declaration
}

