package org.POM_TestCases;

import java.io.IOException;

import org.POM_Pages.DashboardPage;
import org.POM_Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class LoginTestCase2 {
	private WebDriver driver;
	private BaseUtility bu = new BaseUtility();
	@BeforeMethod
	public void launchApplication() {
	String url = "http://localhost:90/login.do";
    driver = bu.startUp("ch", url);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	@Test
	public void validateLoginPageTC001() {
		LoginPage lpObj = new LoginPage(driver);
		Assert.assertTrue(lpObj.getLoginPageUrl(), "URL is  not Matched!");
		Assert.assertTrue(lpObj.getLoginPageTitle(), "Login Page Title is not Matched!!");
		Assert.assertTrue(lpObj.isUserNameFieldDisplayed(), "User name field not displayed!");
		Assert.assertTrue(lpObj.isPasswordFieldDisplayed(), "Password field not displayed!");
		Assert.assertTrue(lpObj.isLoginBtnFieldDisplayed(), "Login Button field not displayed!");
		Assert.assertTrue(lpObj.iskeepMeLoginChkboxDisplayed(), "Keep Me Login Checkbox not displayed!");
		Assert.assertTrue(lpObj.isloginLogosDisplayed(), "Actitime Logos not displayed!");
		
		
		
//	    WebElement uNameField = driver.findElement(By.id("username"));
//	    Assert.assertTrue(uNameField.isDisplayed(), "User name field not displayed!");
//	    
//	    WebElement pwdField = driver.findElement(By.cssSelector(".textField.pwdfield"));
//	    Assert.assertTrue(pwdField.isDisplayed(), "Password field not displayed!");
//	    
//	    WebElement loginBtn = driver.findElement(By.cssSelector("#loginButton>div"));
//	    Assert.assertTrue(loginBtn.isDisplayed(), "Login Button field not displayed!");
//	    
//	    WebElement keepMeLoginChkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
//	    Assert.assertTrue(keepMeLoginChkbox.isDisplayed(), "Keep Me Login Checkbox not displayed!");
//	    
//	    List<WebElement> loginLogos = driver.findElements(By.cssSelector("#logoContainer img"));
//	    Assert.assertTrue(loginLogos.get(0).isDisplayed(), "Actitime Logo not displayed!");
//	    Assert.assertTrue(loginLogos.get(1).isDisplayed(), "Actitime image not displayed!");
	}
	@Test
	public void validateLoginFunctionalityTC002() {
		LoginPage lpObj = new LoginPage(driver);
		lpObj.enterUserName("admin");
		lpObj.enterPassword("manager");
		lpObj.clickOnLoginBtn();
		//lpObj.doLogin("admin","manager");
		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
		
		DashboardPage dbObj = new DashboardPage(driver);
		Assert.assertTrue(dbObj.getDashboardTitle(), "Dashboard Title Changed");
		Assert.assertTrue(dbObj.getDashboardUrl(), "Dashboard URL Changed");
		
		
		
		
		
//	    driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
//		driver.findElement(By.cssSelector("#loginButton>div")).click();
//		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
//		String actDashTitle = driver.getTitle();
//		String expDashTitle = "actiTIME - Enter Time-Track";
//		System.out.println("actDashTitle : "+actDashTitle);
//		if(actDashTitle.equals(expDashTitle)) {
//			System.out.println("Login Successful.");
//		}else {
//			System.out.println("Unable to login.");
//		}
//		System.out.println("****************************");
//		String actDashURL = driver.getCurrentUrl();
//		String expDashURL = "http://localhost:90/user/submit_tt.do";
//		System.out.println("actDashURL : "+actDashURL);
//		if(actDashURL.equals(expDashURL)) {
//			System.out.println("Dashboar URL is matched!");
//		}else {
//			System.out.println("DashBoard URL is not matched!");
//		}
		
	}
}
