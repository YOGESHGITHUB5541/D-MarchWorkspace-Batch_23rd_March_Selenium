package org.testNGEx3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx1 {
	@Test
	public void testMethod1() {
		System.out.println("Test Method 1 Starts");
		String expStr = "pune";
		Assert.assertEquals("Pune", expStr);
		
		int [] ar = {10,50,20,30};
		Assert.assertTrue(ar[1]==50);
		System.out.println("Test Method 1 Ends");
	}
	@Test
	public void testMethod2() {
		System.out.println("Test Method 2");
	}
}
