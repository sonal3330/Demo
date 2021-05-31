package sampleJenkinsProject;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Successfully Finished" +result.getName());
		
	}

}
