package com.SAPTOOL.utils;

import com.SAPTOOL.ui.Class_Frame_Init;
import com.SAPTOOL.ui.Init;
import com.SAPTOOL.ui.main.Grid;
import com.SAPTOOL.ui.main.HubWarning;
import com.SAPTOOL.ui.main.Main;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.io.*;

import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

import static com.google.common.io.Files.copy;

/**
 *
 * @author bharat.vatrapu@gmail.com
 */

public class Generic {


    public static String readProp(String key){
        Properties prop = new Properties();
        InputStream input = null;
        String value=null;
        try {


            input = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src/main/resources/config.properties"));

            prop.load(input);
            value= prop.getProperty(key);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return value;
    }
    public static String readProp(String key,String filepath){
        Properties prop = new Properties();
        InputStream input = null;
        String value=null;
        try {


            input = new FileInputStream(new File(filepath));
            ;

            prop.load(input);
            value= prop.getProperty(key);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return value;
    }

    public static HashMap<String,String> readAllProp(String filepath){
        System.out.println("readAllProp:"+filepath);
        Properties prop = new Properties();
        InputStream input = null;
        HashMap<String,String> hm=new HashMap<String,String>();
        try {

            input = new FileInputStream(new File(filepath));

            prop.load(input);

            Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String value = prop.getProperty(key);
                hm.put(key,value);
                //System.out.println("Key : " + key + ", Value : " + value);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
     return hm;

    }



    public static void writeProp(String key,String value){
        Properties prop = new Properties();
        //OutputStream output = null;
        FileOutputStream fileOut=null;

        try {

           // output = new FileOutputStream(System.getProperty("user.dir")+File.separator+"src/main/resources/config.properties");
            File file = new File(System.getProperty("user.dir")+File.separator+"src/main/resources/config.properties");
            fileOut = new FileOutputStream(file,false);
            // set the properties value
            prop.setProperty(key, value);


            // save properties to project root folder
            prop.store(fileOut, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public static void writeProp(String key,String value,String filepath){
        Properties prop = new Properties();
        //OutputStream output = null;
        FileOutputStream fileOut=null;

        try {

            // output = new FileOutputStream(System.getProperty("user.dir")+File.separator+"src/main/resources/config.properties");
            File file = new File(filepath);
            fileOut = new FileOutputStream(file,false);
            // set the properties value
            prop.setProperty(key, value);


            // save properties to project root folder
            prop.store(fileOut, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public static void writeParamProp(DefaultListModel param_name_value){

        System.out.println("param_name_value::"+param_name_value);
        Properties prop = new Properties();

        String params_path = GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+GlobalConstants.SELECTED_PROJECT+File.separator+GlobalConstants.param_properties;

        //OutputStream output = null;
        FileOutputStream fileOut_params_path=null;
        String paranName=null;
        try {
            for(int i=0;i<=param_name_value.size()-1;i++){
                // System.out.println(String.valueOf(i)+":::"+paramListmodel.get(i).toString());

                File file_params_path = new File(params_path);
                fileOut_params_path = new FileOutputStream(file_params_path,false);

                paranName=param_name_value.get(i).toString().replaceAll("=","");
                System.out.println(param_name_value.get(i).toString()+":::::::::"+paranName);
                // set the properties value
                prop.setProperty(paranName, "");
                //System.out.println("param_name_value::"+param_name_value.get(i).toString());
                if(!param_name_value.get(i).toString().contains("=")) {
                    // Generic.writeProp(listModel.get(i).toString(),"", GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+GlobalConstants.SELECTED_PROJECT+File.separator+"params.properties",false);
                    Generic.createNewFile(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH + File.separator + GlobalConstants.SELECTED_PROJECT + File.separator + param_name_value.get(i).toString() + ".properties");
                }
                // save properties to project root folder
                prop.store(fileOut_params_path, null);
//            SQLLite.insertProjectParams(GlobalConstants.SELECTED_PROJECT+"_params",paramListmodel.get(i).toString(),"value");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void writeParamValuesProp(DefaultListModel listModel,String param){
        Properties prop = new Properties();
        //OutputStream output = null;
        FileOutputStream fileOut=null;


      //
        try {
            for(int i=0;i<=listModel.size()-1;i++){
                               // System.out.println(String.valueOf(i)+":::"+paramListmodel.get(i).toString());
                File file = new File(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+GlobalConstants.SELECTED_PROJECT+File.separator+param+".properties");
                fileOut = new FileOutputStream(file,false);
                // set the properties value
                System.out.println("listmodel:"+listModel.get(i).toString());
                prop.setProperty(String.valueOf(i),listModel.get(i).toString());


                // save properties to project root folder
                prop.store(fileOut, null);


            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void writeParamAndValueProp(DefaultListModel listModel,String filePath){
        Properties prop = new Properties();
        //OutputStream output = null;
        FileOutputStream fileOut=null;
        String[] param=null;

        try {

            for(int i=0;i<=listModel.size()-1;i++){
                if(listModel.get(i).toString().contains("=")) {
                    // set the properties value
                    File file = new File(filePath);
                    fileOut = new FileOutputStream(file,false);
                    param = listModel.get(i).toString().split("=");

                    prop.setProperty(param[0], param[1]);
                } else{
                    prop.setProperty(param[0], "");
                }

                // save properties to project root folder
                prop.store(fileOut, null);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void writeProp(String key,String value,String filePath,boolean append){
        Properties prop = new Properties();
        //OutputStream output = null;
        FileOutputStream fileOut=null;

        try {

            // output = new FileOutputStream(System.getProperty("user.dir")+File.separator+"src/main/resources/config.properties");
            File file = new File(filePath);
            fileOut = new FileOutputStream(file,append);
            // set the properties value
            prop.setProperty(key, value);


            // save properties to project root folder
            prop.store(fileOut, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void close(JFrame frame){
        frame.setVisible(false);
        frame.dispose();
    }

    public static String getDate(){
        String DateNow=null;
        try {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            DateNow = dateFormat.format(date);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return DateNow;
    }
    public static String getTime() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("kk_mm");
        String TimeNow = dateFormat.format(date);
        return TimeNow;
    }
    public static void copy(File sourceLocation, File targetLocation) throws IOException {
        if (sourceLocation.isDirectory()) {
            copyDirectory(sourceLocation, targetLocation);
        } else {
            copyFile(sourceLocation, targetLocation);
        }
    }
    public static void copyFile(File source, File target) throws IOException {
        try (
                InputStream in = new FileInputStream(source);
                OutputStream out = new FileOutputStream(target)
        ) {
            byte[] buf = new byte[1024];
            int length;
            while ((length = in.read(buf)) > 0) {
                out.write(buf, 0, length);
            }
        }
    }
    public static void copyDirectory(File source, File target)  {

        try {
            if (!target.exists()) {
                target.mkdir();
            }

            for (String f : source.list()) {
                copy(new File(source, f), new File(target, f));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static String choosePath(){
        String strPath = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose Path");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            strPath = chooser.getSelectedFile().toString();
        } else {
            JOptionPane.showMessageDialog(null,"Select Project Directory Path only!");
        }
        return strPath;
    }

    public static void openEXEfile(String filePath){
        try {
            Process p = Runtime.getRuntime().exec(new String[] {filePath});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getSelectedRadioButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            System.out.println("testbg::"+button.getText());
            if (button.isSelected()) {
                return button.getText().toString();
            }
        }
        return null;
    }

//    public static void initSetup(){
//      //  createTables();
//        createNewFolder(GlobalConstants.SETUP_FOLDER_PATH, GlobalConstants.ROOT_FOLDER);
//        createNewFolder(GlobalConstants.ROOT_FOLDER_PATH, GlobalConstants.PROJECTS_FOLDER_NAME);
//        createNewFile(GlobalConstants.ROOT_FOLDER_PATH+"/Bharath.txt");
//    }
    public static LocalDateTime getFolderCreateDate(String filePath){

        LocalDateTime localDateTime=null;
        String time=null;
        File path = new File(filePath);
        try {
            BasicFileAttributes attr = Files.readAttributes(path.toPath(),
                    BasicFileAttributes.class);
            localDateTime= attr.creationTime()
                    .toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();

        } catch (Exception e){
            e.printStackTrace();
        }
       return localDateTime;
    }
    public static String format(long time) {
        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return sdf.format(new Date(time));
    }
//    public static void createTables(){
//        SQLLite.createTable(GlobalConstants.PROJECTS_SQL_TABLE);
//        SQLLite.createTable(GlobalConstants.PROJECTPARAMS_SQL_TABLE);
//        SQLLite.createTable(GlobalConstants.PROJECTPARAMVALUES_SQL_TABLE);
//    }
    public static boolean createFolder(String dirPath){
        boolean fvar = false;
        try {
            File file = new File(dirPath);
            if (file.exists()) {
                fvar = true;
            } else {
                fvar = file.mkdir();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return fvar;
    }
    public static boolean createFolder(String dirPath,String folderName){
        boolean fvar = false;
        try {
            File file = new File(dirPath+File.separator+folderName);
            if (file.exists()) {
                fvar = true;
                //JOptionPane.showMessageDialog(null, folderName+" already created", "Warning " , JOptionPane.INFORMATION_MESSAGE);
            } else {
                fvar = file.mkdir();
                fvar = false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return fvar;
    }
    public static void createNewFolder(String folderPath, String folderName) {

        String strfolderPath = folderPath+ "\\" +folderName;
        File file = new File(strfolderPath);
        if (!file.exists()) {
            file.mkdir();
        }

    }
    public static void createNewFile(String filePath) {

        File strFileExists;
        strFileExists = new File(filePath);
        boolean exists = strFileExists.exists();
        if(!exists) {
            try {
                //String desktopPath = System.getProperty("user.home") + "\\Desktop";
                File file = new File(filePath);
                if (file.createNewFile()) {
                    System.out.println("File is created!");
                } else {
                    System.out.println("File already exists.");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static boolean verifyFileExist(String filePath) {
        File strFileExists;
        strFileExists = new File(filePath);
        boolean exists = strFileExists.exists();
        return exists;
    }
    public static boolean fileDelete(String filePath){
        boolean status=true;
        File file = new File(filePath);

        if(!file.delete()){
            status=false;
        }
        return status;
    }
    public static void folderDelete(String folderPath){
        try {
            File directory = new File(folderPath);

            //make sure directory exists
            if(!directory.exists()){

                System.out.println("Directory does not exist.");
                System.exit(0);

            }else{

                try{

                    delete(directory);

                }catch(IOException e){
                    e.printStackTrace();
                    System.exit(0);
                }
            }

            System.out.println("Done");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void delete(File file)
            throws IOException{

        if(file.isDirectory()){

            //directory is empty, then delete it
            if(file.list().length==0){

                file.delete();
                System.out.println("Directory is deleted : "
                        + file.getAbsolutePath());

            }else{

                //list all the directory contents
                String files[] = file.list();

                for (String temp : files) {
                    //construct the file structure
                    File fileDelete = new File(file, temp);

                    //recursive delete
                    delete(fileDelete);
                }

                //check the directory again, if empty then delete it
                if(file.list().length==0){
                    file.delete();
                    System.out.println("Directory is deleted : "
                            + file.getAbsolutePath());
                }
            }

        }else{
            //if file, then delete it
            file.delete();
            System.out.println("File is deleted : " + file.getAbsolutePath());
        }
    }

    public static void createMavenProjectTemplate(String projectName){

        createFolder(GlobalConstants.PROJECTS_FOLDER_PATH+File.separator+projectName+File.separator+"src/main/java/com/testomation/framework");
    }


    public static void createProjectConfig(String projectName){
        Generic.createFolder(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+File.separator+projectName);
        Generic.createNewFile(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+File.separator+projectName+File.separator+GlobalConstants.param_properties);
        Generic.createNewFile(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+File.separator+projectName+File.separator+GlobalConstants.config_properties);
        Generic.createNewFile(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+File.separator+projectName+File.separator+GlobalConstants.queue_suites_properties);
//        Generic.createNewFile(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+File.separator+projectName+File.separator+GlobalConstants.parameter_name_prop);
    }
    public static void createProject_Setup(String projectName){
        DefaultListModel TestNGParams= new DefaultListModel();

        TestNGParams.clear();
       // Projects.txtProjectName.setText(projectName);
      //  Main.txtProjectName.setText(projectName);
        GlobalConstants.SELECTED_PROJECT = projectName;
        GlobalConstants.SELECTED_PROJECT_PATH =GlobalConstants.PROJECTS_FOLDER_PATH+ File.separator+projectName;
        Generic.writeProp(GlobalConstants.Prop_Selected_Project,projectName);
        Generic.writeProp(GlobalConstants.Prop_Project_Path,GlobalConstants.SELECTED_PROJECT_PATH,GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+projectName+File.separator+GlobalConstants.config_properties);
        TestNGParams.addElement("environment");
        TestNGParams.addElement("module");
        TestNGParams.addElement("param1");
        Generic.writeParamProp(TestNGParams);

    }
    public static void deleteProject_Setup(String projectName){
        Generic.folderDelete(GlobalConstants.PROJECTS_FOLDER_PATH+ File.separator+projectName);
        Generic.folderDelete(GlobalConstants.CONFIG_PROJECTS_FOLDER_PATH+ File.separator+projectName);
        if(GlobalConstants.SELECTED_PROJECT.equalsIgnoreCase(projectName)) {
            GlobalConstants.SELECTED_PROJECT = "";
            Main.txtLoadProjectName.setText("");
            Generic.writeProp(GlobalConstants.Prop_Selected_Project, "");
        }
    }

    public static String[] getAllFileNames(String folderPath){
        int i=0;

        File dir = new File(folderPath);
        String[] files = dir.list();

        String[] fileNames=new String[files.length];
        if (files.length == 0) {
            System.out.println("The directory is empty");
            //Init.print("The directory is empty");
        } else {
            for (String aFile : files) {
                fileNames[i] = aFile;
                i=i+1;
            }
        }
//
//        System.out.println("testsuite folder path:"+folderPath);
//        File folder = new File(folderPath);
//        File[] listOfFiles = folder.listFiles();
//
//        System.out.println("lenth:"+listOfFiles.length);
//        for (int i = 0; i < listOfFiles.length; i++) {
//            // if (listOfFiles[i].isFile()) {
//            System.out.println("File " + listOfFiles[i].getName());
//            fileNames[i] = listOfFiles[i].getName();
//            //   }
////            } else if (listOfFiles[i].isDirectory()) {
////                System.out.println("Directory " + listOfFiles[i].getName());
////            }
//        }
        return fileNames;
    }

    public static String paramBuilder(HashMap<String,String> paramValues){
        String builder;
        String formBuilder=null;
        List<String> param_builder = new ArrayList<String>();
        param_builder.clear();
        for (Map.Entry<String, String> entry : paramValues.entrySet()) {
            builder = "-D"+entry.getKey()+"="+entry.getValue();
            param_builder.add(builder);
        }

        formBuilder = param_builder.get(0);
        for(int k=1;k<param_builder.size();k++){
            formBuilder = formBuilder+" "+param_builder.get(k);
        }

        return formBuilder;


    }


    public void startHub(){
        if(GlobalConstants.HUB_STATUS){
            Class_Frame_Init.hubWarning=new HubWarning();
            Class_Frame_Init.hubWarning.setVisible(true);
            //JOptionPane.showMessageDialog(null, "Already Hub is running", "Warning" , JOptionPane.INFORMATION_MESSAGE);
        } else {
            String hubStatus = null;
            Thread object = new Thread(new runHub());
            object.start();
            try {
                Thread.sleep(10000);
                hubStatus = RestApi.callRestApi("http://localhost:4444/grid/api/hub");
                if (hubStatus != null) {
                    GlobalConstants.HUB_STATUS = true;
                    Main.hubStatus.setIcon(new ImageIcon(getClass().getResource("/icons/Green_24px.png")));
                } else {
                    Thread.sleep(5000);
                    hubStatus = RestApi.callRestApi("http://localhost:4444/grid/api/hub");
                    if (hubStatus != null) {
                        GlobalConstants.HUB_STATUS = true;
                        Main.hubStatus.setIcon(new ImageIcon(getClass().getResource("/icons/Green_24px.png")));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    class runHub implements Runnable{
        @Override
        public void run() {
            try{
                System.out.println("sepath::"+GlobalConstants.SELENIUM_GRID_PATH);
                File dir = new File(GlobalConstants.SELENIUM_GRID_PATH);
                ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", "Start","HUB_Start.bat");
                pb.directory(dir);
                Process p = pb.start();
                String name = ManagementFactory.getRuntimeMXBean().getName();
                System.out.println("Process ID for this app = " + name);
            }
            catch (Exception e) {
                // Throwing an exception
                e.printStackTrace();
            }
        }
    }

    public void startNode(){
        String nodesStatus=null;
        Thread object = new Thread(new runNodes());
        object.start();
        try {
            Thread.sleep(10000);
            nodesStatus = RestApi.callRestApi("http://localhost:4444/grid/api/hub");

            if (nodesStatus.contains("\"total\":20")) {
                GlobalConstants.NODE_STATUS = true;
                Main.nodeStatus.setIcon(new ImageIcon(getClass().getResource("/icons/Green_24px.png")));
            } else{
                Thread.sleep(5000);
                nodesStatus = RestApi.callRestApi("http://localhost:4444/grid/api/hub");
                if (nodesStatus.contains("\"total\":20")) {
                    GlobalConstants.NODE_STATUS = true;
                    Main.nodeStatus.setIcon(new ImageIcon(getClass().getResource("/icons/Green_24px.png")));
                }
            }
            System.out.println("nodesStatus:"+GlobalConstants.NODE_STATUS);
            System.out.println("nodesStatus:"+nodesStatus);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    class runNodes implements Runnable{
        @Override
        public void run() {
            try{
                File dir = new File(GlobalConstants.SELENIUM_GRID_PATH);
                ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", "Start","Nodes_Start.bat");
                pb.directory(dir);
                Process p = pb.start();
                String name = ManagementFactory.getRuntimeMXBean().getName();
                System.out.println("Process ID for this app = " + name);
            }
            catch (Exception e) {
                // Throwing an exception
                e.printStackTrace();
            }
        }
    }

    public void stopHub_Node(){
        try {

            WindowsProcessKiller pKiller = new WindowsProcessKiller();

            // To kill a command prompt
            String processName = "cmd.exe";
            boolean isRunning = pKiller.isProcessRunning(processName);

            System.out.println("is " + processName + " running : " + isRunning);

            if (isRunning) {
                pKiller.killProcess(processName);
            }
            else {
                System.out.println("Not able to find the process : "+processName);
            }
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

        String hubStatus=null;
        hubStatus = RestApi.callRestApi("http://localhost:4444/grid/api/hub");
        if(hubStatus.contains("no resp")){
            GlobalConstants.HUB_STATUS=false;
            Main.hubStatus.setIcon(new ImageIcon(getClass().getResource("/icons/Gray_24px.png")));
            GlobalConstants.NODE_STATUS=false;
            Main.nodeStatus.setIcon(new ImageIcon(getClass().getResource("/icons/Gray_24px.png")));
        }
    }

    public static String readText(String filePath){
        String st=null;
        String totalStr = "";
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((st = br.readLine()) != null) {
                totalStr += st+System.lineSeparator();
              //  return st;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return totalStr;
    }
    public static void writeText(String msg, String filePath,boolean existingText){
        try{
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),existingText);
            BufferedWriter wr = new BufferedWriter(fw);
            wr.write(msg);
            wr.newLine();
            wr.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String removeSpecialChars(String string){
        String str;
        str = string.replaceAll("\\s+","");
        //str = str.replaceAll("[-'`~!@#$%&()_;:,<>.?/+^|]*", "");
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return str;
    }



}
