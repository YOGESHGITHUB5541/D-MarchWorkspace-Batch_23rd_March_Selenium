package org.POM_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	private WebDriver driver;
	//WebElement
	@FindBy(id="email")
	private WebElement uNameField;

	@FindBy(id="pass")
	private WebElement pwdField;

	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotPwd;

	//Constructor
	public FacebookLogin(WebDriver driver) {
		//PageFactory.initElements(driver, LoginPage.class);
		//OR
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}	
	//Page Action Methods
	
	public void enterUserName() {
		uNameField.sendKeys("chorevaibhavj45@gmail.com");
	}
	public void enterPassword() {
		pwdField.sendKeys("9730222930");
	}
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	public void forgotPwd() {
		forgotPwd.click();;
	}
	public void doLogin(String uName, String pwd) {
		uNameField.sendKeys(uName);
		pwdField.sendKeys(pwd);
		loginBtn.click();
	}


}



