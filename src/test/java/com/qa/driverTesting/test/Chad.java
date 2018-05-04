package com.qa.driverTesting.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.chad.GoogleSearchPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Chad {

	public ExtentReports report;
	public ExtentTest test;
	
	public String chromeLocation="C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	@Before
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver",chromeLocation);	
		driver=new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	@Test
	public void testGoogleSearch() throws InterruptedException {
		
		report = new ExtentReports("C:\\Users\\Admin\\eclipse-workspace\\test\\New folder (2).html", true); 
		
		for (int i=0;i<30;i++) {
		driver.get("http://www.google.com/");
		GoogleSearchPage page= PageFactory.initElements(driver, GoogleSearchPage.class);
		page.searchFor("istanbul 2005 youtube");
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a")).click();
		if(driver.getPageSource().contains(""))
		{
			page.scroll(driver);
			Thread.sleep(500000);
			page.scroll(driver);

			
		}}
		
		
	}

}
