package org.testNGPractice2;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountManagerEx1 {
	@Test
	public void createAccountr() {
		System.out.println("Create Account");
	}
	@Test
	public void updateAccount() {
		System.out.println("Update Account");
	}
	@Test
	public void deleteAccount() {
		System.out.println("Delete Account");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("AM-Get QA Environment Credential");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Flush Test Data-AM");

}
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("Get Test Data-AM");
//	}
//	@AfterClass
//	public void afterClass() {
//		System.out.println("Flush Test Data-AM");
//
//}
}
