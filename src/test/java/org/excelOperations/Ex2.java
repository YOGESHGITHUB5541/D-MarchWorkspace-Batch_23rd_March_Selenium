package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Program Starts ***");
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllStringType");
		//getLastRowNum method returns total num of rows -1
		int lastRowNum = s1.getLastRowNum();
		System.out.println("lastRowNum : "+lastRowNum);
		
		//getPhysicalNumberOfRows() method will count only those rows which contains Data
		int physcicalRows = s1.getPhysicalNumberOfRows();
		System.out.println("physcicalRows : "+physcicalRows);
		
		
		System.out.println("*** Program Ends ***");

	}

}
