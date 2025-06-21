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
	
	
	public static ExtentSparkReporter sp; //UI of the Report
	public static ExtentReports er; //Populate Common info in the report
	public static ExtentTest tests; //Creating Test Entries in the report
	
	
	
		public void onStart(ITestContext context)
		
		{
			System.out.println("Test Execution Started");
			sp = new ExtentSparkReporter(base._report);
			sp.config().setDocumentTitle("Automation Report");
			sp.config().setReportName("Regression Suite");
			sp.config().setTheme(Theme.DARK);
			
			er = new ExtentReports();
			er.attachReporter(sp);
			
			
		}
		
		public void onTestStart(ITestResult result) {
	        tests = er.createTest(result.getMethod().getMethodName());
	    }
		public void onTestSuccess(ITestResult result)
		{
			
			tests.log(Status.PASS, result.getName()+" Method Execution Completed!");
		}
		public void onTestFailure(ITestResult result)
		{
			
			tests.log(Status.FAIL, "Test is failed caused by "+result.getThrowable());
		}
		
		public void onFinish(ITestContext context)
		{
			  if (er != null) {
		            er.flush();
		        }		
		}
		
		
	
	

}
