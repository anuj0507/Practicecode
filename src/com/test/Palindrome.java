package com.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the nUmber");
		int a = sc.nextInt();
		int temp =a;
		while (a>0) {
				int remainder = a%10;
				sum = (sum*10)+remainder;
				a=a/10;
		}
			if (temp==sum) 
				System.out.println("palindrome number ");   
			 else    
				   System.out.println("not palindrome");   
			sc.close();
		}
		
		

	

}