package com.shift.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shift.base.TestBase;

public class SignInAndSignOutTest extends TestBase{
	
	@Test
	public void signInTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(orProp.getProperty("homePageSignInLink"))).click();
		//
		Thread.sleep(2000);
		driver.findElement(By.xpath(orProp.getProperty("nextSignInLink"))).click();
		//
		driver.findElement(By.xpath(orProp.getProperty("userNameField"))).sendKeys("ashik_mart@yahoo.com");
		driver.findElement(By.xpath(orProp.getProperty("passwordField"))).sendKeys("Mart1996");
		
		
	}
	
	public void signOutTest() {
		
	}

}
