package org.windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
		//driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("admin");
	   
		
	}

}
