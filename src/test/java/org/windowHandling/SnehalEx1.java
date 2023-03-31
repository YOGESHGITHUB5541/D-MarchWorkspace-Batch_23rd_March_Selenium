package org.windowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class SnehalEx1 {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.startUp("ch", url);
		
		String parentwindow = driver.getWindowHandle();
		//System.out.println("Parent Window Id :"+parentwindow);

		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();

		Set<String> allWindowID =driver.getWindowHandles();

		List<String> winIDList = new ArrayList(allWindowID);

		for(String winID : winIDList ) {
			System.out.println(winID);
			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			driver.quit();
			driver.close();
		}   
		
		
	}

}
