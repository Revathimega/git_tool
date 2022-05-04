package com.Maven_Cucumber;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;

//	BrowserLaunch
	public static WebDriver browserlauch(String broswername) {
		
		if (broswername.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();	
		}
		else if (broswername.equalsIgnoreCase("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\firefox.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();	
		}
		
		return driver;
	}
//	get
	public static void geturl(String url) {
		
		driver.get(url);	
	}
// close
	public static void close() {
		
		driver.close();
	}
	
//	quitBrowser
	public static void quitBrowser() {

		driver.quit();
	}
//	sendKeys
	public static void sendkeys(WebElement element,String input ) {
		
		element.sendKeys(input);
	}
//	click
	public static void click(WebElement element) {

		element.click();
		
	}
//	ScreenShot
	public static void screenshot(String location) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(src, dest);
		
		
	}
//	dropdown - is multiple
	public static void dropdown(WebElement element) {

		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
//		dropdown by value
	public static void dropdownvalue(WebElement element,String input) {
		
		Select s = new Select(element);
		s.selectByValue(input);
	}
	
//	dropdown by index
	public static void dropdownindex(WebElement element,int input) {
		
		Select s = new Select(element);
		s.selectByIndex(input);
	}
//	dropdown by Visibletext
		
	public static void dropdown_Visibletext(WebElement element,String input) {

		Select s = new Select(element);
		s.selectByVisibleText(input);
	}
// 	Navigate To()
	public static void navigate_to(String url) {
		
		driver.navigate().to(url);
	}
	
//	Navigate back()
	public static void navigate_back() {
		
		driver.navigate().back();	
	}
//	Navigate forward ()
	public static void navigate_forward () {
		
		driver.navigate().forward();	
	} 
//	Navigate refresh()
	public static void navigate_refresh() {
		
		driver.navigate().refresh();	
	}
//	Is enable
	public static void Is_enable(boolean refname) {
		
		System.out.println(refname);
	}
//	Is displayed
	public static void Is_displayed(boolean refname) {
		
//		(boolean username = driver.findElement(By.name("username")).isDisplayed();)
		System.out.println(refname);
	}
//	Is selected
	public static void Is_selected(boolean refname) {
		
		System.out.println(refname);
	}
//	Get_title
	public void Get_title(String title) {

		System.out.println(title);
	}
//	Get_current url
	public void Get_currenturl(String currentUrl) {

		System.out.println(currentUrl);
	}
//	Alert
	public void alert_method() {
		
	}
//	Frames
	public void frames() {

	}
//	Robot
	public void robot() {

	}
	
//	Window handles
	public void Window_handles() {

	}
//	Check box
	public void Check_box() {

	}

//	Get options
	public void Get_options() {

	}

// Get_text
	public void Get_text() {

	}
//	Get_attribute
	public void Get_attribute() {

	}
//  Wait
	public void Wait() {

	}
	
//	Scroll up and down
	public void Scroll_up_down() {

	}
//	Get first selected options
	public void Get_first_selected_options(WebElement element1,WebElement element2) {
		
//		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select s = new Select(element1);
//		WebElement first = s.getFirstSelectedOption();		
		System.out.println(element2.getText());

	}
//	Get all selected options
	public void Get_all_selected_options() {
		
		

	}
//	RadioButton
	public void RadioButton() {
		
		

	}
//	Action(All methods from action class)
	
}

