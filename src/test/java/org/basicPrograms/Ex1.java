package org.basicPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {
	//String path = System.getProperty("user.dir");
	public static void main(String[] args) {
		//String path = System.getProperty("user.dir");
		//System.out.println("path : "+path);
		Ex1 obj = new Ex1();
		obj.openChromeBrowser();
		obj.openFirefoxBrowser();
		obj.openEdgeBrowser();
	}
	public void openChromeBrowser() {
		//System.setProperty("","D:\\Acceleration\\Drivers\\chromedriver.exe");
		//System.setProperty("",path+"\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();//This line is used to Opens Browser
	}
	public void openFirefoxBrowser() {
		//System.setProperty("","D:\\Acceleration\\Drivers\\geckodriver.exe");
		//System.setProperty("",path+"\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		FirefoxDriver obj = new FirefoxDriver();//This line is used to Opens Browser
	}
	public void openEdgeBrowser() {
		//System.setProperty("","D:\\Acceleration\\Drivers\\msedgedriver.exe");
		//System.setProperty("",path+"\\Drivers\\msedgedriver.exe");
		System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
		EdgeDriver obj = new EdgeDriver();//This line is used to Opens Browser
	}

}
