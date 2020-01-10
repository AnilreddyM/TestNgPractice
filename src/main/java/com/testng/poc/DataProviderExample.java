package com.testng.poc;

import org.testng.annotations.*;

public class DataProviderExample {

	@Test(dataProvider = "LoginData",dataProviderClass =CustomDataProvider.class)
	public  void LoginTest(String userName, String pwd) {

		System.out.println("UserName==>" + userName + "\n" + "Password==>" + pwd);

	}

	
}
