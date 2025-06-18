package script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import base.base;
import methods.homeMethods;

public class launch {
	WebDriver driver;
	homeMethods m1 = new homeMethods();
	@BeforeClass
	public void setUp()
	{
		driver = base.launch(driver);
		
	}
	
	@Test
	public void home() throws InterruptedException
	{
		m1.homePageValidation(driver);
		
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
		
}


