package pom_classes;

import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 
	
	
	
	private WebElement usernameEdt;
	
	
	private WebElement passwordEdt;
	
	
	private WebElement loginLink;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this), driver);
		
	}
	public WebElement getUserNameEdt() {
		return userNameEdt;
		
	}
	public WebElement getPasswordedEdt() {
		return userNameEdt;
	}
	public WebElement getUserNameEdt() {
		return userNameEdt;
	
}
