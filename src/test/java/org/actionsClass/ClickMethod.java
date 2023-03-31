package org.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickMethod {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/sql/");
	
	WebElement ele = driver.findElement(By.xpath("//a[text()='SQL Select Distinct']"));
     Actions act = new Actions(driver);
     act.click(ele).perform();
	}

}
