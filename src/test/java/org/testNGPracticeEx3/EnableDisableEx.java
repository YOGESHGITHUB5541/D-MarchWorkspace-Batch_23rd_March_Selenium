package org.testNGPracticeEx3;

import org.testng.annotations.Test;

public class EnableDisableEx {
	@Test
	public void createAccountr() {
		System.out.println("Create Account");
	}
	@Test(enabled=true)
	public void updateAccount() {
		System.out.println("Update Account");
	}
	@Test(enabled=false)
	public void deleteAccount() {
		System.out.println("Delete Account");
	}
}
