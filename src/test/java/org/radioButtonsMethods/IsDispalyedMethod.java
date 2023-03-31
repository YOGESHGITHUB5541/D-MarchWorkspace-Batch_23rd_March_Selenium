package org.radioButtonsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class IsDispalyedMethod {
	//isDisplayed() Method Returns True OR False
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/radio-button";
		WebDriver driver = bu.startUp("ch", url);
		
        WebElement yesRadio = driver.findElement(By.id("yesRadio"));
        WebElement impRadio = driver.findElement(By.id("impressiveRadio"));
        WebElement noRadio = driver.findElement(By.id("noRadio"));
        
        if(noRadio.isDisplayed()) {
        	System.out.println("noRadio.isDisplayed() : "+noRadio.isDisplayed());
        	impRadio.click();
        }else {
        	System.out.println("noRadio.isDisplayed() : "+noRadio.isDisplayed());
        }
	}

}
