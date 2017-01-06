package com.test;

public class Fabioncci {

	public static void main(String[] args) {
		int count =10;
		int a=0,b=1;int c;
		System.out.print(a + " "+b);
		c=a+b;
		System.out.print(" "+c);
		for (int i = 2; i <= count; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+c);
		}

	}

}
