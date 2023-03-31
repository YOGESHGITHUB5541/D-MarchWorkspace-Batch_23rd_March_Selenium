package org.irctcAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResdBusForm {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Pune");
		driver.findElement(By.id("dest")).sendKeys("Akola");
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		
		WebElement monthYear = driver.findElement(By.xpath("//td[text()='Aug 2022']"));
		
//		while(!(monthYear.equals("Aug 2022"))) {
//			driver.findElement(By.xpath("//td[@class='next']")).click();
//			monthYear = driver.findElement(By.xpath("//td[text()='Aug 2022']"));
//		}
		driver.findElement(By.xpath("//td[text()='7']")).click();	

	}

}
