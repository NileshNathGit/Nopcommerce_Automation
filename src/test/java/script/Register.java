package script;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.base;
import methods.RegisterMethods;
import utilities.MyListener;

@Listeners(MyListener.class)
public class Register {
	RegisterMethods rm = new RegisterMethods();
	Logger logger;
	WebDriver driver;
	
	
	@BeforeClass
	public void launch()
	{
		driver = base.launch(driver);
		base.logger.info("*****  Browser Launch  ****");
		
	}

	@Test
	public void register()
	{
		base.logger.info("****************** Register fucntion Start ______________");
		rm.register(driver,"Nilesh", "Nath", "email@xcd.com","145245245", "Masspower@rfsan123");
		
	}
	@AfterClass
	public void tearDown()
	{
		base.logger.info("*************** Driver close *******************");
		driver.close();
	}
}
