package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelEx1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Program Starts ***");

		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllStringType");
		//		int lastRowNum = s1.getLastRowNum();
		//		System.out.println("lastRowNum : "+lastRowNum);
		//		
		//		Row r1 = s1.getRow(1);
		//		int lastCellNum = r1.getLastCellNum();
		//		System.out.println("lastCellNum : "+lastCellNum);
		//		
		//		Cell c1 = r1.getCell(0);
		//		System.out.println("R2, C1 : "+r1.getCell(0).getStringCellValue());

		for(int k=1; k<=s1.getLastRowNum(); k++) {
			Row r1 = s1.getRow(k);
			for(int i=0; i<r1.getLastCellNum(); i++) {
				System.out.println("R2,C1 : "+r1.getCell(i).getStringCellValue());
			}
			System.out.println();
		}

		System.out.println("*** Program Ends ***");
	}
}
