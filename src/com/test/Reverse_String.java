package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) throws Exception {
		String input ="";
		System.out.println("Please enter the string");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		char[]a = input.toCharArray();
		for (int i = a.length-1; i >=0; i--) {
			System.out.print(a[i]);
		}
	}

}
