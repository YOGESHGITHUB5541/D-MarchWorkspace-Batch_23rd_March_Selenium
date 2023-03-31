package org.actionsClass;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElementEx {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
//		BaseUtility bu = new BaseUtility();
//		String url = "http://localhost:90/login.do";
//		WebDriver driver = bu.startUp("ch", url);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:90/login.do");
		
		driver.switchTo().activeElement().sendKeys("admin");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
	//	driver.findElement(By.id("logoutLink")).click();
		System.out.println("**** Program Ends ****");
	}

}

