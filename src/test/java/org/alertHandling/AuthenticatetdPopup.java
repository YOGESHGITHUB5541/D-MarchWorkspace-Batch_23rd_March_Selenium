package org.alertHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatetdPopup {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/basic_auth");

	//syntax
	//http://admin:admin@the-internet.herokuapp.com/basic_auth
	//http://user:password@URL
	
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
