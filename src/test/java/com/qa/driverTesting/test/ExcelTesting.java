package com.qa.driverTesting.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelTesting {
	
	
	ChromeDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		
		driver.quit();
	}
	
	@Test
	public void FindingItems() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		
		WebElement select = driver.findElement(By.xpath ("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		select.click();
		
		
	}
}
