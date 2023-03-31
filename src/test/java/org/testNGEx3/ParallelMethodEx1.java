package org.testNGEx3;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParallelMethodEx1 {
	@Test
	public void googleCH() {
		System.out.println("*** Ex1 Chrome Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "http://www.google.com";
		WebDriver driver = bu.startUp("ch", url);
	    driver.close();
	    System.out.println("*** Ex1 Chrome Ends ***");
	}
	@Test
	public void facebookEdge() {
		System.out.println("*** Ex1 Edge Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "http://www.facebook.com";
		WebDriver driver = bu.startUp("edge", url);
	    driver.close();
	    System.out.println("*** Ex1 Edge Ends ***");
	}
}
