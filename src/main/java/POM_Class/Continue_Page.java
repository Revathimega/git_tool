package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement button;
	
	@FindBy(name = "continue")
	private WebElement button1;
	
	public Continue_Page(WebDriver driv3) {
		
		this.driver = driv3;
		PageFactory.initElements(driv3,this);
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getButton1() {
		return button1;
	}

	

}
