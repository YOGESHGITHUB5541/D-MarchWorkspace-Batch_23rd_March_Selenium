package org.excelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelEx2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Program Starts ***");

		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx"); //Data Read karne ke liye
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("WriteInFile");
		s1.getRow(1).createCell(3).setCellValue("PASS");
		s1.getRow(2).createCell(3).setCellValue("FAIL");
		s1.getRow(3).createCell(3).setCellValue("PASS");
		FileOutputStream fos = new FileOutputStream("./excelFiles/TestData.xlsx");//Data write karne ke liye
		wb.write(fos);
		fos.close();
		

		System.out.println("*** Program Ends ***");
	}
}
	