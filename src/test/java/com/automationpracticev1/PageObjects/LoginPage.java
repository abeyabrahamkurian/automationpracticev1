package com.automationpracticev1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;


	public LoginPage (WebDriver rdriver)
	{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(id="user-name")
	@CacheLookup
	WebElement EnterUsername;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement EnterPassword;

	@FindBy(xpath ="//input[@id='login-button']")
	@CacheLookup
	WebElement ClickLoginButton;
	
	@FindBy(id="react-burger-menu-btn")
	@CacheLookup
	WebElement Logoutstep1;
	@FindBy(id="logout_sidebar_link")
	@CacheLookup
	WebElement ClickLogout;

public void Login(String Username, String password) {
	EnterUsername.sendKeys(Username);
		EnterPassword.sendKeys(password);
		ClickLoginButton.click();	
}

public void Logout() {
	Logoutstep1.click();
	ClickLogout.click();
	
}
}

