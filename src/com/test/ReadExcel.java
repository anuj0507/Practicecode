package com.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Anuj\\Desktop\\Sample.xlsx");
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total number of rows"+rowcount+1);
		
		for (int i = 0; i < rowcount; i++) {
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data of excel is "+ data0);
		}
	}
}