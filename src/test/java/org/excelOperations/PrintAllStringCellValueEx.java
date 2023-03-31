package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllStringCellValueEx {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Program Starts ***");

		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllStringType");
//				int lastRowNum = s1.getLastRowNum();
//				System.out.println("lastRowNum : "+lastRowNum);
//				
//				Row r1 = s1.getRow(1);
//				int lastCellNum = r1.getLastCellNum();
//				System.out.println("lastCellNum : "+lastCellNum);
//				
//				Cell c1 = r1.getCell(2);
//				String cellValue = c1.getStringCellValue();
//				System.out.println(cellValue);

		for(int i=1; i<=s1.getLastRowNum(); i++) {
			Row r1 = s1.getRow(i);
			for(int j=0; j<r1.getLastCellNum(); j++) {
				System.out.println(r1.getCell(j).getStringCellValue());
			}
			System.out.println();
		}
//
//		System.out.println("*** Program Ends ***");
	}
}
