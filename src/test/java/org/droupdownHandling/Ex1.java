package org.droupdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement ele =driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Green");
	}

}
