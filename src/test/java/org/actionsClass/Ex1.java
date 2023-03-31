package org.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement des = driver.findElement(By.cssSelector("ol[id='bank'] li[class='placeholder']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(src).moveToElement(des).release().build().perform();

		WebElement src1 = driver.findElement(By.xpath("(//li[@id=\"fourth\"])[2]"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.clickAndHold(src1).moveToElement(des1).release().build().perform();

	
	}

}
