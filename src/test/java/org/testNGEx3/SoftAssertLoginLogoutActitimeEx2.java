package org.testNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseUtility;

public class SoftAssertLoginLogoutActitimeEx2 {
	@Test
	public void testMethod(){
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);
		
	    driver.findElement(By.id("username")).sendKeys("admin");
	    Reporter.log("Entered Username.");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		Reporter.log("Entered Password.");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Reporter.log("Click on login button.");
		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track11","Dashboard title is changed");
		Reporter.log("Dashborad Title is as Expected!!");
		System.out.println("****************************");
		sa.assertEquals(driver.getCurrentUrl(), "http://localhost:90/user/submit_tt.do11","Dashboard url is changed");
		Reporter.log("Dashborad URL is as Expected!!");
		//driver.findElement(By.id("logoutLink")).click();
		sa.assertAll();
		System.out.println("**** Program Ends ****");
		
		
	}

}
