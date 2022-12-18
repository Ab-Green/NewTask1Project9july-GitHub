package com.db.flipkartpageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class FlikartIphoneProductDetailspage extends com.db.testBase.NewTestBase{
	
	
	private By Flikcartiphone14price = By.xpath("//div[text()='₹88,490']");

	
	public FlikartIphoneProductDetailspage() {
		PageFactory.initElements(driver,this);
	}
	
	public String FlipKartgetIphonePrice() {
		
		String price = driver.findElement(Flikcartiphone14price).getText();
		System.out.println("this is iphone 14 Flikart price " + price);
	    return price;
        
	}
}
