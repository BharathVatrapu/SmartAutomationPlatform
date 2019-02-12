package com.SAPTOOL.ui;

import com.SAPTOOL.ui.executionlab.AddValue;
import com.SAPTOOL.ui.executionlab.ConfigParams;
import com.SAPTOOL.ui.executionlab.SetupParams;
import com.SAPTOOL.ui.main.Main;
import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Init {

    //TESTNG PARAMS
    public static String testBrowser=null;
    public static String testNGFile=null;
    public static String testPlatform="desktop";
    public static String[] testProjectParams=null;



    public static HashMap<String,String> TestNG_Params=new HashMap<String,String>();
    public static HashMap<String,String> mapParam=new HashMap<String,String>();
    public static HashMap<String,String> paramsHashMap=null;
    public static HashMap<String,String> paramNamesHashMap=null;

    //public static DefaultListModel paramsListModel= null;
    public static DefaultListModel paramNameandValuesListModel= new DefaultListModel();
    public static DefaultListModel paramNameListModel= new DefaultListModel();

    public static String params[]=null;


    public static DefaultListModel page_method_steps_ListModel= new DefaultListModel();
    public static DefaultListModel verification_steps_ListModel= new DefaultListModel();
    //public static DefaultListModel listmodel=null;


    public static DefaultListModel testScript_steps_ListModel= new DefaultListModel();

    public static DefaultListModel Add_TestScript_step_ListModel= new DefaultListModel();

    public static DefaultListModel TestScript_LisModel = new DefaultListModel();

    public static DefaultListModel testdataListmodel= new DefaultListModel();

    public static ConfigParams configParams=null;
    public static SetupParams setupParams=null;
    public static AddValue addValue=null;


    public static HashMap<String,String> TestScript_ManualSteps=null;


    public static String param_Name=null;
    public static String param_Selected=null;


    public static DefaultListModel readParams_Prop(){
            paramNameandValuesListModel.removeAllElements();
            paramsHashMap = new HashMap<String, String>();
            String key = null;
            String value = null;
            paramsHashMap = Generic.readAllProp(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH + File.separator + GlobalConstants.SELECTED_PROJECT + File.separator + GlobalConstants.param_properties);
            for (Map.Entry<String, String> entry : paramsHashMap.entrySet()) {
                key = entry.getKey();
                System.out.println("key::"+key);
                //key = key.replaceAll("=","");
                value = entry.getValue();
                paramNameandValuesListModel.addElement(key + "=" + value);
            }

        return paramNameandValuesListModel;
    }
    public static HashMap<String,String> readParams_PropHash(){
        //paramListmodel.removeAllElements();

        //paramsListModel = new DefaultListModel();
        paramsHashMap = new HashMap<String, String>();
        String key = null;
        String value = null;
        paramsHashMap = Generic.readAllProp(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH + File.separator + GlobalConstants.SELECTED_PROJECT + File.separator + GlobalConstants.param_properties);
//        for (Map.Entry<String, String> entry : paramsHashMap.entrySet()) {
//            key = entry.getKey();
//            value = entry.getValue();
//            paramsListModel.addElement(key + "=" + value);
//        }

        return paramsHashMap;
    }

//    public static DefaultListModel readParamNames_Prop(){
//        //paramListmodel.removeAllElements();
//        paramsListModel = new DefaultListModel();
//        paramsHashMap = new HashMap<String,String>();
//
//        paramsHashMap = Generic.readAllProp(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+GlobalConstants.SELECTED_PROJECT+File.separator+GlobalConstants.param_properties);
//        for (Map.Entry<String, String> entry : paramsHashMap.entrySet()) {
//
//            paramsListModel.addElement(entry.getKey());
//        }
//        return paramsListModel;
//    }

//    public static void globalParamValueListModel(){
//        paramNameandValuesListModel = readParams_Prop();
//    }
//
    public static void globalParamNamesListModel(){
        paramNameListModel.removeAllElements();
        String[] param=null;
        for(int j=0;j<paramNameandValuesListModel.size();j++){
            param = paramNameandValuesListModel.get(j).toString().split("=");
            paramNameListModel.addElement(param[0]);
        }
    }

    public static void print(String string){
        Main.txtAreaTerminal.append(string+"\n");
        // setText(string);
    }
}
