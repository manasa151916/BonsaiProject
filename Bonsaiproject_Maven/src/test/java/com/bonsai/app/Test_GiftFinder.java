package com.bonsai.app;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bonsai.resources.Bonsai_base;

public class Test_GiftFinder extends Bonsai_base{
	
	@BeforeTest
	public void setup2() throws IOException
	{
		driver=invokebrowser();
		driver.get(prop.getProperty("url"));
	}

	 @Test (priority=1)
	public void login() throws IOException
	
	{	
	driver=initializepages();
	hp.Selectlogin().click();
	lp.getemail().sendKeys("addintesting@gmail.com");
	lp.getpassword().sendKeys("Cognizant");
	lp.getloginbutton().click();
	ut.Homebutton().click();		
		
	}
	
	
	 @Test (priority=2)
	public void giftfindinder()
	{
		driver=initializepages();
		gp.getcategory("Hand sanitizer & Deodorant");
		gp.getagegroups("1-3 Years");
		gp.getfindnowbutton().click();
	}
}
