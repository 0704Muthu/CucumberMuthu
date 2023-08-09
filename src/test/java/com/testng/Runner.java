package com.testng;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utility.PageObjectManager;
import com.utility.TestBase;

public class Runner  extends TestBase{
	
	
	PageObjectManager pom = new PageObjectManager();
	
	@DataProvider(name = "data")
	private Object[][] data() {
		Object[][] data = new Object[2][2];
		data[0][0]="Logesh";
		data[0][1]="Logesh@123";
		data[1][0]="ganesh";
		data[1][1]="ganesh@123";
		return data;
	}
	
	/**
	 * 
	 * HardAssert-->Validation
	 * SoftAssert--->Verification
	 */
	
	@Test(dataProvider = "data")
	public void dataProvider(String username,String Password) {
		
		browserLaunch("chrome");
		getUrl("https://www.facebook.com");
		String actual = driver.getTitle();
		String expected="Facebook";
		//Validation HardAssert
		//Assert.assertEquals(actual, expected);
		//Verification using SoftAssert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		soft.assertAll();
		passAData(pom.getLop().getUsername(),username );
		passAData(pom.getLop().getPassword(),Password );
	}

	@Parameters(value = "username")
	@Test()
	private void usingParameter(String username,String password) {
		browserLaunch("chrome");
		getUrl("https://www.facebook.com");
		passAData(pom.getLop().getUsername(),username );
		passAData(pom.getLop().getPassword(),password );
	}

	
	

}
