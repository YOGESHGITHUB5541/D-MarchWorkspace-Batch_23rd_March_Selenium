package org.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsProgram2 {
		public static void main(String[]args) throws InterruptedException {
//			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://opensource-demo.orangehrmlive.com/");
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://opensource-demo.orangehrmlive.com/");
			BaseUtility bu = new BaseUtility();
			String url = "https://opensource-demo.orangehrmlive.com/";
			WebDriver driver = bu.startUp("ch", url);
			
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			
			driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
			List<WebElement> row = driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
			Thread.sleep(2000);
//			bu.scrollByJS(driver, row);
			for(int i=0; i<row.size();i++)
			{
				System.out.println(row.get(i).getText());
			}
//			 driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectAll']")).click();
//			 Thread.sleep(3000);
//			 List<WebElement> click = driver.findElements(By.xpath("//input[@type='checkbox']"));
			List<WebElement> c = driver.findElements(By.xpath("//input[@id='ohrmList_chkSelectAll']"));
			//System.out.println(Integer.toString(c.size()));
			
			for(int j=0;j<c.size();j++)
			{
				
				c.get(j).click();
				//c.get(j).getAttribute("value");
			}

	}
}

