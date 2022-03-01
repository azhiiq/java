package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_write {
	
	public static void write_Data() throws Throwable {
		
		File f = new File("C:\\Selenium\\Maven_project\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet createSheet = w.createSheet("Data");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("ashi");
		
		w.getSheet("Data").getRow(0).createCell(1).setCellValue("123");
		
		w.getSheet("Data").createRow(0).createCell(0).setCellValue("jam");
		
		w.getSheet("Data").getRow(1).createCell(1).setCellValue("256");
		
		w.getSheet("Data").createRow(2).createCell(0).setCellValue("moha");
		
		w.getSheet("Data").getRow(2).createCell(1).setCellValue("456");
		
		w.getSheet("Data").createRow(0).createCell(0).setCellValue("Kar");
		
		w.getSheet("Data").getRow(3).createCell(1).setCellValue("585");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
		
	}
	
   public static void main(String [] args) throws Throwable {
	   write_Data();
   }
	
	
	
	}
