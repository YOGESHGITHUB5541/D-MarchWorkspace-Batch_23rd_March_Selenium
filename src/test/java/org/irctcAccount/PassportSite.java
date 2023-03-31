package org.irctcAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PassportSite {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.passportindia.gov.in/AppOnlineProject/online/apptAvailStatus");
		
		WebElement ddl = driver.findElement(By.id("pboId"));
		ddl.click();
		
//		driver.findElement(By.xpath("//option[text()='Ahmedabad']")).click();
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
//		
//		WebElement ele =driver.findElement(By.xpath("//input[@class='txtbox']"));
//		ele.sendKeys("XYTVQSH");
//		
//		WebElement submit =driver.findElement(By.xpath("(//input[@type='submit'])[2] "));
//		submit.click();
	}

}
