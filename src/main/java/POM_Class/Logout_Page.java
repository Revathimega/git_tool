package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement booknow;

	public Logout_Page(WebDriver driv5) {
		this.driver = driv5;
		PageFactory.initElements(driv5, this);
	}

	public WebElement getBooknow() {
		return booknow;
	}
}
