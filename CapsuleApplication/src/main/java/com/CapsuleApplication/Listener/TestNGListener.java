package com.CapsuleApplication.Listener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.CapsuleApplication.Utils.TakeScreenShot;


public class TestNGListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("TestNG execution is started"  +  result.getName());
}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestNG execution is succesed"  +  result.getName());

		
	}

	public void onTestFailure(ITestResult result) {
		TakeScreenShot.getPhoto(result.getMethod().getMethodName());		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestNG execution is skipped"  +  result.getName());

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Browser is Initilized"  +  context.getName());

		
	}

	public void onFinish(ITestContext context) {
		System.out.println("TestNG execution is finished"  +  context.getName());
		
	}
}