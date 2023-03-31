package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step 1: Creat Obj FileInputStream  And Pass Path of File
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		
		//Step2: Creat obj of WorkbookFactory
		Workbook wb = WorkbookFactory.create(fis);
		
		//Use wb.getNumberOfSheet Method to get total no of sheet
		int totalSheet = wb.getNumberOfSheets();
		System.out.println("TotalSheet :"+totalSheet);
		
		//Use wb.getSheetIndex Method To get the sheet Index
		int sheetIndex = wb.getSheetIndex("TestData");
		System.out.println("Test Data Sheet Index :"+sheetIndex);
		
		//Use wb.getSheetName Method To get the Sheet Name By pass index
		String sheetName = wb.getSheetName(3);
		System.out.println("Sheet Name Of Index 3 is :"+sheetName);
		
		//
		Sheet s1 = wb.getSheet("AllStringType");
		int lastRowNo = s1.getLastRowNum();
		System.out.println("lastRowNo :"+lastRowNo);
		
	}

}

