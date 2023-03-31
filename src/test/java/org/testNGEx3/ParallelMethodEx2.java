package org.testNGEx3;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParallelMethodEx2 {
	@Test
	public void flipkartCH() {
		System.out.println("*** Ex2 Chrome Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "http://www.flipkart.com";
		WebDriver driver = bu.startUp("ch", url);
	    driver.close();
	    System.out.println("*** Ex2 Chrome Ends ***");
	}
	@Test
	public void amazonEdge() {
		System.out.println("*** Ex2 Edge Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "http://www.amazon.com";
		WebDriver driver = bu.startUp("edge", url);
	    driver.close();
	    System.out.println("*** Ex2 Edge Ends ***");
	}

}
