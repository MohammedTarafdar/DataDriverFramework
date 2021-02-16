package com.shift.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties configProp = new Properties();
	public static Properties orProp = new Properties();
	public static FileInputStream fis;
	
	
	@BeforeSuite
	public void setUp() {
		
		if (driver==null) {
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				configProp.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/Or.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				orProp.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		if (configProp.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(configProp.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Browser not recognized");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(configProp.getProperty("implicitWait")), TimeUnit.SECONDS);
		
		driver.get(configProp.getProperty("testsiteurl"));
		
	}
	
	@Test
	public void getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Current page title : " + title);
	}
	
	
	@AfterSuite
	public void tearDown() {
		
	}

}
