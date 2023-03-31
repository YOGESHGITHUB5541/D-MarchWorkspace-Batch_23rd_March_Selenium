package org.GoogleMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleMap {
 WebDriver driver;
 @Test
    public void openApplication() {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.get("https://www.maps.google.co.in/");
    }
}
