package org.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.startUp("ch", url);
		
		String ParentID=driver.getWindowHandle(); //Return Id of the single browser window
		System.out.println("ParentID="+ParentID);
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allWind= driver.getWindowHandles();
		
		Iterator<String> itr =allWind.iterator();
		String Id1=itr.next();
		System.out.println("ID1="+Id1);
		
		String Id2=itr.next();
		System.out.println("ID2="+Id2);
		
		driver.switchTo().window(Id2);
		
		WebElement ele=driver.findElement(By.id("sampleHeading"));
		System.out.println("Text ="+ele.getText());
		
		driver.switchTo().window(Id1);
		
		WebElement ele1=driver.findElement(By.id("messageWindowButton"));
		bu.clickByJS(driver, ele1);
		
		
		
	}

}
