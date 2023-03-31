package org.actionsClass;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseUtility;



public class CopyPasteUsingAWT {
	public static void main(String[] args) throws AWTException, InterruptedException {
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/tool-tips";
		WebDriver driver = bu.startUp("ch", url);
		
		Thread.sleep(5000);
		WebElement textFild = driver.findElement(By.id("toolTipTextField"));
		bu.scrollByJS(driver, textFild);
		bu.clickByJS(driver, textFild);
		
		String text = "Pune";
		StringSelection ss = new StringSelection(text);
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(ss, null);
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
        
	}

}
