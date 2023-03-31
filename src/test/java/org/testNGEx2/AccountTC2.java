package org.testNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountTC2 {
	@BeforeClass
	public void initAccountTestData() {
		System.out.println("Read Account Test Data");
	}
	@AfterClass
	public void clearAccountTestData() {
		System.out.println("Clear Account Test Data");
	}
	@BeforeTest
	public void getQAEnvironmenetDetails() {
		System.out.println("Read QA Environmrnt Details");
	}
	@AfterTest
	public void clearQAEnvironmenetDetails() {
		System.out.println("Clear QA Details");
	}
	@Test
	public void creatAccount() {
		System.out.println("Creat Account");
	}
	@Test
	public void updateAccount() {
		System.out.println("Update Account");
	}
	@Test
	public void deleteAccount() {
		System.out.println("Delete Account");
	}
	
}
