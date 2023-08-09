package com.utility;

import org.openqa.selenium.support.PageFactory;

public class PageObjectManager extends TestBase {

	public PageObjectManager() {
		PageFactory.initElements(driver, this);
	}
	
	private SigninPOM spom;
	private LoginPage lop;
	
	
	public SigninPOM getSpom() {
		spom = new SigninPOM();
		return spom;
	}
	public LoginPage getLop() {
		lop = new LoginPage();
		return lop;
	}
	
	
	
}
