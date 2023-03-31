package org.testNGEx3;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx1 {
	@Test
	public void testMethod1() {
		System.out.println("Test Method 1 Starts");
		SoftAssert sa = new SoftAssert();
		String expStr = "pune";
		sa.assertEquals("Pune", expStr);
		
		int [] ar = {10,50,20,30};
		sa.assertTrue(ar[1]==50);
		System.out.println("Test Method 1 Ends");
		sa.assertAll();
	}
	@Test
	public void testMethod2() {
		System.out.println("Test Method 2");
	}
}
