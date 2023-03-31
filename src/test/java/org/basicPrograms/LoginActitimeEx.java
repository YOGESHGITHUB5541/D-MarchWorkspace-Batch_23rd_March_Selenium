package org.basicPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class LoginActitimeEx {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);
		
//		By uName = By.cssSelector("input[id='username']");
//		driver.findElement(uName);
//		driver.findElement(By.cssSelector("input[id='username']"));
//		
		
		WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys("admin");
		
		WebElement pwdField = driver.findElement(By.cssSelector(".textField.pwdfield"));
		pwdField.sendKeys("manager");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("#loginButton>div"));
		loginBtn.click();
		System.out.println("**** Program Ends ****");

	}

}
