package com.testng.poc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.*;



public class CustomDataProvider {
	
	@DataProvider(name = "LoginData")
	@Test
	public static  Object[][] getData() {
		Object[][] login = { { "abc@hgmail.com", "abc" }, { "mno@gmail.com", "mno" } };
		return login;

	}

}
