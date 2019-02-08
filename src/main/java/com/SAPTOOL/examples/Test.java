package com.SAPTOOL.examples;

public class Test {

    public static void main(String args[]) {
        String str= "enterfirstName(args[0]);";
      //  str.length()
        str=str.substring(0,str.indexOf("(args"));

        System.out.println(str);
    }
}
