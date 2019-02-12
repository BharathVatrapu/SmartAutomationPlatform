package com.SAPTOOL.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;




import java.io.File;

public class GlobalConstants {

    public static String FS = File.separator;
    public static String resources_path = System.getProperty("user.dir")+FS+"src"+FS+"main"+FS+"resources"+FS;


    //Root Folder Paths
    public static String SETUP_FOLDER_PATH = System.getProperty("user.home") +FS+"AppData"+FS+"Roaming";
    public static String ROOT_FOLDER_PATH = SETUP_FOLDER_PATH+FS+"SAT_Tool";
    public static String PROJECTS_FOLDER_PATH = ROOT_FOLDER_PATH+FS+"Projects";
    public static String CONFIG_FOLDER_PATH = ROOT_FOLDER_PATH+FS+"Config";

    public static String EXECUTIONS_FOLDER_PATH = ROOT_FOLDER_PATH+FS+"EXECUTIONS";
    public static String DATE_TIME = null;
    public static String EXECUTION_PROJECT = null;
    public static String EXECUTION_NAME=null;
    //Config Folders Path
    public static String CONFIG_PROJECTS_FOLDER_PATH = CONFIG_FOLDER_PATH+FS+"Projects";
    public static String CONFIG_TEMP_FOLDER_PATH = CONFIG_FOLDER_PATH+FS+"TEMP";

    public static String Config_Temp_page_model_Path=System.getProperty("user.dir")+FS+"src/main/java/com/SAPTOOL/temp/Temp_PageModel.zip";
    public static String Config_Temp_testScript_model_Path=System.getProperty("user.dir")+FS+"src/main/java/com/SAPTOOL/temp/Temp_TestScript.zip";
    public static String Config_Temp_TestData_model_Path=System.getProperty("user.dir")+FS+"src/main/java/com/SAPTOOL/temp/TEMP_TestData.zip";

    public static String Temp_TEST_FRAMEWORK_Path=System.getProperty("user.dir")+File.separator+"src/main/java/com/SAPTOOL/temp/SAPTestFramework/src.zip";
    public static String TEST_FRAMEWORK_TESTPAGES_FOLDER = "src/test/java/com/testProject/testPages";
    public static String TEST_FRAMEWORK_TESTSUITES_FOLDER = "src/test/java/com/testProject/testSuites";
    public static String TEST_FRAMEWORK_TESTRESOURCES_FOLDER = "src/test/resources";
    public static String TEST_FRAMEWORK_TESTDATA_FOLDER = "src/test/resources/testData";
    public static String TEST_FRAMEWORK_TESTEXECUTION_FOLDER = "src/test/resources/testExecution";
    public static String TEST_FRAMEWORK_TESTREPORTS_FOLDER = "src/test/resources/testReports";
    public static String TEST_FRAMEWORK_TESTBASE_FOLDER = "src/test/java/com/testProject/testBase/TestBase.java";

    public static String TEST_MODULE_NAME=null;
//    public static String TEST_ENV_NAME=null;

//    public static String PROJECT_TESTBASE_PATH = "src/test/java/com/testProject/testbase/TestBase.java";
//    public static String PROJECT_PAGES_PATH = "src/test/java/com/testProject/pages/";

//    public static String TEST_SUITE_FILE_PATH="src/test/resources/testExecutionDriver";
    public static String RESULTS_FOLDER_PATH;
    public static String Project_Name=null;




    public static String SELECTED_PROJECT=null;
    public static String TABLE_SELECTED_PROJECT=null;
    public static String SELECTED_PROJECT_PATH=null;
    public static String New_Created_Page_Name=null;



    public static String SublimeText_Path = System.getProperty("user.dir")+"/src/main/java/com/SAPTOOL/temp/SublimeText/sublime_text.exe";
    public static String IntelliJ_Path = "C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2018.2.6/bin/idea.exe";


    public static String Prop_Selected_Project = "Selected.Project";
    public static String Prop_Project_Path = "Project.path";

    public static String param_properties="params.properties";
    public static String config_properties="config.properties";
    public static String queue_suites_properties="queue.properties";
//    public static String parameter_name_prop = "parameter_names.properties";






    public static String project_Button_clicked_name=null;

    public static WebDriver webDriver;

    // HUB _ NODES
    public static String SELENIUM_GRID_PATH = System.getProperty("user.dir")+FS+"src"+FS+"main"+FS+"java"+FS+"com"+FS+"SAPTOOL"+FS+"temp"+FS+"selenium-hub-node-configs";

    public static boolean HUB_STATUS = false;
    public static boolean NODE_STATUS = false;

    public static String GRID_DRIVERS_PATH = SELENIUM_GRID_PATH+FS+"DRIVERS"+FS;
    public static String NODES_JSON_FILE_PATH =SELENIUM_GRID_PATH+FS+"Config/GridNode.json";
    public static String HUB_JSON_FILE_PATH =SELENIUM_GRID_PATH+FS+"Config/hubConfig.json";

    public static String NODES_CONFIG_FILE_PATH =SELENIUM_GRID_PATH+FS+"Nodes_Start.bat";
    public static String HUB_CONFIG_FILE_PATH =SELENIUM_GRID_PATH+FS+"HUB_Start.bat";



    // PAGE MODEL BUILDER
    public static String PAGE_URL=null;
    public static String PAGE_NAME=null;
    public static String PAGE_PATH=null;

    //Operations
    public static String all_operations=null;

    //Methods
    public static String Method_Name=null;
    public static String Method_Description=null;
    public static String Method_AccessModifier=null;
    public static String Method_Return_Type=null;
    public static boolean Method_args_status=false;

    public static String TestScript_Selected_Page_Name=null;

    public static String TestScript_Button_Name=null;

    public static boolean Method_Verify = false;


    public static int STEP_NO = 0;
    public static String STEP_DESCRIPTION=null;
    public static String STEP_EXPECTED=null;
    public static String STEP_FAILMESSAGE=null;

    public static String SCRIPT_NAME=null;

    public static String SELECTED_METHOD=null;

    public static boolean VERIFY_SCRIPT_COMMAND=false;
}
