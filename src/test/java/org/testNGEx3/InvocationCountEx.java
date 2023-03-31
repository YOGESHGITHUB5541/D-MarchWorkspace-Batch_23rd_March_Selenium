package org.testNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountEx {
	@Test(invocationCount=3, threadPoolSize=2)
	public void validateDashboardTitle() {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
//		String url = "http://localhost:90/login.do";
//		WebDriver driver = bu.startUp("ch", url);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		System.out.println("**** Program Ends ****");
	}
}


