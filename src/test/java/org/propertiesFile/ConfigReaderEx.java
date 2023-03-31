package org.propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigReaderEx {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("**** Program Starts ****");
		ConfigReader obj = new ConfigReader();
		String bName = obj.getConfigData("browserName");
		String url = obj.getConfigData("url");
		String uName = obj.getConfigData("username");
		String pwd = obj.getConfigData("password");
		
//		BaseUtility bu = new BaseUtility();
//		WebDriver driver = bu.startUp(bName, url);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
	    driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("**** Program Ends ****");
	}
	public String getTestDataFromConfig(String key) throws IOException {
		FileInputStream fis = new FileInputStream(".\\propertiesFile\\Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		System.out.println("Key : "+value);
		return value;
	}

}
