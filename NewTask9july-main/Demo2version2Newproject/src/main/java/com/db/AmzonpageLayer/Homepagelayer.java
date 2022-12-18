package com.db.AmzonpageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;







public class Homepagelayer extends com.db.testBase.NewTestBase {
	public WebDriver driver;
	
	public Homepagelayer(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);	
		
	}

	private By search_txt = By.xpath("//input[@id='twotabsearchtextbox']");
	private By iphone1164g_boption =By.xpath("//div[text()='iphone 14 plus']");
	private By clickbluecolour_iphoneoption = By.xpath("//span[text()='Apple iPhone 14 Plus 128GB Blue']");
	
     
	public void EnterIphoneName(String iphone_name) {
		driver.findElement(search_txt).sendKeys(iphone_name);
		
	}
	public void clickIphoneOption() {
		driver.findElement(iphone1164g_boption).click();
		driver.findElement(clickbluecolour_iphoneoption).click();
	}	

}
