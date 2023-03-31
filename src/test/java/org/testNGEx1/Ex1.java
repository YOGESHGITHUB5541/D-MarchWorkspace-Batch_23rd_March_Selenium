package org.testNGEx1;

import org.testng.annotations.Test;

public class Ex1 {
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	public void test2() {
		System.out.println("Test 2");
	}
	@Test
	public void test3() {
		System.out.println("Test 3 Starts");
		test2();
		System.out.println("Test 3");
	}
	
	

}
