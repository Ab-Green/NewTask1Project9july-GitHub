package com.db.flipkartpageLayer;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.NewTestBase;



public class FlikartHomePage extends NewTestBase {
	
	public FlikartHomePage() {
		PageFactory.initElements(driver,this);
	}
	 private By CutHomeScreen_txt = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	 private By flipkartsearch_txt = By.xpath("//input[@title='Search for products, brands and more']");
	 private By iphonesearchblue_option =By.xpath("//span[text()='iphone 14 plus']");
	 private By clickonbluecolout_iphoneoption=By.xpath("//div[text()='APPLE iPhone 14 Plus (Blue, 128 GB)']");
	
	 
	 public void withoutlogin() {
		driver.findElement(CutHomeScreen_txt).click();
	 }

	public void FlikartEnterIphoneName(String iphone_name) {
		driver.findElement(flipkartsearch_txt).sendKeys(iphone_name);
	}
	public void FlikarclickIphoneOption() {
		driver.findElement(iphonesearchblue_option).click();
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("scrollBy(0,1000)");
		driver.findElement(clickonbluecolout_iphoneoption).click();
	}
	
}
