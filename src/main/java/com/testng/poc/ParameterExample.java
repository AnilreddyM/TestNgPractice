package com.testng.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterExample {

	WebDriver driver;

	// Assertion is used to verify the title of the page and condition checking it
	// is by default class in TestNG

	@Test(priority = 0)
	@Parameters({ "url" })
	public void launchBrowser(String url) {

		if (url.equalsIgnoreCase("orangehrm")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/");
		} else if (url.equalsIgnoreCase("google")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		} else {
			System.out.println("Not matched with any url");
		}

	}

	@Test(priority = 1)
	void LogoTest() {
		WebElement logo = driver.findElement(By.xpath("//*[@src='themes/orangehrm-modern/static/images/logo.png']"));
		System.out.println(logo);
		Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the website");
		// Assert.assertFalse(logo.isDisplayed(), "Logo is displayed on the website");
	}

	@Test(priority = 2)

	void HomepageTitle() {
		String title = driver.getTitle();
		// System.out.println(title);
		Assert.assertEquals("HR Management System | HR Management Software | OrangeHRM",
				"HR Management System | HR Management Software | OrangeHRM", "Title test failed");
	}

	@Test(priority = 3)
	void tearDown() {

		driver.close();

	}

}
