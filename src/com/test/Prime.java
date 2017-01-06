package com.test;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int flag =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number");//7
		int num =sc.nextInt();//num=7
		for (int i = 2; i <= num/2; i++) { 	//i=2 then i<=7/2-->3.5 condition satisfy
			if (num%i==0) {					//num%i==0-->7%2 is not equal to 0 i.e Condition Not Satisfy
											//For Next Iteration i=3 then i<=7/3-->2 condition satisfy
											//i=3 num%i==0-->7%3 --> is not equal to 0 i.e Condition Not Satisfy loop is not executed
											//For Next Iteration i=4 then i<=7/4-->114.33 condition satisfy
											//num%i==0-->343%3 --> is not equal to 0 i.e Condition Not Satisfy loop is not executed
				System.out.println( "Not a Prime Number");
				flag = 1;
				break;
			}
		}
			if (flag==0 ) 
			System.out.println("Prime Number");
			sc.close();
	}
	


}
