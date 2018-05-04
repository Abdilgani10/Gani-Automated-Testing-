package com.qa.driverTesting.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.chad.BingSearchPage;

public class BingPage {
	
	public WebDriver driver;
	
	 @Before
	    public void setUp(){
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	    }
	
	@After
    public void cleanUp(){
       
            driver.quit();
            
	}
	@Test
	public void testbingsearch() {
		
		driver.get("https://www.bing.com/");
		BingSearchPage page = PageFactory.initElements
				(driver, BingSearchPage.class);
		page.searchFor("stringTosearch");
	}
	

}
