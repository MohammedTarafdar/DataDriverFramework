package com.shift.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shift.base.TestBase;

public class SignInAndSignOutTest extends TestBase{
	
	@Test
	public void signInTest() throws InterruptedException {
		log.debug("Signin Test with valid credentials!!!");
		Thread.sleep(2000);
		driver.findElement(By.xpath(orProp.getProperty("homePageSignInLink"))).click();
		//
		Thread.sleep(2000);
		driver.findElement(By.xpath(orProp.getProperty("nextSignInLink"))).click();
		//
		Thread.sleep(2000);
		driver.findElement(By.xpath(orProp.getProperty("userNameField"))).sendKeys("ashik_mart@yahoo.com");
		driver.findElement(By.xpath(orProp.getProperty("passwordField"))).sendKeys("Mart1996");
		log.debug("User successfully loged in  !!!");
		
	}
	
	public void signOutTest() {
		
	}

}
