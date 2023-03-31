package org.testNGEx3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParametersEx1 {
	@Parameters({"userName","password"})
	@Test
	public void validateDashboardTitle(String uName, String pwd) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("**** Program Ends ****");
	}
}


