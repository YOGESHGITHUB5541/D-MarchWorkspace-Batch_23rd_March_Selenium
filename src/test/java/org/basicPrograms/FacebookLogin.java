package org.basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class FacebookLogin {
	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		String url = "https://www.facebook.com/";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement userNameField = driver.findElement(By.cssSelector("#email"));
		userNameField.sendKeys("chorevaibhavj45@gmail.com");
		
		WebElement pwdField = driver.findElement(By.cssSelector("#pass"));
		pwdField.sendKeys("9730222938");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginBtn.click();
		
		WebElement logout = driver.findElement(By.xpath("(//span[@dir=\"auto\"])[24]"));
		logout.click();

	}

}
