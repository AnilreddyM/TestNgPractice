package com.testng.poc;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {
	WebDriver driver;
	
	//Assertion is used to verify the title of the page and condition checking it is by default class in TestNG

	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");

	}

	@Test
	void LogoTest() {
		WebElement logo = driver.findElement(By.xpath("//*[@src='themes/orangehrm-modern/static/images/logo.png']"));
		System.out.println(logo);
		Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the website");
		// Assert.assertFalse(logo.isDisplayed(), "Logo is displayed on the website");
	}

	@Test

	void HomepageTitle() {
		String title = driver.getTitle();
		// System.out.println(title);
		Assert.assertEquals("HR Management System | HR Management Software | OrangeHRM",
				"HR Management System | HR Management Software | OrangeHRM", "Title test failed");
	}

	@AfterClass
	void tearDown() {

		driver.close();

	}

}
