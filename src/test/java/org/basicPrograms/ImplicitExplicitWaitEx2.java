package org.basicPrograms;



import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class ImplicitExplicitWaitEx2 {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);
		
	    driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		System.out.println("**** Program Ends ****");
		//Thread.sleep(5000);
		
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		
		bu.waitForVisibilityOfWebElement(driver, 10, "id", "logoutLink");
		
		//fluent wait
		FluentWait<WebDriver> wt = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class);
		
		WebElement logout =  wt.until(new Function<WebDriver,WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("logoutLink"));
			}
		});
		
		logout.click();
		System.out.println("**** Program Ends ****");
	}
}
