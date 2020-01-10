package ListenersPkg;

import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

public class CustomListeners implements ITestListener {
	// Execute before the execution of the tests
	public void onStart(ITestContext args) {
		System.out.println("Execution started " + args.getName());
	}

//Exection of all test cases this test case will execute
	public void onFinish(ITestContext args) {
		System.out.println("onfinish  " + args.getName());
	}

//Execute Before start of each test
	public void onTestStart(ITestResult args) {
		System.out.println("onteststart  " + args.getName());
	}

//Whenever the test skipped this method will call
	public void onTestSkipped(ITestResult args) {
		System.out.println("ontestskipped  " + args.getName());

	}

//Whenever the  test success this method will execute
	public void onTestSuccess(ITestResult args) {
		System.out.println("ontestsuccess  " + args.getName());

	}

//Whenever the test failed this method will call
	public void onTestFailure(ITestResult args) {
		System.out.println("ontestfailure " + args.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult args) {
		System.out.println(" " + args.getName());

	}
}
