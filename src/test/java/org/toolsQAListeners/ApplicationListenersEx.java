package org.toolsQAListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ApplicationListenersEx implements ITestListener {
	public void onTestStart(ITestResult result) {
	System.out.println("On Test START : "+result.getName());
	Reporter.log("On Test START : "+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test SUCCESS : "+result.getName());
		Reporter.log("On Test SUCCESS : "+result.getName());	
	}
	public void onTestFailure(ITestResult result) {
		//Screenshot
		System.out.println("On Test FAILURE : "+result.getName());
		Reporter.log("On Test FAILURE : "+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test SKIPPED : "+result.getName());
		Reporter.log("On Test SKIPPED : "+result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Test FAILED WITHIN SUCCESS % : "+result.getName());
		Reporter.log("On Test FAILED WITHIN SUCCESS % : "+result.getName());
	}
	public void onStart(ITestContext context) {
		System.out.println("*** On START ***");
		Reporter.log("*** On START ***");
	}
	public void onFinish(ITestContext context) {
		System.out.println("*** On FINISH ***");
		Reporter.log("*** On FINISH ***");
	}
	
}
