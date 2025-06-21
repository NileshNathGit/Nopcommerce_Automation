package methods;

import org.openqa.selenium.WebDriver;

import base.GenericMethods;
import pageObjects.HomeObjects;
import pageObjects.RegisterObjects;

public class RegisterMethods {
	
	GenericMethods gm = new GenericMethods();
	 
	public void register(WebDriver driver, String name, String last_name, String email, String phone, String pass)
	{
		
		gm.clickElement(driver, HomeObjects._myAccount, "My Account Option");
		gm.clickElement(driver, HomeObjects._Register, "Register");
		gm.enterText(driver,RegisterObjects._firstName, name, "First Name");
		gm.enterText(driver,RegisterObjects._lastName, last_name, "Last Name");
		gm.enterText(driver,RegisterObjects._email, email, "Email");
		gm.enterText(driver,RegisterObjects._phone, phone, "Phone No");
		gm.enterText(driver,RegisterObjects._passwd, pass, "Password");
		gm.enterText(driver,RegisterObjects._passwd_cnfm, pass, "Confirm Password");
		gm.clickElement(driver,RegisterObjects._privacyCheckBox, "Privacy Checkbox");
		gm.clickElement(driver,RegisterObjects._continue, "Continue/Submit");
		gm.showSuccess(driver,RegisterObjects._successMsg, "Account Creation");
	

	}
}
