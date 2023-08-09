package com.bio.NykaaMaster;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import com.utility.PageObjectManager;
import com.utility.TestBase;

public class Test extends TestBase {
	static File file;
	static FileInputStream fis;
	static Properties prop;
	static String url;


	private static  Properties getAPropertyFile() throws IOException {
		file = new File("C:\\Users\\rmuth\\eclipse-workspace\\Relay\\src\\test\\java\\com\\bio\\NykaaMaster\\config.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		return prop;

	}


	private static String getABrowser() throws IOException {
		return	getAPropertyFile().getProperty("browser");
	}
	private static String getAUrl() throws IOException {
		return getAPropertyFile().getProperty("url");
	}
	
	private static String getAUser() throws IOException {
		return getAPropertyFile().getProperty("username");
	}



	public static void main(String[] args) throws IOException {


		browserLaunch(getABrowser());
		getUrl(getAUrl());
		PageObjectManager pom = new PageObjectManager();
		passAData(pom.getSpom().getUsername(), getAUser());

	}

}

