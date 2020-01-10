package com.testng.poc;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DepenedencyExample {
	
	//Ignore if the dependency method if not executed
	//If the dependency method not executed still want to execute then use the alwaysRun=true
	@Test
	public void startCar() {
		System.out.println("Start Car");
		Assert.fail();
	}
	@Test(dependsOnMethods = {"startCar"})
	public void driveCar() {
		System.out.println("driveCar");
	}
	@Test(dependsOnMethods = {"driveCar"})
	public void stopCar() {
		System.out.println("stopCar");
	}
	@Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
	public void parkCar() {
		System.out.println("parkCar");
	}
	

}
