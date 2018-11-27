package com.bonsai.app;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.bonsai.resources.Bonsai_base;

public class test_loginflow extends Bonsai_base{

@BeforeTest
public void setup1() throws IOException
{
	driver=invokebrowser();
	driver.get(prop.getProperty("url"));
}
	@Test
	public void login() throws IOException
	
	{	
	driver=initializepages();
	hp.Selectlogin().click();
	lp.getemail().sendKeys("addintesting@gmail.com");
	lp.getpassword().sendKeys("Cognizant");
	lp.getloginbutton().click();
	ut.Homebutton().click();		
		
	}
	
	
	
}
