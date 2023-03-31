package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseUtility {
	
	public static WebDriver driver;
	public ArrayList<String> getAllTextFromList(List<WebElement> actList) {
		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0; i<actList.size(); i++) {
			ar.add(actList.get(i).getText());
		}
		return ar;
	}
	public ArrayList<String> getAllTextFromDDL(WebElement ele) {
		ArrayList<String> ar = new ArrayList<String>();
		Select sel = new Select(ele);
		for(int i=0; i<sel.getOptions().size(); i++) {
			ar.add(sel.getOptions().get(i).getText());
		}
		return ar;
	}
	public List<WebElement> getAllOptionsFromDDL(WebElement ele) {
		Select sel = new Select(ele);
		return sel.getOptions();	
	}
	public int getNumberOfOptionsFromDDL(WebElement ele) {
		Select sel = new Select(ele);
		return sel.getOptions().size();
	}
	public void scrollByPageDown(WebDriver driver, int numOfScrolls) {
		WebElement ele = driver.findElement(By.tagName("body"));
		for(int i=1; i<=numOfScrolls; i++) {
			ele.sendKeys(Keys.PAGE_DOWN);
		}
	}
	public void scrollByJS(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	
	public void clickByJS(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	}
	
	public void clickByActions(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).perform();	
	}
	public void clickByActiveEle(WebDriver driver,WebElement ele) {
		driver.switchTo().activeElement().click();
	}
	public boolean verifyAttribute(WebElement ele, String attributeName, String expValue, String field) {
		if(ele.getAttribute(attributeName).equals(expValue)) {
			System.out.println("'"+field+"' is selected.");
			return true;
		}else {
			System.out.println("'"+field+"' is NOT selected.");
			return false;
		}
	}
	public void waitForVisibilityOfWebElement(WebDriver driver, int time, String locType, String locator) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		switch(locType) {
		case "id" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))));
		break;
		case "xpath" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))));
		break;
		case "css" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(locator))));
		break;
		case "class" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(locator))));
		break;
		case "linktext" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(locator))));
		break;
		case "partialLinkText" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText(locator))));
		break;
		case "name" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(locator))));
		break;
		case "tagName" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName(locator))));
		break;
		}	
	}
	public void waitForInVisibilityOfWebElement(WebDriver driver, int time, String locType, String locator) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		switch(locType) {
		case "id" : wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id(locator))));
		break;
		case "xpath" : wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(locator))));
		break;
		case "css" : wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(locator))));
		break;
		case "class" : wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className(locator))));
		break;
		case "linktext" : wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.linkText(locator))));
		break;
		case "partialLinkText" : wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.partialLinkText(locator))));
		break;
		case "name" : wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.name(locator))));
		break;
		case "tagName" : wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.tagName(locator))));
		break;
		}	
	}
	public void waitForElementToBeClickable(WebDriver driver, int time, String locType, String locator) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		switch(locType) {
		case "id" : wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(locator))));
		break;
		case "xpath" : wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator))));
		break;
		case "css" : wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(locator))));
		break;
		case "class" : wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className(locator))));
		break;
		case "linktext" : wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText(locator))));
		break;
		case "partialLinkText" : wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText(locator))));
		break;
		case "name" : wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(locator))));
		break;
		case "tagName" : wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.tagName(locator))));
		break;
		}

	}
	public WebDriver startUp(String bName, String url) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			WebDriverManager.chromedriver().create();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		}else if(bName.equalsIgnoreCase("ff") || bName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();//This line is used to Opens Browser
		}else if(bName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();//This line is used to Opens Browser
		}else {
			System.out.println("Invalid browser name");
		}
		//		driver.manage().window().maximize();
		//		driver.manage().window().minimize(); //selenium 4 onwards
		//		driver.manage().window().setSize(new Dimension(350, 300));
		//upto selenium 3
		//    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//selenium 4 onward
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);	
		return driver;
	}
	public void closeAdPopup(WebDriver driver) {
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
	}
	public boolean isAlertPresent(WebDriver driver, int time) {
		try {
			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
			wt.until(ExpectedConditions.alertIsPresent());
			return true;
		}catch(Exception e) {
			return false;
		}

	}
	public ArrayList<String> getAllStringCellValuesForRow(String fileName, String sheetName,int rowNum) {
		ArrayList<String> ar = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream(fileName);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheet(sheetName);
			Row r1 = s1.getRow(rowNum);
			for(int i=0; i<r1.getLastCellNum(); i++) {
				ar.add(r1.getCell(i).getStringCellValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ar;

	}
	public String getStringCellValue(String fileName, String sheetName,int rowNum,int cellNum) {
		String value ="";
		try {
			FileInputStream fis = new FileInputStream(fileName);
			Workbook wb = WorkbookFactory.create(fis);
			//			Sheet s1 = wb.getSheet(sheetName);
			//			Row r1 = s1.getRow(rowNum);
			//			value = (r1.getCell(cellNum).getStringCellValue());
			//			OR
			//			value = (s1.getRow(rowNum).getCell(cellNum).getStringCellValue());
			//			OR
			value = (wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	public String getCurrentDateTime(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(new Date());
	}
	public String captureScreenshot(String methodName) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\MarchWorkspace\\Batch_23rd_March_SeleniumNew\\SaveScreenshot");
		FileHandler.copy(src, dest);
		return methodName;
	}
}