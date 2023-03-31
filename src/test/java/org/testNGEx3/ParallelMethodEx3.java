package org.testNGEx3;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParallelMethodEx3 {
	@Test
	public void orangeHRMCH() {
		System.out.println("*** Ex3 Chrome Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriver driver = bu.startUp("ch", url);
	    driver.close();
	    System.out.println("*** Ex3 Chrome Ends ***");
	}
	@Test
	public void redbusEdge() {
		System.out.println("*** Ex3 Edge Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://www.redbus.in/";
		WebDriver driver = bu.startUp("edge", url);
	    driver.close();
	    System.out.println("*** Ex3 Edge Ends ***");
	}

}
