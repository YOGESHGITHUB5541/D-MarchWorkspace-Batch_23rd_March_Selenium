package org.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class JsProgram {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		BaseUtility bu = new BaseUtility();
		String url = "http://www.google.com";
		WebDriver driver = bu.startUp("ch", url);

//		WebElement	searchBar	=	
//				driver.findElement(By.xpath("//input[@name='q']"));
//		//Enter	seleni	in	search	bar
//		searchBar.sendKeys("seleni");
//		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Seleni");
		Thread.sleep(1200);

		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		Thread.sleep(1200);

		//Store all suggetion elements in list of webElement object
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0; i<autosuggestion.size();i++)
		{
			System.out.println(autosuggestion.get(i).getText());;
		}
//		driver.close();
	}



}


