package org.googleSearch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys("testing");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

		System.out.println("Total number of suggestions in list box : "+list.size());

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		for(int j=0; j<list.size(); j++) {
			String exp = "testing classes in pune";
			String act = list.get(j).getText();

			if(exp.equals(act)) {
				list.get(j).click();
				driver.navigate().back();
				break;
			}
		}
		//driver.close();
	}
}

