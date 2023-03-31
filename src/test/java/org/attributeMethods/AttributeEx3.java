package org.attributeMethods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class AttributeEx3 {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
//		Thread.sleep(5000);
		WebElement tab1 = driver.findElement(By.cssSelector("#topnav tr>td[class^='navItem navCell']:nth-child(2)"));
		bu.verifyAttribute(tab1, "class", "selected","Time-Track");
		
		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(10));
		wb.until(ExpectedConditions.visibilityOf( driver.findElement(By.cssSelector("#topnav tr>td[class^='navItem navCell']:nth-child(3)")))).click();
//		WebElement tab2 = driver.findElement(By.cssSelector("#topnav tr>td[class^='navItem navCell']:nth-child(3)"));
//		tab2.click();
		System.out.println("Click on Tasks tab");
//		bu.verifyAttribute(tab2, "class", "selected","Tasks");
		System.out.println("**** Program Ends ****");
		}
		
	}
	


