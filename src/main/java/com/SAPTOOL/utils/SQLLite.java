package com.SAPTOOL.utils;

import java.sql.*;

public class SQLLite {

    protected static Connection conn = null;
    protected static String dbName = "jdbc:sqlite:test2.db";
    /**
     * Connect to a database
     */
    public static void connect() {


        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(dbName);
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        } finally {
          try{
              if (conn != null) {
                  conn.close();
              }
          } catch (SQLException ex) {
              System.out.println(ex.getMessage());
          }
        }
        System.out.println("Opened database successfully");
    }



    public static void createTable(String sqlquery){
       Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbName);
//            connect();
            System.out.println("Opened database successfully in createProjectsTable");

            stmt = c.createStatement();
            String sql = sqlquery;
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    public static void insertProjectParams(String tableName,String paramName,String paramValue){
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbName);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO "+tableName+"_params (PARAM_NAME,PARAM_VALUE) " +
                    "VALUES ('"+paramName+"', '"+paramValue+"' );";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

    public static void insertProjectsTable(String accountName,String projectName,String projectType,String projectPath){
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbName);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO PROJECTS (ACCOUNT_NAME,PROJECT_NAME,PROJECT_TYPE,PROJECT_PATH) " +
                    "VALUES ('"+accountName+"', '"+projectName+"', '"+projectType+"', '"+projectPath+"' );";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

    public static void select(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbName);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM PROJECTS;" );

            while ( rs.next() ) {

                String  account_name = rs.getString("ACCOUNT_NAME");
                String project_name  = rs.getString("PROJECT_NAME");
                String  project_type = rs.getString("PROJECT_TYPE");
                String project_path = rs.getString("PROJECT_PATH");

                System.out.println( "ACCOUNT_NAME = " + account_name );
                System.out.println( "PROJECT_NAME = " + project_name );
                System.out.println( "PROJECT_TYPE = " + project_type );
                System.out.println( "PROJECT_PATH = " + project_path );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");

    }

    public static boolean tableExists(String tableName){
        boolean flag =true;
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbName);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT count(*) FROM sqlite_master WHERE type='table' AND name='"+tableName+"';" );

            int count =rs.getInt(1);
            System.out.println( "table Count = " + count );
           if(count==0){
               flag=false;
           }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
        return flag;
    }

    public static boolean rowExists(String tableName,String colName,String rowValue){
        boolean flag =true;
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbName);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT count(*) FROM "+tableName+" WHERE "+colName+"='"+rowValue+"';" );

            int count =rs.getInt(1);
            System.out.println( "row Count = " + count );
            if(count==0){
                flag=false;
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
        return flag;
    }

    public static void insertProjectParamsTable(String projectName,String projectParam){
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbName);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO PROJECTSPARAMS (PROJECT_NAME,PARAM_NAME) " +
                    "VALUES ('"+projectName+"', '"+projectParam+"' );";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
    public static void insertProjectParamValuesTable(String projectName,String projectParam,String paramValue){
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbName);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO PROJECTSPARAMVALUES (PROJECT_NAME,PARAM_NAME,PARAM_VALUE) " +
                    "VALUES ('"+projectName+"', '"+projectParam+"', '"+paramValue+"' );";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

    public static String[] selectProjectParams(String projectName){
        Connection c = null;
        Statement stmt = null;
        String[] params=null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbName);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet resultSet = stmt.executeQuery( "SELECT count(*) FROM PROJECTSPARAMS WHERE PROJECT_NAME = '"+projectName+"';" );
            int count =resultSet.getInt(1);
            params = new String[count];
            ResultSet rs = stmt.executeQuery( "SELECT * FROM PROJECTSPARAMS WHERE PROJECT_NAME = '"+projectName+"';" );

            int i=0;
            while ( rs.next() ) {
                params[i] = rs.getString("PROJECT_NAME");


                System.out.println( "paramaName = " + params[i] );
                i=i+1;

            }
            resultSet.close();
            rs.close();

            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
        return params;

    }
}
