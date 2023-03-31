package org.droupdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class WithoutSingleSelectEx1 {
	public static void main(String[] args)  {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);

		WebElement selValueDDL = driver.findElement(By.cssSelector("#withOptGroup .css-1wa3eu0-placeholder"));
		selValueDDL.click();
//		System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//div[text()='Group 1, option 2']")).click();
		
		driver.findElement(By.xpath("//div[text()='Select Title']")).click();
		System.out.println(driver.getPageSource());
		WebElement mr = driver.findElement(By.xpath("//div[text()='Mr.']"));
		bu.clickByJS(driver, mr);
//		driver.findElement(By.xpath("//div[text()='Mrs.']")).click();
//		driver.findElement(By.xpath("//div[text()='Ms.']")).click();
//		driver.findElement(By.xpath("//div[text()='Prof.']")).click();
			System.out.println("**** Program Ends ****");
		}
	}
               







