package com.stepdefinition;

import com.Maven_Cucumber.Baseclass;
import com.propertyfile.File_Reader_Manager;
import com.sdp.POManager_Class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Baseclass {
	
	public static POManager_Class pom = new POManager_Class(driver); 
	
	@Before
	public void beforeHooks(Scenario s) {
		
		String name = s.getName();
		System.out.println("Scenario name ;" +name );
		
	}
	
	@After
	public void afterHooks(Scenario s) throws Throwable {
	
		String status = s.getStatus();
		System.out.println("Scenario status ;" +status );
		
		if (s.isFailed()) {
			screenshot("C:\\Users\\jagadesh kumar\\eclipse-workspace\\project\\Maven_Cucumber\\screenshot\\adactin.png");
			
		}
	}
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		geturl(url);
	}

	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
		
		sendkeys(pom.getInstanceLogin().getUsername(), username);
	}
	
	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		
		sendkeys(pom.getInstanceLogin().getPassword(), password);
	}

	@Then("^user Click The Login Button And It Navigate To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
		
		click(pom.getInstanceLogin().getLogin());
	}

	@When("^user Choose The \"([^\"]*)\" In The Location Field$")
	public void user_Choose_The_In_The_Location_Field(String arg1) throws Throwable {
		
		dropdownvalue(pom.getInstanceSearch_Hotel().getLocation(), "New York");
	}

	@When("^user Choose The \"([^\"]*)\" In The Hotels Field$")
	public void user_Choose_The_In_The_Hotels_Field(String arg1) throws Throwable {
		
		dropdownvalue(pom.getInstanceSearch_Hotel().getHotels(), "Hotel Hervey");
	}

	@When("^user Choose The \"([^\"]*)\" In The Room Type Field$")
	public void user_Choose_The_In_The_Room_Type_Field(String arg1) throws Throwable {
		
		dropdownvalue(pom.getInstanceSearch_Hotel().getRoom_type(), "Double");
	}

	@When("^user Choose The \"([^\"]*)\" In The Number Of Rooms Field$")
	public void user_Choose_The_In_The_Number_Of_Rooms_Field(String arg1) throws Throwable {
		
		dropdownvalue(pom.getInstanceSearch_Hotel().getRoom_nos(),"1");
	}

	@When("^user Choose The \"([^\"]*)\" In The Adults Per Room Field$")
	public void user_Choose_The_In_The_Adults_Per_Room_Field(String arg1) throws Throwable {
		
		dropdownvalue(pom.getInstanceSearch_Hotel().getAdult_room(), "2");
	}

	@When("^user Choose The \"([^\"]*)\" In The Children Per Room Field$")
	public void user_Choose_The_In_The_Children_Per_Room_Field(String arg1) throws Throwable {
		
		dropdownvalue(pom.getInstanceSearch_Hotel().getChild_room(), "0");
	}

	@Then("^user Click Search Button And It Navigates To The Select Hotel$")
	public void user_Click_Search_Button_And_It_Navigates_To_The_Select_Hotel() throws Throwable {
		
		click(pom.getInstanceSearch_Hotel().getSearch());
	}

	@When("^user Click The Checkbox To Select The Hotel$")
	public void user_Click_The_Checkbox_To_Select_The_Hotel() throws Throwable {
		
		click(pom.getInstanceContinue().getButton());
	}

	@Then("^user Click The Continue Button And It Navigates To The Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
		
		click(pom.getInstanceContinue().getButton1());
	}

	@When("^user Enter The \"([^\"]*)\" In The First Name Field$")
	public void user_Enter_The_In_The_First_Name_Field(String arg1) throws Throwable {
		
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfirstname();
		sendkeys(pom.getInstanceDetails_Page().getFirstname(), firstname);
	}

	@When("^user Enter The \"([^\"]*)\" In The Last Name Filed$")
	public void user_Enter_The_In_The_Last_Name_Filed(String arg1) throws Throwable {
		
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getlastname();
		sendkeys(pom.getInstanceDetails_Page().getLastname(),lastname );
	}

	@When("^user Enter The \"([^\"]*)\" In The Billing Address Field$")
	public void user_Enter_The_In_The_Billing_Address_Field(String arg1) throws Throwable {
		
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getaddress();
		sendkeys(pom.getInstanceDetails_Page().getAddress(),address );
	}

	@When("^user Enter The \"([^\"]*)\" In The Credit Card NO Field$")
	public void user_Enter_The_In_The_Credit_Card_NO_Field(String arg1) throws Throwable {
		
		String creditcard_no = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcreditcard_no();
		sendkeys(pom.getInstanceDetails_Page().getCcnum(),creditcard_no );
	}

	@When("^user Select The \"([^\"]*)\" In The Credit Card Type Field$")
	public void user_Select_The_In_The_Credit_Card_Type_Field(String arg1) throws Throwable {
		
		dropdownvalue(pom.getInstanceDetails_Page().getCctype(), "VISA");
	}

	@When("^user Select The \"([^\"]*)\" In The Expiry Month Field$")
	public void user_Select_The_In_The_Expiry_Month_Field(String arg1) throws Throwable {
		
		dropdownvalue(pom.getInstanceDetails_Page().getCc_expmonth(), "4");
	}

	@When("^user Select The \"([^\"]*)\" In The Expiry Year Field$")
	public void user_Select_The_In_The_Expiry_Year_Field(String arg1) throws Throwable {
		
		dropdownvalue(pom.getInstanceDetails_Page().getCc_expyear(), "2022");
	}

	@When("^user Enter The \"([^\"]*)\" In The CVV Number Field$")
	public void user_Enter_The_In_The_CVV_Number_Field(String arg1) throws Throwable {
		
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcvv();
		sendkeys(pom.getInstanceDetails_Page().getCvv(), cvv);
	}

	@Then("^user Click The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
		
		click(pom.getInstanceDetails_Page().getBooknow());
	}

	@When("^user Click The Logout Button Once The Booking was Confirmed$")
	public void user_Click_The_Logout_Button_Once_The_Booking_was_Confirmed() throws Throwable {
		
		click(pom.getInstanceLogout_Page().getBooknow());
	}
}
