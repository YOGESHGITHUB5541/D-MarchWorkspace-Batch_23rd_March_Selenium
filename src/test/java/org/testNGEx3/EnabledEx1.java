package org.testNGEx3;

import org.testng.annotations.Test;

public class EnabledEx1 {
	@Test(priority=1)
	public void login() {
		System.out.println("login");
	}
	@Test(priority=8)
	public void logout() {
		System.out.println("logout");
	}
	@Test(priority=2)
	public void creatCustomer() {
		System.out.println("samll creat Customer");
	}
	@Test(priority=3)
	public void CreatCustomer() {
		System.out.println("Capital Creat Customer");
	}
	@Test(priority=5)
	public void updateCustomer() {
		System.out.println("Small update Customer");
	}
	@Test(priority=4)
	public void UpdateCustomer() {
		System.out.println("Capital Update Customer");
	}
	@Test(priority=6, enabled=false)
	public void deleteCustomer() {
		System.out.println("Small delete Customer");
	}
	@Test(priority=7, enabled=false)
	public void DeleteCustomer() {
		System.out.println("Capital Delete Customer");
	}
	
}
