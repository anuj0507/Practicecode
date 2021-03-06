package com.test;

import java.util.Arrays;

public class SortedString {

	public static void main(String[] args) {
            
            //String array
            String[] strNames = new String[]{"John", "alex", "Chris", "williams", "Mark", "Bob"};
            //sort String array using sort method
            Arrays.sort(strNames);
            System.out.println("String array sorted (case sensitive)");
            //print sorted elements
            for(int i=0; i < strNames.length; i++){
                    System.out.print(strNames[i]+" , ");
            }
           
            /*
             * Please note that, by default Arrays.sort method sorts the Strings
             * in case sensitive manner.
             *
             * To sort an array of Strings irrespective of case, use
             * Arrays.sort(String[] strArray, String.CASE_INSENSITIVE_ORDER) method instead.
             */
           
            //case insensitive sort
            Arrays.sort(strNames);
           
            System.out.println("String array sorted (case insensitive)");
            //print sorted elements again
            for(int i=0; i < strNames.length; i++){
                    System.out.print(strNames[i]+" , ");
            }
	}
}
