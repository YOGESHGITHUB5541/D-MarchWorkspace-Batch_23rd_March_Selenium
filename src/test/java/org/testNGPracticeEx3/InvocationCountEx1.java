package org.testNGPracticeEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class InvocationCountEx1 {
	WebDriver driver;

	@Test(invocationCount = 3, threadPoolSize = 2)
	public void creatCustomer() {
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		driver = bu.startUp("ch", url);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
	}

}
