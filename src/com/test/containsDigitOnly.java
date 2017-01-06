package com.test;

import java.util.Scanner;


public class containsDigitOnly {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String text = sc.next();
		System.out.println(numericValue(text));
		
	}
		
		public static boolean numericValue(String s)
		{
			try 
			{
				double d = Double.parseDouble(s);
				System.out.println("is a valid decimal number");
			} catch (NumberFormatException nme) 
			{
				return false;
			}
			return true;
		}
}