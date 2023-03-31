package org.toolsQAListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(ApplicationListenersEx.class)
public class ListenersTestNG2 {
	private int i = 1;
	@Test(successPercentage = 50, invocationCount=5)
	public void AccountTest() { //P,P,F,P,P
		SoftAssert sa = new SoftAssert();
		if(i <= 3) { //1,2,3,4,5
			sa.assertTrue(i<=2);     //T,T,F
		}
		System.out.println("i = "+i);
		i++;
		sa.assertAll();
	}

}
