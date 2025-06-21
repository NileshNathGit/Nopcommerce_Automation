package script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.base;
import methods.RegisterMethods;

public class Register {
	RegisterMethods rm = new RegisterMethods();
	WebDriver driver;
	@BeforeClass
	public void launch()
	{
		driver = base.launch(driver);
	}

	@Test
	public void register()
	{
		
		rm.register(driver,"Nilesh", "Nath", "email@xcd.com","145245245", "Masspower@rfsan123");
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
