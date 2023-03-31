package org.alertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/alerts";
		WebDriver driver = bu.startUp("ch", url);
		
		
		WebElement ele = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]"));
		
		bu.scrollByJS(driver, ele);
		bu.clickByJS(driver, ele);
		//way: 1st
		Alert alt = driver.switchTo().alert();
		System.out.println("alert text : "+alt.getText());
		alt.sendKeys("23rd March Batch");
		alt.accept();
//		alt.dismiss();
		
//		Way: 2nd
//		System.out.println("alert text: "+driver.switchTo().alert().getText());
//		driver.switchTo().alert().sendKeys("March 23rd batch");
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();

	}

}
