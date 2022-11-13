package com.freecrm.tests;

import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FreeCRMHomeTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		//System.out.println("the current window handle is " +driver.getWindowHandle());
		//System.out.println("the current window handle is " +driver.getWindowHandles());
		System.out.println("The title of window is : "+driver.getTitle());
	}
	
	@Test(priority = 1)
	public void ValidateHomePageLinks() {
		HomePage_Objects homePage = PageFactory.initElements(driver, HomePage_Objects.class);
		boolean strStatus = homePage.freeCRM_VerifyLinks_homepage();
		if (strStatus) System.out.println("The Verify home page Links test is passed");
		else System.out.println("The verify home page links test is failed");
	}
	@Test(priority = 2)
	public void validatePageTitle() {
		HomePage_Objects homepage =PageFactory.initElements(driver, HomePage_Objects.class);
		Assert.assertTrue(homepage.verifyPageTitle("Free CRM software for any business with sales, support and customer relationship management"));
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
