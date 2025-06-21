package methods;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pageObjects.HomeObjects;
import utilities.MyListener;

public class homeMethods {
	
	public void homePageValidation(WebDriver driver)
	{
		String actual = driver.findElement(HomeObjects._logo).getText();
		String expected= "Qafox.com";
		if(actual.equals(expected))
		{
			MyListener.tests.log(Status.PASS, "Title is Correct");
		}
		else

		{
			MyListener.tests.log(Status.FAIL, "Title is NOT Correct");
		}
		
		
	}

}
