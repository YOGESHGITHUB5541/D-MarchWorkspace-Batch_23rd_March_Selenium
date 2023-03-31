package org.robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SDETEx1 {
	public static void main(String[]args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_TAB);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	
	}
	


