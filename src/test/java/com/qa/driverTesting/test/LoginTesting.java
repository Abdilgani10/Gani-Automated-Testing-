package com.qa.driverTesting.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class LoginTesting {
	
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
	driver.get("http://thedemosite.co.uk/addauser.php");
	
	WebElement inputUsername = driver.findElement(By.xpath ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
	inputUsername.sendKeys("chelseafc");
	
	Thread.sleep(1000);
	
	WebElement inputPassword = driver.findElement(By.xpath ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
	inputPassword.sendKeys("1234");
	
	Thread.sleep(1000);
	
	WebElement clickCreate = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
	clickCreate.click();
	
	Thread.sleep(1000);
	

	} 
	
	@After
	public void teardown() {
	 driver.quit();
	}
}



