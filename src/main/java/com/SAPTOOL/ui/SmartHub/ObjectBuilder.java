package com.SAPTOOL.ui.SmartHub;

import com.SAPTOOL.ui.Init;
import com.SAPTOOL.frameworkbuilder.PageBuilder;
import com.SAPTOOL.utils.DomExtractor;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author bvatrapu
 */
public class ObjectBuilder extends JFrame {

    /**
     * Creates new form ObjectBuilder
     */
    public ObjectBuilder() {
        initComponents();
        cbImage.setEnabled(false);
    }


    private void initComponents() {

        panelMain = new JPanel();
        panelObjectControls = new JPanel();
        cblink = new JCheckBox();
        cbButton = new JCheckBox();
        cbRadioButton = new JCheckBox();
        cbCheckBox = new JCheckBox();
        cbEditBox = new JCheckBox();
        cbComboBox = new JCheckBox();
        cbText = new JCheckBox();
        cbImage = new JCheckBox();
        cbSelectAll = new JCheckBox();
        jScrollPane1 = new JScrollPane();
        txtAreaHtmlCodeEditor = new JTextArea();
        btnGenerate = new JButton();
        btnSkip = new JButton();
        cbPageSource = new JCheckBox();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        panelMain.setBackground(new java.awt.Color(255, 255, 255));

        panelObjectControls.setBackground(new java.awt.Color(255, 255, 255));
        panelObjectControls.setBorder(BorderFactory.createTitledBorder(null, "Controls", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 204, 204)));

        cblink.setBackground(new java.awt.Color(255, 255, 255));
        cblink.setFont(new java.awt.Font("Tahoma", 0, 24));
        cblink.setForeground(new java.awt.Color(0, 153, 102));
        cblink.setText("Link");

        cbButton.setBackground(new java.awt.Color(255, 255, 255));
        cbButton.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbButton.setForeground(new java.awt.Color(0, 153, 102));
        cbButton.setText("Button");

        cbRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        cbRadioButton.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbRadioButton.setForeground(new java.awt.Color(0, 153, 102));
        cbRadioButton.setText("RadioButton");

        cbCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cbCheckBox.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbCheckBox.setForeground(new java.awt.Color(0, 153, 102));
        cbCheckBox.setText("CheckBox");

        cbEditBox.setBackground(new java.awt.Color(255, 255, 255));
        cbEditBox.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbEditBox.setForeground(new java.awt.Color(0, 153, 102));
        cbEditBox.setText("EditBox");

        cbComboBox.setBackground(new java.awt.Color(255, 255, 255));
        cbComboBox.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbComboBox.setForeground(new java.awt.Color(0, 153, 102));
        cbComboBox.setText("ComboBox");

        cbText.setBackground(new java.awt.Color(255, 255, 255));
        cbText.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbText.setForeground(new java.awt.Color(0, 153, 102));
        cbText.setText("Text (Headers)");

        cbImage.setBackground(new java.awt.Color(255, 255, 255));
        cbImage.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbImage.setForeground(new java.awt.Color(0, 153, 102));
        cbImage.setText("Image");

