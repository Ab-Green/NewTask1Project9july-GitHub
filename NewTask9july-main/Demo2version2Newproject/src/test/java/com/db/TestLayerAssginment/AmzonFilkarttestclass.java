package com.db.TestLayerAssginment;



import org.testng.annotations.Test;

import com.db.AmzonpageLayer.Homepagelayer;
import com.db.AmzonpageLayer.IphoneProductDetailsPage;
import com.db.flipkartpageLayer.FlikartHomePage;
import com.db.flipkartpageLayer.FlikartIphoneProductDetailspage;





public class AmzonFilkarttestclass extends com.db.testBase.NewTestBase {

	@Test
	public void AmzonPriceCompare() {
		Homepagelayer home = new Homepagelayer(driver);
		driver.navigate().to("https://www.amazon.in/");
		home.EnterIphoneName("iphone 14 plus");
		home.clickIphoneOption();
		IphoneProductDetailsPage iphone= new IphoneProductDetailsPage();
		iphone.amazongetIphonePrice();
	
	   }
	
	@Test
	public void Flipkartpricecompare() {
		FlikartHomePage fhome = new FlikartHomePage();
		driver.navigate().to("https://www.flipkart.com/");
		   fhome.withoutlogin();
		   fhome.FlikartEnterIphoneName("iphone 14 plus");
		   fhome.FlikarclickIphoneOption();
		    FlikartIphoneProductDetailspage iphone = new FlikartIphoneProductDetailspage();
		   iphone. FlipKartgetIphonePrice();
		  
		  
		  
		
	}


}
