package com.qa.driverTesting.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class SignUptesting {


	public ExtentReports report;
	public ExtentTest test;

	ChromeDriver driver;
	 
	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver", 
	"C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	}

	@Test
	public void testCreateUser() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	
	WebElement clickSignIn = driver.findElement(By.xpath ("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	clickSignIn.click();
	
	Thread.sleep(1000);
	
	WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
	inputEmail.sendKeys("aabdilgani@gmail.com");
	
	Thread.sleep(1000);
	
	WebElement clickCreate = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
	clickCreate.click();
	
	Thread.sleep(1000);
	
	WebElement firstNameInput = driver.findElement(By.xpath ("//*[@id=\"customer_firstname\"]"));
	firstNameInput.sendKeys("Abdilgani");
	
	Thread.sleep(1000);
	} 
	
	@After
	public void teardown() {
	 driver.quit();
	}
}
