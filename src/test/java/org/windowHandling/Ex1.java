package org.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.startUp("ch", url);
		
		String parentId1 = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		String parentId2 = driver.getWindowHandle();
		System.out.println("parentId 1 : "+parentId1);
		System.out.println("parentId 2 : "+parentId2);
		
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("number of windows : "+allWinIds.size());
		
		Iterator<String> itr = allWinIds.iterator();
		String id1 = itr.next();
		if(id1.equals(parentId1)) {
			id1 = itr.next();
		}
		driver.switchTo().window(id1);
		String txt = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("txt : "+txt);
		
		System.out.println("** Program Ends **");

	}

}
