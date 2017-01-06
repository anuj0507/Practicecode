package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;



public class txtFileWordCount {

	public static void main(String[] args) throws IOException {
		int count = 0;
		File file = new File("C:\\Users\\Anuj\\Desktop\\sample.txt");
		Scanner sc = new Scanner(new FileInputStream(file));
		{
			while (sc.hasNext()) 
			{
				sc.next();
				count++;
			}
			System.out.println(count);
		}
		sc.close();
	}

}
