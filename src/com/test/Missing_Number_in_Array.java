package com.test;

import java.util.ArrayList;

public class Missing_Number_in_Array {

	public static void main(String[] args) {
		ArrayList<Integer>array = new ArrayList<Integer>();
		int[] a = {1,3,5,6,7,8,9,10,15};
		int j = a[0];
		for (int i = 0; i < a.length; i++) {
			if(j==a[i])
			{
				j++;
				continue;
			}else
			{
				array.add(j);
				i--;
				j++;
			}
		}
		for (int r : array) {
			System.out.println("The missing numbers are : "+ " "+ r);
		}
	}

}
