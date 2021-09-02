package commonfunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.sun.org.slf4j.internal.Logger;

public class commonfunctions {
	public static WebDriver driver=null;
	public static Properties properties =null;
	
	org.testng.log4testng.Logger logger = Logger.getlogger(commonfunctions.class);
	
	public Properties loadpropertyfile() throws IOException {
		FileInputStream fileinputstream =new FileInputStream("config.properties");
				Properties properties =new Properties();
		properties.load(fileinputstream);
		return properties;
		
		//propertyfileload.return
	}
	
	@BeforeSuite
	
	public void launchbrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("orange HRM test begins");
		logger.info("loading the property file");
		loadpropertyfile();
		
		String browser =properties.getProperty("browser");
		String url=properties.getProperty("url");
		
		String driverlocation=properties.getProperty("driverlocation");
		
		//to lauch a browser without system.setproperties
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverlocation);
			logger.info("launching chrome");
			driver= new ChromeDriver();
			
	
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.friver", driverlocation);
			logger.info("launching firefox");
		driver= new FirefoxDriver();
			
		// }
		driver.manage().window().maximize();
		logger.info("navigating to application ");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	}
	}
	
	
	@AfterSuite
	public void teardown() {
		
logger.info("Execution done");
	driver.quit();
	}
	

}