        GroupLayout panelObjectControlsLayout = new GroupLayout(panelObjectControls);
        panelObjectControls.setLayout(panelObjectControlsLayout);
        panelObjectControlsLayout.setHorizontalGroup(
                panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelObjectControlsLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(cblink)
                                        .addComponent(cbButton))
                                .addGap(109, 109, 109)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(cbRadioButton)
                                        .addComponent(cbCheckBox))
                                .addGap(123, 123, 123)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(cbEditBox)
                                        .addComponent(cbComboBox))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(cbText)
                                        .addComponent(cbImage))
                                .addGap(67, 67, 67))
        );
        panelObjectControlsLayout.setVerticalGroup(
                panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelObjectControlsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cblink)
                                        .addComponent(cbRadioButton)
                                        .addComponent(cbEditBox)
                                        .addComponent(cbText))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(panelObjectControlsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbButton)
                                        .addComponent(cbCheckBox)
                                        .addComponent(cbComboBox)
                                        .addComponent(cbImage))
                                .addGap(21, 21, 21))
        );

        cbSelectAll.setBackground(new java.awt.Color(255, 255, 255));
        cbSelectAll.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbSelectAll.setForeground(new java.awt.Color(0, 51, 255));
        cbSelectAll.setText("Select All");
        cbSelectAll.addActionListener(actionListener);

        txtAreaHtmlCodeEditor.setColumns(20);
        txtAreaHtmlCodeEditor.setRows(5);
        txtAreaHtmlCodeEditor.setBorder(BorderFactory.createTitledBorder(null, "Html Code", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane1.setViewportView(txtAreaHtmlCodeEditor);

        btnGenerate.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerate.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnSkip.setBackground(new java.awt.Color(255, 255, 255));
        btnSkip.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnSkip.setText("Skip");
        btnSkip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSkipActionPerformed(evt);
            }
        });

        cbPageSource.setBackground(new java.awt.Color(255, 255, 255));
        cbPageSource.setFont(new java.awt.Font("Tahoma", 0, 24));
        cbPageSource.setForeground(new java.awt.Color(255, 102, 51));
        cbPageSource.setText("Direct Url PageSource");
        cbPageSource.addActionListener(PageSourceactionListener);

        GroupLayout panelMainLayout = new GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
                panelMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelMainLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(panelMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1)
                                                        .addComponent(panelObjectControls, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(panelMainLayout.createSequentialGroup()
                                                .addGap(167, 167, 167)
                                                .addComponent(btnGenerate, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
                                                .addGap(135, 135, 135)
                                                .addComponent(btnSkip, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelMainLayout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(cbSelectAll)
                                                .addGap(71, 71, 71)
                                                .addComponent(cbPageSource)))
                                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
                panelMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(panelMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbSelectAll)
                                        .addComponent(cbPageSource))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelObjectControls, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(panelMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnGenerate, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSkip, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelMain, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelMain, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObjectBuilder().setVisible(true);
            }
        });
    }
    ActionListener PageSourceactionListener = new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
            boolean selected = abstractButton.getModel().isSelected();
            if(selected){
                txtAreaHtmlCodeEditor.setEnabled(false);
            } else{
                txtAreaHtmlCodeEditor.setEnabled(true);
            }
        }
    };

    ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
            boolean selected = abstractButton.getModel().isSelected();

            if(selected){
                cblink.setSelected(true);
                cbButton.setSelected(true);
                cbCheckBox.setSelected(true);
                cbRadioButton.setSelected(true);
                cbComboBox.setSelected(true);
                cbEditBox.setSelected(true);
                cbText.setSelected(true);
               // cbImage.setSelected(true);
            } else {
                cblink.setSelected(false);
                cbButton.setSelected(false);
                cbCheckBox.setSelected(false);
                cbRadioButton.setSelected(false);
                cbComboBox.setSelected(false);
                cbEditBox.setSelected(false);
                cbText.setSelected(false);
              //  cbImage.setSelected(false);
            }
            // abstractButton.setText(newLabel);
        }
    };

    private void btnGenerateActionPerformed(ActionEvent evt) {
        ArrayList<String> objList=new ArrayList<String>();
        if(cblink.isSelected()){
            objList.add(cblink.getText());
        }
        if(cbButton.isSelected()){
            objList.add(cbButton.getText());
        }
        if(cbCheckBox.isSelected()){
            objList.add(cbCheckBox.getText());
        }
        if(cbEditBox.isSelected()){
            objList.add(cbEditBox.getText());
        }
        if(cbImage.isSelected()){
            objList.add(cbImage.getText());
        }

        if(cbRadioButton.isSelected()){
            objList.add(cbRadioButton.getText());
        }
        if(cbText.isSelected()){
            objList.add(cbText.getText());
        }
        if(cbComboBox.isSelected()){
            objList.add(cbComboBox.getText());
        }

        for(int j=0; j<=objList.size()-1;j++){
            System.out.println(objList.get(j));
        }
        DomExtractor domExtractor=new DomExtractor();
        //System.out.println(domExtractor.smartExtractor(txtAreaHtmlCodeEditor.getText(),objList));

        PageBuilder.init_PageBuilder(GlobalConstants.PAGE_PATH,GlobalConstants.PAGE_URL,GlobalConstants.PAGE_NAME,domExtractor.smartExtractor(txtAreaHtmlCodeEditor.getText(),objList));

        SmartBuilder_New.smartBuilder_new_3.setVisible(true);
        SmartBuilder_New.imgProgressbar.setIcon(new ImageIcon(getClass().getResource("/icons/smarthub/progressbar_3.png")));
        SmartBuilder_New_3.timer_createPage.start();
        dispose();
    }

    private void btnSkipActionPerformed(ActionEvent evt) {
        SmartBuilder_New.smartBuilder_new_3.setVisible(true);
        SmartBuilder_New.imgProgressbar.setIcon(new ImageIcon(getClass().getResource("/icons/smarthub/progressbar_3.png")));
        SmartBuilder_New_3.timer_createPage.start();
        dispose();
    }

    // Variables declaration - do not modify
    private JButton btnSkip;
    private JButton btnGenerate;
    private JCheckBox cbButton;
    private JCheckBox cbCheckBox;
    private JCheckBox cbComboBox;
    private JCheckBox cbEditBox;
    private JCheckBox cbImage;
    private JCheckBox cbRadioButton;
    private JCheckBox cbSelectAll;
    private JCheckBox cbPageSource;
    private JCheckBox cbText;
    private JCheckBox cblink;
    private JScrollPane jScrollPane1;
    private JPanel panelMain;
    private JPanel panelObjectControls;
    private JTextArea txtAreaHtmlCodeEditor;
    // End of variables declaration
}

