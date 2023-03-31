package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllTypesDataEx {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Program Starts ***");

		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("TestData");
		for(int i=1; i<=s1.getLastRowNum(); i++) {
			Row r1 = s1.getRow(i);
			for(int j=0; j<r1.getLastCellNum(); j++) {
				CellType ct = r1.getCell(j).getCellType();
//				System.out.println(ct);
				switch(ct) {
				case STRING: System.out.println(r1.getCell(j).getStringCellValue());
				break;
				case NUMERIC: if(DateUtil.isCellDateFormatted(r1.getCell(j))) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					System.out.println(sdf.format(r1.getCell(j).getDateCellValue()));
				}else {
					System.out.println((long)r1.getCell(j).getNumericCellValue());
				}
				break;
				case BOOLEAN:System.out.println(r1.getCell(j).getBooleanCellValue());
				break;
				case FORMULA:System.out.println(r1.getCell(j).getCellFormula());
				break;
				case BLANK: System.out.println("Cell is Blank");
				break;
				case _NONE:System.out.println("Cell is None");
				break;
				case ERROR:System.out.println("Error in Cell");
				break;
				default: System.out.println("Invalid Cell Type");
				}
			}
			System.out.println();
		}

		System.out.println("*** Program Ends ***");
	}
}
