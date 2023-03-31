package org.alertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SDETEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert Window With Ok Button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//Alert Window with ok & cancle button
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		//Alert Windo with input box, capture text from alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alertWind = driver.switchTo().alert();
		System.out.println("Alert Window Text :"+alertWind.getText());
		alertWind.sendKeys("Welcome");
		driver.switchTo().alert().accept();
		

	}

}
