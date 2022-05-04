package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotels;
	
	@FindBy(name = "room_type")
	private WebElement room_type;
	
	@FindBy(name = "room_nos")
	private WebElement room_nos;
	
	@FindBy(name = "datepick_in")
	private WebElement datepick_in;
	
	@FindBy(name = "datepick_out")
	private WebElement datepick_out;
	
	@FindBy(name = "adult_room")
	private WebElement adult_room;
	
	@FindBy(name = "child_room")
	private WebElement child_room;
	
	@FindBy(name = "Submit")
	private WebElement search;
	
	public Search_Hotel(WebDriver driv2) {
		this.driver = driv2;
		PageFactory.initElements(driv2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearch() {
		return search;
	}


}
