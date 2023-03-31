package org.droupdownHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectEx1 {
	public static void main(String[] args)  {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement carsDDL = driver.findElement(By.id("cars"));
		bu.scrollByJS(driver, carsDDL);
		Select sel = new Select(carsDDL);
//		sel.selectByVisibleText("Volvo");
//		sel.selectByValue("audi");
//		sel.selectByIndex(2);
		for(int i=0; i<sel.getOptions().size(); i++) {
			sel.selectByIndex(i);
		}
		List<WebElement> ar = sel.getAllSelectedOptions();
		ArrayList<String> actSelected = bu.getAllTextFromList(ar);
		System.out.println(actSelected);
		System.out.println("**** Program Ends ****");
	}
	
	}










