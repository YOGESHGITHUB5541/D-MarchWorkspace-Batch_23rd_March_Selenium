package org.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/droppable";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement des=driver.findElement(By.id("droppable"));
	
		bu.scrollByJS(driver, des);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, des).perform();
		
	}

}
