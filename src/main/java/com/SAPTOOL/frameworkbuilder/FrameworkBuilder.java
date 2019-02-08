package com.SAPTOOL.frameworkbuilder;

import com.SAPTOOL.utils.Generic;
import com.SAPTOOL.utils.GlobalConstants;

import java.io.File;

public class FrameworkBuilder {

    public static void updatePageInit_TestBase(String pagename){
        String readTestBase = Generic.readText(GlobalConstants.SELECTED_PROJECT_PATH + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTBASE_FOLDER);
        readTestBase = readTestBase.replaceAll("//SAP-START   - IMPORT DECLARATION","import com.testProject.pages."+pagename+"Page;"+System.lineSeparator()+"//SAP-END   - IMPORT DECLARATION");
        readTestBase = readTestBase.replaceAll("//SAP-END   - PAGE DECLARATION","public "+pagename+"Page "+pagename.toLowerCase()+"page  = null;"+System.lineSeparator()+"\t//SAP-END   - PAGE DECLARATION");
        readTestBase = readTestBase.replaceAll("//SAP-END   - PAGE INITILAZATION",""+pagename.toLowerCase()+"page = new "+pagename+"Page(configTestData);"+System.lineSeparator()+"\t//SAP-END   - PAGE INITILAZATION");
        Generic.writeText(readTestBase,GlobalConstants.SELECTED_PROJECT_PATH + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTBASE_FOLDER,false);
    }

    public static void updatePOM_ProjectName(String projectName){
        String readPOM = Generic.readText(GlobalConstants.SELECTED_PROJECT_PATH + File.separator + "pom.xml");
        readPOM = readPOM.replaceAll("DemoProject",projectName);
        Generic.writeText(readPOM,GlobalConstants.SELECTED_PROJECT_PATH + File.separator + "pom.xml",false);
    }

    public static void deletePageInit_TestBase(String pagename){
        System.out.println("pagename::::"+pagename);
        String pagesource=null;
        String readTestBase = Generic.readText(GlobalConstants.SELECTED_PROJECT_PATH + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTBASE_FOLDER);
//        String pagedec=readTestBase.substring(readTestBase.indexOf("//PAGE DECLARATION - START"),readTestBase.indexOf("//PAGE DECLARATION - END"));
//        String pageimport=readTestBase.substring(readTestBase.indexOf("//IMPORT DECLARATION - START"),readTestBase.indexOf("//IMPORT DECLARATION - END"));
//        String pageinit=readTestBase.substring(readTestBase.indexOf("//PAGE INITILAZATION - START"),readTestBase.indexOf("//PAGE INITILAZATION - END"));
//        System.out.println("pagedec:::"+pagedec);
//        System.out.println(readTestBase);
//        pageimport = pageimport.replaceAll("import com.testProject.pages."+pagename+";","");
//        pagedec = pagedec.replaceAll("public "+pagename+" "+pagename.toLowerCase()+"  = null;","");
//        pageinit = pageinit.replaceAll(pagename.toLowerCase()+" = new "+pagename+"(configTestData);","");
//        String pageinit =pagename.toLowerCase()+" = new "+pagename+"P(configTestData);";

        pagesource = readTestBase.replaceAll(pagename.toLowerCase()+" = new "+pagename+"\\(configTestData\\);","");

        //+pagename+"(configTestData);
        pagesource = pagesource.replaceAll("public "+pagename+" "+pagename.toLowerCase()+"  = null;","");
        pagesource = pagesource.replaceAll("import com.testProject.pages."+pagename+";","");

      //  pagesource = pagesource.replaceAll(pagesource.substring(pagesource.indexOf("//IMPORT DECLARATION - START"),pagesource.indexOf("//IMPORT DECLARATION - END")),pagesource.substring(pagesource.indexOf("//IMPORT DECLARATION - START"),pagesource.indexOf("//IMPORT DECLARATION - END")).replaceAll("\\n+",""));
                //pagesource.substring(readTestBase.indexOf("//IMPORT DECLARATION - START"),readTestBase.indexOf("//IMPORT DECLARATION - END")).replaceAll("(?m)^\\s","");
      //  pagesource = pagesource.substring(readTestBase.indexOf("//PAGE DECLARATION - START"),readTestBase.indexOf("//PAGE DECLARATION - END")).replaceAll("(?m)^\\s","");
     //   pagesource = pagesource.substring(readTestBase.indexOf("//PAGE INITILAZATION - START"),readTestBase.indexOf("//PAGE INITILAZATION - START")).replaceAll("(?m)^\\s","");
//        System.out.println("pageimport::"+pageimport);
//        System.out.println("pagedec::"+pagedec);
//        System.out.println("pageinit::"+pageinit);

        Generic.writeText(pagesource,GlobalConstants.SELECTED_PROJECT_PATH + File.separator + GlobalConstants.TEST_FRAMEWORK_TESTBASE_FOLDER,false);
    }
}
