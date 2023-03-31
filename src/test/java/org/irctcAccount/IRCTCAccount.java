						package org.irctcAccount;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTCAccount {
	public static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='prsnl-info-field'])[1]")).sendKeys("9545041395");
		Thread.sleep(2000);
		driver.findElement(By.id("email_id")).sendKeys("vaibhavchore95@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("irtct-acc-detail")).click();

		driver.findElement(By.id("username-id")).sendKeys("vrchore");
		driver.findElement(By.id("usr_pwd")).sendKeys("Vrchore@95");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='prsnl-info-field'])[2]")).sendKeys("Vicky");
		driver.findElement(By.id("f_name_field")).sendKeys("Vaibhav Raosaheb chore");
		
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle'])[1]")).click();
        
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys("Student");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		driver.findElement(By.id("dob_field")).click();
		new WebDriverWait(driver, Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class=' table-condensed']")));

		String monthYrearVal = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
		//        System.out.println("monthYrearVal = "+monthYrearVal);

		//        String month = monthYrearVal.split(" ")[0].trim();
		//        String Year = monthYrearVal.split(" ")[1].trim();

		while(!(monthYrearVal.equals("April 1994"))) {
			driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
			monthYrearVal = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
//			       	System.out.println("monthYrearVal = "+monthYrearVal);

		}
		driver.findElement(By.xpath("//td[text()='21']")).click();
		driver.findElement(By.xpath("//p[text()='Male']")).click();
		driver.findElement(By.xpath("//p[text()='Unmarried']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle'])[2]")).click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("India");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle'])[3]")).click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("sec_ans_field")).sendKeys("Devidas");
		//driver.close();
	}
}
