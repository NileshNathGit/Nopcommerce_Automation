package script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import base.base;
import methods.homeMethods;

public class HomePage {
	WebDriver driver;
	homeMethods m1 = new homeMethods();
	@BeforeClass
	public void setUp()
	{
		driver = base.launch(driver);
		
	}
	
	@Test
	public void homePageValidation() throws InterruptedException
	{
		m1.homePageValidation(driver);
		
	}
	
	
	@AfterClass
	public void teardown() throws InterruptedException {
		driver.close();
		
	}
	
		
}


