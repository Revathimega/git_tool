package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details_Page {
	
	public WebDriver driver;

	@FindBy(name = "first_name")
	private WebElement firstname;
	
	@FindBy(name = "last_name")
	private WebElement lastname;
	
	@FindBy(name = "address")
	private WebElement address;
	
	@FindBy(name = "cc_num")
	private WebElement ccnum;
	
	@FindBy(name = "cc_type")
	private WebElement cctype;
	
	@FindBy(name = "cc_exp_month")
	private WebElement cc_expmonth;
	
	@FindBy(name = "cc_exp_year")
	private WebElement cc_expyear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(name = "book_now")
	private WebElement booknow;

	public Details_Page(WebDriver driv4) {
		this.driver = driv4;
		PageFactory.initElements(driv4, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCc_expmonth() {
		return cc_expmonth;
	}

	public WebElement getCc_expyear() {
		return cc_expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	
}
