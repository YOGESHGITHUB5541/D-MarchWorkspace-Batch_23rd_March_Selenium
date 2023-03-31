package org.propertiesFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class LoginActitimeEx2 {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		//First Way:
		ConfigReader cr = new ConfigReader();
//		String bName = cr.getConfigData("browserName");
//		String url = cr.getConfigData("url");
//		String uName = cr.getConfigData("username");
//		String pwd = cr.getConfigData("password");
		
		BaseUtility bu = new BaseUtility();
		
//		WebDriver driver = bu.startUp(bName, url);
//	    driver.findElement(By.id("username")).sendKeys(uName);
//		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);

//		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
		//Second Way:
		WebDriver driver = bu.startUp(cr.getConfigData("browserName"), cr.getConfigData("url"));
	    driver.findElement(By.id("username")).sendKeys(cr.getConfigData("username"));
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(cr.getConfigData("password"));
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
		
		System.out.println("**** Program Ends ****");

	}

}
