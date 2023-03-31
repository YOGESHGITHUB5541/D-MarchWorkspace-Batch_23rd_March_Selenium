package org.droupdownHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectEx2 {
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
		//Step4:
		ArrayList<String> expList = new ArrayList<String>();
		//add test data from manual test case
		
		ArrayList<String> actList = new ArrayList<String>();
		List<WebElement> colourList = sel.getOptions();
		for(int i=0; i<colourList.size(); i++) {
			System.out.println(colourList.get(i).getText());
		}
		//step5: select Data in dropdown
		sel.selectByVisibleText("Purple"); //purple
//		sel.deselectByValue("5");		   //black
//		sel.selectByIndex(7);			   //violet
		
		//Step6: verify purple color is selected or not
		selectedWebElement = sel.getFirstSelectedOption();
		defaultColour = selectedWebElement.getText();
		if(defaultColour.equals("Purple")) {
			System.out.println("Purple colour is selected by default");
		}else {
			System.out.println("Purple colour is NOT selected by default");
		}
		System.out.println("**** Program Ends ****");
	}
	public ArrayList<String> getDropdownAllOptionText(WebElement ele) {
		ArrayList<String> ar = new ArrayList<String>();
		Select sel = new Select(ele);
		List<WebElement> allEles = sel.getOptions();
		for(int i=0; i<allEles.size(); i++) {
			ar.add(allEles.get(i).getText());
		}
		return ar;
		
	}

}








