package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex2 {

	public static void main(String[] args) {
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.flipkart.com/");
		
		BaseUtility bu = new BaseUtility();
		String url = "https://demo.automationtesting.in/Register.html";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement ele = driver.findElement(By.id("submitbtn"));
		bu.scrollByJS(driver, ele);
		
	
	}

}
