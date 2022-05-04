package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	
	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement login;
	
	public Login(WebDriver driv) {
		this.driver = driv;
		PageFactory.initElements(driv, this);
	
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
	
	
	
	
	
	
	
	
}
