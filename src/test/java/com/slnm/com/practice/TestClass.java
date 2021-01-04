package com.slnm.com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
	public static WebDriver driver;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@Test
	public void browserLaunch(){
		driver.get("https://www.google.com/");	
	}
	
	@AfterTest
	public void Quit(){
		driver.quit();
	}

}
