package pageObjects;

import org.openqa.selenium.By;

public class RegisterObjects {
	
	public static final By _firstName = By.xpath("//div/input[@id='input-firstname']");
	public static final By _lastName = By.xpath("//div/input[@id='input-lastname']");
	public static final By _email = By.xpath("//div/input[@id='input-email']");
	public static final By _phone = By.xpath("//div/input[@id='input-telephone']");
	public static final By _passwd = By.xpath("//div/input[@id='input-password']");
	public static final By _passwd_cnfm = By.xpath("//div/input[@id='input-confirm']");
	public static final By _privacyCheckBox = By.xpath("//input[@name='agree']");
	public static final By _continue = By.xpath("//input[@value='Continue']");
	public static final By _successMsg = By.xpath("//h1[contains(.,'Your Account Has Been Created!')]");
	

}
