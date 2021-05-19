package com.automationpracticev1.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
public ReadConfig() {
File src= new File("./Configrations/config.properties");	
try {
	FileInputStream fis = new FileInputStream(src);
pro=new Properties();
pro.load(fis);
}catch (Exception e) {
System.out.println("Exception is"+ e.getMessage());
}
}
public String getApplicationURL()
{
String baseURL=pro.getProperty("baseURL");	
return baseURL;
	}

public String getUsername()
{
String Username=pro.getProperty("Username");	
return Username;
	}

public String getpassword()
{
String password=pro.getProperty("password");	
return password;
	}

public String getChromepath()
{
String Chromepath=pro.getProperty("Chromepath");	
return Chromepath;
	}

public String actualUrl()
{
String actualUrl=pro.getProperty("actualUrl");	
return actualUrl;
	}
public String Logout()
{
String LogoutButtonID=pro.getProperty("LogoutButtonID");	
return LogoutButtonID;
	}
}

