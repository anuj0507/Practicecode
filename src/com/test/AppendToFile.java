package com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AppendToFile {

	public static void main(String[] args) throws Exception {
		String data = "Today is last working day of the year";
		File file = new File("C:\\Users\\Anuj\\Desktop\\sample.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw= new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(data);
		System.out.println("Done");
		if (bw !=null) 
			bw.close();
		if(fw !=null)
			fw.close();
	}

}
