package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Cucumber.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature_file\\Adactin.feature",glue = "com.stepdefinition",
				monochrome =  true ,dryRun = false, strict = true ,
				tags = ("~@Logout"),
				plugin = {"html:Report","json:Report/cucumber.json","pretty","com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"})

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		driver = Baseclass.browserlauch("chrome");
	}
	@AfterClass
	public static void tear_Down() {

//		driver.close(); 		or
		
		Baseclass.close();
	}

}
