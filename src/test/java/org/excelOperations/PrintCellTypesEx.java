package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintCellTypesEx {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Program Starts ***");
		
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("TestData");
		for(int k=1; k<=s1.getLastRowNum(); k++) {
			Row r1 = s1.getRow(k);
			for(int i=0; i<r1.getLastCellNum(); i++) {
				//System.out.println(r1.getCell(i).getStringCellValue());
				CellType ct = r1.getCell(i).getCellType();
//				System.out.println(ct);
//				System.out.println(r1.getCell(i).getCellType());
				switch(ct) {
				case STRING: System.out.println(r1.getCell(i).getStringCellValue());
							break;
				case NUMERIC: System.out.println((long)r1.getCell(i).getNumericCellValue());
							break;
				case BOOLEAN:System.out.println(r1.getCell(i).getBooleanCellValue());
							break;
				case FORMULA:System.out.println(r1.getCell(i).getCellFormula());
							break;
				default: System.out.println("Invalid Cell Type");
				}
			}
			System.out.println();
		}

		System.out.println("*** Program Ends ***");
	}
}
