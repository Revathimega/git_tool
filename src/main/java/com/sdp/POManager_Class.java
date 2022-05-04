package com.sdp;

import org.openqa.selenium.WebDriver;

import POM_Class.Continue_Page;
import POM_Class.Details_Page;
import POM_Class.Login;
import POM_Class.Logout_Page;
import POM_Class.Search_Hotel;

public class POManager_Class {
	
	public WebDriver driver;
	
	private Login lp;
	private Search_Hotel sh ;
	private Continue_Page cp;
	private Details_Page dp;
	private Logout_Page lo; 
	
	public POManager_Class(WebDriver driver2) {
		this.driver = driver2;
	}


	public Login getInstanceLogin() {
	if (lp == null) {
		
		lp = new Login(driver);
	
	}
		return lp;	
	}
	
	public Continue_Page getInstanceContinue() {
		if (cp==null) {
			
			cp = new Continue_Page(driver);
		}
	return cp;
	}
	
	public Search_Hotel getInstanceSearch_Hotel() {
		if (sh==null) {
			sh = new Search_Hotel(driver);
		}
		return sh;
	}
	
	
	public Details_Page getInstanceDetails_Page() {
		if (dp==null) {
			dp = new Details_Page(driver);		
		}
		return dp;
	}
	public Logout_Page getInstanceLogout_Page() {
		if (lo==null) {
			lo = new Logout_Page(driver);	
		}
		return lo;
		
	}
	
	}

