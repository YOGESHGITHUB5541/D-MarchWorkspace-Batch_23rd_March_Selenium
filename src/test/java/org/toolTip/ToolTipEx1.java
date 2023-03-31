  package org.toolTip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipEx1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		WebElement btn = driver.findElement(By.id("toolTipButton"));
		Actions act = new Actions(driver);
		
		act.moveToElement(btn).perform();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String tooltip1 = driver.findElement(By.cssSelector("div[class='tooltip-inner']")).getText();
		System.out.println("Button tooltip : "+tooltip1);

		
		WebElement textField = driver.findElement(By.id("toolTipTextField"));
		act.moveToElement(textField).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String toolTip2 = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println("tooltip2 : "+toolTip2);
		
	}

}
