package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Program Starts ***");
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//getNumberOfSheet: Return Type is integer
		int totalSheets = wb.getNumberOfSheets();
		System.out.println("Num Of Sheets = "+totalSheets);
		
		//getSheetName : Return Type is String
		String sheetName = wb.getSheetName(2);
		System.out.println("sheetName ="+sheetName);
		
		//For All Sheet Name
		for(int i=0; i<totalSheets; i++) {
			System.out.println("wb.getSheetName("+i+") ="+wb.getSheetName(i));
		}
		
		//getSheetIndex : Return Type is integer
		int indexOfSheet = wb.getSheetIndex("WriteInFile");
		System.out.println("indexOfSheet = "+indexOfSheet);
		
		//getSheet : Return Type is Sheet Object
//		Sheet s1 = wb.getSheet("AllStringType");
//		System.out.println(s1);
		
		System.out.println("*** Program Ends ***");

	}

}
