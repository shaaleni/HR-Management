package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpageobjects {
	
	
	@FindBy(id="txtUsername")
	public static WebElement username;
	
	@FindBy(id="txtPassword")
	public static WebElement passowrd;
	
	@FindBy(id="btnLogin")
	public static WebElement submitbutton;
	

}
