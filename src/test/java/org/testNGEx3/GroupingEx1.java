package org.testNGEx3;

import org.testng.annotations.Test;

public class GroupingEx1 {
	@Test(groups= {"smoke","regression","UAT"})
	public void umTest1() {
		System.out.println("User Test 1");
	}
	@Test(groups= {"smoke"})
	public void umTest2() {
		System.out.println("User Test 2");
	}
	@Test(groups= {"regression"})
	public void umTest3() {
		System.out.println("User Test 3");
	}
	@Test(groups= {"UAT"})
	public void umTest4() {
		System.out.println("User Test 4");
	}
	@Test(groups= {"smoke","regression"})
	public void umTest5() {
		System.out.println("User Test 5");
	}
	@Test(groups= {"regression","UAT"})
	public void umTest6() {
		System.out.println("User Test 6");
	}
	@Test(groups= {"smoke","UAT"})
	public void umTest7() {
		System.out.println("User Test 7");
	}
	@Test
	public void umTest8() {
		System.out.println("User Test 8");
	}
}
