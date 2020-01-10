package com.testng.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest1 {
	WebDriver driver;

	@Test
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//WebElement logo = driver.findElement(By.xpath("//*[@src='themes/orangehrm-modern/static/images/logo.png']"));
		//Assert.assertTrue(logo.isDisplayed());

	}

	@Test
	public void HomePageTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "HR Management System | HR Management Software | OrangeHRM");

	}

	@AfterTest
	public void tearDiown() throws InterruptedException {
		System.out.println("Closed");
		driver.quit();
	}

}
