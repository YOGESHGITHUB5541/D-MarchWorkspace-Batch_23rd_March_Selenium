package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex1 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://populationmatters.org/");
	
	List<WebElement> popList = driver.findElements(By.xpath("//div[@class='bg-blue text-center py-12']/div"));
   
    for(WebElement e:popList) {
    	System.out.println(e.getText());
    }
  //  popList = driver.findElements(By.xpath("//div[@class='bg-blue text-center py-12']/div"));
    System.out.println("Program Ends");
	}

}
