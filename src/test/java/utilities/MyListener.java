package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListener implements ITestListener {
	
	
	public ExtentSparkReporter sp; //UI of the Report
	public ExtentReports er; //Populate Common info in the report
	public ExtentTest tests; //Creating Test Entries in the report
	
	
	
		public void onStart(ITestContext context)
		
		{
			System.out.println("Test Execution Started");
			sp = new ExtentSparkReporter(base._report);
			sp.config().setDocumentTitle("Automation Report");
			sp.config().setReportName("Regression");
			sp.config().setTheme(Theme.DARK);
			
			er = new ExtentReports();
			er.attachReporter(sp);
			
			
		}
		
//		public void onTestStart(ITestResult result)
//		{
//			tests = er.createTest(result.getName());
//			tests.log(Status.PASS, "Test is started"+result.getName());
//		}
		public void onTestSuccess(ITestResult result)
		{
			tests = er.createTest(result.getName());
			tests.log(Status.PASS, "Test is started"+result.getName());
		}
		public void onTestFailure(ITestResult result)
		{
			tests = er.createTest(result.getName());
			tests.log(Status.FAIL, "Test is failed caused by "+result.getThrowable());
		}
		
		public void onEnd(ITestContext context)
		{
			
			System.out.println("test ended");
		}
		
		
	
	

}
