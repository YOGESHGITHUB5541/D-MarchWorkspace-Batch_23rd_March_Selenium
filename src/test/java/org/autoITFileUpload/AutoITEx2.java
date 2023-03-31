package org.autoITFileUpload;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class AutoITEx2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("**** Program Starts ****");
		
		//open the browser hit the url
		BaseUtility bu = new BaseUtility();
		String url = "https://demo.automationtesting.in/Register.html";
		WebDriver driver = bu.startUp("ch", url);
		//Find The Upload Button WebElement
		WebElement uploadBtn = driver.findElement(By.id("imagesrc"));
		Thread.sleep(1000);
		//Use Actions Class For Click on upload Button
		Actions act = new Actions(driver);
		act.click(uploadBtn).perform();
		Thread.sleep(3000);
		//Then Upload The file By using following Syntax
		Runtime.getRuntime().exec("D://MarchWorkspace//Batch_23rd_March_SeleniumNew//UploadFiles//Vaibhav.exe");
		System.out.println("**** Program Ends ****");
	}

}
//auto tool is used to upload the file
//Extension of auto it is =.au3
//We have to compile .au3 file via auto it and it generates .exe file
//then we can execute .exe by using java code


