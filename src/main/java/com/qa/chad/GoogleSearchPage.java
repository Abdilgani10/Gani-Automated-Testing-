package com.qa.chad;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class GoogleSearchPage {
	@FindBy(how=How.NAME,using="q")
	private WebElement searchBox;
	
	public void searchFor(String text) {
		searchBox.sendKeys(text);
		searchBox.submit();
	}
	public void scroll(WebDriver driver ) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)","");
	}
}
