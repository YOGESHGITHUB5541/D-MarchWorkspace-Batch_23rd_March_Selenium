package org.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class ContextClickEx {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/links";
		WebDriver driver = bu.startUp("edge", url);
		
		WebElement src = driver.findElement(By.id("dynamicLink"));
	
		bu.scrollByJS(driver, src);
		Actions act = new Actions(driver);
		act.contextClick(src).perform(); //use for right click
	}

}
