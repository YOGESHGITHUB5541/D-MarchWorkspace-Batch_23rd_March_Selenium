package org.toolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;



public class ToolTipEx3 {

	public static void main(String[] args)  {
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/tool-tips";
		WebDriver driver = bu.startUp("ch", url);
		WebElement btn = driver.findElement(By.id("toolTipTextField"));
		Actions act = new Actions(driver);
		act.moveToElement(btn).perform();
		
		String toolTip2 = driver.findElement(By.cssSelector(".tooltip-inner")).getText();
		System.out.println("tooltip2 : "+toolTip2);
		System.out.println("** Program Ends **");
	}

}
