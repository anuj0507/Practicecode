package com.test;

import java.util.HashSet;
import java.util.Set;


public class Permutations {
	public static Set<String> permutationFinder(String str){
		Set<String> perm = new HashSet<String>();
		if (str==null) {
			return null;
		}
		else if (str.length()==0) {
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0);
		String rem= str.substring(1);
		System.out.println("rem :" +rem );
		Set<String> words = permutationFinder(rem);
		System.out.println("Word :"+words);
		for (String strNew : words) {
			
			for (int i = 0; i < str.length(); i++) {
				perm.add(charInsert(strNew,initial,i));
				System.out.println("-----------------"+perm.toString()+"i="+i);
			}
			System.out.println("str new"+strNew);
		}
		return perm;	
	}
    private static String charInsert(String str, char c, int j) {
    	System.out.println("String : "+str);
		String begin = str.substring(0,j);
		System.out.println("begin"+" "+begin);
		String end  = str.substring(j);
		System.out.println("end"+" "+end);
		return begin + c + end;
	}
	public static void main(String[] args) {
		String s = "ABC";
		System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
    	
    }
}