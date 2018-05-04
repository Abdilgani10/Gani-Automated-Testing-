package com.qa.chad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class reportTesting {
	
	public ExtentReports report;
	public ExtentTest test;
	
	@Test
	public void verifyHomePageTitle() {

		report = new ExtentReports("C:\\Users\\Admin\\eclipse-workspace\\test\\ExcelTest.html", true);

		test = report.startTest("Verify application Title");
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// add a note to the test
		test.log(LogStatus.INFO, "Browser started");
		driver.get("https://www.qa.com/");
		String title = driver.getTitle();
		System.out.println(title);

		HelperMethods.screenshot(driver);

		if (title.equals("IT Training | Project Management Training | Business Skills Training | QA")) {
			// report the test as a pass
			test.log(LogStatus.PASS, "verify Title of the page");
		} else {
			test.log(LogStatus.FAIL, "verify Title of the page");
		}
		
		FileInputStream file = null;
	    try {
	       file = new FileInputStream (Constant.pathTestData + Constant.fileTestData);
	    } catch (FileNotFoundException e) {}
	    XSSFWorkbook workbook = null;
	    try {
	        workbook = new XSSFWorkbook(file);
	    } catch (IOException e) {}
	    XSSFSheet sheet = workbook.getSheetAt(0);
	    XSSFCell cell = sheet.getRow(0).getCell(0);
	    System.out.println(cell.getStringCellValue());
	   

		report.endTest(test);
		report.flush();

		driver.quit();
	}

}


