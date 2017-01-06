package com.test;

public class BubbleSort {
	public static void main(String[] args) {
		int[]a ={12,45,1,23,20};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		 bubblesort(a);
		 System.out.println("Array after bubble sort");
		 for (int i = 0; i < a.length; i++) {
			 System.out.print(a[i]+ " ");
		}
	}
	
	
	public static void bubblesort(int []arr){
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n-1; j++) {
				if(arr[j-1]>arr[j])
				{
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
}
