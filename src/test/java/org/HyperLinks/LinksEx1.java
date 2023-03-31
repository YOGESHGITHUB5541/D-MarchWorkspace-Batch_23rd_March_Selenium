package org.HyperLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEx1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step1 : all links save in list of web element and get the size of links
		List<WebElement> allLink= driver.findElements(By.tagName("a"));
		System.out.println("Size of All Links : "+allLink.size());
		
		//step2: use for loop for get all links attribute which is present in href attribute name
		for(int i=0; i<allLink.size(); i++) {
			WebElement element = allLink.get(i);
			String url = element.getAttribute("href");
		
		//step3: use URL obj and pass the url	
			URL link = new URL(url);
		
		//step4: to create HttpURLConnection obj 
			HttpURLConnection httpCon = (HttpURLConnection) link.openConnection();
			Thread.sleep(3000);
			httpCon.connect();
			
		//step5: to store the httpcon and get response code
			int rescode = httpCon.getResponseCode();
			
		//step6: use if else for verifry the broken links and valid links
			if(rescode>=400) {
				System.out.println(url +" - "+"is broken Link");
			}else{
				System.out.println(url +" - "+"is Valid Link");
			}
			
		}
		

	}

}
