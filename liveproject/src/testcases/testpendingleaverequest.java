package testcases;

import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.log.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunction.commonfunctions;
import pageobject.dashboardpageobject;
import pageobject.loginpageobjects;

public class testpendingleaverequest extends commonfunctions {
	String actualMessage=null;
	 static Logger logger=Logger.getLogger(testpendingleaverequest.class);
	public void login() {
		logger.info("login into the application")
		PageFactory.initElements(driver,loginpageobjects.class);
		loginpageobjects.username.sendKeys(properties.getProperty("username"));
		loginpageobjects.passowrd.sendKeys(properties.getProperty("password"));
		loginpageobjects.submitbutton.click();
		
	}
	
	public void getpendingleaverequest() {
		PageFactory.initElements(driver,dashboardpageobject.class);
		String actualMessage = dashboardpageobject.pendingleaverequest.getText();
	}
	@Test
	
	public void verifypendingleaverequest() {
		
	login();
	logger.info("getting the pending leave request details");
	getpendingleaverequest();
	logger.info("verification");
	Assert.assertEquals(actualMessage, "No records are available ");
		
	}
	

}
