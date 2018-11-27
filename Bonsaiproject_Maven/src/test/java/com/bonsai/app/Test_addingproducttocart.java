package com.bonsai.app;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bonsai.resources.Bonsai_base;

public class Test_addingproducttocart extends Bonsai_base{
	
	
	
	@BeforeTest
	
	public void launchbrowser() throws IOException
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
	public void productselection()
	{
		driver=initializepages();
		
	}

}
