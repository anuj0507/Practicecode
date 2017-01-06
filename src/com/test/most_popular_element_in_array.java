package com.test;



import java.util.ArrayList;

public class most_popular_element_in_array {
	public static void main(String [] args){
	ArrayList<Integer>array = new ArrayList<Integer>();
	int[] a= {1,2,3,4,5,6,7,7,7,7,1,2,3,45,5,5,5,5,5,5,5,5};
	int count = 1, tempCount;
	  int popular = a[0];
	  int temp = 0;
	  for (int i = 0; i < (a.length - 1); i++)
	  {
	    temp = a[i];
	    tempCount = 0;
	    for (int j = 1; j < a.length; j++)
	    {
	      if (temp == a[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      popular = temp;
	      count = tempCount;
	    }
	  }
	  System.out.println(popular);

	  }
}
