package com.test;

public class CheckSubString {
		
		/*public void checkStringContains() {
	        
	        String haystack = "Programming in Java";
	        String needle1 = "Java";
	        String needle2 = "Pascal";
	        
	        int index1 = haystack.indexOf(needle1);
	        int index2 = haystack.indexOf(needle2);
	        
	        if (index1 != -1)
	            System.out.println("The string contains the substring " + needle1);
	        else
	            System.out.println("The string does not contain the substring " + needle1);
	 
	        if (index2 != -1)
	            System.out.println("The string contains the substring " + needle2);
	        else
	            System.out.println("The string does not contain the substring " + needle2);
	    }
	    
	    *//**
	     * Starts the program
	     *
	     * @param args the command line arguments
	     *//*
	    public static void main(String[] args) {
	        new CheckSubString().checkStringContains();
	    }*/
	
	public static void main(String[] args) {
	String string1 = "AAABBBCCC"; 
	String string2 = "DDDEEEFFF";
	String searchForThis = "AABB";

	System.out.println("Search1="+string1.contains(searchForThis));

	System.out.println("Search2="+string2.toUpperCase().contains(searchForThis.toUpperCase()));
	}
}
