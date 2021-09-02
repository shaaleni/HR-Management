package testcases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.org.slf4j.internal.Logger;

import commonfunction.commonfunctions;
import pageobject.userrolepageobject;

public class testuserrole extends commonfunctions {
	
	public void movetouserspage() {
		PageFactory.initElements(driver,userrolepageobject.class);
		Actions actions =new Actions(driver);
		actions.moveToElement (userrolepageobject.adminlink);
		actions.moveToElement (userrolepageobject.usermanagementlink);
		actions.moveToElement (userrolepageobject.userslink);
		actions.click().build().perform();
		
		
	}
	
	public void selectuserrole() {
		
		Select selectrole =new Select(userrolepageobject.usertype);
		selectrole.selectByIndex(1);
		
	}
	
	public void selectstatus() {
		Select selectstatus =new Select (userrolepageobject.userstatus);
		selectstatus.selectByIndex(1); 
	
		
	}
	@Test 
	
	public void checkuserrole() {
		PageFactory.initElements(driver,userrolepageobject.class);
		logger.info("navigating to the user page");
		movetouserspage();
		logger.info("selecting the user role");
		selectuserrole();
		logger.info("seleting the status");
		selectstatus();
		userrolepageobject.searchbutton.click();
		
		String actualrole = userrolepageobject.userrolevalue.getText();
		String actualstatus=userrolepageobject.userrolevalue.getText();
		
		logger.info("verifying the results");
		Assert.assertEquals(actualrole, "admin");
		Assert.assertEquals(actual, "enabled");
		logger.info("end of test userrole ")
		
	}

}
