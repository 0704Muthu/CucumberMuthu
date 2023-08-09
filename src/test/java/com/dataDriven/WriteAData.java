package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteAData {

	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\rmuth\\Documents\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);//up casting
		//wb.createSheet("IPTEnroll");
		//wb.getSheet("IPTEnroll").createRow(0).createCell(0).setCellValue("STD:ID");
		//wb.getSheet("IPTEnroll").getRow(0).createCell(1).setCellValue("Name");
		wb.getSheet("IPTEnroll").createRow(1).createCell(0).setCellValue("101");
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		System.out.println("Successfully updated");
		
	}
	
}
