package com.test;

public class ReadExcelData {

	public static void main(String[] args) {
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Anuj\\Desktop\\Sample.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));
	}

}
