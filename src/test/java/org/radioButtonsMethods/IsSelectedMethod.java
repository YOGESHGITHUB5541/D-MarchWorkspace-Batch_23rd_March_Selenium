package org.radioButtonsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedMethod {
//isSelected() Method Returns True OR False
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
//		BaseUtility bu = new BaseUtility();
//		String url = "https://demoqa.com/radio-button";
//		WebDriver driver = bu.startUp("ch", url);
		
        WebElement yesRadio = driver.findElement(By.id("yesRadio"));
        WebElement impRadio = driver.findElement(By.id("impressiveRadio"));
        WebElement noRadio = driver.findElement(By.id("noRadio"));
        
        if(impRadio.isSelected()) {
        	System.out.println("impRadio.isSelected() : "+impRadio.isSelected());
        	impRadio.click();
        }else {
        	System.out.println("impRadio.isSelected() : "+impRadio.isSelected());
        }

	}

}
