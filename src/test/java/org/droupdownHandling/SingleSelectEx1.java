package org.droupdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectEx1 {
	public static void main(String[] args)  {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		
		//step1: identify the dropdown WebElement
		WebElement colourDDL = driver.findElement(By.id("oldSelectMenu"));
		
		bu.scrollByJS(driver, colourDDL);
		
		//step2: create Object of Select class by passing ddl object
		Select sel = new Select(colourDDL);
		
		//step3: Verify default selected option
		WebElement selectedWebElement = sel.getFirstSelectedOption();
		String defaultColour = selectedWebElement.getText();
		if(defaultColour.equals("Red")) {
			System.out.println("Red colour is selected by default");
		}else {
			System.out.println("Red colour is NOT selected by default");
		}
			System.out.println("**** Program Ends ****");
		}
	}








