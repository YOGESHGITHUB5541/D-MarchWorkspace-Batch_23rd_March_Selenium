package org.browserOperations;


import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "http://www.google.com";
		WebDriver driver = bu.startUp("ch", url);
		Thread.sleep(2000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("**** Program Ends ****");
		}
	
	}
		
	
	


