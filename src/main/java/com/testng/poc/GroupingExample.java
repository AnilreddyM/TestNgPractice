package com.testng.poc;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups = {"sanity"})

	public void Test1() {
		System.out.println(" This Test 1 sanity");

	}

	@Test(groups = {"sanity"})

	public void Test2() {
		System.out.println("This Test 2 sanity");

	}

	@Test(groups = {"regression"})

	public void Test3() {
		System.out.println("This Test 3 regression");
	}

	@Test(groups = {"regression"})

	public void Test4() {
		System.out.println("This Test 4 regression");
	}

	@Test(groups = {"regression","sanity"})

	public void Test5() {
		System.out.println("This Test 5 sanity &reg");
	}

}
