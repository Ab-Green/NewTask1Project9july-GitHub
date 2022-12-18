package com.db.AmzonpageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.NewTestBase;



public class IphoneProductDetailsPage extends NewTestBase {
	
	private By amazoniphone11plusprice = By.xpath("//span[@class='a-price-whole']");
	
	
	public IphoneProductDetailsPage(){
		PageFactory.initElements(driver, this);
	
	}
	
	public void amazongetIphonePrice() {
		
		String amzonprice = driver.findElement(amazoniphone11plusprice).getText();
		//return price;
		System.out.println("Amzone iphone 14plus 128 Gb Blue price " + amzonprice);

	}
 

}
