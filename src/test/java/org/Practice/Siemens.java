package org.Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Siemens {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.siemens.com/global/en.html");
		driver.manage().getCookies();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		WebElement element = (WebElement)
//		jse.executeScript("returndocument.querySelector(\"#user
//		element.click();
	}

}
