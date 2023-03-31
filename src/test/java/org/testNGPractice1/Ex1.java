package org.testNGPractice1;

import org.testng.annotations.Test;

public class Ex1 {
	
	@Test
	public void test1() {
		System.out.println("Test 1 is Execute");
		test2();
	}
	@Test
	public void test2() {
		System.out.println("Test 2 is Execute");
	}
	@Test
	public void test3() {
		System.out.println("Test 3 is Execute");
	}
	@Test
	public void test4() {
		System.out.println("Test 4 is Execute");
	}
	@Test
	public void test5() {
		System.out.println("Test 5 is Execute");
	}
}
