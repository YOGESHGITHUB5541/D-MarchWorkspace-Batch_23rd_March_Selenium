package org.POM_TestCases;

import org.POM_Pages.DashboardPage2;
import org.POM_Pages.LoginPage2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class LoginTestCase3 {
	WebDriver driver;
	BaseUtility bu = new BaseUtility();
	
	@BeforeMethod
	public void launchApplication() {
		String url = "http://Automationpractice.com";
		driver = bu.startUp("ch", url);
	}
	@AfterMethod
	public void tearDown() {
		//		driver.close();
	}
	@Test
	public void login(){
		LoginPage2 lgnPage = new LoginPage2(driver);
		DashboardPage2 dbObj = new DashboardPage2(driver);
		
		lgnPage.loginCredential();
		dbObj.clickOnTshirtBtn();
		dbObj.clickOnCheckBoxSizeBtn();
		dbObj.clickOnCheckBoxClrBtn();
		dbObj.clickOnQuickViewBtn();
		dbObj.addTocart();
		
		
}
}
