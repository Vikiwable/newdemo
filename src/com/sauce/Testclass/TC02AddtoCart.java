package com.sauce.Testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.souce.POMclass.HomePageS;





public class TC02AddtoCart extends TestBaseClass
{
	@SuppressWarnings("deprecation")
	@Test
	public void Addtocart()
	{
		HomePageS hp = new HomePageS(driver);
	 System.out.println("6.Jacket add to cart");
	 
	 hp.selectjacket();
	 
	  String ExpectedText = "REMOVE";
	  String ActualResult = hp.getTextAddto();
	  
	  System.out.println(ActualResult);
	  
	// Assert.assertEquals(ExpectedText,ActualResult,"test failed");
	//	Assert.assertTrue(false);	
	//Assert.assertFalse(true);	  
	}

}
