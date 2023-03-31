package org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SdetInnerIframe2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		//Switch to outer iframe
		driver.switchTo().frame("iframeResult");
		
		//switch to inner iframe
		driver.switchTo().frame(0);
		
		//find text in inner i frame
		WebElement innerFrameText = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		System.out.println("inner Frame Text : "+innerFrameText.getText());
		
		//switch to parent frame
		driver.switchTo().parentFrame();
		
		WebElement outerFrameText = driver.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']"));
		System.out.println("outer Frame Text :"+outerFrameText.getText());
	
	
	}

}
