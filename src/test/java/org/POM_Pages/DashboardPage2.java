package org.POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class DashboardPage2 {
	 WebDriver driver;
	BaseUtility bu = new BaseUtility();
	//WebElement
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement tShirtBtn;
	
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement checkBoxSize;
	
	@FindBy(id="layered_id_attribute_group_13")
	private WebElement checkBoxColour;
	
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement quickView;
	
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement addToCart;
	
	
	
	//constructor
	public DashboardPage2 (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}	
	//Page Action Methods
	public void clickOnTshirtBtn() {
		tShirtBtn.click();
	}
	public void clickOnCheckBoxSizeBtn() {
		checkBoxSize.click();
	}
	public void clickOnCheckBoxClrBtn() {
		checkBoxColour.click();
	}
	public void clickOnQuickViewBtn() {
		quickView.click();
	}
	public void addTocart() {
		Actions act = new Actions(driver);
		act.click(addToCart).perform();
		
	}
	
}