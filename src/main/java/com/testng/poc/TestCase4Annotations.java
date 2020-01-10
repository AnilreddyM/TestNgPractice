package com.testng.poc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestCase4Annotations {

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}

	@BeforeMethod
	public void BeforewMethod() {

		System.out.println("Before Method");
	}

	@AfterMethod
	public void AfterMethod() {

		System.out.println("After Method");
	}

	@Test
	public void method1() {

		System.out.println(" Method4");
	}

	@Test
	public void method2() {

		System.out.println(" Method4");
	}

	@BeforeTest

	public void BeforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest

	public void AfterTest() {
		System.out.println("AfterTest");
	}

	@BeforeSuite

	public void BeforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}

}
