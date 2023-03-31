package org.robotClass;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class GenericUploadEx2 {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
		bu.scrollByJS(driver, uploadBtn);
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.click(uploadBtn).perform();
		Thread.sleep(3000);
		String path = System.getProperty("user.dir");
		String fileName = path+"\\UploadFiles\\FileUpload.txt";
		StringSelection ss = new StringSelection(fileName);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("**** Program Ends ****");
	}

}
//auto tool is used to upload the file
//Extension of auto it is =.au3
//We have to compile .au3 file via auto it and it generates .exe file
//then we can execute .exe by using java code