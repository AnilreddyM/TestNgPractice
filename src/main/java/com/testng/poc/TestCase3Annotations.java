package com.testng.poc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestCase3Annotations {

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

		System.out.println(" Method1");
	}

	@Test
	public void method2() {

		System.out.println(" Method2");
	}

}
