package org.toolsQAListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(ApplicationListenersEx.class)
public class ListenersTestNG1 {
	WebDriver driver = null;
	@BeforeSuite
	public void startUp() {
		Reporter.log("...Before SUITE...");
		System.out.println("...Before SUITE...");
		System.setProperty("webdriver.chrome.driver","D://Acceleration//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void CloseBrowser() {
		System.out.println("Closing Browser");
		Reporter.log("Driver Closed After Testing");
		driver.close();
	}
	@Test
	public void openApplication() {
		System.out.println("Trying to hit URL!!");
		Reporter.log("Trying to hit URL!!");
		driver.get("https://www.google.com");
		String expectedTitle = "Free QA Automation Tools For Everyone";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, originalTitle,"Titles of the App is matched" );
	}
	@AfterSuite
	public void tearDown() {
		System.out.println("...After SUITE...");
		Reporter.log("...After SUITE...");
		driver.quit();
	}
	
	
//	***************************************************
	@Test(dependsOnMethods="loginTestCase")
	public void dashboardTestCase() {   //skip test
		Reporter.log("Skipp Test");
		System.out.println("Skipp Test");
	}
	@Test
	public void loginTestCase() {
		Reporter.log("Login");
		System.out.println("Login");
		Assert.assertEquals("Pune", "Pune");
	}
}
