package org.basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class ImplicitExplicitWaitEx {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);
		
	    driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		//Thread.sleep(5000);
;
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		
		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
		
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("**** Program Ends ****");
	}
}
