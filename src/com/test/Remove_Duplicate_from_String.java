package com.test;

import java.util.HashSet;
import java.util.Set;
/*
 * create a string in which duplicates has to removed
 * convert string into lower case or upper case
 * write a method removeDuplicates Which accept Strings and it should return string.
 * In removeDuplicates method Create a HashSet.
 * Create a StringBuffer
 * loop through the each Character in String
 * Convert String to character array
 * Take each character from array and check in HashSet if its not present in HashSet add to HashSet and StringBuffer.
 * After Iterating each character in String return the String object from this method.
 */


public class Remove_Duplicate_from_String {
	public static void main(String[] args) 
	{
		String str = "Anuj Jain";
		String s= str.toLowerCase();
		System.out.println(removeDuplicates(s));
	}
	
	public static String removeDuplicates(String s)
	{
		Set<Character> set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
	}
	
}
