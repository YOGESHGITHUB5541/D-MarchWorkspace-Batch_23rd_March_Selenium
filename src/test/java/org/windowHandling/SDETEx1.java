package org.windowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class SDETEx1 {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://opensoursce-demo.orangehrmlive.com/";
		WebDriver driver = bu.startUp("ch", url);
		
		//getWindowHandle  
//		String windowID = driver.getWindowHandle();	//return Id of the single browser window
//		System.out.println("WindowID : "+windowID);
		
		driver.findElement(By.xpath("(//a[text()='OrangeHRM, Inc'])")).click();
//		bu.clickByJS(driver, ele); //Opens another browser window -child window
		
		//getWindowHandles
		Set<String> windowIDs = driver.getWindowHandles(); //return Id's of the multiple browser window
		System.out.println(" windowIDs :"+ windowIDs);
		//First method - iterator()
//		Iterator<String> itr = windowIDs.iterator();
//		
//		String parentWindowID = itr.next();
//		String childWindowID = itr.next();
//		System.out.println("parentWindowID : "+parentWindowID);
//		System.out.println("childWindowID : "+childWindowID);
		
		//Second Method - using list/ArrayList 
		List<String> windowIdsList = new ArrayList(windowIDs); //convert Set into List
		
		
		/*String parentWindowID = windowIdsList.get(0);  //parent window id
		String childWindowID = windowIdsList.get(1); // child window id
		
		System.out.println("parentWindowID :"+parentWindowID);
		System.out.println("childWindowID :"+childWindowID);
		
		//How to use window Id's for switching 
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window Title :"+driver.getTitle());
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child Window Title :"+driver.getTitle());
		*/
		//For each loop
		for(String winid:windowIdsList) {
			//System.out.println(winid);
			String title = driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
		//driver.close();
		//driver.quit();
		for(String winid:windowIdsList) {
			String title = driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
		}
		

	}
//	(//i[@class='fa fa-facebook'])[1]
}
