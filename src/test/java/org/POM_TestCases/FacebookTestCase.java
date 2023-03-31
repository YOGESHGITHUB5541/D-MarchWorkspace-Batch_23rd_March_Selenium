package org.POM_TestCases;

import org.POM_Pages.FacebookLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class FacebookTestCase {
	WebDriver driver;
	BaseUtility bu = new BaseUtility();

	@BeforeMethod
	public void launchApplication() {
		String url = "https://www.facebook.com/";
		driver = bu.startUp("ch", url);
	}
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}
	@Test
	public void login() throws InterruptedException{
		FacebookLogin lgnPage = new FacebookLogin(driver);
		lgnPage.enterUserName();
		Thread.sleep(2000);
		lgnPage.enterPassword();
		Thread.sleep(2000);
		lgnPage.clickOnLoginBtn();
		Thread.sleep(2000);
		lgnPage.forgotPwd();
	}
}
