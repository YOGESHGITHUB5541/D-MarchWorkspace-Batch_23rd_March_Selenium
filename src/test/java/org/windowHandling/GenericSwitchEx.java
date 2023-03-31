package org.windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GenericSwitchEx {
	public static void main(String[] args) {
		System.out.println("**** Program Starts ****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.startUp("ch", url);

		String parentId1 = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("number of windows : " +allWinIds.size());

		Iterator<String> itr = allWinIds.iterator();
		while(itr.hasNext()) {
			String id = itr.next();
			if(!id.equals(parentId1)) {
				driver.switchTo().window(id);
				List<WebElement> eleList = driver.findElements(By.id("sampleHeading"));
				if(!eleList.isEmpty()) {
					System.out.println("text : "+eleList.get(0).getText());
					break;
				}
			}
		}
//		driver.close();
//		driver.switchTo().window(parentId1);
//		driver.close();
		driver.quit();
		System.out.println("** Program Ends **");
	}
}

//try {
//	WebElement ele = driver.findElement(By.id("sampleHeading"));
//	System.out.println("text : "+ele.getText());
//	break;
//}catch(Exception e) {
//	continue;
//}