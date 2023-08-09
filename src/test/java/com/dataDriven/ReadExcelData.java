package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {


	private static void ReadAParticularData() throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\rmuth\\Documents\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);//up casting
		Sheet sheetAt = wb.getSheetAt(2);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);

		DataFormatter df = new DataFormatter();
		String formatCellValue = df.formatCellValue(cell);
		System.out.println(formatCellValue);
	}

	private  static void getAllData() throws IOException {
		File file = new File("C:\\Users\\rmuth\\Documents\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);//up casting
		Sheet sheetAt = wb.getSheetAt(2);
		
		//Get row value include header
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("include header:"+physicalNumberOfRows);
		
		//Get last row value
		int lastRowNum = sheetAt.getLastRowNum();
		System.out.println("last row value:"+lastRowNum);
		//Get last cell value
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("last cell value:"+lastCellNum);
		
		//Iterate the row and column
		for (int i = 1; i <=lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				Cell cell = sheetAt.getRow(i).getCell(j);
				DataFormatter dataf = new DataFormatter();
				String formatCellValue = dataf.formatCellValue(cell);
				System.out.println(formatCellValue);
			}
		}
		
	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		getAllData();
	}



}
