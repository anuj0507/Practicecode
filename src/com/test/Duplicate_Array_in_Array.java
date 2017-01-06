package com.test;

import java.util.HashSet;
import java.util.Set;


public class Duplicate_Array_in_Array {

	public static void main(String[] args) {
		String duplicates[] = new String[]{"Anuj","Ashish","Amit","Anuj"};
		Set duplicatesSet = new HashSet<>();
		Set nonduplicatesSet = new HashSet<>();
		for (String string : duplicates) {
			if (!nonduplicatesSet.contains(string)) {
				 nonduplicatesSet.add(string);
			}else {
				duplicatesSet.add(string);
			}
		}
		System.out.println(duplicatesSet);
	}
}


