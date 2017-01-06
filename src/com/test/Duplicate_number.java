package com.test;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_number {

		public static void main(String a[])
		{
			int[] numbers = new int[]{5, 6, 9, 25, 34, 34, 99 ,54,23,2,45,75,23,5,6,1,2,7,99};
			Set<Integer> repeatCheck = new HashSet<>();
			for(int x : numbers) 
				{
				if(repeatCheck.add(x))
				System.out.println("Number repeated "+ x);
				}
			}
		}