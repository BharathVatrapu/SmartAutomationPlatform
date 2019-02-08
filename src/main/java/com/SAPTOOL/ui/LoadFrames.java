package com.SAPTOOL.ui;

import com.SAPTOOL.ui.executionlab.SetupParams;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class LoadFrames extends javax.swing.JFrame {

    public static SetupParams setupParams  = null;



    public static void initFrames(){
        setupParams=new SetupParams();

    }
}
