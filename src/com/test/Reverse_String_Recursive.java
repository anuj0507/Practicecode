package com.test;


public class Reverse_String_Recursive {
	public String recursive(String str){
		String Revese = "";
		if (str.length()==1) {
			return str;
		}
		else
		{
			Revese += str.charAt(str.length()-1)
				   +recursive(str.substring(0,str.length()-1));
			return Revese;
		}
	}
	public static void main(String[] args) {
		Reverse_String_Recursive rsr = new Reverse_String_Recursive();
		System.out.println("Result " +rsr.recursive("Anuj Jain") );
	}

}
