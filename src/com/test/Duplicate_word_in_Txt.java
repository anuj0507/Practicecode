package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Duplicate_word_in_Txt {
	public static void main(String[] args) throws Exception {
		String s;
		FileReader fr = new FileReader("C:\\Users\\Anuj\\Desktop\\sample.txt");
		BufferedReader br = new BufferedReader(fr);
		Set<String> data1 = new HashSet<String>();
		List<String> data2 = new ArrayList<String>();
		while ((s=br.readLine())!=null) {
			for(String val : s.split(" "))
			{
				data1.add(val);
				data2.add(val);
			}
		}
		
		for(String val: data1){
			int freq = Collections.frequency(data2,val);
			System.out.println("Frequency of " + val + " " + freq);
		}
	}
}
