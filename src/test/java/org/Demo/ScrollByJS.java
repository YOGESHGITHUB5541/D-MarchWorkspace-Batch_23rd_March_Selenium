package org.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByJS {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=fb&oq=fb&aqs=chrome..69i57.5071j0j15&sourceid=chrome&ie=UTF-8");
		BaseUtility bu = new BaseUtility();
		//WebElement ele = driver.findElement(By.xpath("(//div[@class=\"ace_content\"])[1]"));
		Thread.sleep(3000);
		bu.scrollByPageDown(driver, 1);

	}

}
