package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vowels {

	public static void main(String[] args) throws Exception {
		int vowels=0;int digit=0;int blank=0;int consonant=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a string");
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		if (ch=='a'|| ch=='A' ||ch=='e'|| ch=='E' ||ch=='i'|| ch=='I' ||ch=='o'|| ch=='O' ||ch=='u'|| ch=='U') 
		{
			vowels++;
		}
		else if (ch=='b'||ch == 'B'||ch=='c'||ch == 'C'||ch=='d'||ch == 'D'||ch=='f'||ch == 'F'||ch=='g'||ch == 'G'||ch=='h'||
				ch == 'H'||ch=='j'||ch == 'J'||ch=='k'||ch == 'K'||ch=='l'||ch == 'L'||ch=='m'||ch == 'M'||ch=='n'||ch == 'N'||
				ch=='p'||ch == 'P'||ch=='q'||ch == 'Q'||ch=='r'||ch == 'R'||ch=='s'||ch == 't'||ch == 'v'||ch == 'V'||ch == 'x'||
				ch == 'X'||ch == 'z'||ch == 'Z')
		{
			consonant++;
			
		}
		else if (Character.isDigit(ch))
		{
			digit++;
		}
		else if (Character.isWhitespace(ch)) 
		{
			blank++;
		}
	}
		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonant);
		System.out.println("Digits : " + digit);
		System.out.println("Blanks : " + blank);
	}

}
