package com.testng.poc;

import org.testng.annotations.Test;

public class TestCase2 {
	@Test(priority = 1)
	public void setUp() {

		System.out.println("Opening Browser");

	}

	@Test(priority = 2)
	public void searchCustomer() {
		System.out.println("Search Customer");
	}

	@Test(priority = 3)
	public void addCustomer() {

		System.out.println("Add customer ");

	}
	@Test(priority = 4)
	public void tearDown() {

		System.out.println("Close Browser");

	}

}
