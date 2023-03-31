package org.droupdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class WithoutMultiSelectEx1 {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);

//		WebElement selValueDDL = driver.findElement(By.xpath("//div[p[b[text()='Multiselect drop down']]]//div[@class=' css-1wa3eu0-placeholder']"));
		
//		WebElement bodyTag = driver.findElement(By.tagName("body"));
//		bodyTag.sendKeys(Keys.PAGE_DOWN);
		
		WebElement selValueDDL = driver.findElement(By.xpath("//div[p[b[text()='Multiselect drop down']]]//div[@class=' css-1wa3eu0-placeholder']"));
		bu.scrollByJS(driver, selValueDDL);
		
		selValueDDL.click();
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		driver.findElement(By.xpath("//div[text()='Black']")).click();
		driver.findElement(By.xpath("//div[text()='Red']")).click();

			System.out.println("**** Program Ends ****");
		}
	}








