package org.POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class LoginPage2 {
	BaseUtility bu = new BaseUtility();
     public WebDriver driver;
	//WebElement
	@FindBy(xpath="//a[@class='login']")
	private WebElement signinBtn;

	@FindBy(xpath="//input[@id='email']")
	private WebElement uName;

	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;

	@FindBy(css="button[id='SubmitLogin'] span")
	private WebElement loginBtn;

	//Constructor
	public LoginPage2(WebDriver driver) {
		//PageFactory.initElements(driver, LoginPage.class);
		//OR
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	//Page Action Methods
	}
	public void loginCredential(){
		signinBtn.click();
		uName.sendKeys("gtl_test@thegatewaycorp.com");;
		password.sendKeys("Gtl@123");
		loginBtn.click();
	}


}



