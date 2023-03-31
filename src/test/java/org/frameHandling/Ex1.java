package org.frameHandling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/frames";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement f1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(f1);
		
		String txt = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("txt : "+txt);
		
		driver.switchTo().defaultContent(); //root html
		
		driver.switchTo().frame("frame2");
		String txt2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("txt2 : "+txt2);
		System.out.println("*** Program Ends ***");
	}

}
