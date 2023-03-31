package org.testNGPractice2;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserManagerEx2 {
	@Test
	public void createCustomer() {
		System.out.println("Create Customer");
	}
	@Test
	public void updateCustomer() {
		System.out.println("Update Customer");
	}
	@Test
	public void deleteCustomer() {
		System.out.println("Delete Customer");
	}
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("UM-Get DEV Environment Credential");
//	}
//	@AfterTest
//	public void afterTest() {
//		System.out.println("Flush Test Data-UM");

}
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("Get Test Data-UM");
//	}
//	@AfterClass
//	public void afterClass() {
//		System.out.println("Flush Test Data-UM");
//
//}
//}
