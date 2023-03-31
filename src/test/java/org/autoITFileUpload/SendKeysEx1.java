package org.autoITFileUpload;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class SendKeysEx1 {
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
		bu.scrollByJS(driver, uploadBtn);
		uploadBtn.sendKeys("D://MarchWorkspace//Batch_23rd_March_SeleniumNew//UploadFiles//StudentReport.xlsx");
		System.out.println("**** Program Ends ****");
	}

}
