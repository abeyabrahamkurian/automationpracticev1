package com.automationpracticev1.TestCases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automationpracticev1.Utilities.ReadConfig;
import com.beust.jcommander.Parameter;

public class  BaseClass {
ReadConfig readconfig=new ReadConfig();

public String baseURL= readconfig.getApplicationURL();
public String Username=readconfig.getUsername();
public String password =readconfig.getpassword();
public String actualUrl =readconfig.actualUrl();
public String LogoutButtonID =readconfig.Logout();
WebDriver driver;
public static Logger Logger;

@Parameters("browser")
@BeforeClass
public void setup(String Browsers) {
	
	Logger =Logger.getLogger("automationpracticev1");
	PropertyConfigurator.configure("log4j.properties");
if(Browsers.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
	driver= new ChromeDriver();
}
else {
	AssertJUnit.assertTrue(false);
}
	
}



@AfterClass
public void teardown() {
driver.quit();
}
}

