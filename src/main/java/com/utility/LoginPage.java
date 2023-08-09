package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement amazonSearch;
	@FindBy(id="nav-search-submit-button")
	private WebElement clickSearch;
	
	public WebElement getAmazonSearch() {
		return amazonSearch;
	}
	public WebElement getClickSearch() {
		return clickSearch;
	}
	
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id="pass")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
}
