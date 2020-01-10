package com.testng.poc;

import org.testng.annotations.Test;

public class PriorityExample {
	@Test(priority = 0)
	public void TestOne() {

		System.out.println("Test1");

	}

	@Test(priority = 1)
	public void TestTwo() {
		System.out.println("Test2");
	}

	@Test(priority = 2)
	public void TestThree() {

		System.out.println("Test3");

	}
//For Ignoring need to use enabled=false
	@Test(priority = 3,enabled = false)
	public void TestFour() {

		System.out.println("Test4");

	}

}
