package org.basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class ActitimeLoginLogout {
    private WebDriver driver;
	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);
	    driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
		String actDashTitle = driver.getTitle();
		String expDashTitle = "actiTIME - Enter Time-Track";
		System.out.println("actDashTitle : "+actDashTitle);
		if(actDashTitle.equals(expDashTitle)) {
			System.out.println("Login Successful.");
		}else {
			System.out.println("Unable to login.");
		}
		System.out.println("****************************");
		String actDashURL = driver.getCurrentUrl();
		String expDashURL = "http://localhost:90/user/submit_tt.do";
		System.out.println("actDashURL : "+actDashURL);
		if(actDashURL.equals(expDashURL)) {
			System.out.println("Dashboar URL is matched!");
		}else {
			System.out.println("DashBoard URL is not matched!");
		}
	}

}
