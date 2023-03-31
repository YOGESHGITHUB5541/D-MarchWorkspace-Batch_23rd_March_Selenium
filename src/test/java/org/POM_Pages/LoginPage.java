package org.POM_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	//WebElement
	@FindBy(id="username")
	private WebElement uNameField;

	@FindBy(css=".textField.pwdfield")
	private WebElement pwdField;

	@FindBy(css="#loginButton>div")
	private WebElement loginBtn;

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoginChkbox;

	@FindBy(css="#logoContainer img")
	private List<WebElement> loginLogos;

	//Constructor
	public LoginPage(WebDriver driver) {
		//PageFactory.initElements(driver, LoginPage.class);
		//OR
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	//Page Action Methods
	}
	public boolean getLoginPageTitle() {
		return driver.getTitle().equals("actiTIME - Login");
	}
	public boolean getLoginPageUrl() {
		return driver.getCurrentUrl().equals("http://localhost:90/login.do");
	}
	public boolean isUserNameFieldDisplayed() {
		return uNameField.isDisplayed();
	}
	public boolean isPasswordFieldDisplayed() {
		return pwdField.isDisplayed();
	}
	public boolean isLoginBtnFieldDisplayed() {
		return loginBtn.isDisplayed();
	}
	public boolean iskeepMeLoginChkboxDisplayed() {
		return keepMeLoginChkbox.isDisplayed();
	}
	public boolean isloginLogosDisplayed() {
		boolean flag = true;
		for(int i=0; i<loginLogos.size(); i++) {
			flag =loginLogos.get(i).isDisplayed();
			if(flag) {
				continue;
			}else {
				break;
			}
		}
		return flag;
	}
	public void enterUserName(String uName) {
		uNameField.sendKeys(uName);
	}
	public void enterPassword(String pwd) {
		pwdField.sendKeys(pwd);
	}
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	public void doLogin(String uName, String pwd) {
		uNameField.sendKeys(uName);
		pwdField.sendKeys(pwd);
		loginBtn.click();
	}


}



