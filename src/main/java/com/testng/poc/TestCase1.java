package com.testng.poc;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * 1. SetUp -LaunchBrowser
 * 2. Login -Login Application
 * 3. Close -Close the Browser
 * 
 */
public class TestCase1 {
	@Test(priority = 1)
	public void setUp() {

		System.out.println("Opening Browser");

	}

	@Test(priority = 2)
	public void login() {

		System.out.println("Login Application");

	}

	@Test(priority = 3)
	public void tearDown() {

		Assert.assertEquals(2, 2);
		System.out.println("Close Browser");

	}

}
