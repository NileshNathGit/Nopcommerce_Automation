package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	WebDriver driver;
	public static  Logger logger = LogManager.getLogger();
	public static final  String url = "https://tutorialsninja.com/demo";
	public static WebDriver launch(WebDriver driver)
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(base.url);
		return driver;
	}
	
	
		
		

	public static final String _report = System.getProperty("user.dir")+"/reports/Automation_Report.html";

}
