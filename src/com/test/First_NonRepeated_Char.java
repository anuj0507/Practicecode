package com.test;

import java.util.Scanner;

public class First_NonRepeated_Char {

	public static void main(String[] args) {
		    String str;char non_repeat=0;
		    int len,i,j,count=0;
		    
		    Scanner s = new Scanner(System.in);
		    str = s.nextLine();
		    len = str.length();
		    for(i=0;i<len;i++) 
		    { 
		      non_repeat=str.charAt(i); 
		      count=1; 
		      for(j=0;j<len;j++) 
		      { 
		        if(i!=j) 
		        { 
		          if(str.charAt(i) == str.charAt(j)) 
		          { 
		            count=0; 
		            break; 
		          } 
		        } 
		      } 
		      if(count==1) 
		        break; 
		    } 
		if(count == 1) 
		System.out.print("The non repeated character is  : " + non_repeat); 
	}
}
