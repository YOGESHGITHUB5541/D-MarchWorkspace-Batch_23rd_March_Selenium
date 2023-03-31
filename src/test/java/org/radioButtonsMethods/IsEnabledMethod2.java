package org.radioButtonsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class IsEnabledMethod2 {
//isSelected() Method Returns True OR False
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/radio-button";
		WebDriver driver = bu.startUp("ch", url);
		
        WebElement yesRadio = driver.findElement(By.id("yesRadio"));
        WebElement impRadio = driver.findElement(By.id("impressiveRadio"));
        WebElement noRadio = driver.findElement(By.id("noRadio"));
        
        if(noRadio.isEnabled()) {
        	System.out.println("noRadio is Enabled : "+noRadio.isEnabled());
        	JavascriptExecutor js = (JavascriptExecutor)driver;
        	js.executeScript("arguments[0].click();", noRadio);
        }else {
        	System.out.println("noRadio is Not Enabled() : "+noRadio.isEnabled());
        }

	}

}
