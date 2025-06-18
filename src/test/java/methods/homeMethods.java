package methods;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import pageObjects.homePageObjects;

public class homeMethods {
	
	public void homePageValidation(WebDriver driver)
	{
		String actual = driver.findElement(homePageObjects._logo).getText();
		 String expected= "Qafox.com";
		if(actual.equals(expected))
		{
			System.out.println("True");
		}
		else

		{
			System.out.println("False");
		}
		
		
	}

}
