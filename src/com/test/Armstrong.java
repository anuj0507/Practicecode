package com.test;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		int n = num;
		while (num>0)
		{
			int remainder = num%10;
			sum = sum+(int)Math.pow(remainder, 3);
			num=num/10;
		}
		if (sum==n) 
			System.out.println(n +": "+ "is an Armstrong Number");
			else 
				System.out.println(n+": "+ "is not an Armstrong Number");
		sc.close();
		}
}