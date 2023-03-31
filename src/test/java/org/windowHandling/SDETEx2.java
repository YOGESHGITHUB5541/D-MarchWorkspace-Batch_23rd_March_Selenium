package org.windowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class SDETEx2 {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://opensoursce-demo.orangehrmlive.com/";
		WebDriver driver = bu.startUp("ch", url);
		//getWindowHandle Method
		String windowID = driver.getWindowHandle();
		System.out.println("Window ID : "+windowID);
		
		//Opens another browser window -child window
		driver.findElement(By.xpath("(//a[text()='OrangeHRM, Inc'])")).click();
          
		//getWindowHandles Method
		Set<String> windowIDs = driver.getWindowHandles(); //return Id's of the multiple browser window
		
		//First method - iterator()
		Iterator<String> itr = windowIDs.iterator();
		
		String parentWindowID = itr.next();
		String childWindowID = itr.next();
		System.out.println("parentWindowID : "+parentWindowID);
		System.out.println("childWindowID : "+childWindowID);
		
		//How to use window Id's for switching 
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window Title :"+driver.getTitle());
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child Window Title :"+driver.getTitle());
		
		//close and quite method
		driver.close();
		driver.quit();
	}
}
