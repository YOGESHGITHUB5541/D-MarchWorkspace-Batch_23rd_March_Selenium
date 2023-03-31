package org.alertHandling;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/alerts";
		WebDriver driver = bu.startUp("ch", url);
		bu.closeAdPopup(driver);
		driver.findElement(By.id("timerAlertButton")).click();

		//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		//		wt.until(ExpectedConditions.alertIsPresent());

		if(bu.isAlertPresent(driver, 10)) {
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();

		}else {
			System.out.println("Alert is not dispalyed. ");
		}
		System.out.println("**** Program Ends ****");
	}
}