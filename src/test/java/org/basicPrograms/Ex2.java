package org.basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {
	public static void main(String[] args) {
		String bName = "ch";
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome")) {
			//Chrome
			//System.setProperty("","D:\\Acceleration\\Drivers\\chromedriver.exe");
			//System.setProperty("",path+"\\Drivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			//ChromeDriver objCh = new ChromeDriver();//This line is used to Opens Browser
//			WebDriver driver = new ChromeDriver(); //opens Browser
			driver = new ChromeDriver();
			//objCh.manage().window().maximize();
//			objCh.manage().window().minimize(); //selenium 4 onwards
//			objCh.manage().window().setSize(new Dimension(350, 300));
		}else if(bName.equalsIgnoreCase("ff") || bName.equalsIgnoreCase("firefox")) {
			//firefox
			//System.setProperty("","D:\\Acceleration\\Drivers\\geckodriver.exe");
			//System.setProperty("",path+"\\Drivers\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
//			FirefoxDriver objFF = new FirefoxDriver();//This line is used to Opens Browser
//			WebDriver driver = new FirefoxDriver();//This line is used to Opens Browser
			driver = new FirefoxDriver();//This line is used to Opens Browser
//			objFF.manage().window().maximize();
//			objFF.manage().window().minimize(); //selenium 4 onwards
//			objFF.manage().window().setSize(new Dimension(350, 300));
		}else if(bName.equalsIgnoreCase("edge")) {
			//edge
			//System.setProperty("","D:\\Acceleration\\Drivers\\msedgedriver.exe");
			//System.setProperty("",path+"\\Drivers\\msedgedriver.exe");
			System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
//			EdgeDriver objEdge =EdgeDriver new ();//This line is used to Opens Browser
//			WebDriver driver = new EdgeDriver();//This line is used to Opens Browser
			driver = new EdgeDriver();//This line is used to Opens Browser
//			objEdge.manage().window().maximize();
//			objEdge.manage().window().minimize(); //selenium 4 onwards
//			objEdge.manage().window().setSize(new Dimension(350, 300));
		}else {
			System.out.println("Invalid browser name");
		}
		driver.manage().window().minimize();

	}
}
