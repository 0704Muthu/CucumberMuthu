package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPOM extends TestBase {

	public SigninPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;



	//POJO-->plain old java object -->getters and setters
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}


}
