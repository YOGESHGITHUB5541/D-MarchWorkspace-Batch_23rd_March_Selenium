package org.testNGEx1;

import org.testng.annotations.Test;
//Execution Sequence as per the ASSCI Value
public class ExecutionSequenceEx1 {
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
	@Test
	public void creatCustomer() {
		System.out.println("samll creat Customer");
	}
	@Test
	public void CreatCustomer() {
		System.out.println("Capital Creat Customer");
	}
	@Test                                       
	public void updateCustomer() {
		System.out.println("Small update Customer");
	}
	@Test
	public void UpdateCustomer() {
		System.out.println("Capital Update Customer");
	}
	@Test
	public void deleteCustomer() {
		System.out.println("Small delete Customer");
	}
	@Test
	public void DeleteCustomer() {
		System.out.println("Capital Delete Customer");
	}
	
}
