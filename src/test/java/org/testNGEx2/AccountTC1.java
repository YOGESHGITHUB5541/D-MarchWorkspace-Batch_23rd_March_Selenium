package org.testNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountTC1 {
	@BeforeClass
	public void initAccountTestData() {
		System.out.println("Read Account Test Data");
	}
	@AfterClass
	public void clearAccountTestData() {
		System.out.println("Clear Account Test Data");
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
