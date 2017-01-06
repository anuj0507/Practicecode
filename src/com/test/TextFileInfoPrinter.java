package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileInfoPrinter {
	 public static void main(String[]args) throws FileNotFoundException        
	    {
		 int words=0;
		 int lines=0;
		 int chars=0;
		 
		 		File file = new File("C:\\Users\\Anuj\\Desktop\\sample.txt");
	            Scanner sc = new Scanner(file);
	            while(sc.hasNext())
	            {
	            	sc.next();
	                words++;
	            }
	            sc = new Scanner(file);
	            while(sc.hasNextLine())
	            {
	            	sc.nextLine();
	                lines++;
	            }
	            sc = new Scanner(file);
	            while(sc.hasNextByte())
	            {
	            	sc.nextByte();
	                chars++;
	            }

	            System.out.println("Number of lines: " + lines);
	            System.out.println("Number of words: " + words);
	            System.out.println("Number of characters: " + chars);
	    }

}
