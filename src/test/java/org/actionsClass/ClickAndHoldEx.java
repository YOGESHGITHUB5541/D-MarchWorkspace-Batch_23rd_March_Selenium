package org.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class ClickAndHoldEx {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		
		String url = "https://demoqa.com/droppable";
		WebDriver driver = bu.startUp("ch", url);
		WebElement src = driver.findElement(By.id("draggable"));
		
		WebElement des = driver.findElement(By.id("droppable"));
		bu.scrollByJS(driver, src);
		Actions act = new Actions(driver);
		act.clickAndHold(src).moveToElement(des).release().build().perform();
	}//click()  moveToElement() doubleClick() ContextClick()-->Right click button

}//dragAndDropBy(WebElement src,x,y)  dragAndDrop(src,des)
