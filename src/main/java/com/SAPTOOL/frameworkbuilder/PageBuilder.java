package com.SAPTOOL.frameworkbuilder;

import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import javax.swing.*;
import java.io.File;

public class PageBuilder {

    static StringBuilder stringBuilder = null;


    static boolean returnStatus;

    public static void pageBuilder(String body,String type){
        String pagePath = GlobalConstants.SELECTED_PROJECT_PATH + File.separator +GlobalConstants.TEST_FRAMEWORK_TESTPAGES_FOLDER+File.separator+GlobalConstants.Method_Selected_Page_Name+".java";
        String readPageModel = Generic.readText(pagePath);

        switch (type.toUpperCase()){
            case "VARIABLE":
                readPageModel = readPageModel.replaceAll("//SAP-END - VARIABLE DECLARAITON",body+"//SAP-END - VARIABLE DECLARAITON");
                break;
            case "OBJECT":
                readPageModel = readPageModel.replaceAll("//SAP-END - OBJECT DECLARAITON",body+"//SAP-END - OBJECT DECLARAITON");
                break;
            case "OPERATION":
                readPageModel = readPageModel.replaceAll("//SAP-END - OPERATION DECLARAITON", body +"//SAP-END - OPERATION DECLARAITON");
                break;
            case "METHOD":
                readPageModel = readPageModel.replaceAll("//SAP-END - METHOD DECLARAITON",System.lineSeparator()+body+System.lineSeparator()+"//SAP-END - METHOD DECLARAITON");
                break;

        }
        Generic.writeText(readPageModel,pagePath,false);

    }
    public static void init_PageBuilder(String pagePath,String pageUrl,String pageName,String objects){
        String readPageModel = Generic.readText(pagePath);
        readPageModel = readPageModel.replaceAll("//SAP-END - VARIABLE DECLARAITON",strVariableBuilder(pageName+"PageUrl",pageUrl)+System.lineSeparator()+"//SAP-END - VARIABLE DECLARAITON");
        readPageModel = readPageModel.replaceAll("//SAP-END - OBJECT DECLARAITON",objects+"//SAP-END - OBJECT DECLARAITON");
        readPageModel = readPageModel.replaceAll("//SAP-END - OPERATION DECLARAITON", GlobalConstants.all_operations +"//SAP-END - OPERATION DECLARAITON");
        readPageModel = readPageModel.replaceAll("//SAP-END - METHOD DECLARAITON",navigateMethodBuilder(pageUrl,pageName)+"//SAP-END - METHOD DECLARAITON");

        Generic.writeText(readPageModel,pagePath,false);
    }

    public static String strVariableBuilder(String varName){
        return ("    String "+varName+";");
    }

    public static String strVariableBuilder(String varName,String value){
        return ("\tString "+varName+" = \""+value+"\";");
    }

    public static String navigateMethodBuilder(String pageUrl,String pageName){
        stringBuilder = new StringBuilder();
        stringBuilder.append("\tpublic String goto"+pageName+"Page(){");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\tconfigTestData.stepDescription = \"Navigate to "+pageName+" Page.\";");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\tLog.startLog(\""+pageName+"Page:::'goto"+pageName+"Page'\");");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\tnavigateToURL("+pageName+"PageUrl);");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\tLog.info(\"Navigated URL is :"+pageName+"PageUrl\");");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\tif (!verifyPageUrl("+pageName+"PageUrl)){");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\t\treturn false;");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\t}");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\tLog.endLog(\""+pageName+"Page:::'goto"+pageName+"Page'\");");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\treturn \"true\";");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t}");

        return stringBuilder.toString();
    }

    public static String method_Builder(DefaultListModel steps){
        stringBuilder = new StringBuilder();
        if(GlobalConstants.Method_args_status) {
            stringBuilder.append("\t"+"public String "+GlobalConstants.Method_Name+ "(String[] args){");
        } else{
            stringBuilder.append("\t"+"public String "+GlobalConstants.Method_Name+ "(){");
        }
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\tconfigTestData.stepDescription = \""+GlobalConstants.Method_Description+"\";");
        stringBuilder.append(System.lineSeparator());
       // stringBuilder.append("\t\tLog.startLog(\""+pageName+"Page:::'goto"+pageName+"Page'\");");
        //stringBuilder.append(System.lineSeparator());


        for(int i=0;i<=steps.size()-1;i++){
            stringBuilder.append("\t\t"+steps.getElementAt(i).toString()+";");
            stringBuilder.append(System.lineSeparator());
        }
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t\treturn \"true\";");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("\t}");

        return stringBuilder.toString();
    }

}
