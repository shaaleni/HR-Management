package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;

public class userrolepageobject {

	@FindBy(id="searchSystemUser_userName")
	public static WebElement username;
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement usertype;
	
	@FindBy(id ="searchSystemUser_employeeName_empName")
	public static WebElement searchuser;
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement userstatus;
	
	@FindBy(id="searchBtn")
	public static WebElement searchbutton;
	
	@FindBy(xpath = "//*[@id=\"resultTable\"]/thead/tr/th[3]/a")
	public static WebElement userrolevalue;
	
	@FindBy(xpath ="//*[@id=\"resultTable\"]/thead/tr/th[5]")
	public static WebElement statusvalue;
	
	@FindBy(linkText="Admin")
	public static WebElement adminlink;
	
	@FindBy(linkText="User Management")
	public static WebElement usermanagementlink;
	
	@FindBy(linkText="Users")
	public static WebElement userslink;
	
	
	
	
	
	
	
}
