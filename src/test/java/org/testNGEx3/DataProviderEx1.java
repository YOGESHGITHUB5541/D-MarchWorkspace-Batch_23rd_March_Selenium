package org.testNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class DataProviderEx1 {
	@Test(dataProvider="loginCredentials")
	public void loginTC(String uName, String pwd) {
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);

		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
	    driver.findElement(By.id("logoutLink")).click();
	    driver.close();
	}
	@DataProvider
	public Object[][] loginCredentials() {
		Object [][] ar = new Object[4][2];
		ar[0][0] = "admin";
		ar[0][1] = "manager"; 
		
		ar[1][0] = "admin";
		ar[1][1] = "manager1";
		
		ar[2][0] = "admin2";
		ar[2][1] = "manager";
		
		ar[3][0] = "admin3";
		ar[3][1] = "manager3";
		
		return ar;
	}
	
}
