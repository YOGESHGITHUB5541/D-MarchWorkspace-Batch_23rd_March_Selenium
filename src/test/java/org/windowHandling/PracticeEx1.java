package org.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeEx1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String windID = driver.getWindowHandle();
		System.out.println("Window ID : "+windID);
		
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> windowIDS = driver.getWindowHandles();
		System.out.println("Window IDS : "+windowIDS);
		
		Iterator<String> itr = windowIDS.iterator();
		String parentWindID = itr.next();
		String childWindID = itr.next();
		System.out.println("Parent WindID : "+parentWindID);
		System.out.println("Child WindID"+childWindID);
		
		driver.switchTo().window(parentWindID);
		System.out.println("Parent window Title : "+driver.getTitle());
		driver.switchTo().window(childWindID);
		System.out.println("Child Window Title : "+driver.getTitle());
		
		//driver.close();

	}

}
