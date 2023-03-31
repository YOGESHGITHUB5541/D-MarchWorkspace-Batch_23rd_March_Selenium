package org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SdetInnerIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement outerIframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerIframe);  //Here We are passing frame as a WebElement

		
		WebElement innerFrame = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		
		
		
	}

}
