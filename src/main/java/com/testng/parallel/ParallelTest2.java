package com.testng.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest2 {
	
	WebDriver driver;
	@Test
	public void LoginTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		System.out.println("Title 2"+title);
		//Assert.assertEquals(title, "HR Management System | HR Management Software | OrangeHRM");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("Closed Second");
		driver.quit();
	}
	
	
}
