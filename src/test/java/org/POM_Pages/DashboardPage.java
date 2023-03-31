package org.POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	private WebDriver driver;
	//WebElement

	//constructor
	public DashboardPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}	
	//Page Action Methods
	public boolean getDashboardTitle() {
		return driver.getTitle().equals("actiTIME - Enter Time-Track");
	}
	public boolean getDashboardUrl() {
		return driver.getCurrentUrl().equals("http://localhost:90/user/submit_tt.do");
	}
}