//package com.testng;
//
//import java.io.IOException;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Sel4 {
//	
//	 
//	public static void main(String[] args) throws Throwable {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions ch = new ChromeOptions();
//		ch.addArguments("--remote-allow-origins=*");//AccessControl
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.ilovepdf.com/edit-pdf");
//		driver.findElement(By.id("pickfiles")).click();
//		Thread.sleep(3000);
//		Runtime.getRuntime().exec("C:\\AutoIt\\EvengAuto.exe");
//		
//	}
//}
