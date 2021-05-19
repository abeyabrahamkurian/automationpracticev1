package com.automationpracticev1.TestCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationpracticev1.PageObjects.LoginPage;
import com.automationpracticev1.Utilities.XLUtils;

public class TC_Login_001 extends BaseClass {
@Test(dataProvider = "LoginData")
public void Login(String Username, String password) {
LoginPage lp=new LoginPage(driver);
driver.get(baseURL);
lp.Login(Username, password);
if(actualUrl.equalsIgnoreCase(driver.getCurrentUrl()))
{
	 System.out.println("Correct username and correct password-Test passed"); 
	 lp.Logout();
} 
else { 
	System.out.println("Test failed-username or password issue");
	}	



}






@DataProvider(name="LoginData")
String[][] getData() throws IOException{
String path=System.getProperty("user.dir")+"/src/test/java/com/automationpracticev1/TestData/LoginData.xlsx";	
int rownum=XLUtils.getRowCount(path, "Sheet1");
int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
String loginData[][]=new String[rownum][colcount];
for(int i=1;i<=rownum;i++) {
	for(int j=0; j<colcount;j++) {
		loginData[i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j);
	}
}
return loginData;
}
}
