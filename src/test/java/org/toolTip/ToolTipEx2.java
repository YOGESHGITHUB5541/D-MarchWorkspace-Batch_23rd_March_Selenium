package org.toolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;



public class ToolTipEx2 {

	public static void main(String[] args)  {
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/tool-tips";
		WebDriver driver = bu.startUp("ch", url);
		WebElement btn = driver.findElement(By.id("toolTipButton"));
		Actions act = new Actions(driver);
		act.moveToElement(btn).perform();
		
		String toolTip = driver.findElement(By.cssSelector(".tooltip-inner")).getText();
		System.out.println("tooltip : "+toolTip);
		System.out.println("** Program Ends **");
	}

}
