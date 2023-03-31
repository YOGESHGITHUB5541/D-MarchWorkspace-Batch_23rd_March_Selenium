package org.testNGPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;


public class ActitimeWithAnnotationsEx {
	WebDriver driver;
	@BeforeMethod
	public void login() throws InterruptedException {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		driver = bu.startUp("ch", url);
		
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.get("http://localhost:90/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Thread.sleep(5000);
	}
	@Test
	public void verifyDashboardURL() {
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		if(actURL.equals("http://localhost:90/user/submit_tt.do")) {
			System.out.println("URL Matched");
		}else {
			System.out.println("URL is not Matched");
		}
	}
	@AfterMethod
	public void logout() {
		driver.close();		
	}
}


