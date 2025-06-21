package pageObjects;

import org.openqa.selenium.By;

public class HomeObjects {
	public static final By _logo = By.xpath("//div/h1/a[contains(.,'Qafox.com')]");
	public static final By _myAccount = By.xpath("//li[@class='dropdown']/a[@title='My Account']");
	public static final By _login = By.xpath("//li[@class='dropdown']/a[@title='Login']");
	public static final By _Register = By.xpath("//a[contains(text(),'Register')]");
	
	
	

}
