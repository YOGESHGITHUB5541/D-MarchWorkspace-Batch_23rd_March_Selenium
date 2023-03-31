package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {
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
		
		Row r1 = s1.getRow(3);
		int lastCellNum = r1.getLastCellNum();
		System.out.println("lastCellNum : "+lastCellNum);
		
		int physicalCells = r1.getPhysicalNumberOfCells();
		System.out.println("physicalCells : "+physicalCells);
		
		Cell c1 = r1.getCell(4);
		String cellValue = c1.getStringCellValue();
		System.out.println("cellValue of R2, C1 : "+cellValue);
		
		
		System.out.println("*** Program Ends ***");

	}

}
