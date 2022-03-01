package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {
	
	public static void read_particular_Data() throws Throwable  {
	
	File f = new File("C:\\Selenium\\Maven_project\\Data.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fis);
	
	Sheet sheetAt = w.getSheetAt(0);
	
	Row row = sheetAt.getRow(1);
	
	Cell cell = row.getCell(1);
	
	CellType cellType = cell.getCellType();
	
	if(cellType.equals(cellType.STRING)) {
		
		String value = cell.getStringCellValue();
		System.out.println(value);
	}
	else if (cellType.equals(cellType.NUMERIC)) {
		double value = cell.getNumericCellValue();
		int num = (int) value;
		System.out.println(num);
	}
	
	}
	
	public static void  read_All_Data() throws Throwable {
		
		File f = new File("C:\\Selenium\\Maven_project\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int NoOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for(int i=0;i < NoOfRows; i++) {
			Row row = sheetAt.getRow(i);
			
			int NoOfCells = row.getPhysicalNumberOfCells();
			
			for(int j=0;i < NoOfCells; i++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if(cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				
				else if(cellType.equals(cellType.NUMERIC)){
					double value = cell.getNumericCellValue();
					int n = (int) value;
					System.out.println(n);
				}
				
			}
		}
		
	}
	
	public static void main (String [] args) throws Throwable {
		
		read_particular_Data();
		read_All_Data();
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}