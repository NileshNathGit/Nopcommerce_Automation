package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import utilities.MyListener;

public class GenericMethods {

	public final void enterText(WebDriver driver, By locater, String value, String fieldName)

	{
		try {
			driver.findElement(locater).sendKeys(value);
			MyListener.tests.log(Status.PASS, fieldName + " is Entered");
		} catch (Exception e) {
			MyListener.tests.log(Status.FAIL, fieldName + " is NOT Entered, Caused By " + e);
		}
	}

	public final void clickElement(WebDriver driver, By locater, String fieldName) {
		if (driver.findElement(locater).isDisplayed()) {
			driver.findElement(locater).click();
			MyListener.tests.log(Status.PASS, fieldName + " is clicked");
		} else {
			MyListener.tests.log(Status.FAIL, fieldName + " is NOT clicked, Caused By ");
		}
	}

	public final void showSuccess(WebDriver driver, By locater, String fieldName) {
		try {
			driver.findElement(locater).isDisplayed();
			MyListener.tests.log(Status.PASS, fieldName + " is Successfull");

		} catch (Exception e) {
			MyListener.tests.log(Status.FAIL, fieldName+" is NOT Successfull");

		}
	}

}
