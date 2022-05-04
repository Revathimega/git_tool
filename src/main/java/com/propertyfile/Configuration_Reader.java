package com.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
   
public class Configuration_Reader {
	
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\jagadesh kumar\\eclipse-workspace\\project\\Maven_Project\\src\\main\\java\\com\\propertyfile\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}
	public String geturl() throws Throwable {
		
		String url = p.getProperty("url");
		return url;
		
	}
	public String getusername() throws Throwable {
		
		String username = p.getProperty("usename");
		return username ;
		}
		public String getpassword() throws Throwable {
			
			String password = p.getProperty("password");
			return password;
		}
		public String getfirstname() throws Throwable {
			
			String firstname = p.getProperty("firstname");
			return firstname;	
		}

		public String getlastname() throws Throwable {
	
			String lastname = p.getProperty("lastname");
			return lastname;	
		}
		public String getaddress() throws Throwable {
	
			String address = p.getProperty("address");
			return address;	
		}
		public String getcreditcard_no() throws Throwable {
	
			String creditcard_no = p.getProperty("creditcard_no");
			return creditcard_no;
		}
		public String getcard_type() throws Throwable {
	
			String card_type = p.getProperty("card_type");
			return card_type;	
		}
		public String getexp_month() throws Throwable {

			String exp_month = p.getProperty("exp_month");
			return exp_month;	
		}
		public String getexp_year() throws Throwable {

			String exp_year = p.getProperty("exp_year");
			return exp_year;	
}
		public String getcvv() throws Throwable {

			String cvv = p.getProperty("cvv");
			return cvv;	
}
}
