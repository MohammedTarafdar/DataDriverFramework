package com.shift.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;


import com.shift.base.TestBase;

public class CreateAccountTest extends TestBase {
	
	@Test(priority = 1)
	public void getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Current page title : " + title);
		
	}
	
	@Test(priority = 2)
	public void cliclOnSignInLinkTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(orProp.getProperty("signInLink"))).click();
		Assert.assertTrue(isElementsPresent(By.xpath(orProp.getProperty("createAccountText"))));
		
	}
	
	@Test(priority = 3)
	public void clickOnCreateAccountLinkTest() throws InterruptedException {
		//driver.findElement(By.xpath(orProp.getProperty("signInLink"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(orProp.getProperty("createAccountLink"))).click();
	}
	
	@Test(priority = 4)
	public void sendingAcconutInfoTest() throws InterruptedException {
		//driver.findElement(By.xpath(orProp.getProperty("signInLink"))).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(orProp.getProperty("createAccountLink"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(orProp.getProperty("emailAddress"))).sendKeys("test1@gmail.com");
		driver.findElement(By.xpath(orProp.getProperty("firstName"))).sendKeys("TestFirstName");
		driver.findElement(By.xpath(orProp.getProperty("lastName"))).sendKeys("TestLastName");
		driver.findElement(By.xpath(orProp.getProperty("mobileNumber"))).sendKeys("3216781234");
		driver.findElement(By.xpath(orProp.getProperty("createPassword"))).sendKeys("password1234");
	}

}
