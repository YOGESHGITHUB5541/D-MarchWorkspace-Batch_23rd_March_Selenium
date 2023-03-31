package org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SDETEx1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	driver.manage().window().maximize();
	
	//1st Frame
	driver.switchTo().frame("packageListFrame"); //Name of the Frame
	WebElement ele = driver.findElement(By.xpath("//a[text()='org.openqa.selenium'] [@target=\"packageFrame\"]"));
    System.out.println(ele.getText());
	driver.switchTo().defaultContent(); //go back to the main page
	
	Thread.sleep(5000);
	
	//2nd iFrame Element
	driver.switchTo().frame("packageFrame"); //Name of the Frame
	driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
	driver.switchTo().defaultContent(); //go back to the main page
	
	Thread.sleep(5000);
	
	//3rd iFrame Element
	driver.switchTo().frame("classFrame"); //Name of the Frame
	driver.findElement(By.xpath("(//a[text()='Help'])[1]")).click();
	
	
	}

}
