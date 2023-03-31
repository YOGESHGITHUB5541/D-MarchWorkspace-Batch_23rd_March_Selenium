package org.autoITFileUpload;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class GenericUploadEx1 {
	public static void main(String[] args) throws IOException, InterruptedException {
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
		Runtime.getRuntime().exec("D://MarchWorkspace//Batch_23rd_March_SeleniumNew//UploadFiles//GenericUpload.exe");
		System.out.println("**** Program Ends ****");
	}

}
//auto tool is used to upload the file
//Extension of auto it is =.au3
//We have to compile .au3 file via auto it and it generates .exe file
//then we can execute .exe by using java code