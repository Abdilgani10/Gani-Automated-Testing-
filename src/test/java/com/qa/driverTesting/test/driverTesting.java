package com.qa.driverTesting.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverTesting {

	
	private static WebDriver driver;

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
    public void testChromeSelenium() {
    	driver.manage().window().maximize();
        driver.get("http://www.goal.com/en-gb");
    }

    
    }



