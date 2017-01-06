package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Remove_White_Spaces {
//	Remove White Space from String
	public static void main(String[] args) throws Exception {
		String input= "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter the String");
		input= br.readLine();
		System.out.println(input.replaceAll("\\s", ""));

	}
	
//	Remove character from a given String
	/*public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");
		String a= sc.next();
		System.out.println(removeCharAt(a, 3));
	}
	
	public static String removeCharAt(String s, int pos) 
	{
		return s.substring(0,pos)+s.substring(pos + 1);
	}*/

}
