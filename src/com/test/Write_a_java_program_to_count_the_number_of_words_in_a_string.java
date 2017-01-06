package com.test;

import java.util.Scanner;

public class Write_a_java_program_to_count_the_number_of_words_in_a_string {

	public static void main(String[] args) {
		int dig_count=0;
		int up_count=0;
		int lo_count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) 
			{
				dig_count++;
			}
			else if(Character.isUpperCase(input.charAt(i)))
			{
				up_count++;
			}
			else if(Character.isLowerCase(input.charAt(i)))
			{
				lo_count++;
			}
			}
		System.out.println("No of Digit :"+dig_count);
		System.out.println("No of Digit :"+up_count);
		System.out.println("No of Digit :"+lo_count);
	}

}
