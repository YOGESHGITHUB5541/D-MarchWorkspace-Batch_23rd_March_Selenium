package org.testNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerTC2 {
	@BeforeClass
	public void initCustomerTestData() {
		System.out.println("Read Customer Test Data");
	}
	@AfterClass
	public void clearCustomerTestData() {
		System.out.println("Clear Customer Test Data");
	}
	@BeforeTest
	public void getDevEnvironmenetDetails() {
		System.out.println("Read Dev Environmrnt Details");
	}
	@AfterTest
	public void clearDevEnvironmenetDetails() {
		System.out.println("Clear Dev Details");
	}
	@Test
	public void creatCustomer() {
		System.out.println("Creat Customer");
	}
	@Test
	public void updateCustomer() {
		System.out.println("Update Customer");
	}
	@Test
	public void deleteCustomer() {
		System.out.println("Delete Customer");
	}
	
}
