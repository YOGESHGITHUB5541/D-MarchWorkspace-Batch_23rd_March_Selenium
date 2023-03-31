package org.basicPrograms;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class FindElementsEx1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);
		
	    List<WebElement> credFields = driver.findElements(By.cssSelector("td[valign='middle']>input[placeholder]"));
//		WebElement userNameField = credFields.get(0);
//		WebElement passwordField = credFields.get(1);
//		userNameField.sendKeys("admin");
//		passwordField.sendKeys("manager");
	    
	    credFields.get(0).sendKeys("admin1");
	    credFields.get(1).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Thread.sleep(2000);
		List<WebElement> errList = driver.findElements(By.xpath("(//span[@class='errormsg'])[1]"));
		System.out.println("List empty ? : "+errList.isEmpty());
		if(errList.isEmpty()) {
			System.out.println("Error message not displayed.");
		}else {
			System.out.println("Error message is displayed.");
		}
		System.out.println("**** Program Ends ****");

	}
}
//try {
//	driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
//	System.out.println("Error message displayed.");
//}catch(Exception e) {
//	System.out.println("Error message not displayed.");
//}
